package io.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ReadinessProbeBuilder extends ReadinessProbeFluent<ReadinessProbeBuilder> implements VisitableBuilder<ReadinessProbe,ReadinessProbeBuilder>{
  public ReadinessProbeBuilder() {
    this(new ReadinessProbe());
  }
  
  public ReadinessProbeBuilder(ReadinessProbeFluent<?> fluent) {
    this(fluent, new ReadinessProbe());
  }
  
  public ReadinessProbeBuilder(ReadinessProbeFluent<?> fluent,ReadinessProbe instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ReadinessProbeBuilder(ReadinessProbe instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ReadinessProbeFluent<?> fluent;
  
  public ReadinessProbe build() {
    ReadinessProbe buildable = new ReadinessProbe();
    buildable.setFailureThreshold(fluent.getFailureThreshold());
    buildable.setInitialDelaySeconds(fluent.getInitialDelaySeconds());
    buildable.setPeriodSeconds(fluent.getPeriodSeconds());
    buildable.setSuccessThreshold(fluent.getSuccessThreshold());
    buildable.setTimeoutSeconds(fluent.getTimeoutSeconds());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}