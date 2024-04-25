package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.podantiaffinity.requiredduringschedulingignoredduringexecution;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class NamespaceSelectorBuilder extends NamespaceSelectorFluent<NamespaceSelectorBuilder> implements VisitableBuilder<NamespaceSelector,NamespaceSelectorBuilder>{
  public NamespaceSelectorBuilder() {
    this(new NamespaceSelector());
  }
  
  public NamespaceSelectorBuilder(NamespaceSelectorFluent<?> fluent) {
    this(fluent, new NamespaceSelector());
  }
  
  public NamespaceSelectorBuilder(NamespaceSelectorFluent<?> fluent,NamespaceSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public NamespaceSelectorBuilder(NamespaceSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  NamespaceSelectorFluent<?> fluent;
  
  public NamespaceSelector build() {
    NamespaceSelector buildable = new NamespaceSelector();
    buildable.setMatchExpressions(fluent.buildMatchExpressions());
    buildable.setMatchLabels(fluent.buildMatchLabels());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}