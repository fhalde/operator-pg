package cli.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class TemplateBuilder extends TemplateFluent<TemplateBuilder> implements VisitableBuilder<Template,TemplateBuilder>{
  public TemplateBuilder() {
    this(new Template());
  }
  
  public TemplateBuilder(TemplateFluent<?> fluent) {
    this(fluent, new Template());
  }
  
  public TemplateBuilder(TemplateFluent<?> fluent,Template instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public TemplateBuilder(Template instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  TemplateFluent<?> fluent;
  
  public Template build() {
    Template buildable = new Template();
    buildable.setApiService(fluent.buildApiService());
    buildable.setBuildConfig(fluent.buildBuildConfig());
    buildable.setBuildContainer(fluent.buildBuildContainer());
    buildable.setBuildPod(fluent.buildBuildPod());
    buildable.setBuildServiceAccount(fluent.buildBuildServiceAccount());
    buildable.setClusterRoleBinding(fluent.buildClusterRoleBinding());
    buildable.setConnectContainer(fluent.buildConnectContainer());
    buildable.setDeployment(fluent.buildDeployment());
    buildable.setHeadlessService(fluent.buildHeadlessService());
    buildable.setInitContainer(fluent.buildInitContainer());
    buildable.setJmxSecret(fluent.buildJmxSecret());
    buildable.setPod(fluent.buildPod());
    buildable.setPodDisruptionBudget(fluent.buildPodDisruptionBudget());
    buildable.setPodSet(fluent.buildPodSet());
    buildable.setServiceAccount(fluent.buildServiceAccount());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}