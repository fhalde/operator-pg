package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.nodeaffinity;

import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.PreferenceFluent;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.Preference;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.PreferenceBuilder;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class PreferredDuringSchedulingIgnoredDuringExecutionFluent<A extends PreferredDuringSchedulingIgnoredDuringExecutionFluent<A>> extends BaseFluent<A>{
  public PreferredDuringSchedulingIgnoredDuringExecutionFluent() {
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionFluent(PreferredDuringSchedulingIgnoredDuringExecution instance) {
    this.copyInstance(instance);
  }
  private PreferenceBuilder preference;
  private Long weight;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(PreferredDuringSchedulingIgnoredDuringExecution instance) {
    instance = (instance != null ? instance : new PreferredDuringSchedulingIgnoredDuringExecution());
    if (instance != null) {
          this.withPreference(instance.getPreference());
          this.withWeight(instance.getWeight());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public Preference buildPreference() {
    return this.preference != null ? this.preference.build() : null;
  }
  
  public A withPreference(Preference preference) {
    this._visitables.remove("preference");
    if (preference != null) {
        this.preference = new PreferenceBuilder(preference);
        this._visitables.get("preference").add(this.preference);
    } else {
        this.preference = null;
        this._visitables.get("preference").remove(this.preference);
    }
    return (A) this;
  }
  
  public boolean hasPreference() {
    return this.preference != null;
  }
  
  public PreferenceNested<A> withNewPreference() {
    return new PreferenceNested(null);
  }
  
  public PreferenceNested<A> withNewPreferenceLike(Preference item) {
    return new PreferenceNested(item);
  }
  
  public PreferenceNested<A> editPodPreference() {
    return withNewPreferenceLike(java.util.Optional.ofNullable(buildPreference()).orElse(null));
  }
  
  public PreferenceNested<A> editOrNewPreference() {
    return withNewPreferenceLike(java.util.Optional.ofNullable(buildPreference()).orElse(new PreferenceBuilder().build()));
  }
  
  public PreferenceNested<A> editOrNewPreferenceLike(Preference item) {
    return withNewPreferenceLike(java.util.Optional.ofNullable(buildPreference()).orElse(item));
  }
  
  public Long getWeight() {
    return this.weight;
  }
  
  public A withWeight(Long weight) {
    this.weight = weight;
    return (A) this;
  }
  
  public boolean hasWeight() {
    return this.weight != null;
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
    PreferredDuringSchedulingIgnoredDuringExecutionFluent that = (PreferredDuringSchedulingIgnoredDuringExecutionFluent) o;
    if (!java.util.Objects.equals(preference, that.preference)) return false;
    if (!java.util.Objects.equals(weight, that.weight)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(preference,  weight,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (preference != null) { sb.append("preference:"); sb.append(preference + ","); }
    if (weight != null) { sb.append("weight:"); sb.append(weight + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class PreferenceNested<N> extends PreferenceFluent<PreferenceNested<N>> implements Nested<N>{
    PreferenceNested(Preference item) {
      this.builder = new PreferenceBuilder(this, item);
    }
    PreferenceBuilder builder;
    
    public N and() {
      return (N) PreferredDuringSchedulingIgnoredDuringExecutionFluent.this.withPreference(builder.build());
    }
    
    public N endPodPreference() {
      return and();
    }
    
  
  }

}