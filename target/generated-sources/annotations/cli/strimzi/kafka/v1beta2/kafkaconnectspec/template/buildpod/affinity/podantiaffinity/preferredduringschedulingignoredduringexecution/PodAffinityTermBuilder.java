package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podantiaffinity.preferredduringschedulingignoredduringexecution;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PodAffinityTermBuilder extends PodAffinityTermFluent<PodAffinityTermBuilder> implements VisitableBuilder<PodAffinityTerm,PodAffinityTermBuilder>{
  public PodAffinityTermBuilder() {
    this(new PodAffinityTerm());
  }
  
  public PodAffinityTermBuilder(PodAffinityTermFluent<?> fluent) {
    this(fluent, new PodAffinityTerm());
  }
  
  public PodAffinityTermBuilder(PodAffinityTermFluent<?> fluent,PodAffinityTerm instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PodAffinityTermBuilder(PodAffinityTerm instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PodAffinityTermFluent<?> fluent;
  
  public PodAffinityTerm build() {
    PodAffinityTerm buildable = new PodAffinityTerm();
    buildable.setLabelSelector(fluent.buildLabelSelector());
    buildable.setNamespaceSelector(fluent.buildNamespaceSelector());
    buildable.setNamespaces(fluent.getNamespaces());
    buildable.setTopologyKey(fluent.getTopologyKey());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}