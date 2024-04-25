package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.preferredduringschedulingignoredduringexecution.PodAffinityTermBuilder;
import java.lang.String;
import java.util.LinkedHashMap;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.preferredduringschedulingignoredduringexecution.PodAffinityTerm;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.preferredduringschedulingignoredduringexecution.PodAffinityTermFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
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
  private PodAffinityTermBuilder podAffinityTerm;
  private Long weight;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(PreferredDuringSchedulingIgnoredDuringExecution instance) {
    instance = (instance != null ? instance : new PreferredDuringSchedulingIgnoredDuringExecution());
    if (instance != null) {
          this.withPodAffinityTerm(instance.getPodAffinityTerm());
          this.withWeight(instance.getWeight());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public PodAffinityTerm buildPodAffinityTerm() {
    return this.podAffinityTerm != null ? this.podAffinityTerm.build() : null;
  }
  
  public A withPodAffinityTerm(PodAffinityTerm podAffinityTerm) {
    this._visitables.remove("podAffinityTerm");
    if (podAffinityTerm != null) {
        this.podAffinityTerm = new PodAffinityTermBuilder(podAffinityTerm);
        this._visitables.get("podAffinityTerm").add(this.podAffinityTerm);
    } else {
        this.podAffinityTerm = null;
        this._visitables.get("podAffinityTerm").remove(this.podAffinityTerm);
    }
    return (A) this;
  }
  
  public boolean hasPodAffinityTerm() {
    return this.podAffinityTerm != null;
  }
  
  public PodAffinityTermNested<A> withNewPodAffinityTerm() {
    return new PodAffinityTermNested(null);
  }
  
  public PodAffinityTermNested<A> withNewPodAffinityTermLike(PodAffinityTerm item) {
    return new PodAffinityTermNested(item);
  }
  
  public PodAffinityTermNested<A> editPodAffinityTerm() {
    return withNewPodAffinityTermLike(java.util.Optional.ofNullable(buildPodAffinityTerm()).orElse(null));
  }
  
  public PodAffinityTermNested<A> editOrNewPodAffinityTerm() {
    return withNewPodAffinityTermLike(java.util.Optional.ofNullable(buildPodAffinityTerm()).orElse(new PodAffinityTermBuilder().build()));
  }
  
  public PodAffinityTermNested<A> editOrNewPodAffinityTermLike(PodAffinityTerm item) {
    return withNewPodAffinityTermLike(java.util.Optional.ofNullable(buildPodAffinityTerm()).orElse(item));
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
    if (!java.util.Objects.equals(podAffinityTerm, that.podAffinityTerm)) return false;
    if (!java.util.Objects.equals(weight, that.weight)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(podAffinityTerm,  weight,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (podAffinityTerm != null) { sb.append("podAffinityTerm:"); sb.append(podAffinityTerm + ","); }
    if (weight != null) { sb.append("weight:"); sb.append(weight + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class PodAffinityTermNested<N> extends PodAffinityTermFluent<PodAffinityTermNested<N>> implements Nested<N>{
    PodAffinityTermNested(PodAffinityTerm item) {
      this.builder = new PodAffinityTermBuilder(this, item);
    }
    PodAffinityTermBuilder builder;
    
    public N and() {
      return (N) PreferredDuringSchedulingIgnoredDuringExecutionFluent.this.withPodAffinityTerm(builder.build());
    }
    
    public N endPodAffinityTerm() {
      return and();
    }
    
  
  }

}