/* (C)2024 */
package hello.world.operator.hellouniverse;

import hello.world.operator.KindClass;
import hello.world.operator.Ref;
import hello.world.operator.hellouniverse.customresources.HelloUniverse;
import hello.world.operator.hellouniverse.customresources.HelloUniverseSpec;
import hello.world.operator.hellouniverse.customresources.HelloUniverseStatus;
import hello.world.operator.helloworld.customresources.HelloWorld;
import hello.world.operator.helloworld.customresources.HelloWorldSpec;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.javaoperatorsdk.operator.api.config.informer.InformerConfiguration;
import io.javaoperatorsdk.operator.api.reconciler.*;
import io.javaoperatorsdk.operator.processing.event.ResourceID;
import io.javaoperatorsdk.operator.processing.event.source.EventSource;
import io.javaoperatorsdk.operator.processing.event.source.PrimaryToSecondaryMapper;
import io.javaoperatorsdk.operator.processing.event.source.informer.InformerEventSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

@ControllerConfiguration(name = "hellouniverse")
public class HelloUniverseReconciler implements Reconciler<HelloUniverse>, EventSourceInitializer<HelloUniverse> {

    private static final Logger log = LoggerFactory.getLogger(HelloUniverseReconciler.class);

    public HelloUniverseReconciler() {
    }

    @Override
    public UpdateControl<HelloUniverse> reconcile(HelloUniverse helloUniverse, Context<HelloUniverse> context) {
        log.info("Reconciling hello universe...");
        if (helloUniverse.getStatus() == null) {
            helloUniverse.setStatus(new HelloUniverseStatus());
        }
        HelloWorld helloWorld = context.getSecondaryResource(HelloWorld.class).orElseThrow();
        helloUniverse.getStatus().lastSeenHelloWorldResourceVersion = helloWorld.getMetadata().getResourceVersion();
        return UpdateControl.patchStatus(helloUniverse);
    }

    private String indexKey(Ref ref) {
        return ref.name() + "#" + ref.namespace();
    }

    private String indexKey(HasMetadata resource) {
        return resource.getMetadata().getName() + "#" + resource.getMetadata().getNamespace();
    }

    @Override
    public Map<String, EventSource> prepareEventSources(EventSourceContext<HelloUniverse> context) {
        var informers = new LinkedList<EventSource>();
        for (var field : HelloUniverseSpec.class.getDeclaredFields()) {
            if (field.getType().isAnnotationPresent(KindClass.class)) {
                var refKind = field.getType().getDeclaredAnnotation(KindClass.class).value();
                var indexName = UUID.randomUUID().toString();
                log.info("Discovered field {} as a ref of kind {} in spec {}", field.getName(), refKind, HelloUniverseSpec.class);
                log.info("Adding index {}", indexName);
                context.getPrimaryCache().addIndexer(indexName, (primary -> {
                    try {
                        var k = indexKey((Ref) field.get(primary.getSpec()));
                        log.info("Adding to indexer {} {}", field.getName(), k);
                        return List.of(k);
                    } catch (IllegalAccessException e) {
                        log.error("this is bad", e);
                        throw new RuntimeException(e);
                    }
                }));
                var configuration = InformerConfiguration.from(refKind, context)
                                            .withNamespacesInheritedFromController(context)
                                            .withSecondaryToPrimaryMapper(secondary -> {
                                                var resources = context.getPrimaryCache().byIndex(indexName, indexKey(secondary)).stream().map(ResourceID::fromResource).collect(Collectors.toSet());
                                                return resources;
                                            })
                                            .withPrimaryToSecondaryMapper((PrimaryToSecondaryMapper<HelloUniverse>) primary -> {
                                                try {
                                                    var ref = (Ref) field.get(primary.getSpec());
                                                    return Set.of(new ResourceID(ref.name(), ref.namespace()));
                                                } catch (IllegalAccessException e) {
                                                    log.error("Error in PrimaryToSecondaryMapper", e);
                                                    throw new RuntimeException(e);
                                                }
                                            })
                                            .build();
                informers.add(new InformerEventSource<>(configuration, context));
            }
        }
        return EventSourceInitializer.nameEventSources(informers.toArray(new EventSource[0]));
    }
}
