package io.strimzi.kafka.v1beta2;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class KafkaConnectStatusBuilder extends KafkaConnectStatusFluent<KafkaConnectStatusBuilder> implements VisitableBuilder<KafkaConnectStatus,KafkaConnectStatusBuilder>{
  public KafkaConnectStatusBuilder() {
    this(new KafkaConnectStatus());
  }
  
  public KafkaConnectStatusBuilder(KafkaConnectStatusFluent<?> fluent) {
    this(fluent, new KafkaConnectStatus());
  }
  
  public KafkaConnectStatusBuilder(KafkaConnectStatusFluent<?> fluent,KafkaConnectStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public KafkaConnectStatusBuilder(KafkaConnectStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  KafkaConnectStatusFluent<?> fluent;
  
  public KafkaConnectStatus build() {
    KafkaConnectStatus buildable = new KafkaConnectStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setConnectorPlugins(fluent.buildConnectorPlugins());
    buildable.setLabelSelector(fluent.getLabelSelector());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setUrl(fluent.getUrl());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}