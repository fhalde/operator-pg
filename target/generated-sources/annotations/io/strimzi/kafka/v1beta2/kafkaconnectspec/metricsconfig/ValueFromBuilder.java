package io.strimzi.kafka.v1beta2.kafkaconnectspec.metricsconfig;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ValueFromBuilder extends ValueFromFluent<ValueFromBuilder> implements VisitableBuilder<ValueFrom,ValueFromBuilder>{
  public ValueFromBuilder() {
    this(new ValueFrom());
  }
  
  public ValueFromBuilder(ValueFromFluent<?> fluent) {
    this(fluent, new ValueFrom());
  }
  
  public ValueFromBuilder(ValueFromFluent<?> fluent,ValueFrom instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ValueFromBuilder(ValueFrom instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ValueFromFluent<?> fluent;
  
  public ValueFrom build() {
    ValueFrom buildable = new ValueFrom();
    buildable.setConfigMapKeyRef(fluent.buildConfigMapKeyRef());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}