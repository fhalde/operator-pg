package cli.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class TlsBuilder extends TlsFluent<TlsBuilder> implements VisitableBuilder<Tls,TlsBuilder>{
  public TlsBuilder() {
    this(new Tls());
  }
  
  public TlsBuilder(TlsFluent<?> fluent) {
    this(fluent, new Tls());
  }
  
  public TlsBuilder(TlsFluent<?> fluent,Tls instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public TlsBuilder(Tls instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  TlsFluent<?> fluent;
  
  public Tls build() {
    Tls buildable = new Tls();
    buildable.setTrustedCertificates(fluent.buildTrustedCertificates());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}