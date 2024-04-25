package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class MatchFieldsBuilder extends MatchFieldsFluent<MatchFieldsBuilder> implements VisitableBuilder<MatchFields,MatchFieldsBuilder>{
  public MatchFieldsBuilder() {
    this(new MatchFields());
  }
  
  public MatchFieldsBuilder(MatchFieldsFluent<?> fluent) {
    this(fluent, new MatchFields());
  }
  
  public MatchFieldsBuilder(MatchFieldsFluent<?> fluent,MatchFields instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public MatchFieldsBuilder(MatchFields instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  MatchFieldsFluent<?> fluent;
  
  public MatchFields build() {
    MatchFields buildable = new MatchFields();
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setValues(fluent.getValues());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}