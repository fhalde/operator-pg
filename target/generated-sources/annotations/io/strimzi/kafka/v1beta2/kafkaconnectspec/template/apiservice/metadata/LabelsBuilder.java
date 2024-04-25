package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.apiservice.metadata;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class LabelsBuilder extends LabelsFluent<LabelsBuilder> implements VisitableBuilder<Labels,LabelsBuilder>{
  public LabelsBuilder() {
    this(new Labels());
  }
  
  public LabelsBuilder(LabelsFluent<?> fluent) {
    this(fluent, new Labels());
  }
  
  public LabelsBuilder(LabelsFluent<?> fluent,Labels instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public LabelsBuilder(Labels instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  LabelsFluent<?> fluent;
  
  public Labels build() {
    Labels buildable = new Labels();
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}