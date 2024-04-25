package cli.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ResourcesBuilder extends ResourcesFluent<ResourcesBuilder> implements VisitableBuilder<Resources,ResourcesBuilder>{
  public ResourcesBuilder() {
    this(new Resources());
  }
  
  public ResourcesBuilder(ResourcesFluent<?> fluent) {
    this(fluent, new Resources());
  }
  
  public ResourcesBuilder(ResourcesFluent<?> fluent,Resources instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ResourcesBuilder(Resources instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ResourcesFluent<?> fluent;
  
  public Resources build() {
    Resources buildable = new Resources();
    buildable.setClaims(fluent.buildClaims());
    buildable.setLimits(fluent.buildLimits());
    buildable.setRequests(fluent.buildRequests());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}