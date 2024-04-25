package cli.strimzi.kafka.v1beta2.kafkaconnectspec.build.plugins;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ArtifactsBuilder extends ArtifactsFluent<ArtifactsBuilder> implements VisitableBuilder<Artifacts,ArtifactsBuilder>{
  public ArtifactsBuilder() {
    this(new Artifacts());
  }
  
  public ArtifactsBuilder(ArtifactsFluent<?> fluent) {
    this(fluent, new Artifacts());
  }
  
  public ArtifactsBuilder(ArtifactsFluent<?> fluent,Artifacts instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ArtifactsBuilder(Artifacts instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ArtifactsFluent<?> fluent;
  
  public Artifacts build() {
    Artifacts buildable = new Artifacts();
    buildable.setArtifact(fluent.getArtifact());
    buildable.setFileName(fluent.getFileName());
    buildable.setGroup(fluent.getGroup());
    buildable.setInsecure(fluent.getInsecure());
    buildable.setRepository(fluent.getRepository());
    buildable.setSha512sum(fluent.getSha512sum());
    buildable.setType(fluent.getType());
    buildable.setUrl(fluent.getUrl());
    buildable.setVersion(fluent.getVersion());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}