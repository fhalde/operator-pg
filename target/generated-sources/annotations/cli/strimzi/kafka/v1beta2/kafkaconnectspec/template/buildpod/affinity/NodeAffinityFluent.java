package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity;

import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.PreferredDuringSchedulingIgnoredDuringExecutionBuilder;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.RequiredDuringSchedulingIgnoredDuringExecutionFluent;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.List;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.PreferredDuringSchedulingIgnoredDuringExecution;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.RequiredDuringSchedulingIgnoredDuringExecution;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.RequiredDuringSchedulingIgnoredDuringExecutionBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.PreferredDuringSchedulingIgnoredDuringExecutionFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class NodeAffinityFluent<A extends NodeAffinityFluent<A>> extends BaseFluent<A>{
  public NodeAffinityFluent() {
  }
  
  public NodeAffinityFluent(NodeAffinity instance) {
    this.copyInstance(instance);
  }
  private ArrayList<PreferredDuringSchedulingIgnoredDuringExecutionBuilder> preferredDuringSchedulingIgnoredDuringExecution;
  private RequiredDuringSchedulingIgnoredDuringExecutionBuilder requiredDuringSchedulingIgnoredDuringExecution;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(NodeAffinity instance) {
    instance = (instance != null ? instance : new NodeAffinity());
    if (instance != null) {
          this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution());
          this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public A addToPreferredDuringSchedulingIgnoredDuringExecution(int index,PreferredDuringSchedulingIgnoredDuringExecution item) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<PreferredDuringSchedulingIgnoredDuringExecutionBuilder>();}
    PreferredDuringSchedulingIgnoredDuringExecutionBuilder builder = new PreferredDuringSchedulingIgnoredDuringExecutionBuilder(item);
    if (index < 0 || index >= preferredDuringSchedulingIgnoredDuringExecution.size()) { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder); preferredDuringSchedulingIgnoredDuringExecution.add(builder); } else { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(index, builder); preferredDuringSchedulingIgnoredDuringExecution.add(index, builder);}
    return (A)this;
  }
  
  public A setToPreferredDuringSchedulingIgnoredDuringExecution(int index,PreferredDuringSchedulingIgnoredDuringExecution item) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<PreferredDuringSchedulingIgnoredDuringExecutionBuilder>();}
    PreferredDuringSchedulingIgnoredDuringExecutionBuilder builder = new PreferredDuringSchedulingIgnoredDuringExecutionBuilder(item);
    if (index < 0 || index >= preferredDuringSchedulingIgnoredDuringExecution.size()) { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder); preferredDuringSchedulingIgnoredDuringExecution.add(builder); } else { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").set(index, builder); preferredDuringSchedulingIgnoredDuringExecution.set(index, builder);}
    return (A)this;
  }
  
  public A addToPreferredDuringSchedulingIgnoredDuringExecution(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.PreferredDuringSchedulingIgnoredDuringExecution... items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<PreferredDuringSchedulingIgnoredDuringExecutionBuilder>();}
    for (PreferredDuringSchedulingIgnoredDuringExecution item : items) {PreferredDuringSchedulingIgnoredDuringExecutionBuilder builder = new PreferredDuringSchedulingIgnoredDuringExecutionBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
  }
  
  public A addAllToPreferredDuringSchedulingIgnoredDuringExecution(Collection<PreferredDuringSchedulingIgnoredDuringExecution> items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<PreferredDuringSchedulingIgnoredDuringExecutionBuilder>();}
    for (PreferredDuringSchedulingIgnoredDuringExecution item : items) {PreferredDuringSchedulingIgnoredDuringExecutionBuilder builder = new PreferredDuringSchedulingIgnoredDuringExecutionBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
  }
  
  public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.PreferredDuringSchedulingIgnoredDuringExecution... items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) return (A)this;
    for (PreferredDuringSchedulingIgnoredDuringExecution item : items) {PreferredDuringSchedulingIgnoredDuringExecutionBuilder builder = new PreferredDuringSchedulingIgnoredDuringExecutionBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").remove(builder); this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);} return (A)this;
  }
  
  public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(Collection<PreferredDuringSchedulingIgnoredDuringExecution> items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) return (A)this;
    for (PreferredDuringSchedulingIgnoredDuringExecution item : items) {PreferredDuringSchedulingIgnoredDuringExecutionBuilder builder = new PreferredDuringSchedulingIgnoredDuringExecutionBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").remove(builder); this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromPreferredDuringSchedulingIgnoredDuringExecution(Predicate<PreferredDuringSchedulingIgnoredDuringExecutionBuilder> predicate) {
    if (preferredDuringSchedulingIgnoredDuringExecution == null) return (A) this;
    final Iterator<PreferredDuringSchedulingIgnoredDuringExecutionBuilder> each = preferredDuringSchedulingIgnoredDuringExecution.iterator();
    final List visitables = _visitables.get("preferredDuringSchedulingIgnoredDuringExecution");
    while (each.hasNext()) {
      PreferredDuringSchedulingIgnoredDuringExecutionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<PreferredDuringSchedulingIgnoredDuringExecution> buildPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution != null ? build(preferredDuringSchedulingIgnoredDuringExecution) : null;
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecution buildPreferredDuringSchedulingIgnoredDuringExecution(int index) {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(index).build();
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecution buildFirstPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(0).build();
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecution buildLastPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(preferredDuringSchedulingIgnoredDuringExecution.size() - 1).build();
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecution buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<PreferredDuringSchedulingIgnoredDuringExecutionBuilder> predicate) {
      for (PreferredDuringSchedulingIgnoredDuringExecutionBuilder item : preferredDuringSchedulingIgnoredDuringExecution) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<PreferredDuringSchedulingIgnoredDuringExecutionBuilder> predicate) {
      for (PreferredDuringSchedulingIgnoredDuringExecutionBuilder item : preferredDuringSchedulingIgnoredDuringExecution) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPreferredDuringSchedulingIgnoredDuringExecution(List<PreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {
      this._visitables.get("preferredDuringSchedulingIgnoredDuringExecution").clear();
    }
    if (preferredDuringSchedulingIgnoredDuringExecution != null) {
        this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList();
        for (PreferredDuringSchedulingIgnoredDuringExecution item : preferredDuringSchedulingIgnoredDuringExecution) {
          this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);
        }
    } else {
      this.preferredDuringSchedulingIgnoredDuringExecution = null;
    }
    return (A) this;
  }
  
  public A withPreferredDuringSchedulingIgnoredDuringExecution(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.PreferredDuringSchedulingIgnoredDuringExecution... preferredDuringSchedulingIgnoredDuringExecution) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {
        this.preferredDuringSchedulingIgnoredDuringExecution.clear();
        _visitables.remove("preferredDuringSchedulingIgnoredDuringExecution");
    }
    if (preferredDuringSchedulingIgnoredDuringExecution != null) {
      for (PreferredDuringSchedulingIgnoredDuringExecution item : preferredDuringSchedulingIgnoredDuringExecution) {
        this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution != null && !this.preferredDuringSchedulingIgnoredDuringExecution.isEmpty();
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecution() {
    return new PreferredDuringSchedulingIgnoredDuringExecutionNested(-1, null);
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(PreferredDuringSchedulingIgnoredDuringExecution item) {
    return new PreferredDuringSchedulingIgnoredDuringExecutionNested(-1, item);
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(int index,PreferredDuringSchedulingIgnoredDuringExecution item) {
    return new PreferredDuringSchedulingIgnoredDuringExecutionNested(index, item);
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editPreferredDuringSchedulingIgnoredDuringExecution(int index) {
    if (preferredDuringSchedulingIgnoredDuringExecution.size() <= index) throw new RuntimeException("Can't edit preferredDuringSchedulingIgnoredDuringExecution. Index exceeds size.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstPreferredDuringSchedulingIgnoredDuringExecution() {
    if (preferredDuringSchedulingIgnoredDuringExecution.size() == 0) throw new RuntimeException("Can't edit first preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(0, buildPreferredDuringSchedulingIgnoredDuringExecution(0));
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editLastPreferredDuringSchedulingIgnoredDuringExecution() {
    int index = preferredDuringSchedulingIgnoredDuringExecution.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<PreferredDuringSchedulingIgnoredDuringExecutionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<preferredDuringSchedulingIgnoredDuringExecution.size();i++) { 
    if (predicate.test(preferredDuringSchedulingIgnoredDuringExecution.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching preferredDuringSchedulingIgnoredDuringExecution. No match found.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecution buildRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution != null ? this.requiredDuringSchedulingIgnoredDuringExecution.build() : null;
  }
  
  public A withRequiredDuringSchedulingIgnoredDuringExecution(RequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution) {
    this._visitables.remove("requiredDuringSchedulingIgnoredDuringExecution");
    if (requiredDuringSchedulingIgnoredDuringExecution != null) {
        this.requiredDuringSchedulingIgnoredDuringExecution = new RequiredDuringSchedulingIgnoredDuringExecutionBuilder(requiredDuringSchedulingIgnoredDuringExecution);
        this._visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(this.requiredDuringSchedulingIgnoredDuringExecution);
    } else {
        this.requiredDuringSchedulingIgnoredDuringExecution = null;
        this._visitables.get("requiredDuringSchedulingIgnoredDuringExecution").remove(this.requiredDuringSchedulingIgnoredDuringExecution);
    }
    return (A) this;
  }
  
  public boolean hasRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution != null;
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> withNewRequiredDuringSchedulingIgnoredDuringExecution() {
    return new RequiredDuringSchedulingIgnoredDuringExecutionNested(null);
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(RequiredDuringSchedulingIgnoredDuringExecution item) {
    return new RequiredDuringSchedulingIgnoredDuringExecutionNested(item);
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editRequiredDuringSchedulingIgnoredDuringExecution() {
    return withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(java.util.Optional.ofNullable(buildRequiredDuringSchedulingIgnoredDuringExecution()).orElse(null));
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editOrNewRequiredDuringSchedulingIgnoredDuringExecution() {
    return withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(java.util.Optional.ofNullable(buildRequiredDuringSchedulingIgnoredDuringExecution()).orElse(new RequiredDuringSchedulingIgnoredDuringExecutionBuilder().build()));
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editOrNewRequiredDuringSchedulingIgnoredDuringExecutionLike(RequiredDuringSchedulingIgnoredDuringExecution item) {
    return withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(java.util.Optional.ofNullable(buildRequiredDuringSchedulingIgnoredDuringExecution()).orElse(item));
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
    NodeAffinityFluent that = (NodeAffinityFluent) o;
    if (!java.util.Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, that.preferredDuringSchedulingIgnoredDuringExecution)) return false;
    if (!java.util.Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, that.requiredDuringSchedulingIgnoredDuringExecution)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(preferredDuringSchedulingIgnoredDuringExecution,  requiredDuringSchedulingIgnoredDuringExecution,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (preferredDuringSchedulingIgnoredDuringExecution != null && !preferredDuringSchedulingIgnoredDuringExecution.isEmpty()) { sb.append("preferredDuringSchedulingIgnoredDuringExecution:"); sb.append(preferredDuringSchedulingIgnoredDuringExecution + ","); }
    if (requiredDuringSchedulingIgnoredDuringExecution != null) { sb.append("requiredDuringSchedulingIgnoredDuringExecution:"); sb.append(requiredDuringSchedulingIgnoredDuringExecution + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class PreferredDuringSchedulingIgnoredDuringExecutionNested<N> extends PreferredDuringSchedulingIgnoredDuringExecutionFluent<PreferredDuringSchedulingIgnoredDuringExecutionNested<N>> implements Nested<N>{
    PreferredDuringSchedulingIgnoredDuringExecutionNested(int index,PreferredDuringSchedulingIgnoredDuringExecution item) {
      this.index = index;
      this.builder = new PreferredDuringSchedulingIgnoredDuringExecutionBuilder(this, item);
    }
    PreferredDuringSchedulingIgnoredDuringExecutionBuilder builder;
    int index;
    
    public N and() {
      return (N) NodeAffinityFluent.this.setToPreferredDuringSchedulingIgnoredDuringExecution(index,builder.build());
    }
    
    public N endPreferredDuringSchedulingIgnoredDuringExecution() {
      return and();
    }
    
  
  }
  public class RequiredDuringSchedulingIgnoredDuringExecutionNested<N> extends RequiredDuringSchedulingIgnoredDuringExecutionFluent<RequiredDuringSchedulingIgnoredDuringExecutionNested<N>> implements Nested<N>{
    RequiredDuringSchedulingIgnoredDuringExecutionNested(RequiredDuringSchedulingIgnoredDuringExecution item) {
      this.builder = new RequiredDuringSchedulingIgnoredDuringExecutionBuilder(this, item);
    }
    RequiredDuringSchedulingIgnoredDuringExecutionBuilder builder;
    
    public N and() {
      return (N) NodeAffinityFluent.this.withRequiredDuringSchedulingIgnoredDuringExecution(builder.build());
    }
    
    public N endRequiredDuringSchedulingIgnoredDuringExecution() {
      return and();
    }
    
  
  }

}