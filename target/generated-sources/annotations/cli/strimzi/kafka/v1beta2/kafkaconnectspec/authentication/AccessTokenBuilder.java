package cli.strimzi.kafka.v1beta2.kafkaconnectspec.authentication;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class AccessTokenBuilder extends AccessTokenFluent<AccessTokenBuilder> implements VisitableBuilder<AccessToken,AccessTokenBuilder>{
  public AccessTokenBuilder() {
    this(new AccessToken());
  }
  
  public AccessTokenBuilder(AccessTokenFluent<?> fluent) {
    this(fluent, new AccessToken());
  }
  
  public AccessTokenBuilder(AccessTokenFluent<?> fluent,AccessToken instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public AccessTokenBuilder(AccessToken instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  AccessTokenFluent<?> fluent;
  
  public AccessToken build() {
    AccessToken buildable = new AccessToken();
    buildable.setKey(fluent.getKey());
    buildable.setSecretName(fluent.getSecretName());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}