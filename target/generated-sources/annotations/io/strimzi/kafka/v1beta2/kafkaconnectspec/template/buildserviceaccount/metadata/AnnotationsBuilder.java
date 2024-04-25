package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildserviceaccount.metadata;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class AnnotationsBuilder extends AnnotationsFluent<AnnotationsBuilder> implements VisitableBuilder<Annotations,AnnotationsBuilder>{
  public AnnotationsBuilder() {
    this(new Annotations());
  }
  
  public AnnotationsBuilder(AnnotationsFluent<?> fluent) {
    this(fluent, new Annotations());
  }
  
  public AnnotationsBuilder(AnnotationsFluent<?> fluent,Annotations instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public AnnotationsBuilder(Annotations instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  AnnotationsFluent<?> fluent;
  
  public Annotations build() {
    Annotations buildable = new Annotations();
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}