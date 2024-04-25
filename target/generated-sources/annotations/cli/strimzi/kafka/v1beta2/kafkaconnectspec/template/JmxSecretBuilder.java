package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class JmxSecretBuilder extends JmxSecretFluent<JmxSecretBuilder> implements VisitableBuilder<JmxSecret,JmxSecretBuilder>{
  public JmxSecretBuilder() {
    this(new JmxSecret());
  }
  
  public JmxSecretBuilder(JmxSecretFluent<?> fluent) {
    this(fluent, new JmxSecret());
  }
  
  public JmxSecretBuilder(JmxSecretFluent<?> fluent,JmxSecret instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public JmxSecretBuilder(JmxSecret instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  JmxSecretFluent<?> fluent;
  
  public JmxSecret build() {
    JmxSecret buildable = new JmxSecret();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}