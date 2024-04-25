package io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class RefreshTokenBuilder extends RefreshTokenFluent<RefreshTokenBuilder> implements VisitableBuilder<RefreshToken,RefreshTokenBuilder>{
  public RefreshTokenBuilder() {
    this(new RefreshToken());
  }
  
  public RefreshTokenBuilder(RefreshTokenFluent<?> fluent) {
    this(fluent, new RefreshToken());
  }
  
  public RefreshTokenBuilder(RefreshTokenFluent<?> fluent,RefreshToken instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public RefreshTokenBuilder(RefreshToken instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  RefreshTokenFluent<?> fluent;
  
  public RefreshToken build() {
    RefreshToken buildable = new RefreshToken();
    buildable.setKey(fluent.getKey());
    buildable.setSecretName(fluent.getSecretName());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}