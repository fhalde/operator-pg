package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PreferredDuringSchedulingIgnoredDuringExecutionBuilder extends PreferredDuringSchedulingIgnoredDuringExecutionFluent<PreferredDuringSchedulingIgnoredDuringExecutionBuilder> implements VisitableBuilder<PreferredDuringSchedulingIgnoredDuringExecution,PreferredDuringSchedulingIgnoredDuringExecutionBuilder>{
  public PreferredDuringSchedulingIgnoredDuringExecutionBuilder() {
    this(new PreferredDuringSchedulingIgnoredDuringExecution());
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionBuilder(PreferredDuringSchedulingIgnoredDuringExecutionFluent<?> fluent) {
    this(fluent, new PreferredDuringSchedulingIgnoredDuringExecution());
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionBuilder(PreferredDuringSchedulingIgnoredDuringExecutionFluent<?> fluent,PreferredDuringSchedulingIgnoredDuringExecution instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionBuilder(PreferredDuringSchedulingIgnoredDuringExecution instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PreferredDuringSchedulingIgnoredDuringExecutionFluent<?> fluent;
  
  public PreferredDuringSchedulingIgnoredDuringExecution build() {
    PreferredDuringSchedulingIgnoredDuringExecution buildable = new PreferredDuringSchedulingIgnoredDuringExecution();
    buildable.setPreference(fluent.buildPreference());
    buildable.setWeight(fluent.getWeight());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}