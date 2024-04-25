package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.securitycontext.Sysctls;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.securitycontext.SeccompProfile;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.securitycontext.SeccompProfileBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.securitycontext.SeLinuxOptionsBuilder;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.securitycontext.SeLinuxOptions;
import java.util.List;
import java.lang.Boolean;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.securitycontext.WindowsOptionsFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.securitycontext.SysctlsBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.securitycontext.WindowsOptionsBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.securitycontext.SeLinuxOptionsFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.securitycontext.WindowsOptions;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.securitycontext.SeccompProfileFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.securitycontext.SysctlsFluent;

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
  private Long fsGroup;
  private String fsGroupChangePolicy;
  private Long runAsGroup;
  private Boolean runAsNonRoot;
  private Long runAsUser;
  private SeLinuxOptionsBuilder seLinuxOptions;
  private SeccompProfileBuilder seccompProfile;
  private List<Long> supplementalGroups;
  private ArrayList<SysctlsBuilder> sysctls;
  private WindowsOptionsBuilder windowsOptions;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(SecurityContext instance) {
    instance = (instance != null ? instance : new SecurityContext());
    if (instance != null) {
          this.withFsGroup(instance.getFsGroup());
          this.withFsGroupChangePolicy(instance.getFsGroupChangePolicy());
          this.withRunAsGroup(instance.getRunAsGroup());
          this.withRunAsNonRoot(instance.getRunAsNonRoot());
          this.withRunAsUser(instance.getRunAsUser());
          this.withSeLinuxOptions(instance.getSeLinuxOptions());
          this.withSeccompProfile(instance.getSeccompProfile());
          this.withSupplementalGroups(instance.getSupplementalGroups());
          this.withSysctls(instance.getSysctls());
          this.withWindowsOptions(instance.getWindowsOptions());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public Long getFsGroup() {
    return this.fsGroup;
  }
  
  public A withFsGroup(Long fsGroup) {
    this.fsGroup = fsGroup;
    return (A) this;
  }
  
  public boolean hasFsGroup() {
    return this.fsGroup != null;
  }
  
  public String getFsGroupChangePolicy() {
    return this.fsGroupChangePolicy;
  }
  
  public A withFsGroupChangePolicy(String fsGroupChangePolicy) {
    this.fsGroupChangePolicy = fsGroupChangePolicy;
    return (A) this;
  }
  
  public boolean hasFsGroupChangePolicy() {
    return this.fsGroupChangePolicy != null;
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
  
  public SeLinuxOptionsNested<A> editBuildpodSeLinuxOptions() {
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
  
  public SeccompProfileNested<A> editBuildpodSeccompProfile() {
    return withNewSeccompProfileLike(java.util.Optional.ofNullable(buildSeccompProfile()).orElse(null));
  }
  
  public SeccompProfileNested<A> editOrNewSeccompProfile() {
    return withNewSeccompProfileLike(java.util.Optional.ofNullable(buildSeccompProfile()).orElse(new SeccompProfileBuilder().build()));
  }
  
  public SeccompProfileNested<A> editOrNewSeccompProfileLike(SeccompProfile item) {
    return withNewSeccompProfileLike(java.util.Optional.ofNullable(buildSeccompProfile()).orElse(item));
  }
  
  public A addToSupplementalGroups(int index,Long item) {
    if (this.supplementalGroups == null) {this.supplementalGroups = new ArrayList<Long>();}
    this.supplementalGroups.add(index, item);
    return (A)this;
  }
  
  public A setToSupplementalGroups(int index,Long item) {
    if (this.supplementalGroups == null) {this.supplementalGroups = new ArrayList<Long>();}
    this.supplementalGroups.set(index, item); return (A)this;
  }
  
  public A addToSupplementalGroups(java.lang.Long... items) {
    if (this.supplementalGroups == null) {this.supplementalGroups = new ArrayList<Long>();}
    for (Long item : items) {this.supplementalGroups.add(item);} return (A)this;
  }
  
  public A addAllToSupplementalGroups(Collection<Long> items) {
    if (this.supplementalGroups == null) {this.supplementalGroups = new ArrayList<Long>();}
    for (Long item : items) {this.supplementalGroups.add(item);} return (A)this;
  }
  
  public A removeFromSupplementalGroups(java.lang.Long... items) {
    if (this.supplementalGroups == null) return (A)this;
    for (Long item : items) { this.supplementalGroups.remove(item);} return (A)this;
  }
  
  public A removeAllFromSupplementalGroups(Collection<Long> items) {
    if (this.supplementalGroups == null) return (A)this;
    for (Long item : items) { this.supplementalGroups.remove(item);} return (A)this;
  }
  
  public List<Long> getSupplementalGroups() {
    return this.supplementalGroups;
  }
  
  public Long getSupplementalGroup(int index) {
    return this.supplementalGroups.get(index);
  }
  
  public Long getFirstSupplementalGroup() {
    return this.supplementalGroups.get(0);
  }
  
  public Long getLastSupplementalGroup() {
    return this.supplementalGroups.get(supplementalGroups.size() - 1);
  }
  
  public Long getMatchingSupplementalGroup(Predicate<Long> predicate) {
      for (Long item : supplementalGroups) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingSupplementalGroup(Predicate<Long> predicate) {
      for (Long item : supplementalGroups) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withSupplementalGroups(List<Long> supplementalGroups) {
    if (supplementalGroups != null) {
        this.supplementalGroups = new ArrayList();
        for (Long item : supplementalGroups) {
          this.addToSupplementalGroups(item);
        }
    } else {
      this.supplementalGroups = null;
    }
    return (A) this;
  }
  
  public A withSupplementalGroups(java.lang.Long... supplementalGroups) {
    if (this.supplementalGroups != null) {
        this.supplementalGroups.clear();
        _visitables.remove("supplementalGroups");
    }
    if (supplementalGroups != null) {
      for (Long item : supplementalGroups) {
        this.addToSupplementalGroups(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasSupplementalGroups() {
    return this.supplementalGroups != null && !this.supplementalGroups.isEmpty();
  }
  
  public A addToSysctls(int index,Sysctls item) {
    if (this.sysctls == null) {this.sysctls = new ArrayList<SysctlsBuilder>();}
    SysctlsBuilder builder = new SysctlsBuilder(item);
    if (index < 0 || index >= sysctls.size()) { _visitables.get("sysctls").add(builder); sysctls.add(builder); } else { _visitables.get("sysctls").add(index, builder); sysctls.add(index, builder);}
    return (A)this;
  }
  
  public A setToSysctls(int index,Sysctls item) {
    if (this.sysctls == null) {this.sysctls = new ArrayList<SysctlsBuilder>();}
    SysctlsBuilder builder = new SysctlsBuilder(item);
    if (index < 0 || index >= sysctls.size()) { _visitables.get("sysctls").add(builder); sysctls.add(builder); } else { _visitables.get("sysctls").set(index, builder); sysctls.set(index, builder);}
    return (A)this;
  }
  
  public A addToSysctls(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.securitycontext.Sysctls... items) {
    if (this.sysctls == null) {this.sysctls = new ArrayList<SysctlsBuilder>();}
    for (Sysctls item : items) {SysctlsBuilder builder = new SysctlsBuilder(item);_visitables.get("sysctls").add(builder);this.sysctls.add(builder);} return (A)this;
  }
  
  public A addAllToSysctls(Collection<Sysctls> items) {
    if (this.sysctls == null) {this.sysctls = new ArrayList<SysctlsBuilder>();}
    for (Sysctls item : items) {SysctlsBuilder builder = new SysctlsBuilder(item);_visitables.get("sysctls").add(builder);this.sysctls.add(builder);} return (A)this;
  }
  
  public A removeFromSysctls(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.securitycontext.Sysctls... items) {
    if (this.sysctls == null) return (A)this;
    for (Sysctls item : items) {SysctlsBuilder builder = new SysctlsBuilder(item);_visitables.get("sysctls").remove(builder); this.sysctls.remove(builder);} return (A)this;
  }
  
  public A removeAllFromSysctls(Collection<Sysctls> items) {
    if (this.sysctls == null) return (A)this;
    for (Sysctls item : items) {SysctlsBuilder builder = new SysctlsBuilder(item);_visitables.get("sysctls").remove(builder); this.sysctls.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromSysctls(Predicate<SysctlsBuilder> predicate) {
    if (sysctls == null) return (A) this;
    final Iterator<SysctlsBuilder> each = sysctls.iterator();
    final List visitables = _visitables.get("sysctls");
    while (each.hasNext()) {
      SysctlsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Sysctls> buildSysctls() {
    return this.sysctls != null ? build(sysctls) : null;
  }
  
  public Sysctls buildSysctl(int index) {
    return this.sysctls.get(index).build();
  }
  
  public Sysctls buildFirstSysctl() {
    return this.sysctls.get(0).build();
  }
  
  public Sysctls buildLastSysctl() {
    return this.sysctls.get(sysctls.size() - 1).build();
  }
  
  public Sysctls buildMatchingSysctl(Predicate<SysctlsBuilder> predicate) {
      for (SysctlsBuilder item : sysctls) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingSysctl(Predicate<SysctlsBuilder> predicate) {
      for (SysctlsBuilder item : sysctls) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withSysctls(List<Sysctls> sysctls) {
    if (this.sysctls != null) {
      this._visitables.get("sysctls").clear();
    }
    if (sysctls != null) {
        this.sysctls = new ArrayList();
        for (Sysctls item : sysctls) {
          this.addToSysctls(item);
        }
    } else {
      this.sysctls = null;
    }
    return (A) this;
  }
  
  public A withSysctls(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.securitycontext.Sysctls... sysctls) {
    if (this.sysctls != null) {
        this.sysctls.clear();
        _visitables.remove("sysctls");
    }
    if (sysctls != null) {
      for (Sysctls item : sysctls) {
        this.addToSysctls(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasSysctls() {
    return this.sysctls != null && !this.sysctls.isEmpty();
  }
  
  public SysctlsNested<A> addNewSysctl() {
    return new SysctlsNested(-1, null);
  }
  
  public SysctlsNested<A> addNewSysctlLike(Sysctls item) {
    return new SysctlsNested(-1, item);
  }
  
  public SysctlsNested<A> setNewSysctlLike(int index,Sysctls item) {
    return new SysctlsNested(index, item);
  }
  
  public SysctlsNested<A> editSysctl(int index) {
    if (sysctls.size() <= index) throw new RuntimeException("Can't edit sysctls. Index exceeds size.");
    return setNewSysctlLike(index, buildSysctl(index));
  }
  
  public SysctlsNested<A> editFirstSysctl() {
    if (sysctls.size() == 0) throw new RuntimeException("Can't edit first sysctls. The list is empty.");
    return setNewSysctlLike(0, buildSysctl(0));
  }
  
  public SysctlsNested<A> editLastSysctl() {
    int index = sysctls.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last sysctls. The list is empty.");
    return setNewSysctlLike(index, buildSysctl(index));
  }
  
  public SysctlsNested<A> editMatchingSysctl(Predicate<SysctlsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<sysctls.size();i++) { 
    if (predicate.test(sysctls.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching sysctls. No match found.");
    return setNewSysctlLike(index, buildSysctl(index));
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
  
  public WindowsOptionsNested<A> editBuildpodWindowsOptions() {
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
    if (!java.util.Objects.equals(fsGroup, that.fsGroup)) return false;
    if (!java.util.Objects.equals(fsGroupChangePolicy, that.fsGroupChangePolicy)) return false;
    if (!java.util.Objects.equals(runAsGroup, that.runAsGroup)) return false;
    if (!java.util.Objects.equals(runAsNonRoot, that.runAsNonRoot)) return false;
    if (!java.util.Objects.equals(runAsUser, that.runAsUser)) return false;
    if (!java.util.Objects.equals(seLinuxOptions, that.seLinuxOptions)) return false;
    if (!java.util.Objects.equals(seccompProfile, that.seccompProfile)) return false;
    if (!java.util.Objects.equals(supplementalGroups, that.supplementalGroups)) return false;
    if (!java.util.Objects.equals(sysctls, that.sysctls)) return false;
    if (!java.util.Objects.equals(windowsOptions, that.windowsOptions)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(fsGroup,  fsGroupChangePolicy,  runAsGroup,  runAsNonRoot,  runAsUser,  seLinuxOptions,  seccompProfile,  supplementalGroups,  sysctls,  windowsOptions,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsGroup != null) { sb.append("fsGroup:"); sb.append(fsGroup + ","); }
    if (fsGroupChangePolicy != null) { sb.append("fsGroupChangePolicy:"); sb.append(fsGroupChangePolicy + ","); }
    if (runAsGroup != null) { sb.append("runAsGroup:"); sb.append(runAsGroup + ","); }
    if (runAsNonRoot != null) { sb.append("runAsNonRoot:"); sb.append(runAsNonRoot + ","); }
    if (runAsUser != null) { sb.append("runAsUser:"); sb.append(runAsUser + ","); }
    if (seLinuxOptions != null) { sb.append("seLinuxOptions:"); sb.append(seLinuxOptions + ","); }
    if (seccompProfile != null) { sb.append("seccompProfile:"); sb.append(seccompProfile + ","); }
    if (supplementalGroups != null && !supplementalGroups.isEmpty()) { sb.append("supplementalGroups:"); sb.append(supplementalGroups + ","); }
    if (sysctls != null && !sysctls.isEmpty()) { sb.append("sysctls:"); sb.append(sysctls + ","); }
    if (windowsOptions != null) { sb.append("windowsOptions:"); sb.append(windowsOptions + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withRunAsNonRoot() {
    return withRunAsNonRoot(true);
  }
  public class SeLinuxOptionsNested<N> extends SeLinuxOptionsFluent<SeLinuxOptionsNested<N>> implements Nested<N>{
    SeLinuxOptionsNested(SeLinuxOptions item) {
      this.builder = new SeLinuxOptionsBuilder(this, item);
    }
    SeLinuxOptionsBuilder builder;
    
    public N and() {
      return (N) SecurityContextFluent.this.withSeLinuxOptions(builder.build());
    }
    
    public N endBuildpodSeLinuxOptions() {
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
    
    public N endBuildpodSeccompProfile() {
      return and();
    }
    
  
  }
  public class SysctlsNested<N> extends SysctlsFluent<SysctlsNested<N>> implements Nested<N>{
    SysctlsNested(int index,Sysctls item) {
      this.index = index;
      this.builder = new SysctlsBuilder(this, item);
    }
    SysctlsBuilder builder;
    int index;
    
    public N and() {
      return (N) SecurityContextFluent.this.setToSysctls(index,builder.build());
    }
    
    public N endSysctl() {
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
    
    public N endBuildpodWindowsOptions() {
      return and();
    }
    
  
  }

}