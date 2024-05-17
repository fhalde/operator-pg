/* (C)2024 */
package hello.world.operator.helloworld;

import hello.world.operator.KindClass;
import hello.world.operator.Ref;
import hello.world.operator.helloworld.customresources.HelloWorldSpec;
import hello.world.operator.helloworld.customresources.HelloWorldStatus;
import io.fabric8.kubernetes.api.model.ConfigMap;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.client.utils.Serialization;
import io.javaoperatorsdk.operator.api.config.informer.InformerConfiguration;
import io.javaoperatorsdk.operator.api.reconciler.*;
import hello.world.operator.helloworld.customresources.HelloWorld;
import io.javaoperatorsdk.operator.processing.event.ResourceID;
import io.javaoperatorsdk.operator.processing.event.source.EventSource;
import io.javaoperatorsdk.operator.processing.event.source.PrimaryToSecondaryMapper;
import io.javaoperatorsdk.operator.processing.event.source.informer.InformerEventSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

@ControllerConfiguration(name = "helloworld")
public class HelloWorldReconciler implements Reconciler<HelloWorld>, EventSourceInitializer<HelloWorld> {

    private static final Logger log = LoggerFactory.getLogger(HelloWorldReconciler.class);

    public HelloWorldReconciler() {
    }

    @Override
    public UpdateControl<HelloWorld> reconcile(HelloWorld helloWorld, Context<HelloWorld> context) {
        log.info("Reconciling hello world...");
        if (helloWorld.getStatus() == null) {
            helloWorld.setStatus(new HelloWorldStatus());
        }
        var cm = context.getSecondaryResource(ConfigMap.class).orElseThrow();
        helloWorld.getStatus().entries = String.join(",", cm.getData().keySet());
        return UpdateControl.patchStatus(helloWorld);
    }

    private String indexKey(Ref ref) {
        return ref.name() + "#" + ref.namespace();
    }

    private String indexKey(HasMetadata resource) {
        return resource.getMetadata().getName() + "#" + resource.getMetadata().getNamespace();
    }

    /*
     * Summary
     *
     * A custom resource can reference another custom resource and therefore form an object graph.
     *
     * References in our operator is of the same type `Ref` to have consistency. Refs in itself don't say anything about the kind of the resource
     * which is important because, when reading the resource from k8s ( or the cache ), we need to provide this 3rd dimension
     *
     *
     */

    @Override
    public Map<String, EventSource> prepareEventSources(EventSourceContext<HelloWorld> context) {
        var informers = new LinkedList<EventSource>();
        for (var field : HelloWorldSpec.class.getDeclaredFields()) {
            if (field.getType().isAnnotationPresent(KindClass.class)) {
                var refKind = field.getType().getDeclaredAnnotation(KindClass.class).value();
                var indexName = UUID.randomUUID().toString();
                log.info("Discovered field {} as a ref of kind {} in spec {}", field.getName(), refKind, HelloWorldSpec.class);
                log.info("Adding index {}", indexName);
                context.getPrimaryCache().addIndexer(indexName, (primary -> {
                    try {
                        var k = indexKey((Ref) field.get(primary.getSpec()));
                        log.info("Adding to indexer {}", k);
                        return List.of(k);
                    } catch (IllegalAccessException e) {
                        log.error("this is bad", e);
                        throw new RuntimeException(e);
                    }
                }));
                var configuration = InformerConfiguration.from(refKind, context)
                                            .withNamespacesInheritedFromController(context)
                                            .withSecondaryToPrimaryMapper(secondary -> {
                                                var resources = context.getPrimaryCache().byIndex(indexName, indexKey(secondary))
                                                                        .stream()
                                                                        .map(ResourceID::fromResource)
                                                                        .collect(Collectors.toSet());
                                                return resources;
                                            })
                                            .withPrimaryToSecondaryMapper((PrimaryToSecondaryMapper<HelloWorld>) primary -> {
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
