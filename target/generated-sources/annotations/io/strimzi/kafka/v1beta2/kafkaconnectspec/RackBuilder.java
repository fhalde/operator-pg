package io.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class RackBuilder extends RackFluent<RackBuilder> implements VisitableBuilder<Rack,RackBuilder>{
  public RackBuilder() {
    this(new Rack());
  }
  
  public RackBuilder(RackFluent<?> fluent) {
    this(fluent, new Rack());
  }
  
  public RackBuilder(RackFluent<?> fluent,Rack instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public RackBuilder(Rack instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  RackFluent<?> fluent;
  
  public Rack build() {
    Rack buildable = new Rack();
    buildable.setTopologyKey(fluent.getTopologyKey());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}