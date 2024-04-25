package cli.strimzi.kafka.v1beta2.kafkaconnectspec.authentication;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class CertificateAndKeyBuilder extends CertificateAndKeyFluent<CertificateAndKeyBuilder> implements VisitableBuilder<CertificateAndKey,CertificateAndKeyBuilder>{
  public CertificateAndKeyBuilder() {
    this(new CertificateAndKey());
  }
  
  public CertificateAndKeyBuilder(CertificateAndKeyFluent<?> fluent) {
    this(fluent, new CertificateAndKey());
  }
  
  public CertificateAndKeyBuilder(CertificateAndKeyFluent<?> fluent,CertificateAndKey instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public CertificateAndKeyBuilder(CertificateAndKey instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  CertificateAndKeyFluent<?> fluent;
  
  public CertificateAndKey build() {
    CertificateAndKey buildable = new CertificateAndKey();
    buildable.setCertificate(fluent.getCertificate());
    buildable.setKey(fluent.getKey());
    buildable.setSecretName(fluent.getSecretName());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}