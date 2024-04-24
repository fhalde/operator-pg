/* (C)2024 */
package hello.world.operator.slope;

import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.processing.dependent.BulkDependentResource;
import io.javaoperatorsdk.operator.processing.dependent.kubernetes.CRUDKubernetesDependentResource;
import io.javaoperatorsdk.operator.processing.dependent.kubernetes.KubernetesDependent;
import io.strimzi.api.kafka.model.connector.KafkaConnector;
import io.strimzi.api.kafka.model.connector.KafkaConnectorBuilder;
import hello.world.operator.slope.customresources.HelloWorld;

import java.util.HashMap;
import java.util.Map;

@KubernetesDependent
public class KafkaConnectorDependentResource
        extends CRUDKubernetesDependentResource<KafkaConnector, HelloWorld>
        implements BulkDependentResource<KafkaConnector, HelloWorld> {


  public KafkaConnectorDependentResource() {
    super(KafkaConnector.class);
  }

  @Override
  public Map<String, KafkaConnector> desiredResources(HelloWorld primary, Context<HelloWorld> context) {
    var m = new HashMap<String, KafkaConnector>();
    primary.getSpec().description().stream().map(str -> new KafkaConnectorBuilder()
           .withNewMetadata()
           .withNamespace(primary.getMetadata().getNamespace())
           .withName(str)
           .endMetadata().withNewSpec().withClassName("v2.HelloWorld").endSpec().build())
            .forEach(c -> {
              m.put(c.getMetadata().getName(), c);
            });
    return m;
  }

  @Override
  public Map<String, KafkaConnector> getSecondaryResources(HelloWorld primary, Context<HelloWorld> context) {
    var m = new HashMap<String, KafkaConnector>();
    context.getSecondaryResources(KafkaConnector.class).forEach(c -> m.put(c.getMetadata().getName(), c));
    System.out.println(m.entrySet());
    return m;
  }
}
