package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.preferredduringschedulingignoredduringexecution.podaffinityterm.labelselector;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class MatchLabelsBuilder extends MatchLabelsFluent<MatchLabelsBuilder> implements VisitableBuilder<MatchLabels,MatchLabelsBuilder>{
  public MatchLabelsBuilder() {
    this(new MatchLabels());
  }
  
  public MatchLabelsBuilder(MatchLabelsFluent<?> fluent) {
    this(fluent, new MatchLabels());
  }
  
  public MatchLabelsBuilder(MatchLabelsFluent<?> fluent,MatchLabels instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public MatchLabelsBuilder(MatchLabels instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  MatchLabelsFluent<?> fluent;
  
  public MatchLabels build() {
    MatchLabels buildable = new MatchLabels();
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}