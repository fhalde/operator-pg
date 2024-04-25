package cli.strimzi.kafka.v1beta2.kafkaconnectspec.resources;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class RequestsBuilder extends RequestsFluent<RequestsBuilder> implements VisitableBuilder<Requests,RequestsBuilder>{
  public RequestsBuilder() {
    this(new Requests());
  }
  
  public RequestsBuilder(RequestsFluent<?> fluent) {
    this(fluent, new Requests());
  }
  
  public RequestsBuilder(RequestsFluent<?> fluent,Requests instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public RequestsBuilder(Requests instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  RequestsFluent<?> fluent;
  
  public Requests build() {
    Requests buildable = new Requests();
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}