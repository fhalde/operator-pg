package io.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class BuildServiceAccountBuilder extends BuildServiceAccountFluent<BuildServiceAccountBuilder> implements VisitableBuilder<BuildServiceAccount,BuildServiceAccountBuilder>{
  public BuildServiceAccountBuilder() {
    this(new BuildServiceAccount());
  }
  
  public BuildServiceAccountBuilder(BuildServiceAccountFluent<?> fluent) {
    this(fluent, new BuildServiceAccount());
  }
  
  public BuildServiceAccountBuilder(BuildServiceAccountFluent<?> fluent,BuildServiceAccount instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public BuildServiceAccountBuilder(BuildServiceAccount instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  BuildServiceAccountFluent<?> fluent;
  
  public BuildServiceAccount build() {
    BuildServiceAccount buildable = new BuildServiceAccount();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}