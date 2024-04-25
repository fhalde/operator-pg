package io.strimzi.kafka.v1beta2.kafkaconnectspec.jvmoptions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class JavaSystemPropertiesBuilder extends JavaSystemPropertiesFluent<JavaSystemPropertiesBuilder> implements VisitableBuilder<JavaSystemProperties,JavaSystemPropertiesBuilder>{
  public JavaSystemPropertiesBuilder() {
    this(new JavaSystemProperties());
  }
  
  public JavaSystemPropertiesBuilder(JavaSystemPropertiesFluent<?> fluent) {
    this(fluent, new JavaSystemProperties());
  }
  
  public JavaSystemPropertiesBuilder(JavaSystemPropertiesFluent<?> fluent,JavaSystemProperties instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public JavaSystemPropertiesBuilder(JavaSystemProperties instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  JavaSystemPropertiesFluent<?> fluent;
  
  public JavaSystemProperties build() {
    JavaSystemProperties buildable = new JavaSystemProperties();
    buildable.setName(fluent.getName());
    buildable.setValue(fluent.getValue());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}