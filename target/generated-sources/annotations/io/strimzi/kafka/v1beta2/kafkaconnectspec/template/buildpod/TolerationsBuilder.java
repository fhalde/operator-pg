package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class TolerationsBuilder extends TolerationsFluent<TolerationsBuilder> implements VisitableBuilder<Tolerations,TolerationsBuilder>{
  public TolerationsBuilder() {
    this(new Tolerations());
  }
  
  public TolerationsBuilder(TolerationsFluent<?> fluent) {
    this(fluent, new Tolerations());
  }
  
  public TolerationsBuilder(TolerationsFluent<?> fluent,Tolerations instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public TolerationsBuilder(Tolerations instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  TolerationsFluent<?> fluent;
  
  public Tolerations build() {
    Tolerations buildable = new Tolerations();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setTolerationSeconds(fluent.getTolerationSeconds());
    buildable.setValue(fluent.getValue());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}