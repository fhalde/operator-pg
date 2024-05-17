/* (C)2024 */
package hello.world.operator.slope;

import hello.world.operator.slope.customresources.HelloWorldSpec;
import hello.world.operator.slope.customresources.Ref;
import hello.world.operator.slope.customresources.ReferredKind;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.javaoperatorsdk.operator.api.config.informer.InformerConfiguration;
import io.javaoperatorsdk.operator.api.reconciler.*;
import io.javaoperatorsdk.operator.api.reconciler.dependent.Dependent;
import hello.world.operator.slope.customresources.HelloWorld;
import io.javaoperatorsdk.operator.processing.event.ResourceID;
import io.javaoperatorsdk.operator.processing.event.source.EventSource;
import io.javaoperatorsdk.operator.processing.event.source.PrimaryToSecondaryMapper;
import io.javaoperatorsdk.operator.processing.event.source.informer.InformerEventSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@ControllerConfiguration(name = "helloworld")
public class HelloWorldReconciler implements Reconciler<HelloWorld>, EventSourceInitializer<HelloWorld> {

    private static final Logger log = LoggerFactory.getLogger(HelloWorldReconciler.class);

    public HelloWorldReconciler() {
    }

    public static void main(String[] args) {
    }

    @Override
    public UpdateControl<HelloWorld> reconcile(HelloWorld slope, Context<HelloWorld> context) {
        log.info("Reconciling hello world...");
        return UpdateControl.noUpdate();
    }

    @Override
    public Map<String, EventSource> prepareEventSources(EventSourceContext<HelloWorld> context) {
        // any other event sources of your wish
        var sources = Arrays.stream(HelloWorldSpec.class.getDeclaredFields())
                              .filter(f -> f.isAnnotationPresent(ReferredKind.class))
                              .map(f -> {
                                  System.out.println("Discovered " + f.getName() + " as a ref field");
                                  var annotation = f.getDeclaredAnnotation(ReferredKind.class);
                                  var clazz = annotation.value();
                                  var builder = InformerConfiguration.from(clazz, context)
                                                        .withNamespacesInheritedFromController(context)
                                                        .withPrimaryToSecondaryMapper(new PrimaryToSecondaryMapper<HelloWorld>() {
                                                            @Override
                                                            public Set<ResourceID> toSecondaryResourceIDs(HelloWorld primary) {
                                                                try {
                                                                    var ref = (Ref) f.get(primary);
                                                                    System.out.println(ResourceID.fromResource(primary) + " -> " + new ResourceID(ref.name, ref.namespace));
                                                                    return Set.of(new ResourceID(ref.name, ref.namespace));
                                                                } catch (IllegalAccessException e) {
                                                                    System.out.println(e);
                                                                    throw new RuntimeException(e);
                                                                }
                                                            }
                                                        });
                                  return new InformerEventSource<>(builder.build(), context);
                              })
                              .collect(Collectors.toList());
        return EventSourceInitializer.nameEventSources(sources.toArray(new EventSource[0]));
    }
}
