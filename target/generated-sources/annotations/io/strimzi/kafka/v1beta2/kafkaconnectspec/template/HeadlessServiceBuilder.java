package io.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class HeadlessServiceBuilder extends HeadlessServiceFluent<HeadlessServiceBuilder> implements VisitableBuilder<HeadlessService,HeadlessServiceBuilder>{
  public HeadlessServiceBuilder() {
    this(new HeadlessService());
  }
  
  public HeadlessServiceBuilder(HeadlessServiceFluent<?> fluent) {
    this(fluent, new HeadlessService());
  }
  
  public HeadlessServiceBuilder(HeadlessServiceFluent<?> fluent,HeadlessService instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public HeadlessServiceBuilder(HeadlessService instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  HeadlessServiceFluent<?> fluent;
  
  public HeadlessService build() {
    HeadlessService buildable = new HeadlessService();
    buildable.setIpFamilies(fluent.getIpFamilies());
    buildable.setIpFamilyPolicy(fluent.getIpFamilyPolicy());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}