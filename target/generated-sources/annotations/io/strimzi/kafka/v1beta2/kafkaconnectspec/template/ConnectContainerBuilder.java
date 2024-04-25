package io.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ConnectContainerBuilder extends ConnectContainerFluent<ConnectContainerBuilder> implements VisitableBuilder<ConnectContainer,ConnectContainerBuilder>{
  public ConnectContainerBuilder() {
    this(new ConnectContainer());
  }
  
  public ConnectContainerBuilder(ConnectContainerFluent<?> fluent) {
    this(fluent, new ConnectContainer());
  }
  
  public ConnectContainerBuilder(ConnectContainerFluent<?> fluent,ConnectContainer instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ConnectContainerBuilder(ConnectContainer instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ConnectContainerFluent<?> fluent;
  
  public ConnectContainer build() {
    ConnectContainer buildable = new ConnectContainer();
    buildable.setEnv(fluent.buildEnv());
    buildable.setSecurityContext(fluent.buildSecurityContext());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}