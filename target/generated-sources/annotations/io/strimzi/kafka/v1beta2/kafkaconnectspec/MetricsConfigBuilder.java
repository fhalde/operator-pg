package io.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class MetricsConfigBuilder extends MetricsConfigFluent<MetricsConfigBuilder> implements VisitableBuilder<MetricsConfig,MetricsConfigBuilder>{
  public MetricsConfigBuilder() {
    this(new MetricsConfig());
  }
  
  public MetricsConfigBuilder(MetricsConfigFluent<?> fluent) {
    this(fluent, new MetricsConfig());
  }
  
  public MetricsConfigBuilder(MetricsConfigFluent<?> fluent,MetricsConfig instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public MetricsConfigBuilder(MetricsConfig instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  MetricsConfigFluent<?> fluent;
  
  public MetricsConfig build() {
    MetricsConfig buildable = new MetricsConfig();
    buildable.setType(fluent.getType());
    buildable.setValueFrom(fluent.buildValueFrom());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}