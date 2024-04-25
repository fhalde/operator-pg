package io.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class LivenessProbeBuilder extends LivenessProbeFluent<LivenessProbeBuilder> implements VisitableBuilder<LivenessProbe,LivenessProbeBuilder>{
  public LivenessProbeBuilder() {
    this(new LivenessProbe());
  }
  
  public LivenessProbeBuilder(LivenessProbeFluent<?> fluent) {
    this(fluent, new LivenessProbe());
  }
  
  public LivenessProbeBuilder(LivenessProbeFluent<?> fluent,LivenessProbe instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public LivenessProbeBuilder(LivenessProbe instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  LivenessProbeFluent<?> fluent;
  
  public LivenessProbe build() {
    LivenessProbe buildable = new LivenessProbe();
    buildable.setFailureThreshold(fluent.getFailureThreshold());
    buildable.setInitialDelaySeconds(fluent.getInitialDelaySeconds());
    buildable.setPeriodSeconds(fluent.getPeriodSeconds());
    buildable.setSuccessThreshold(fluent.getSuccessThreshold());
    buildable.setTimeoutSeconds(fluent.getTimeoutSeconds());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}