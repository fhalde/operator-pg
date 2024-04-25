package io.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ClusterRoleBindingBuilder extends ClusterRoleBindingFluent<ClusterRoleBindingBuilder> implements VisitableBuilder<ClusterRoleBinding,ClusterRoleBindingBuilder>{
  public ClusterRoleBindingBuilder() {
    this(new ClusterRoleBinding());
  }
  
  public ClusterRoleBindingBuilder(ClusterRoleBindingFluent<?> fluent) {
    this(fluent, new ClusterRoleBinding());
  }
  
  public ClusterRoleBindingBuilder(ClusterRoleBindingFluent<?> fluent,ClusterRoleBinding instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ClusterRoleBindingBuilder(ClusterRoleBinding instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ClusterRoleBindingFluent<?> fluent;
  
  public ClusterRoleBinding build() {
    ClusterRoleBinding buildable = new ClusterRoleBinding();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}