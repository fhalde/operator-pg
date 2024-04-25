package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.jmxsecret;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class MetadataBuilder extends MetadataFluent<MetadataBuilder> implements VisitableBuilder<Metadata,MetadataBuilder>{
  public MetadataBuilder() {
    this(new Metadata());
  }
  
  public MetadataBuilder(MetadataFluent<?> fluent) {
    this(fluent, new Metadata());
  }
  
  public MetadataBuilder(MetadataFluent<?> fluent,Metadata instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public MetadataBuilder(Metadata instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  MetadataFluent<?> fluent;
  
  public Metadata build() {
    Metadata buildable = new Metadata();
    buildable.setAnnotations(fluent.buildAnnotations());
    buildable.setLabels(fluent.buildLabels());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}