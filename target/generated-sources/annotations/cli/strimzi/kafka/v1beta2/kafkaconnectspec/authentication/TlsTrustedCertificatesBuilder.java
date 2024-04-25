package cli.strimzi.kafka.v1beta2.kafkaconnectspec.authentication;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class TlsTrustedCertificatesBuilder extends TlsTrustedCertificatesFluent<TlsTrustedCertificatesBuilder> implements VisitableBuilder<TlsTrustedCertificates,TlsTrustedCertificatesBuilder>{
  public TlsTrustedCertificatesBuilder() {
    this(new TlsTrustedCertificates());
  }
  
  public TlsTrustedCertificatesBuilder(TlsTrustedCertificatesFluent<?> fluent) {
    this(fluent, new TlsTrustedCertificates());
  }
  
  public TlsTrustedCertificatesBuilder(TlsTrustedCertificatesFluent<?> fluent,TlsTrustedCertificates instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public TlsTrustedCertificatesBuilder(TlsTrustedCertificates instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  TlsTrustedCertificatesFluent<?> fluent;
  
  public TlsTrustedCertificates build() {
    TlsTrustedCertificates buildable = new TlsTrustedCertificates();
    buildable.setCertificate(fluent.getCertificate());
    buildable.setSecretName(fluent.getSecretName());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}