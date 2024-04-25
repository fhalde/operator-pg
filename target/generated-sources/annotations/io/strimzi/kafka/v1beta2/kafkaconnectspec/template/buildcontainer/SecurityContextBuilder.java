package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildcontainer;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class SecurityContextBuilder extends SecurityContextFluent<SecurityContextBuilder> implements VisitableBuilder<SecurityContext,SecurityContextBuilder>{
  public SecurityContextBuilder() {
    this(new SecurityContext());
  }
  
  public SecurityContextBuilder(SecurityContextFluent<?> fluent) {
    this(fluent, new SecurityContext());
  }
  
  public SecurityContextBuilder(SecurityContextFluent<?> fluent,SecurityContext instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public SecurityContextBuilder(SecurityContext instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  SecurityContextFluent<?> fluent;
  
  public SecurityContext build() {
    SecurityContext buildable = new SecurityContext();
    buildable.setAllowPrivilegeEscalation(fluent.getAllowPrivilegeEscalation());
    buildable.setCapabilities(fluent.buildCapabilities());
    buildable.setPrivileged(fluent.getPrivileged());
    buildable.setProcMount(fluent.getProcMount());
    buildable.setReadOnlyRootFilesystem(fluent.getReadOnlyRootFilesystem());
    buildable.setRunAsGroup(fluent.getRunAsGroup());
    buildable.setRunAsNonRoot(fluent.getRunAsNonRoot());
    buildable.setRunAsUser(fluent.getRunAsUser());
    buildable.setSeLinuxOptions(fluent.buildSeLinuxOptions());
    buildable.setSeccompProfile(fluent.buildSeccompProfile());
    buildable.setWindowsOptions(fluent.buildWindowsOptions());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}