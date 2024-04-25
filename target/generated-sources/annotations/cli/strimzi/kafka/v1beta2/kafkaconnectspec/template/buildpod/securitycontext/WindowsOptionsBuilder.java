package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.securitycontext;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class WindowsOptionsBuilder extends WindowsOptionsFluent<WindowsOptionsBuilder> implements VisitableBuilder<WindowsOptions,WindowsOptionsBuilder>{
  public WindowsOptionsBuilder() {
    this(new WindowsOptions());
  }
  
  public WindowsOptionsBuilder(WindowsOptionsFluent<?> fluent) {
    this(fluent, new WindowsOptions());
  }
  
  public WindowsOptionsBuilder(WindowsOptionsFluent<?> fluent,WindowsOptions instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public WindowsOptionsBuilder(WindowsOptions instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  WindowsOptionsFluent<?> fluent;
  
  public WindowsOptions build() {
    WindowsOptions buildable = new WindowsOptions();
    buildable.setGmsaCredentialSpec(fluent.getGmsaCredentialSpec());
    buildable.setGmsaCredentialSpecName(fluent.getGmsaCredentialSpecName());
    buildable.setHostProcess(fluent.getHostProcess());
    buildable.setRunAsUserName(fluent.getRunAsUserName());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}