package cli.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class JvmOptionsBuilder extends JvmOptionsFluent<JvmOptionsBuilder> implements VisitableBuilder<JvmOptions,JvmOptionsBuilder>{
  public JvmOptionsBuilder() {
    this(new JvmOptions());
  }
  
  public JvmOptionsBuilder(JvmOptionsFluent<?> fluent) {
    this(fluent, new JvmOptions());
  }
  
  public JvmOptionsBuilder(JvmOptionsFluent<?> fluent,JvmOptions instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public JvmOptionsBuilder(JvmOptions instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  JvmOptionsFluent<?> fluent;
  
  public JvmOptions build() {
    JvmOptions buildable = new JvmOptions();
    buildable.set_XX(fluent.buildXX());
    buildable.set_Xms(fluent.getXms());
    buildable.set_Xmx(fluent.getXmx());
    buildable.setGcLoggingEnabled(fluent.getGcLoggingEnabled());
    buildable.setJavaSystemProperties(fluent.buildJavaSystemProperties());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}