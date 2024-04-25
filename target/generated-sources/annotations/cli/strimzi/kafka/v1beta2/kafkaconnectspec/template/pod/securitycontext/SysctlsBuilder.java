package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.securitycontext;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SysctlsBuilder extends SysctlsFluent<SysctlsBuilder> implements VisitableBuilder<Sysctls,SysctlsBuilder>{
  public SysctlsBuilder() {
    this(new Sysctls());
  }
  
  public SysctlsBuilder(SysctlsFluent<?> fluent) {
    this(fluent, new Sysctls());
  }
  
  public SysctlsBuilder(SysctlsFluent<?> fluent,Sysctls instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SysctlsBuilder(Sysctls instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SysctlsFluent<?> fluent;
  
  public Sysctls build() {
    Sysctls buildable = new Sysctls();
    buildable.setName(fluent.getName());
    buildable.setValue(fluent.getValue());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}