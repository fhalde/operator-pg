package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ApiServiceBuilder extends ApiServiceFluent<ApiServiceBuilder> implements VisitableBuilder<ApiService,ApiServiceBuilder>{
  public ApiServiceBuilder() {
    this(new ApiService());
  }
  
  public ApiServiceBuilder(ApiServiceFluent<?> fluent) {
    this(fluent, new ApiService());
  }
  
  public ApiServiceBuilder(ApiServiceFluent<?> fluent,ApiService instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ApiServiceBuilder(ApiService instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ApiServiceFluent<?> fluent;
  
  public ApiService build() {
    ApiService buildable = new ApiService();
    buildable.setIpFamilies(fluent.getIpFamilies());
    buildable.setIpFamilyPolicy(fluent.getIpFamilyPolicy());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}