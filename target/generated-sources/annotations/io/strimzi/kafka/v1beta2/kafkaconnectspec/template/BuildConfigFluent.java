package io.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildconfig.MetadataBuilder;
import java.lang.SuppressWarnings;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildconfig.MetadataFluent;
import io.fabric8.kubernetes.api.builder.Nested;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildconfig.Metadata;
import java.lang.String;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class BuildConfigFluent<A extends BuildConfigFluent<A>> extends BaseFluent<A>{
  public BuildConfigFluent() {
  }
  
  public BuildConfigFluent(BuildConfig instance) {
    this.copyInstance(instance);
  }
  private MetadataBuilder metadata;
  private String pullSecret;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(BuildConfig instance) {
    instance = (instance != null ? instance : new BuildConfig());
    if (instance != null) {
          this.withMetadata(instance.getMetadata());
          this.withPullSecret(instance.getPullSecret());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public Metadata buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public A withMetadata(Metadata metadata) {
    this._visitables.remove("metadata");
    if (metadata != null) {
        this.metadata = new MetadataBuilder(metadata);
        this._visitables.get("metadata").add(this.metadata);
    } else {
        this.metadata = null;
        this._visitables.get("metadata").remove(this.metadata);
    }
    return (A) this;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(Metadata item) {
    return new MetadataNested(item);
  }
  
  public MetadataNested<A> editBuildconfigMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(new MetadataBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(Metadata item) {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(item));
  }
  
  public String getPullSecret() {
    return this.pullSecret;
  }
  
  public A withPullSecret(String pullSecret) {
    this.pullSecret = pullSecret;
    return (A) this;
  }
  
  public boolean hasPullSecret() {
    return this.pullSecret != null;
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
    BuildConfigFluent that = (BuildConfigFluent) o;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(pullSecret, that.pullSecret)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(metadata,  pullSecret,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (pullSecret != null) { sb.append("pullSecret:"); sb.append(pullSecret + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class MetadataNested<N> extends MetadataFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(Metadata item) {
      this.builder = new MetadataBuilder(this, item);
    }
    MetadataBuilder builder;
    
    public N and() {
      return (N) BuildConfigFluent.this.withMetadata(builder.build());
    }
    
    public N endBuildconfigMetadata() {
      return and();
    }
    
  
  }

}