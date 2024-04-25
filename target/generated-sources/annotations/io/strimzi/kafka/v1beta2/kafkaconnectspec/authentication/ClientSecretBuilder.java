package io.strimzi.kafka.v1beta2.kafkaconnectspec.authentication;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ClientSecretBuilder extends ClientSecretFluent<ClientSecretBuilder> implements VisitableBuilder<ClientSecret,ClientSecretBuilder>{
  public ClientSecretBuilder() {
    this(new ClientSecret());
  }
  
  public ClientSecretBuilder(ClientSecretFluent<?> fluent) {
    this(fluent, new ClientSecret());
  }
  
  public ClientSecretBuilder(ClientSecretFluent<?> fluent,ClientSecret instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ClientSecretBuilder(ClientSecret instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ClientSecretFluent<?> fluent;
  
  public ClientSecret build() {
    ClientSecret buildable = new ClientSecret();
    buildable.setKey(fluent.getKey());
    buildable.setSecretName(fluent.getSecretName());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}