package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PodSetBuilder extends PodSetFluent<PodSetBuilder> implements VisitableBuilder<PodSet,PodSetBuilder>{
  public PodSetBuilder() {
    this(new PodSet());
  }
  
  public PodSetBuilder(PodSetFluent<?> fluent) {
    this(fluent, new PodSet());
  }
  
  public PodSetBuilder(PodSetFluent<?> fluent,PodSet instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PodSetBuilder(PodSet instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PodSetFluent<?> fluent;
  
  public PodSet build() {
    PodSet buildable = new PodSet();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}