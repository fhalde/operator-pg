package io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PasswordSecretBuilder extends PasswordSecretFluent<PasswordSecretBuilder> implements VisitableBuilder<PasswordSecret,PasswordSecretBuilder>{
  public PasswordSecretBuilder() {
    this(new PasswordSecret());
  }
  
  public PasswordSecretBuilder(PasswordSecretFluent<?> fluent) {
    this(fluent, new PasswordSecret());
  }
  
  public PasswordSecretBuilder(PasswordSecretFluent<?> fluent,PasswordSecret instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PasswordSecretBuilder(PasswordSecret instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PasswordSecretFluent<?> fluent;
  
  public PasswordSecret build() {
    PasswordSecret buildable = new PasswordSecret();
    buildable.setPassword(fluent.getPassword());
    buildable.setSecretName(fluent.getSecretName());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}