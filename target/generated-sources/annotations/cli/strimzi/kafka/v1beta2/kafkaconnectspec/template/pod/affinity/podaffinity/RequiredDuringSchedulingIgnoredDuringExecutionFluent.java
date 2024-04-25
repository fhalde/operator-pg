package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.podaffinity;

import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.podaffinity.requiredduringschedulingignoredduringexecution.LabelSelectorBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.podaffinity.requiredduringschedulingignoredduringexecution.LabelSelector;
import java.lang.String;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.podaffinity.requiredduringschedulingignoredduringexecution.NamespaceSelector;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.podaffinity.requiredduringschedulingignoredduringexecution.NamespaceSelectorBuilder;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.podaffinity.requiredduringschedulingignoredduringexecution.LabelSelectorFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.pod.affinity.podaffinity.requiredduringschedulingignoredduringexecution.NamespaceSelectorFluent;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class RequiredDuringSchedulingIgnoredDuringExecutionFluent<A extends RequiredDuringSchedulingIgnoredDuringExecutionFluent<A>> extends BaseFluent<A>{
  public RequiredDuringSchedulingIgnoredDuringExecutionFluent() {
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionFluent(RequiredDuringSchedulingIgnoredDuringExecution instance) {
    this.copyInstance(instance);
  }
  private LabelSelectorBuilder labelSelector;
  private NamespaceSelectorBuilder namespaceSelector;
  private List<String> namespaces;
  private String topologyKey;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(RequiredDuringSchedulingIgnoredDuringExecution instance) {
    instance = (instance != null ? instance : new RequiredDuringSchedulingIgnoredDuringExecution());
    if (instance != null) {
          this.withLabelSelector(instance.getLabelSelector());
          this.withNamespaceSelector(instance.getNamespaceSelector());
          this.withNamespaces(instance.getNamespaces());
          this.withTopologyKey(instance.getTopologyKey());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public LabelSelector buildLabelSelector() {
    return this.labelSelector != null ? this.labelSelector.build() : null;
  }
  
  public A withLabelSelector(LabelSelector labelSelector) {
    this._visitables.remove("labelSelector");
    if (labelSelector != null) {
        this.labelSelector = new LabelSelectorBuilder(labelSelector);
        this._visitables.get("labelSelector").add(this.labelSelector);
    } else {
        this.labelSelector = null;
        this._visitables.get("labelSelector").remove(this.labelSelector);
    }
    return (A) this;
  }
  
  public boolean hasLabelSelector() {
    return this.labelSelector != null;
  }
  
  public LabelSelectorNested<A> withNewLabelSelector() {
    return new LabelSelectorNested(null);
  }
  
  public LabelSelectorNested<A> withNewLabelSelectorLike(LabelSelector item) {
    return new LabelSelectorNested(item);
  }
  
  public LabelSelectorNested<A> editRequiredduringschedulingignoredduringexecutionLabelSelector() {
    return withNewLabelSelectorLike(java.util.Optional.ofNullable(buildLabelSelector()).orElse(null));
  }
  
  public LabelSelectorNested<A> editOrNewLabelSelector() {
    return withNewLabelSelectorLike(java.util.Optional.ofNullable(buildLabelSelector()).orElse(new LabelSelectorBuilder().build()));
  }
  
  public LabelSelectorNested<A> editOrNewLabelSelectorLike(LabelSelector item) {
    return withNewLabelSelectorLike(java.util.Optional.ofNullable(buildLabelSelector()).orElse(item));
  }
  
  public NamespaceSelector buildNamespaceSelector() {
    return this.namespaceSelector != null ? this.namespaceSelector.build() : null;
  }
  
  public A withNamespaceSelector(NamespaceSelector namespaceSelector) {
    this._visitables.remove("namespaceSelector");
    if (namespaceSelector != null) {
        this.namespaceSelector = new NamespaceSelectorBuilder(namespaceSelector);
        this._visitables.get("namespaceSelector").add(this.namespaceSelector);
    } else {
        this.namespaceSelector = null;
        this._visitables.get("namespaceSelector").remove(this.namespaceSelector);
    }
    return (A) this;
  }
  
  public boolean hasNamespaceSelector() {
    return this.namespaceSelector != null;
  }
  
  public NamespaceSelectorNested<A> withNewNamespaceSelector() {
    return new NamespaceSelectorNested(null);
  }
  
  public NamespaceSelectorNested<A> withNewNamespaceSelectorLike(NamespaceSelector item) {
    return new NamespaceSelectorNested(item);
  }
  
  public NamespaceSelectorNested<A> editRequiredduringschedulingignoredduringexecutionNamespaceSelector() {
    return withNewNamespaceSelectorLike(java.util.Optional.ofNullable(buildNamespaceSelector()).orElse(null));
  }
  
  public NamespaceSelectorNested<A> editOrNewNamespaceSelector() {
    return withNewNamespaceSelectorLike(java.util.Optional.ofNullable(buildNamespaceSelector()).orElse(new NamespaceSelectorBuilder().build()));
  }
  
  public NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(NamespaceSelector item) {
    return withNewNamespaceSelectorLike(java.util.Optional.ofNullable(buildNamespaceSelector()).orElse(item));
  }
  
  public A addToNamespaces(int index,String item) {
    if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
    this.namespaces.add(index, item);
    return (A)this;
  }
  
  public A setToNamespaces(int index,String item) {
    if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
    this.namespaces.set(index, item); return (A)this;
  }
  
  public A addToNamespaces(java.lang.String... items) {
    if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
    for (String item : items) {this.namespaces.add(item);} return (A)this;
  }
  
  public A addAllToNamespaces(Collection<String> items) {
    if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
    for (String item : items) {this.namespaces.add(item);} return (A)this;
  }
  
  public A removeFromNamespaces(java.lang.String... items) {
    if (this.namespaces == null) return (A)this;
    for (String item : items) { this.namespaces.remove(item);} return (A)this;
  }
  
  public A removeAllFromNamespaces(Collection<String> items) {
    if (this.namespaces == null) return (A)this;
    for (String item : items) { this.namespaces.remove(item);} return (A)this;
  }
  
  public List<String> getNamespaces() {
    return this.namespaces;
  }
  
  public String getNamespace(int index) {
    return this.namespaces.get(index);
  }
  
  public String getFirstNamespace() {
    return this.namespaces.get(0);
  }
  
  public String getLastNamespace() {
    return this.namespaces.get(namespaces.size() - 1);
  }
  
  public String getMatchingNamespace(Predicate<String> predicate) {
      for (String item : namespaces) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingNamespace(Predicate<String> predicate) {
      for (String item : namespaces) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withNamespaces(List<String> namespaces) {
    if (namespaces != null) {
        this.namespaces = new ArrayList();
        for (String item : namespaces) {
          this.addToNamespaces(item);
        }
    } else {
      this.namespaces = null;
    }
    return (A) this;
  }
  
  public A withNamespaces(java.lang.String... namespaces) {
    if (this.namespaces != null) {
        this.namespaces.clear();
        _visitables.remove("namespaces");
    }
    if (namespaces != null) {
      for (String item : namespaces) {
        this.addToNamespaces(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasNamespaces() {
    return this.namespaces != null && !this.namespaces.isEmpty();
  }
  
  public String getTopologyKey() {
    return this.topologyKey;
  }
  
  public A withTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
    return (A) this;
  }
  
  public boolean hasTopologyKey() {
    return this.topologyKey != null;
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
    RequiredDuringSchedulingIgnoredDuringExecutionFluent that = (RequiredDuringSchedulingIgnoredDuringExecutionFluent) o;
    if (!java.util.Objects.equals(labelSelector, that.labelSelector)) return false;
    if (!java.util.Objects.equals(namespaceSelector, that.namespaceSelector)) return false;
    if (!java.util.Objects.equals(namespaces, that.namespaces)) return false;
    if (!java.util.Objects.equals(topologyKey, that.topologyKey)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(labelSelector,  namespaceSelector,  namespaces,  topologyKey,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (labelSelector != null) { sb.append("labelSelector:"); sb.append(labelSelector + ","); }
    if (namespaceSelector != null) { sb.append("namespaceSelector:"); sb.append(namespaceSelector + ","); }
    if (namespaces != null && !namespaces.isEmpty()) { sb.append("namespaces:"); sb.append(namespaces + ","); }
    if (topologyKey != null) { sb.append("topologyKey:"); sb.append(topologyKey + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class LabelSelectorNested<N> extends LabelSelectorFluent<LabelSelectorNested<N>> implements Nested<N>{
    LabelSelectorNested(LabelSelector item) {
      this.builder = new LabelSelectorBuilder(this, item);
    }
    LabelSelectorBuilder builder;
    
    public N and() {
      return (N) RequiredDuringSchedulingIgnoredDuringExecutionFluent.this.withLabelSelector(builder.build());
    }
    
    public N endRequiredduringschedulingignoredduringexecutionLabelSelector() {
      return and();
    }
    
  
  }
  public class NamespaceSelectorNested<N> extends NamespaceSelectorFluent<NamespaceSelectorNested<N>> implements Nested<N>{
    NamespaceSelectorNested(NamespaceSelector item) {
      this.builder = new NamespaceSelectorBuilder(this, item);
    }
    NamespaceSelectorBuilder builder;
    
    public N and() {
      return (N) RequiredDuringSchedulingIgnoredDuringExecutionFluent.this.withNamespaceSelector(builder.build());
    }
    
    public N endRequiredduringschedulingignoredduringexecutionNamespaceSelector() {
      return and();
    }
    
  
  }

}