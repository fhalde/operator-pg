package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class AffinityBuilder extends AffinityFluent<AffinityBuilder> implements VisitableBuilder<Affinity,AffinityBuilder>{
  public AffinityBuilder() {
    this(new Affinity());
  }
  
  public AffinityBuilder(AffinityFluent<?> fluent) {
    this(fluent, new Affinity());
  }
  
  public AffinityBuilder(AffinityFluent<?> fluent,Affinity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public AffinityBuilder(Affinity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  AffinityFluent<?> fluent;
  
  public Affinity build() {
    Affinity buildable = new Affinity();
    buildable.setNodeAffinity(fluent.buildNodeAffinity());
    buildable.setPodAffinity(fluent.buildPodAffinity());
    buildable.setPodAntiAffinity(fluent.buildPodAntiAffinity());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}