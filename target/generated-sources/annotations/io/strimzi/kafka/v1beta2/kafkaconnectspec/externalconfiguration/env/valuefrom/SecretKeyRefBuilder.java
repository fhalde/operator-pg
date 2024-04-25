package io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.env.valuefrom;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SecretKeyRefBuilder extends SecretKeyRefFluent<SecretKeyRefBuilder> implements VisitableBuilder<SecretKeyRef,SecretKeyRefBuilder>{
  public SecretKeyRefBuilder() {
    this(new SecretKeyRef());
  }
  
  public SecretKeyRefBuilder(SecretKeyRefFluent<?> fluent) {
    this(fluent, new SecretKeyRef());
  }
  
  public SecretKeyRefBuilder(SecretKeyRefFluent<?> fluent,SecretKeyRef instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SecretKeyRefBuilder(SecretKeyRef instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SecretKeyRefFluent<?> fluent;
  
  public SecretKeyRef build() {
    SecretKeyRef buildable = new SecretKeyRef();
    buildable.setKey(fluent.getKey());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}