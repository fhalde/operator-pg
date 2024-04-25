package io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SecretBuilder extends SecretFluent<SecretBuilder> implements VisitableBuilder<Secret,SecretBuilder>{
  public SecretBuilder() {
    this(new Secret());
  }
  
  public SecretBuilder(SecretFluent<?> fluent) {
    this(fluent, new Secret());
  }
  
  public SecretBuilder(SecretFluent<?> fluent,Secret instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SecretBuilder(Secret instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SecretFluent<?> fluent;
  
  public Secret build() {
    Secret buildable = new Secret();
    buildable.setDefaultMode(fluent.getDefaultMode());
    buildable.setItems(fluent.buildItems());
    buildable.setOptional(fluent.getOptional());
    buildable.setSecretName(fluent.getSecretName());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}