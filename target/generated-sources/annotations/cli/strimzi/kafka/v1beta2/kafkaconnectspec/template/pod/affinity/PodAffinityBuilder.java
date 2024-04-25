package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PodAffinityBuilder extends PodAffinityFluent<PodAffinityBuilder> implements VisitableBuilder<PodAffinity,PodAffinityBuilder>{
  public PodAffinityBuilder() {
    this(new PodAffinity());
  }
  
  public PodAffinityBuilder(PodAffinityFluent<?> fluent) {
    this(fluent, new PodAffinity());
  }
  
  public PodAffinityBuilder(PodAffinityFluent<?> fluent,PodAffinity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PodAffinityBuilder(PodAffinity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PodAffinityFluent<?> fluent;
  
  public PodAffinity build() {
    PodAffinity buildable = new PodAffinity();
    buildable.setPreferredDuringSchedulingIgnoredDuringExecution(fluent.buildPreferredDuringSchedulingIgnoredDuringExecution());
    buildable.setRequiredDuringSchedulingIgnoredDuringExecution(fluent.buildRequiredDuringSchedulingIgnoredDuringExecution());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}