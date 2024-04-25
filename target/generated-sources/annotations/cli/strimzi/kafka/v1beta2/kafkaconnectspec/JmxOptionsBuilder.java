package cli.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class JmxOptionsBuilder extends JmxOptionsFluent<JmxOptionsBuilder> implements VisitableBuilder<JmxOptions,JmxOptionsBuilder>{
  public JmxOptionsBuilder() {
    this(new JmxOptions());
  }
  
  public JmxOptionsBuilder(JmxOptionsFluent<?> fluent) {
    this(fluent, new JmxOptions());
  }
  
  public JmxOptionsBuilder(JmxOptionsFluent<?> fluent,JmxOptions instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public JmxOptionsBuilder(JmxOptions instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  JmxOptionsFluent<?> fluent;
  
  public JmxOptions build() {
    JmxOptions buildable = new JmxOptions();
    buildable.setAuthentication(fluent.buildAuthentication());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}