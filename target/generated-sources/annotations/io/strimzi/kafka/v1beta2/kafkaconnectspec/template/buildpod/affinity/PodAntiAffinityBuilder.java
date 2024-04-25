package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PodAntiAffinityBuilder extends PodAntiAffinityFluent<PodAntiAffinityBuilder> implements VisitableBuilder<PodAntiAffinity,PodAntiAffinityBuilder>{
  public PodAntiAffinityBuilder() {
    this(new PodAntiAffinity());
  }
  
  public PodAntiAffinityBuilder(PodAntiAffinityFluent<?> fluent) {
    this(fluent, new PodAntiAffinity());
  }
  
  public PodAntiAffinityBuilder(PodAntiAffinityFluent<?> fluent,PodAntiAffinity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PodAntiAffinityBuilder(PodAntiAffinity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PodAntiAffinityFluent<?> fluent;
  
  public PodAntiAffinity build() {
    PodAntiAffinity buildable = new PodAntiAffinity();
    buildable.setPreferredDuringSchedulingIgnoredDuringExecution(fluent.buildPreferredDuringSchedulingIgnoredDuringExecution());
    buildable.setRequiredDuringSchedulingIgnoredDuringExecution(fluent.buildRequiredDuringSchedulingIgnoredDuringExecution());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}