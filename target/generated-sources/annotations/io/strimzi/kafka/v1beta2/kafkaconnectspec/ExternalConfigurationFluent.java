package io.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.Env;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.Volumes;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.VolumesBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.List;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.EnvFluent;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.VolumesFluent;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.EnvBuilder;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ExternalConfigurationFluent<A extends ExternalConfigurationFluent<A>> extends BaseFluent<A>{
  public ExternalConfigurationFluent() {
  }
  
  public ExternalConfigurationFluent(ExternalConfiguration instance) {
    this.copyInstance(instance);
  }
  private ArrayList<EnvBuilder> env;
  private ArrayList<VolumesBuilder> volumes;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(ExternalConfiguration instance) {
    instance = (instance != null ? instance : new ExternalConfiguration());
    if (instance != null) {
          this.withEnv(instance.getEnv());
          this.withVolumes(instance.getVolumes());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public A addToEnv(int index,Env item) {
    if (this.env == null) {this.env = new ArrayList<EnvBuilder>();}
    EnvBuilder builder = new EnvBuilder(item);
    if (index < 0 || index >= env.size()) { _visitables.get("env").add(builder); env.add(builder); } else { _visitables.get("env").add(index, builder); env.add(index, builder);}
    return (A)this;
  }
  
  public A setToEnv(int index,Env item) {
    if (this.env == null) {this.env = new ArrayList<EnvBuilder>();}
    EnvBuilder builder = new EnvBuilder(item);
    if (index < 0 || index >= env.size()) { _visitables.get("env").add(builder); env.add(builder); } else { _visitables.get("env").set(index, builder); env.set(index, builder);}
    return (A)this;
  }
  
  public A addToEnv(io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.Env... items) {
    if (this.env == null) {this.env = new ArrayList<EnvBuilder>();}
    for (Env item : items) {EnvBuilder builder = new EnvBuilder(item);_visitables.get("env").add(builder);this.env.add(builder);} return (A)this;
  }
  
  public A addAllToIoEnv(Collection<Env> items) {
    if (this.env == null) {this.env = new ArrayList<EnvBuilder>();}
    for (Env item : items) {EnvBuilder builder = new EnvBuilder(item);_visitables.get("env").add(builder);this.env.add(builder);} return (A)this;
  }
  
  public A removeFromEnv(io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.Env... items) {
    if (this.env == null) return (A)this;
    for (Env item : items) {EnvBuilder builder = new EnvBuilder(item);_visitables.get("env").remove(builder); this.env.remove(builder);} return (A)this;
  }
  
  public A removeAllFromIoEnv(Collection<Env> items) {
    if (this.env == null) return (A)this;
    for (Env item : items) {EnvBuilder builder = new EnvBuilder(item);_visitables.get("env").remove(builder); this.env.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromIoEnv(Predicate<EnvBuilder> predicate) {
    if (env == null) return (A) this;
    final Iterator<EnvBuilder> each = env.iterator();
    final List visitables = _visitables.get("env");
    while (each.hasNext()) {
      EnvBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Env> buildEnv() {
    return this.env != null ? build(env) : null;
  }
  
  public Env buildEnv(int index) {
    return this.env.get(index).build();
  }
  
  public Env buildFirstEnv() {
    return this.env.get(0).build();
  }
  
  public Env buildLastEnv() {
    return this.env.get(env.size() - 1).build();
  }
  
  public Env buildMatchingEnv(Predicate<EnvBuilder> predicate) {
      for (EnvBuilder item : env) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingEnv(Predicate<EnvBuilder> predicate) {
      for (EnvBuilder item : env) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withEnv(List<Env> env) {
    if (this.env != null) {
      this._visitables.get("env").clear();
    }
    if (env != null) {
        this.env = new ArrayList();
        for (Env item : env) {
          this.addToEnv(item);
        }
    } else {
      this.env = null;
    }
    return (A) this;
  }
  
  public A withEnv(io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.Env... env) {
    if (this.env != null) {
        this.env.clear();
        _visitables.remove("env");
    }
    if (env != null) {
      for (Env item : env) {
        this.addToEnv(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasEnv() {
    return this.env != null && !this.env.isEmpty();
  }
  
  public EnvNested<A> addNewEnv() {
    return new EnvNested(-1, null);
  }
  
  public EnvNested<A> addNewEnvLike(Env item) {
    return new EnvNested(-1, item);
  }
  
  public EnvNested<A> setNewEnvLike(int index,Env item) {
    return new EnvNested(index, item);
  }
  
  public EnvNested<A> editEnv(int index) {
    if (env.size() <= index) throw new RuntimeException("Can't edit env. Index exceeds size.");
    return setNewEnvLike(index, buildEnv(index));
  }
  
  public EnvNested<A> editFirstEnv() {
    if (env.size() == 0) throw new RuntimeException("Can't edit first env. The list is empty.");
    return setNewEnvLike(0, buildEnv(0));
  }
  
  public EnvNested<A> editLastEnv() {
    int index = env.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last env. The list is empty.");
    return setNewEnvLike(index, buildEnv(index));
  }
  
  public EnvNested<A> editMatchingEnv(Predicate<EnvBuilder> predicate) {
    int index = -1;
    for (int i=0;i<env.size();i++) { 
    if (predicate.test(env.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching env. No match found.");
    return setNewEnvLike(index, buildEnv(index));
  }
  
  public A addToVolumes(int index,Volumes item) {
    if (this.volumes == null) {this.volumes = new ArrayList<VolumesBuilder>();}
    VolumesBuilder builder = new VolumesBuilder(item);
    if (index < 0 || index >= volumes.size()) { _visitables.get("volumes").add(builder); volumes.add(builder); } else { _visitables.get("volumes").add(index, builder); volumes.add(index, builder);}
    return (A)this;
  }
  
  public A setToVolumes(int index,Volumes item) {
    if (this.volumes == null) {this.volumes = new ArrayList<VolumesBuilder>();}
    VolumesBuilder builder = new VolumesBuilder(item);
    if (index < 0 || index >= volumes.size()) { _visitables.get("volumes").add(builder); volumes.add(builder); } else { _visitables.get("volumes").set(index, builder); volumes.set(index, builder);}
    return (A)this;
  }
  
  public A addToVolumes(io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.Volumes... items) {
    if (this.volumes == null) {this.volumes = new ArrayList<VolumesBuilder>();}
    for (Volumes item : items) {VolumesBuilder builder = new VolumesBuilder(item);_visitables.get("volumes").add(builder);this.volumes.add(builder);} return (A)this;
  }
  
  public A addAllToIoVolumes(Collection<Volumes> items) {
    if (this.volumes == null) {this.volumes = new ArrayList<VolumesBuilder>();}
    for (Volumes item : items) {VolumesBuilder builder = new VolumesBuilder(item);_visitables.get("volumes").add(builder);this.volumes.add(builder);} return (A)this;
  }
  
  public A removeFromVolumes(io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.Volumes... items) {
    if (this.volumes == null) return (A)this;
    for (Volumes item : items) {VolumesBuilder builder = new VolumesBuilder(item);_visitables.get("volumes").remove(builder); this.volumes.remove(builder);} return (A)this;
  }
  
  public A removeAllFromIoVolumes(Collection<Volumes> items) {
    if (this.volumes == null) return (A)this;
    for (Volumes item : items) {VolumesBuilder builder = new VolumesBuilder(item);_visitables.get("volumes").remove(builder); this.volumes.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromIoVolumes(Predicate<VolumesBuilder> predicate) {
    if (volumes == null) return (A) this;
    final Iterator<VolumesBuilder> each = volumes.iterator();
    final List visitables = _visitables.get("volumes");
    while (each.hasNext()) {
      VolumesBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Volumes> buildVolumes() {
    return this.volumes != null ? build(volumes) : null;
  }
  
  public Volumes buildVolume(int index) {
    return this.volumes.get(index).build();
  }
  
  public Volumes buildFirstVolume() {
    return this.volumes.get(0).build();
  }
  
  public Volumes buildLastVolume() {
    return this.volumes.get(volumes.size() - 1).build();
  }
  
  public Volumes buildMatchingVolume(Predicate<VolumesBuilder> predicate) {
      for (VolumesBuilder item : volumes) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingVolume(Predicate<VolumesBuilder> predicate) {
      for (VolumesBuilder item : volumes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withVolumes(List<Volumes> volumes) {
    if (this.volumes != null) {
      this._visitables.get("volumes").clear();
    }
    if (volumes != null) {
        this.volumes = new ArrayList();
        for (Volumes item : volumes) {
          this.addToVolumes(item);
        }
    } else {
      this.volumes = null;
    }
    return (A) this;
  }
  
  public A withVolumes(io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.Volumes... volumes) {
    if (this.volumes != null) {
        this.volumes.clear();
        _visitables.remove("volumes");
    }
    if (volumes != null) {
      for (Volumes item : volumes) {
        this.addToVolumes(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasVolumes() {
    return this.volumes != null && !this.volumes.isEmpty();
  }
  
  public VolumesNested<A> addNewVolume() {
    return new VolumesNested(-1, null);
  }
  
  public VolumesNested<A> addNewVolumeLike(Volumes item) {
    return new VolumesNested(-1, item);
  }
  
  public VolumesNested<A> setNewVolumeLike(int index,Volumes item) {
    return new VolumesNested(index, item);
  }
  
  public VolumesNested<A> editVolume(int index) {
    if (volumes.size() <= index) throw new RuntimeException("Can't edit volumes. Index exceeds size.");
    return setNewVolumeLike(index, buildVolume(index));
  }
  
  public VolumesNested<A> editFirstVolume() {
    if (volumes.size() == 0) throw new RuntimeException("Can't edit first volumes. The list is empty.");
    return setNewVolumeLike(0, buildVolume(0));
  }
  
  public VolumesNested<A> editLastVolume() {
    int index = volumes.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last volumes. The list is empty.");
    return setNewVolumeLike(index, buildVolume(index));
  }
  
  public VolumesNested<A> editMatchingVolume(Predicate<VolumesBuilder> predicate) {
    int index = -1;
    for (int i=0;i<volumes.size();i++) { 
    if (predicate.test(volumes.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching volumes. No match found.");
    return setNewVolumeLike(index, buildVolume(index));
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
    ExternalConfigurationFluent that = (ExternalConfigurationFluent) o;
    if (!java.util.Objects.equals(env, that.env)) return false;
    if (!java.util.Objects.equals(volumes, that.volumes)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(env,  volumes,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (env != null && !env.isEmpty()) { sb.append("env:"); sb.append(env + ","); }
    if (volumes != null && !volumes.isEmpty()) { sb.append("volumes:"); sb.append(volumes + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class EnvNested<N> extends EnvFluent<EnvNested<N>> implements Nested<N>{
    EnvNested(int index,Env item) {
      this.index = index;
      this.builder = new EnvBuilder(this, item);
    }
    EnvBuilder builder;
    int index;
    
    public N and() {
      return (N) ExternalConfigurationFluent.this.setToEnv(index,builder.build());
    }
    
    public N endIoEnv() {
      return and();
    }
    
  
  }
  public class VolumesNested<N> extends VolumesFluent<VolumesNested<N>> implements Nested<N>{
    VolumesNested(int index,Volumes item) {
      this.index = index;
      this.builder = new VolumesBuilder(this, item);
    }
    VolumesBuilder builder;
    int index;
    
    public N and() {
      return (N) ExternalConfigurationFluent.this.setToVolumes(index,builder.build());
    }
    
    public N endIoVolume() {
      return and();
    }
    
  
  }

}