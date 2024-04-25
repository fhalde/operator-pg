package io.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.poddisruptionbudget.MetadataBuilder;
import java.lang.SuppressWarnings;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.poddisruptionbudget.MetadataFluent;
import io.fabric8.kubernetes.api.builder.Nested;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.poddisruptionbudget.Metadata;
import java.lang.String;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class PodDisruptionBudgetFluent<A extends PodDisruptionBudgetFluent<A>> extends BaseFluent<A>{
  public PodDisruptionBudgetFluent() {
  }
  
  public PodDisruptionBudgetFluent(PodDisruptionBudget instance) {
    this.copyInstance(instance);
  }
  private Long maxUnavailable;
  private MetadataBuilder metadata;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(PodDisruptionBudget instance) {
    instance = (instance != null ? instance : new PodDisruptionBudget());
    if (instance != null) {
          this.withMaxUnavailable(instance.getMaxUnavailable());
          this.withMetadata(instance.getMetadata());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public Long getMaxUnavailable() {
    return this.maxUnavailable;
  }
  
  public A withMaxUnavailable(Long maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return (A) this;
  }
  
  public boolean hasMaxUnavailable() {
    return this.maxUnavailable != null;
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
  
  public MetadataNested<A> editPoddisruptionbudgetMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(new MetadataBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(Metadata item) {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(item));
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
    PodDisruptionBudgetFluent that = (PodDisruptionBudgetFluent) o;
    if (!java.util.Objects.equals(maxUnavailable, that.maxUnavailable)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(maxUnavailable,  metadata,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (maxUnavailable != null) { sb.append("maxUnavailable:"); sb.append(maxUnavailable + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
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
      return (N) PodDisruptionBudgetFluent.this.withMetadata(builder.build());
    }
    
    public N endPoddisruptionbudgetMetadata() {
      return and();
    }
    
  
  }

}