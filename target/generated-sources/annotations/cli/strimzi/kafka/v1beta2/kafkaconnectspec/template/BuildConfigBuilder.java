package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class BuildConfigBuilder extends BuildConfigFluent<BuildConfigBuilder> implements VisitableBuilder<BuildConfig,BuildConfigBuilder>{
  public BuildConfigBuilder() {
    this(new BuildConfig());
  }
  
  public BuildConfigBuilder(BuildConfigFluent<?> fluent) {
    this(fluent, new BuildConfig());
  }
  
  public BuildConfigBuilder(BuildConfigFluent<?> fluent,BuildConfig instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public BuildConfigBuilder(BuildConfig instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  BuildConfigFluent<?> fluent;
  
  public BuildConfig build() {
    BuildConfig buildable = new BuildConfig();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setPullSecret(fluent.getPullSecret());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}