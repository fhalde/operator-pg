package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod;

import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.NodeAffinity;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.PodAffinityBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.PodAntiAffinityBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.NodeAffinityFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.PodAffinity;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.PodAffinityFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.NodeAffinityBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.PodAntiAffinity;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.PodAntiAffinityFluent;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class AffinityFluent<A extends AffinityFluent<A>> extends BaseFluent<A>{
  public AffinityFluent() {
  }
  
  public AffinityFluent(Affinity instance) {
    this.copyInstance(instance);
  }
  private NodeAffinityBuilder nodeAffinity;
  private PodAffinityBuilder podAffinity;
  private PodAntiAffinityBuilder podAntiAffinity;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(Affinity instance) {
    instance = (instance != null ? instance : new Affinity());
    if (instance != null) {
          this.withNodeAffinity(instance.getNodeAffinity());
          this.withPodAffinity(instance.getPodAffinity());
          this.withPodAntiAffinity(instance.getPodAntiAffinity());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public NodeAffinity buildNodeAffinity() {
    return this.nodeAffinity != null ? this.nodeAffinity.build() : null;
  }
  
  public A withNodeAffinity(NodeAffinity nodeAffinity) {
    this._visitables.remove("nodeAffinity");
    if (nodeAffinity != null) {
        this.nodeAffinity = new NodeAffinityBuilder(nodeAffinity);
        this._visitables.get("nodeAffinity").add(this.nodeAffinity);
    } else {
        this.nodeAffinity = null;
        this._visitables.get("nodeAffinity").remove(this.nodeAffinity);
    }
    return (A) this;
  }
  
  public boolean hasNodeAffinity() {
    return this.nodeAffinity != null;
  }
  
  public NodeAffinityNested<A> withNewNodeAffinity() {
    return new NodeAffinityNested(null);
  }
  
  public NodeAffinityNested<A> withNewNodeAffinityLike(NodeAffinity item) {
    return new NodeAffinityNested(item);
  }
  
  public NodeAffinityNested<A> editPodNodeAffinity() {
    return withNewNodeAffinityLike(java.util.Optional.ofNullable(buildNodeAffinity()).orElse(null));
  }
  
  public NodeAffinityNested<A> editOrNewNodeAffinity() {
    return withNewNodeAffinityLike(java.util.Optional.ofNullable(buildNodeAffinity()).orElse(new NodeAffinityBuilder().build()));
  }
  
  public NodeAffinityNested<A> editOrNewNodeAffinityLike(NodeAffinity item) {
    return withNewNodeAffinityLike(java.util.Optional.ofNullable(buildNodeAffinity()).orElse(item));
  }
  
  public PodAffinity buildPodAffinity() {
    return this.podAffinity != null ? this.podAffinity.build() : null;
  }
  
  public A withPodAffinity(PodAffinity podAffinity) {
    this._visitables.remove("podAffinity");
    if (podAffinity != null) {
        this.podAffinity = new PodAffinityBuilder(podAffinity);
        this._visitables.get("podAffinity").add(this.podAffinity);
    } else {
        this.podAffinity = null;
        this._visitables.get("podAffinity").remove(this.podAffinity);
    }
    return (A) this;
  }
  
  public boolean hasPodAffinity() {
    return this.podAffinity != null;
  }
  
  public PodAffinityNested<A> withNewPodAffinity() {
    return new PodAffinityNested(null);
  }
  
  public PodAffinityNested<A> withNewPodAffinityLike(PodAffinity item) {
    return new PodAffinityNested(item);
  }
  
  public PodAffinityNested<A> editPodPodAffinity() {
    return withNewPodAffinityLike(java.util.Optional.ofNullable(buildPodAffinity()).orElse(null));
  }
  
  public PodAffinityNested<A> editOrNewPodAffinity() {
    return withNewPodAffinityLike(java.util.Optional.ofNullable(buildPodAffinity()).orElse(new PodAffinityBuilder().build()));
  }
  
  public PodAffinityNested<A> editOrNewPodAffinityLike(PodAffinity item) {
    return withNewPodAffinityLike(java.util.Optional.ofNullable(buildPodAffinity()).orElse(item));
  }
  
  public PodAntiAffinity buildPodAntiAffinity() {
    return this.podAntiAffinity != null ? this.podAntiAffinity.build() : null;
  }
  
  public A withPodAntiAffinity(PodAntiAffinity podAntiAffinity) {
    this._visitables.remove("podAntiAffinity");
    if (podAntiAffinity != null) {
        this.podAntiAffinity = new PodAntiAffinityBuilder(podAntiAffinity);
        this._visitables.get("podAntiAffinity").add(this.podAntiAffinity);
    } else {
        this.podAntiAffinity = null;
        this._visitables.get("podAntiAffinity").remove(this.podAntiAffinity);
    }
    return (A) this;
  }
  
  public boolean hasPodAntiAffinity() {
    return this.podAntiAffinity != null;
  }
  
  public PodAntiAffinityNested<A> withNewPodAntiAffinity() {
    return new PodAntiAffinityNested(null);
  }
  
  public PodAntiAffinityNested<A> withNewPodAntiAffinityLike(PodAntiAffinity item) {
    return new PodAntiAffinityNested(item);
  }
  
  public PodAntiAffinityNested<A> editPodPodAntiAffinity() {
    return withNewPodAntiAffinityLike(java.util.Optional.ofNullable(buildPodAntiAffinity()).orElse(null));
  }
  
  public PodAntiAffinityNested<A> editOrNewPodAntiAffinity() {
    return withNewPodAntiAffinityLike(java.util.Optional.ofNullable(buildPodAntiAffinity()).orElse(new PodAntiAffinityBuilder().build()));
  }
  
  public PodAntiAffinityNested<A> editOrNewPodAntiAffinityLike(PodAntiAffinity item) {
    return withNewPodAntiAffinityLike(java.util.Optional.ofNullable(buildPodAntiAffinity()).orElse(item));
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
    AffinityFluent that = (AffinityFluent) o;
    if (!java.util.Objects.equals(nodeAffinity, that.nodeAffinity)) return false;
    if (!java.util.Objects.equals(podAffinity, that.podAffinity)) return false;
    if (!java.util.Objects.equals(podAntiAffinity, that.podAntiAffinity)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(nodeAffinity,  podAffinity,  podAntiAffinity,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (nodeAffinity != null) { sb.append("nodeAffinity:"); sb.append(nodeAffinity + ","); }
    if (podAffinity != null) { sb.append("podAffinity:"); sb.append(podAffinity + ","); }
    if (podAntiAffinity != null) { sb.append("podAntiAffinity:"); sb.append(podAntiAffinity + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class NodeAffinityNested<N> extends NodeAffinityFluent<NodeAffinityNested<N>> implements Nested<N>{
    NodeAffinityNested(NodeAffinity item) {
      this.builder = new NodeAffinityBuilder(this, item);
    }
    NodeAffinityBuilder builder;
    
    public N and() {
      return (N) AffinityFluent.this.withNodeAffinity(builder.build());
    }
    
    public N endPodNodeAffinity() {
      return and();
    }
    
  
  }
  public class PodAffinityNested<N> extends PodAffinityFluent<PodAffinityNested<N>> implements Nested<N>{
    PodAffinityNested(PodAffinity item) {
      this.builder = new PodAffinityBuilder(this, item);
    }
    PodAffinityBuilder builder;
    
    public N and() {
      return (N) AffinityFluent.this.withPodAffinity(builder.build());
    }
    
    public N endPodPodAffinity() {
      return and();
    }
    
  
  }
  public class PodAntiAffinityNested<N> extends PodAntiAffinityFluent<PodAntiAffinityNested<N>> implements Nested<N>{
    PodAntiAffinityNested(PodAntiAffinity item) {
      this.builder = new PodAntiAffinityBuilder(this, item);
    }
    PodAntiAffinityBuilder builder;
    
    public N and() {
      return (N) AffinityFluent.this.withPodAntiAffinity(builder.build());
    }
    
    public N endPodPodAntiAffinity() {
      return and();
    }
    
  
  }

}