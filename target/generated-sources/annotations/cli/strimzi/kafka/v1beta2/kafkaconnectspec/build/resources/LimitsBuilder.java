package cli.strimzi.kafka.v1beta2.kafkaconnectspec.build.resources;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class LimitsBuilder extends LimitsFluent<LimitsBuilder> implements VisitableBuilder<Limits,LimitsBuilder>{
  public LimitsBuilder() {
    this(new Limits());
  }
  
  public LimitsBuilder(LimitsFluent<?> fluent) {
    this(fluent, new Limits());
  }
  
  public LimitsBuilder(LimitsFluent<?> fluent,Limits instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public LimitsBuilder(Limits instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  LimitsFluent<?> fluent;
  
  public Limits build() {
    Limits buildable = new Limits();
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}