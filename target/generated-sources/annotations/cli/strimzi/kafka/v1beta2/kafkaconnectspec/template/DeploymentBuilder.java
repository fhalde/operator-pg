package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class DeploymentBuilder extends DeploymentFluent<DeploymentBuilder> implements VisitableBuilder<Deployment,DeploymentBuilder>{
  public DeploymentBuilder() {
    this(new Deployment());
  }
  
  public DeploymentBuilder(DeploymentFluent<?> fluent) {
    this(fluent, new Deployment());
  }
  
  public DeploymentBuilder(DeploymentFluent<?> fluent,Deployment instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public DeploymentBuilder(Deployment instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  DeploymentFluent<?> fluent;
  
  public Deployment build() {
    Deployment buildable = new Deployment();
    buildable.setDeploymentStrategy(fluent.getDeploymentStrategy());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}