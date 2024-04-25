package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildcontainer;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildcontainer.securitycontext.CapabilitiesFluent;
import java.lang.String;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildcontainer.securitycontext.SeccompProfile;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildcontainer.securitycontext.SeccompProfileBuilder;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildcontainer.securitycontext.SeLinuxOptionsBuilder;
import java.util.LinkedHashMap;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildcontainer.securitycontext.CapabilitiesBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildcontainer.securitycontext.SeLinuxOptions;
import java.lang.Boolean;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildcontainer.securitycontext.WindowsOptionsFluent;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildcontainer.securitycontext.WindowsOptionsBuilder;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildcontainer.securitycontext.SeLinuxOptionsFluent;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildcontainer.securitycontext.WindowsOptions;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildcontainer.securitycontext.Capabilities;
import java.lang.Long;
import java.lang.Object;
import java.util.Map;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildcontainer.securitycontext.SeccompProfileFluent;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class SecurityContextFluent<A extends SecurityContextFluent<A>> extends BaseFluent<A>{
  public SecurityContextFluent() {
  }
  
  public SecurityContextFluent(SecurityContext instance) {
    this.copyInstance(instance);
  }
  private Boolean allowPrivilegeEscalation;
  private CapabilitiesBuilder capabilities;
  private Boolean privileged;
  private String procMount;
  private Boolean readOnlyRootFilesystem;
  private Long runAsGroup;
  private Boolean runAsNonRoot;
  private Long runAsUser;
  private SeLinuxOptionsBuilder seLinuxOptions;
  private SeccompProfileBuilder seccompProfile;
  private WindowsOptionsBuilder windowsOptions;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(SecurityContext instance) {
    instance = (instance != null ? instance : new SecurityContext());
    if (instance != null) {
          this.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation());
          this.withCapabilities(instance.getCapabilities());
          this.withPrivileged(instance.getPrivileged());
          this.withProcMount(instance.getProcMount());
          this.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem());
          this.withRunAsGroup(instance.getRunAsGroup());
          this.withRunAsNonRoot(instance.getRunAsNonRoot());
          this.withRunAsUser(instance.getRunAsUser());
          this.withSeLinuxOptions(instance.getSeLinuxOptions());
          this.withSeccompProfile(instance.getSeccompProfile());
          this.withWindowsOptions(instance.getWindowsOptions());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public Boolean getAllowPrivilegeEscalation() {
    return this.allowPrivilegeEscalation;
  }
  
  public A withAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    return (A) this;
  }
  
  public boolean hasAllowPrivilegeEscalation() {
    return this.allowPrivilegeEscalation != null;
  }
  
  public Capabilities buildCapabilities() {
    return this.capabilities != null ? this.capabilities.build() : null;
  }
  
  public A withCapabilities(Capabilities capabilities) {
    this._visitables.remove("capabilities");
    if (capabilities != null) {
        this.capabilities = new CapabilitiesBuilder(capabilities);
        this._visitables.get("capabilities").add(this.capabilities);
    } else {
        this.capabilities = null;
        this._visitables.get("capabilities").remove(this.capabilities);
    }
    return (A) this;
  }
  
  public boolean hasCapabilities() {
    return this.capabilities != null;
  }
  
  public CapabilitiesNested<A> withNewCapabilities() {
    return new CapabilitiesNested(null);
  }
  
  public CapabilitiesNested<A> withNewCapabilitiesLike(Capabilities item) {
    return new CapabilitiesNested(item);
  }
  
  public CapabilitiesNested<A> editIoCapabilities() {
    return withNewCapabilitiesLike(java.util.Optional.ofNullable(buildCapabilities()).orElse(null));
  }
  
  public CapabilitiesNested<A> editOrNewCapabilities() {
    return withNewCapabilitiesLike(java.util.Optional.ofNullable(buildCapabilities()).orElse(new CapabilitiesBuilder().build()));
  }
  
  public CapabilitiesNested<A> editOrNewCapabilitiesLike(Capabilities item) {
    return withNewCapabilitiesLike(java.util.Optional.ofNullable(buildCapabilities()).orElse(item));
  }
  
  public Boolean getPrivileged() {
    return this.privileged;
  }
  
  public A withPrivileged(Boolean privileged) {
    this.privileged = privileged;
    return (A) this;
  }
  
  public boolean hasPrivileged() {
    return this.privileged != null;
  }
  
  public String getProcMount() {
    return this.procMount;
  }
  
  public A withProcMount(String procMount) {
    this.procMount = procMount;
    return (A) this;
  }
  
  public boolean hasProcMount() {
    return this.procMount != null;
  }
  
  public Boolean getReadOnlyRootFilesystem() {
    return this.readOnlyRootFilesystem;
  }
  
  public A withReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    return (A) this;
  }
  
  public boolean hasReadOnlyRootFilesystem() {
    return this.readOnlyRootFilesystem != null;
  }
  
  public Long getRunAsGroup() {
    return this.runAsGroup;
  }
  
  public A withRunAsGroup(Long runAsGroup) {
    this.runAsGroup = runAsGroup;
    return (A) this;
  }
  
  public boolean hasRunAsGroup() {
    return this.runAsGroup != null;
  }
  
  public Boolean getRunAsNonRoot() {
    return this.runAsNonRoot;
  }
  
  public A withRunAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
    return (A) this;
  }
  
  public boolean hasRunAsNonRoot() {
    return this.runAsNonRoot != null;
  }
  
  public Long getRunAsUser() {
    return this.runAsUser;
  }
  
  public A withRunAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
    return (A) this;
  }
  
  public boolean hasRunAsUser() {
    return this.runAsUser != null;
  }
  
  public SeLinuxOptions buildSeLinuxOptions() {
    return this.seLinuxOptions != null ? this.seLinuxOptions.build() : null;
  }
  
  public A withSeLinuxOptions(SeLinuxOptions seLinuxOptions) {
    this._visitables.remove("seLinuxOptions");
    if (seLinuxOptions != null) {
        this.seLinuxOptions = new SeLinuxOptionsBuilder(seLinuxOptions);
        this._visitables.get("seLinuxOptions").add(this.seLinuxOptions);
    } else {
        this.seLinuxOptions = null;
        this._visitables.get("seLinuxOptions").remove(this.seLinuxOptions);
    }
    return (A) this;
  }
  
  public boolean hasSeLinuxOptions() {
    return this.seLinuxOptions != null;
  }
  
  public SeLinuxOptionsNested<A> withNewSeLinuxOptions() {
    return new SeLinuxOptionsNested(null);
  }
  
  public SeLinuxOptionsNested<A> withNewSeLinuxOptionsLike(SeLinuxOptions item) {
    return new SeLinuxOptionsNested(item);
  }
  
  public SeLinuxOptionsNested<A> editIoSeLinuxOptions() {
    return withNewSeLinuxOptionsLike(java.util.Optional.ofNullable(buildSeLinuxOptions()).orElse(null));
  }
  
  public SeLinuxOptionsNested<A> editOrNewSeLinuxOptions() {
    return withNewSeLinuxOptionsLike(java.util.Optional.ofNullable(buildSeLinuxOptions()).orElse(new SeLinuxOptionsBuilder().build()));
  }
  
  public SeLinuxOptionsNested<A> editOrNewSeLinuxOptionsLike(SeLinuxOptions item) {
    return withNewSeLinuxOptionsLike(java.util.Optional.ofNullable(buildSeLinuxOptions()).orElse(item));
  }
  
  public SeccompProfile buildSeccompProfile() {
    return this.seccompProfile != null ? this.seccompProfile.build() : null;
  }
  
  public A withSeccompProfile(SeccompProfile seccompProfile) {
    this._visitables.remove("seccompProfile");
    if (seccompProfile != null) {
        this.seccompProfile = new SeccompProfileBuilder(seccompProfile);
        this._visitables.get("seccompProfile").add(this.seccompProfile);
    } else {
        this.seccompProfile = null;
        this._visitables.get("seccompProfile").remove(this.seccompProfile);
    }
    return (A) this;
  }
  
  public boolean hasSeccompProfile() {
    return this.seccompProfile != null;
  }
  
  public SeccompProfileNested<A> withNewSeccompProfile() {
    return new SeccompProfileNested(null);
  }
  
  public SeccompProfileNested<A> withNewSeccompProfileLike(SeccompProfile item) {
    return new SeccompProfileNested(item);
  }
  
  public SeccompProfileNested<A> editIoSeccompProfile() {
    return withNewSeccompProfileLike(java.util.Optional.ofNullable(buildSeccompProfile()).orElse(null));
  }
  
  public SeccompProfileNested<A> editOrNewSeccompProfile() {
    return withNewSeccompProfileLike(java.util.Optional.ofNullable(buildSeccompProfile()).orElse(new SeccompProfileBuilder().build()));
  }
  
  public SeccompProfileNested<A> editOrNewSeccompProfileLike(SeccompProfile item) {
    return withNewSeccompProfileLike(java.util.Optional.ofNullable(buildSeccompProfile()).orElse(item));
  }
  
  public WindowsOptions buildWindowsOptions() {
    return this.windowsOptions != null ? this.windowsOptions.build() : null;
  }
  
  public A withWindowsOptions(WindowsOptions windowsOptions) {
    this._visitables.remove("windowsOptions");
    if (windowsOptions != null) {
        this.windowsOptions = new WindowsOptionsBuilder(windowsOptions);
        this._visitables.get("windowsOptions").add(this.windowsOptions);
    } else {
        this.windowsOptions = null;
        this._visitables.get("windowsOptions").remove(this.windowsOptions);
    }
    return (A) this;
  }
  
  public boolean hasWindowsOptions() {
    return this.windowsOptions != null;
  }
  
  public WindowsOptionsNested<A> withNewWindowsOptions() {
    return new WindowsOptionsNested(null);
  }
  
  public WindowsOptionsNested<A> withNewWindowsOptionsLike(WindowsOptions item) {
    return new WindowsOptionsNested(item);
  }
  
  public WindowsOptionsNested<A> editIoWindowsOptions() {
    return withNewWindowsOptionsLike(java.util.Optional.ofNullable(buildWindowsOptions()).orElse(null));
  }
  
  public WindowsOptionsNested<A> editOrNewWindowsOptions() {
    return withNewWindowsOptionsLike(java.util.Optional.ofNullable(buildWindowsOptions()).orElse(new WindowsOptionsBuilder().build()));
  }
  
  public WindowsOptionsNested<A> editOrNewWindowsOptionsLike(WindowsOptions item) {
    return withNewWindowsOptionsLike(java.util.Optional.ofNullable(buildWindowsOptions()).orElse(item));
  }
  
  public A addToAdditionalProperties(String key,Object value) {
    if(this.additionalProperties == null && key != null && value != null) { this.additionalProperties = new LinkedHashMap(); }
    if(key != null && value != null) {this.additionalProperties.put(key, value);} return (A)this;
  }
  
  public A addToAdditionalProperties(Map<String,Object> map) {
    if(this.additionalProperties == null && map != null) { this.additionalProperties = new LinkedHashMap(); }
    if(map != null) { this.additionalProperties.putAll(map);} return (A)this;
  }
  
  public A removeFromAdditionalProperties(String key) {
    if(this.additionalProperties == null) { return (A) this; }
    if(key != null && this.additionalProperties != null) {this.additionalProperties.remove(key);} return (A)this;
  }
  
  public A removeFromAdditionalProperties(Map<String,Object> map) {
    if(this.additionalProperties == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.additionalProperties != null){this.additionalProperties.remove(key);}}} return (A)this;
  }
  
  public Map<String,Object> getAdditionalProperties() {
    return this.additionalProperties;
  }
  
  public <K,V>A withAdditionalProperties(Map<String,Object> additionalProperties) {
    if (additionalProperties == null) {
      this.additionalProperties = null;
    } else {
      this.additionalProperties = new LinkedHashMap(additionalProperties);
    }
    return (A) this;
  }
  
  public boolean hasAdditionalProperties() {
    return this.additionalProperties != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    SecurityContextFluent that = (SecurityContextFluent) o;
    if (!java.util.Objects.equals(allowPrivilegeEscalation, that.allowPrivilegeEscalation)) return false;
    if (!java.util.Objects.equals(capabilities, that.capabilities)) return false;
    if (!java.util.Objects.equals(privileged, that.privileged)) return false;
    if (!java.util.Objects.equals(procMount, that.procMount)) return false;
    if (!java.util.Objects.equals(readOnlyRootFilesystem, that.readOnlyRootFilesystem)) return false;
    if (!java.util.Objects.equals(runAsGroup, that.runAsGroup)) return false;
    if (!java.util.Objects.equals(runAsNonRoot, that.runAsNonRoot)) return false;
    if (!java.util.Objects.equals(runAsUser, that.runAsUser)) return false;
    if (!java.util.Objects.equals(seLinuxOptions, that.seLinuxOptions)) return false;
    if (!java.util.Objects.equals(seccompProfile, that.seccompProfile)) return false;
    if (!java.util.Objects.equals(windowsOptions, that.windowsOptions)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(allowPrivilegeEscalation,  capabilities,  privileged,  procMount,  readOnlyRootFilesystem,  runAsGroup,  runAsNonRoot,  runAsUser,  seLinuxOptions,  seccompProfile,  windowsOptions,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (allowPrivilegeEscalation != null) { sb.append("allowPrivilegeEscalation:"); sb.append(allowPrivilegeEscalation + ","); }
    if (capabilities != null) { sb.append("capabilities:"); sb.append(capabilities + ","); }
    if (privileged != null) { sb.append("privileged:"); sb.append(privileged + ","); }
    if (procMount != null) { sb.append("procMount:"); sb.append(procMount + ","); }
    if (readOnlyRootFilesystem != null) { sb.append("readOnlyRootFilesystem:"); sb.append(readOnlyRootFilesystem + ","); }
    if (runAsGroup != null) { sb.append("runAsGroup:"); sb.append(runAsGroup + ","); }
    if (runAsNonRoot != null) { sb.append("runAsNonRoot:"); sb.append(runAsNonRoot + ","); }
    if (runAsUser != null) { sb.append("runAsUser:"); sb.append(runAsUser + ","); }
    if (seLinuxOptions != null) { sb.append("seLinuxOptions:"); sb.append(seLinuxOptions + ","); }
    if (seccompProfile != null) { sb.append("seccompProfile:"); sb.append(seccompProfile + ","); }
    if (windowsOptions != null) { sb.append("windowsOptions:"); sb.append(windowsOptions + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAllowPrivilegeEscalation() {
    return withAllowPrivilegeEscalation(true);
  }
  
  public A withPrivileged() {
    return withPrivileged(true);
  }
  
  public A withReadOnlyRootFilesystem() {
    return withReadOnlyRootFilesystem(true);
  }
  
  public A withRunAsNonRoot() {
    return withRunAsNonRoot(true);
  }
  public class CapabilitiesNested<N> extends CapabilitiesFluent<CapabilitiesNested<N>> implements Nested<N>{
    CapabilitiesNested(Capabilities item) {
      this.builder = new CapabilitiesBuilder(this, item);
    }
    CapabilitiesBuilder builder;
    
    public N and() {
      return (N) SecurityContextFluent.this.withCapabilities(builder.build());
    }
    
    public N endIoCapabilities() {
      return and();
    }
    
  
  }
  public class SeLinuxOptionsNested<N> extends SeLinuxOptionsFluent<SeLinuxOptionsNested<N>> implements Nested<N>{
    SeLinuxOptionsNested(SeLinuxOptions item) {
      this.builder = new SeLinuxOptionsBuilder(this, item);
    }
    SeLinuxOptionsBuilder builder;
    
    public N and() {
      return (N) SecurityContextFluent.this.withSeLinuxOptions(builder.build());
    }
    
    public N endIoSeLinuxOptions() {
      return and();
    }
    
  
  }
  public class SeccompProfileNested<N> extends SeccompProfileFluent<SeccompProfileNested<N>> implements Nested<N>{
    SeccompProfileNested(SeccompProfile item) {
      this.builder = new SeccompProfileBuilder(this, item);
    }
    SeccompProfileBuilder builder;
    
    public N and() {
      return (N) SecurityContextFluent.this.withSeccompProfile(builder.build());
    }
    
    public N endIoSeccompProfile() {
      return and();
    }
    
  
  }
  public class WindowsOptionsNested<N> extends WindowsOptionsFluent<WindowsOptionsNested<N>> implements Nested<N>{
    WindowsOptionsNested(WindowsOptions item) {
      this.builder = new WindowsOptionsBuilder(this, item);
    }
    WindowsOptionsBuilder builder;
    
    public N and() {
      return (N) SecurityContextFluent.this.withWindowsOptions(builder.build());
    }
    
    public N endIoWindowsOptions() {
      return and();
    }
    
  
  }

}