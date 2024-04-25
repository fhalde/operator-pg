package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ImagePullSecretsBuilder extends ImagePullSecretsFluent<ImagePullSecretsBuilder> implements VisitableBuilder<ImagePullSecrets,ImagePullSecretsBuilder>{
  public ImagePullSecretsBuilder() {
    this(new ImagePullSecrets());
  }
  
  public ImagePullSecretsBuilder(ImagePullSecretsFluent<?> fluent) {
    this(fluent, new ImagePullSecrets());
  }
  
  public ImagePullSecretsBuilder(ImagePullSecretsFluent<?> fluent,ImagePullSecrets instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ImagePullSecretsBuilder(ImagePullSecrets instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ImagePullSecretsFluent<?> fluent;
  
  public ImagePullSecrets build() {
    ImagePullSecrets buildable = new ImagePullSecrets();
    buildable.setName(fluent.getName());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}