package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class TopologySpreadConstraintsBuilder extends TopologySpreadConstraintsFluent<TopologySpreadConstraintsBuilder> implements VisitableBuilder<TopologySpreadConstraints,TopologySpreadConstraintsBuilder>{
  public TopologySpreadConstraintsBuilder() {
    this(new TopologySpreadConstraints());
  }
  
  public TopologySpreadConstraintsBuilder(TopologySpreadConstraintsFluent<?> fluent) {
    this(fluent, new TopologySpreadConstraints());
  }
  
  public TopologySpreadConstraintsBuilder(TopologySpreadConstraintsFluent<?> fluent,TopologySpreadConstraints instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public TopologySpreadConstraintsBuilder(TopologySpreadConstraints instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  TopologySpreadConstraintsFluent<?> fluent;
  
  public TopologySpreadConstraints build() {
    TopologySpreadConstraints buildable = new TopologySpreadConstraints();
    buildable.setLabelSelector(fluent.buildLabelSelector());
    buildable.setMatchLabelKeys(fluent.getMatchLabelKeys());
    buildable.setMaxSkew(fluent.getMaxSkew());
    buildable.setMinDomains(fluent.getMinDomains());
    buildable.setNodeAffinityPolicy(fluent.getNodeAffinityPolicy());
    buildable.setNodeTaintsPolicy(fluent.getNodeTaintsPolicy());
    buildable.setTopologyKey(fluent.getTopologyKey());
    buildable.setWhenUnsatisfiable(fluent.getWhenUnsatisfiable());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}