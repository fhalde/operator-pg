package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class BuildContainerBuilder extends BuildContainerFluent<BuildContainerBuilder> implements VisitableBuilder<BuildContainer,BuildContainerBuilder>{
  public BuildContainerBuilder() {
    this(new BuildContainer());
  }
  
  public BuildContainerBuilder(BuildContainerFluent<?> fluent) {
    this(fluent, new BuildContainer());
  }
  
  public BuildContainerBuilder(BuildContainerFluent<?> fluent,BuildContainer instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public BuildContainerBuilder(BuildContainer instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  BuildContainerFluent<?> fluent;
  
  public BuildContainer build() {
    BuildContainer buildable = new BuildContainer();
    buildable.setEnv(fluent.buildEnv());
    buildable.setSecurityContext(fluent.buildSecurityContext());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}