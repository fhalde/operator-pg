package io.strimzi.kafka.v1beta2;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class KafkaConnectBuilder extends KafkaConnectFluent<KafkaConnectBuilder> implements VisitableBuilder<KafkaConnect,KafkaConnectBuilder>{
  public KafkaConnectBuilder() {
    this(new KafkaConnect());
  }
  
  public KafkaConnectBuilder(KafkaConnectFluent<?> fluent) {
    this(fluent, new KafkaConnect());
  }
  
  public KafkaConnectBuilder(KafkaConnectFluent<?> fluent,KafkaConnect instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public KafkaConnectBuilder(KafkaConnect instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  KafkaConnectFluent<?> fluent;
  
  public KafkaConnect build() {
    KafkaConnect buildable = new KafkaConnect();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    buildable.setKind(fluent.getKind());
    buildable.setApiVersion(fluent.getApiVersion());
    return buildable;
  }
  

}