package io.strimzi.kafka.v1beta2.kafkaconnectspec.resources;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ClaimsBuilder extends ClaimsFluent<ClaimsBuilder> implements VisitableBuilder<Claims,ClaimsBuilder>{
  public ClaimsBuilder() {
    this(new Claims());
  }
  
  public ClaimsBuilder(ClaimsFluent<?> fluent) {
    this(fluent, new Claims());
  }
  
  public ClaimsBuilder(ClaimsFluent<?> fluent,Claims instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ClaimsBuilder(Claims instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ClaimsFluent<?> fluent;
  
  public Claims build() {
    Claims buildable = new Claims();
    buildable.setName(fluent.getName());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}