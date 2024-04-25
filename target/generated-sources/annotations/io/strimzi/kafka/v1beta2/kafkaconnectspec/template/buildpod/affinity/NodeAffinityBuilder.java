package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class NodeAffinityBuilder extends NodeAffinityFluent<NodeAffinityBuilder> implements VisitableBuilder<NodeAffinity,NodeAffinityBuilder>{
  public NodeAffinityBuilder() {
    this(new NodeAffinity());
  }
  
  public NodeAffinityBuilder(NodeAffinityFluent<?> fluent) {
    this(fluent, new NodeAffinity());
  }
  
  public NodeAffinityBuilder(NodeAffinityFluent<?> fluent,NodeAffinity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public NodeAffinityBuilder(NodeAffinity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  NodeAffinityFluent<?> fluent;
  
  public NodeAffinity build() {
    NodeAffinity buildable = new NodeAffinity();
    buildable.setPreferredDuringSchedulingIgnoredDuringExecution(fluent.buildPreferredDuringSchedulingIgnoredDuringExecution());
    buildable.setRequiredDuringSchedulingIgnoredDuringExecution(fluent.buildRequiredDuringSchedulingIgnoredDuringExecution());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}