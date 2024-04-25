package cli.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class LoggingBuilder extends LoggingFluent<LoggingBuilder> implements VisitableBuilder<Logging,LoggingBuilder>{
  public LoggingBuilder() {
    this(new Logging());
  }
  
  public LoggingBuilder(LoggingFluent<?> fluent) {
    this(fluent, new Logging());
  }
  
  public LoggingBuilder(LoggingFluent<?> fluent,Logging instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public LoggingBuilder(Logging instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  LoggingFluent<?> fluent;
  
  public Logging build() {
    Logging buildable = new Logging();
    buildable.setLoggers(fluent.buildLoggers());
    buildable.setType(fluent.getType());
    buildable.setValueFrom(fluent.buildValueFrom());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}