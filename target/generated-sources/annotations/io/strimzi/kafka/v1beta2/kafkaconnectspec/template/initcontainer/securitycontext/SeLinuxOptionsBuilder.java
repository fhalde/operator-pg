package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.initcontainer.securitycontext;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SeLinuxOptionsBuilder extends SeLinuxOptionsFluent<SeLinuxOptionsBuilder> implements VisitableBuilder<SeLinuxOptions,SeLinuxOptionsBuilder>{
  public SeLinuxOptionsBuilder() {
    this(new SeLinuxOptions());
  }
  
  public SeLinuxOptionsBuilder(SeLinuxOptionsFluent<?> fluent) {
    this(fluent, new SeLinuxOptions());
  }
  
  public SeLinuxOptionsBuilder(SeLinuxOptionsFluent<?> fluent,SeLinuxOptions instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SeLinuxOptionsBuilder(SeLinuxOptions instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SeLinuxOptionsFluent<?> fluent;
  
  public SeLinuxOptions build() {
    SeLinuxOptions buildable = new SeLinuxOptions();
    buildable.setLevel(fluent.getLevel());
    buildable.setRole(fluent.getRole());
    buildable.setType(fluent.getType());
    buildable.setUser(fluent.getUser());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}