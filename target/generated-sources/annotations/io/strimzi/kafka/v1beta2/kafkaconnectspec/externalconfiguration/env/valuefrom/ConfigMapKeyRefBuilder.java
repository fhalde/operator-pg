package io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.env.valuefrom;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ConfigMapKeyRefBuilder extends ConfigMapKeyRefFluent<ConfigMapKeyRefBuilder> implements VisitableBuilder<ConfigMapKeyRef,ConfigMapKeyRefBuilder>{
  public ConfigMapKeyRefBuilder() {
    this(new ConfigMapKeyRef());
  }
  
  public ConfigMapKeyRefBuilder(ConfigMapKeyRefFluent<?> fluent) {
    this(fluent, new ConfigMapKeyRef());
  }
  
  public ConfigMapKeyRefBuilder(ConfigMapKeyRefFluent<?> fluent,ConfigMapKeyRef instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ConfigMapKeyRefBuilder(ConfigMapKeyRef instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ConfigMapKeyRefFluent<?> fluent;
  
  public ConfigMapKeyRef build() {
    ConfigMapKeyRef buildable = new ConfigMapKeyRef();
    buildable.setKey(fluent.getKey());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}