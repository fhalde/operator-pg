package io.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ServiceAccountBuilder extends ServiceAccountFluent<ServiceAccountBuilder> implements VisitableBuilder<ServiceAccount,ServiceAccountBuilder>{
  public ServiceAccountBuilder() {
    this(new ServiceAccount());
  }
  
  public ServiceAccountBuilder(ServiceAccountFluent<?> fluent) {
    this(fluent, new ServiceAccount());
  }
  
  public ServiceAccountBuilder(ServiceAccountFluent<?> fluent,ServiceAccount instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ServiceAccountBuilder(ServiceAccount instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ServiceAccountFluent<?> fluent;
  
  public ServiceAccount build() {
    ServiceAccount buildable = new ServiceAccount();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}