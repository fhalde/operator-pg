package io.strimzi.kafka.v1beta2.kafkaconnectspec.jmxoptions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class AuthenticationBuilder extends AuthenticationFluent<AuthenticationBuilder> implements VisitableBuilder<Authentication,AuthenticationBuilder>{
  public AuthenticationBuilder() {
    this(new Authentication());
  }
  
  public AuthenticationBuilder(AuthenticationFluent<?> fluent) {
    this(fluent, new Authentication());
  }
  
  public AuthenticationBuilder(AuthenticationFluent<?> fluent,Authentication instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public AuthenticationBuilder(Authentication instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  AuthenticationFluent<?> fluent;
  
  public Authentication build() {
    Authentication buildable = new Authentication();
    buildable.setType(fluent.getType());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}