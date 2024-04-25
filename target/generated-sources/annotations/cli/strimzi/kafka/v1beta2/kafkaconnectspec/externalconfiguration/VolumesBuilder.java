package cli.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class VolumesBuilder extends VolumesFluent<VolumesBuilder> implements VisitableBuilder<Volumes,VolumesBuilder>{
  public VolumesBuilder() {
    this(new Volumes());
  }
  
  public VolumesBuilder(VolumesFluent<?> fluent) {
    this(fluent, new Volumes());
  }
  
  public VolumesBuilder(VolumesFluent<?> fluent,Volumes instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public VolumesBuilder(Volumes instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  VolumesFluent<?> fluent;
  
  public Volumes build() {
    Volumes buildable = new Volumes();
    buildable.setConfigMap(fluent.buildConfigMap());
    buildable.setName(fluent.getName());
    buildable.setSecret(fluent.buildSecret());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}