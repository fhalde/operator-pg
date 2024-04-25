package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PodDisruptionBudgetBuilder extends PodDisruptionBudgetFluent<PodDisruptionBudgetBuilder> implements VisitableBuilder<PodDisruptionBudget,PodDisruptionBudgetBuilder>{
  public PodDisruptionBudgetBuilder() {
    this(new PodDisruptionBudget());
  }
  
  public PodDisruptionBudgetBuilder(PodDisruptionBudgetFluent<?> fluent) {
    this(fluent, new PodDisruptionBudget());
  }
  
  public PodDisruptionBudgetBuilder(PodDisruptionBudgetFluent<?> fluent,PodDisruptionBudget instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PodDisruptionBudgetBuilder(PodDisruptionBudget instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PodDisruptionBudgetFluent<?> fluent;
  
  public PodDisruptionBudget build() {
    PodDisruptionBudget buildable = new PodDisruptionBudget();
    buildable.setMaxUnavailable(fluent.getMaxUnavailable());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}