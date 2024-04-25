package cli.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ExternalConfigurationBuilder extends ExternalConfigurationFluent<ExternalConfigurationBuilder> implements VisitableBuilder<ExternalConfiguration,ExternalConfigurationBuilder>{
  public ExternalConfigurationBuilder() {
    this(new ExternalConfiguration());
  }
  
  public ExternalConfigurationBuilder(ExternalConfigurationFluent<?> fluent) {
    this(fluent, new ExternalConfiguration());
  }
  
  public ExternalConfigurationBuilder(ExternalConfigurationFluent<?> fluent,ExternalConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ExternalConfigurationBuilder(ExternalConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ExternalConfigurationFluent<?> fluent;
  
  public ExternalConfiguration build() {
    ExternalConfiguration buildable = new ExternalConfiguration();
    buildable.setEnv(fluent.buildEnv());
    buildable.setVolumes(fluent.buildVolumes());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}