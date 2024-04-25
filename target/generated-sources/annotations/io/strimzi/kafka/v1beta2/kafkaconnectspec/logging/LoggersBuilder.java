package io.strimzi.kafka.v1beta2.kafkaconnectspec.logging;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class LoggersBuilder extends LoggersFluent<LoggersBuilder> implements VisitableBuilder<Loggers,LoggersBuilder>{
  public LoggersBuilder() {
    this(new Loggers());
  }
  
  public LoggersBuilder(LoggersFluent<?> fluent) {
    this(fluent, new Loggers());
  }
  
  public LoggersBuilder(LoggersFluent<?> fluent,Loggers instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public LoggersBuilder(Loggers instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  LoggersFluent<?> fluent;
  
  public Loggers build() {
    Loggers buildable = new Loggers();
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}