package cli.strimzi.kafka.v1beta2.kafkaconnectspec.build;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class OutputBuilder extends OutputFluent<OutputBuilder> implements VisitableBuilder<Output,OutputBuilder>{
  public OutputBuilder() {
    this(new Output());
  }
  
  public OutputBuilder(OutputFluent<?> fluent) {
    this(fluent, new Output());
  }
  
  public OutputBuilder(OutputFluent<?> fluent,Output instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public OutputBuilder(Output instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  OutputFluent<?> fluent;
  
  public Output build() {
    Output buildable = new Output();
    buildable.setAdditionalKanikoOptions(fluent.getAdditionalKanikoOptions());
    buildable.setImage(fluent.getImage());
    buildable.setPushSecret(fluent.getPushSecret());
    buildable.setType(fluent.getType());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}