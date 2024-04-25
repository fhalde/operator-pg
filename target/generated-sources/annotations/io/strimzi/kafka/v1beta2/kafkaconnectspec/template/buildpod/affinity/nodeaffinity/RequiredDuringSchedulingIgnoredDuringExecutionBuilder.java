package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class RequiredDuringSchedulingIgnoredDuringExecutionBuilder extends RequiredDuringSchedulingIgnoredDuringExecutionFluent<RequiredDuringSchedulingIgnoredDuringExecutionBuilder> implements VisitableBuilder<RequiredDuringSchedulingIgnoredDuringExecution,RequiredDuringSchedulingIgnoredDuringExecutionBuilder>{
  public RequiredDuringSchedulingIgnoredDuringExecutionBuilder() {
    this(new RequiredDuringSchedulingIgnoredDuringExecution());
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionBuilder(RequiredDuringSchedulingIgnoredDuringExecutionFluent<?> fluent) {
    this(fluent, new RequiredDuringSchedulingIgnoredDuringExecution());
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionBuilder(RequiredDuringSchedulingIgnoredDuringExecutionFluent<?> fluent,RequiredDuringSchedulingIgnoredDuringExecution instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionBuilder(RequiredDuringSchedulingIgnoredDuringExecution instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  RequiredDuringSchedulingIgnoredDuringExecutionFluent<?> fluent;
  
  public RequiredDuringSchedulingIgnoredDuringExecution build() {
    RequiredDuringSchedulingIgnoredDuringExecution buildable = new RequiredDuringSchedulingIgnoredDuringExecution();
    buildable.setNodeSelectorTerms(fluent.buildNodeSelectorTerms());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}