package cli.strimzi.kafka.v1beta2.kafkaconnectspec.tls;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class TrustedCertificatesBuilder extends TrustedCertificatesFluent<TrustedCertificatesBuilder> implements VisitableBuilder<TrustedCertificates,TrustedCertificatesBuilder>{
  public TrustedCertificatesBuilder() {
    this(new TrustedCertificates());
  }
  
  public TrustedCertificatesBuilder(TrustedCertificatesFluent<?> fluent) {
    this(fluent, new TrustedCertificates());
  }
  
  public TrustedCertificatesBuilder(TrustedCertificatesFluent<?> fluent,TrustedCertificates instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public TrustedCertificatesBuilder(TrustedCertificates instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  TrustedCertificatesFluent<?> fluent;
  
  public TrustedCertificates build() {
    TrustedCertificates buildable = new TrustedCertificates();
    buildable.setCertificate(fluent.getCertificate());
    buildable.setSecretName(fluent.getSecretName());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}