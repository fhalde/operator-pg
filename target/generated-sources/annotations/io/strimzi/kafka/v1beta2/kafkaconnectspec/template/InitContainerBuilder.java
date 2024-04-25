package io.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class InitContainerBuilder extends InitContainerFluent<InitContainerBuilder> implements VisitableBuilder<InitContainer,InitContainerBuilder>{
  public InitContainerBuilder() {
    this(new InitContainer());
  }
  
  public InitContainerBuilder(InitContainerFluent<?> fluent) {
    this(fluent, new InitContainer());
  }
  
  public InitContainerBuilder(InitContainerFluent<?> fluent,InitContainer instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public InitContainerBuilder(InitContainer instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  InitContainerFluent<?> fluent;
  
  public InitContainer build() {
    InitContainer buildable = new InitContainer();
    buildable.setEnv(fluent.buildEnv());
    buildable.setSecurityContext(fluent.buildSecurityContext());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}