package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PreferenceBuilder extends PreferenceFluent<PreferenceBuilder> implements VisitableBuilder<Preference,PreferenceBuilder>{
  public PreferenceBuilder() {
    this(new Preference());
  }
  
  public PreferenceBuilder(PreferenceFluent<?> fluent) {
    this(fluent, new Preference());
  }
  
  public PreferenceBuilder(PreferenceFluent<?> fluent,Preference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PreferenceBuilder(Preference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PreferenceFluent<?> fluent;
  
  public Preference build() {
    Preference buildable = new Preference();
    buildable.setMatchExpressions(fluent.buildMatchExpressions());
    buildable.setMatchFields(fluent.buildMatchFields());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}