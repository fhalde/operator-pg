package cli.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ConfigBuilder extends ConfigFluent<ConfigBuilder> implements VisitableBuilder<Config,ConfigBuilder>{
  public ConfigBuilder() {
    this(new Config());
  }
  
  public ConfigBuilder(ConfigFluent<?> fluent) {
    this(fluent, new Config());
  }
  
  public ConfigBuilder(ConfigFluent<?> fluent,Config instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ConfigBuilder(Config instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ConfigFluent<?> fluent;
  
  public Config build() {
    Config buildable = new Config();
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}