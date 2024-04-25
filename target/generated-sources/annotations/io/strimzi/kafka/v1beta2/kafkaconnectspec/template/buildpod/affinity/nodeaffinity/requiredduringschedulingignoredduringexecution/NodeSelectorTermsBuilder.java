package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class NodeSelectorTermsBuilder extends NodeSelectorTermsFluent<NodeSelectorTermsBuilder> implements VisitableBuilder<NodeSelectorTerms,NodeSelectorTermsBuilder>{
  public NodeSelectorTermsBuilder() {
    this(new NodeSelectorTerms());
  }
  
  public NodeSelectorTermsBuilder(NodeSelectorTermsFluent<?> fluent) {
    this(fluent, new NodeSelectorTerms());
  }
  
  public NodeSelectorTermsBuilder(NodeSelectorTermsFluent<?> fluent,NodeSelectorTerms instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public NodeSelectorTermsBuilder(NodeSelectorTerms instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  NodeSelectorTermsFluent<?> fluent;
  
  public NodeSelectorTerms build() {
    NodeSelectorTerms buildable = new NodeSelectorTerms();
    buildable.setMatchExpressions(fluent.buildMatchExpressions());
    buildable.setMatchFields(fluent.buildMatchFields());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}