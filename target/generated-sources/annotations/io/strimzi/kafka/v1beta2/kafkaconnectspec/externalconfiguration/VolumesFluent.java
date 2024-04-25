package io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration;

import io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.volumes.ConfigMap;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.volumes.Secret;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.volumes.SecretBuilder;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.volumes.ConfigMapFluent;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.volumes.SecretFluent;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.volumes.ConfigMapBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class VolumesFluent<A extends VolumesFluent<A>> extends BaseFluent<A>{
  public VolumesFluent() {
  }
  
  public VolumesFluent(Volumes instance) {
    this.copyInstance(instance);
  }
  private ConfigMapBuilder configMap;
  private String name;
  private SecretBuilder secret;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(Volumes instance) {
    instance = (instance != null ? instance : new Volumes());
    if (instance != null) {
          this.withConfigMap(instance.getConfigMap());
          this.withName(instance.getName());
          this.withSecret(instance.getSecret());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public ConfigMap buildConfigMap() {
    return this.configMap != null ? this.configMap.build() : null;
  }
  
  public A withConfigMap(ConfigMap configMap) {
    this._visitables.remove("configMap");
    if (configMap != null) {
        this.configMap = new ConfigMapBuilder(configMap);
        this._visitables.get("configMap").add(this.configMap);
    } else {
        this.configMap = null;
        this._visitables.get("configMap").remove(this.configMap);
    }
    return (A) this;
  }
  
  public boolean hasConfigMap() {
    return this.configMap != null;
  }
  
  public ConfigMapNested<A> withNewConfigMap() {
    return new ConfigMapNested(null);
  }
  
  public ConfigMapNested<A> withNewConfigMapLike(ConfigMap item) {
    return new ConfigMapNested(item);
  }
  
  public ConfigMapNested<A> editIoConfigMap() {
    return withNewConfigMapLike(java.util.Optional.ofNullable(buildConfigMap()).orElse(null));
  }
  
  public ConfigMapNested<A> editOrNewConfigMap() {
    return withNewConfigMapLike(java.util.Optional.ofNullable(buildConfigMap()).orElse(new ConfigMapBuilder().build()));
  }
  
  public ConfigMapNested<A> editOrNewConfigMapLike(ConfigMap item) {
    return withNewConfigMapLike(java.util.Optional.ofNullable(buildConfigMap()).orElse(item));
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public Secret buildSecret() {
    return this.secret != null ? this.secret.build() : null;
  }
  
  public A withSecret(Secret secret) {
    this._visitables.remove("secret");
    if (secret != null) {
        this.secret = new SecretBuilder(secret);
        this._visitables.get("secret").add(this.secret);
    } else {
        this.secret = null;
        this._visitables.get("secret").remove(this.secret);
    }
    return (A) this;
  }
  
  public boolean hasSecret() {
    return this.secret != null;
  }
  
  public SecretNested<A> withNewSecret() {
    return new SecretNested(null);
  }
  
  public SecretNested<A> withNewSecretLike(Secret item) {
    return new SecretNested(item);
  }
  
  public SecretNested<A> editIoSecret() {
    return withNewSecretLike(java.util.Optional.ofNullable(buildSecret()).orElse(null));
  }
  
  public SecretNested<A> editOrNewSecret() {
    return withNewSecretLike(java.util.Optional.ofNullable(buildSecret()).orElse(new SecretBuilder().build()));
  }
  
  public SecretNested<A> editOrNewSecretLike(Secret item) {
    return withNewSecretLike(java.util.Optional.ofNullable(buildSecret()).orElse(item));
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
    VolumesFluent that = (VolumesFluent) o;
    if (!java.util.Objects.equals(configMap, that.configMap)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(secret, that.secret)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configMap,  name,  secret,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configMap != null) { sb.append("configMap:"); sb.append(configMap + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (secret != null) { sb.append("secret:"); sb.append(secret + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigMapNested<N> extends ConfigMapFluent<ConfigMapNested<N>> implements Nested<N>{
    ConfigMapNested(ConfigMap item) {
      this.builder = new ConfigMapBuilder(this, item);
    }
    ConfigMapBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withConfigMap(builder.build());
    }
    
    public N endIoConfigMap() {
      return and();
    }
    
  
  }
  public class SecretNested<N> extends SecretFluent<SecretNested<N>> implements Nested<N>{
    SecretNested(Secret item) {
      this.builder = new SecretBuilder(this, item);
    }
    SecretBuilder builder;
    
    public N and() {
      return (N) VolumesFluent.this.withSecret(builder.build());
    }
    
    public N endIoSecret() {
      return and();
    }
    
  
  }

}