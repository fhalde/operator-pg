package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class HostAliasesBuilder extends HostAliasesFluent<HostAliasesBuilder> implements VisitableBuilder<HostAliases,HostAliasesBuilder>{
  public HostAliasesBuilder() {
    this(new HostAliases());
  }
  
  public HostAliasesBuilder(HostAliasesFluent<?> fluent) {
    this(fluent, new HostAliases());
  }
  
  public HostAliasesBuilder(HostAliasesFluent<?> fluent,HostAliases instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public HostAliasesBuilder(HostAliases instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  HostAliasesFluent<?> fluent;
  
  public HostAliases build() {
    HostAliases buildable = new HostAliases();
    buildable.setHostnames(fluent.getHostnames());
    buildable.setIp(fluent.getIp());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}