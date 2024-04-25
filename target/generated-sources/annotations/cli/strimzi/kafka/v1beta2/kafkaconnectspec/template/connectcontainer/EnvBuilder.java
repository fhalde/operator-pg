package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.connectcontainer;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class EnvBuilder extends EnvFluent<EnvBuilder> implements VisitableBuilder<Env,EnvBuilder>{
  public EnvBuilder() {
    this(new Env());
  }
  
  public EnvBuilder(EnvFluent<?> fluent) {
    this(fluent, new Env());
  }
  
  public EnvBuilder(EnvFluent<?> fluent,Env instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public EnvBuilder(Env instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  EnvFluent<?> fluent;
  
  public Env build() {
    Env buildable = new Env();
    buildable.setName(fluent.getName());
    buildable.setValue(fluent.getValue());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}