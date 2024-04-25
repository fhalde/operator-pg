package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.NodeSelectorTerms;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.NodeSelectorTermsFluent;
import java.util.Map;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.NodeSelectorTermsBuilder;

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
  private ArrayList<NodeSelectorTermsBuilder> nodeSelectorTerms;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(RequiredDuringSchedulingIgnoredDuringExecution instance) {
    instance = (instance != null ? instance : new RequiredDuringSchedulingIgnoredDuringExecution());
    if (instance != null) {
          this.withNodeSelectorTerms(instance.getNodeSelectorTerms());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public A addToNodeSelectorTerms(int index,NodeSelectorTerms item) {
    if (this.nodeSelectorTerms == null) {this.nodeSelectorTerms = new ArrayList<NodeSelectorTermsBuilder>();}
    NodeSelectorTermsBuilder builder = new NodeSelectorTermsBuilder(item);
    if (index < 0 || index >= nodeSelectorTerms.size()) { _visitables.get("nodeSelectorTerms").add(builder); nodeSelectorTerms.add(builder); } else { _visitables.get("nodeSelectorTerms").add(index, builder); nodeSelectorTerms.add(index, builder);}
    return (A)this;
  }
  
  public A setToNodeSelectorTerms(int index,NodeSelectorTerms item) {
    if (this.nodeSelectorTerms == null) {this.nodeSelectorTerms = new ArrayList<NodeSelectorTermsBuilder>();}
    NodeSelectorTermsBuilder builder = new NodeSelectorTermsBuilder(item);
    if (index < 0 || index >= nodeSelectorTerms.size()) { _visitables.get("nodeSelectorTerms").add(builder); nodeSelectorTerms.add(builder); } else { _visitables.get("nodeSelectorTerms").set(index, builder); nodeSelectorTerms.set(index, builder);}
    return (A)this;
  }
  
  public A addToNodeSelectorTerms(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.NodeSelectorTerms... items) {
    if (this.nodeSelectorTerms == null) {this.nodeSelectorTerms = new ArrayList<NodeSelectorTermsBuilder>();}
    for (NodeSelectorTerms item : items) {NodeSelectorTermsBuilder builder = new NodeSelectorTermsBuilder(item);_visitables.get("nodeSelectorTerms").add(builder);this.nodeSelectorTerms.add(builder);} return (A)this;
  }
  
  public A addAllToNodeSelectorTerms(Collection<NodeSelectorTerms> items) {
    if (this.nodeSelectorTerms == null) {this.nodeSelectorTerms = new ArrayList<NodeSelectorTermsBuilder>();}
    for (NodeSelectorTerms item : items) {NodeSelectorTermsBuilder builder = new NodeSelectorTermsBuilder(item);_visitables.get("nodeSelectorTerms").add(builder);this.nodeSelectorTerms.add(builder);} return (A)this;
  }
  
  public A removeFromNodeSelectorTerms(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.NodeSelectorTerms... items) {
    if (this.nodeSelectorTerms == null) return (A)this;
    for (NodeSelectorTerms item : items) {NodeSelectorTermsBuilder builder = new NodeSelectorTermsBuilder(item);_visitables.get("nodeSelectorTerms").remove(builder); this.nodeSelectorTerms.remove(builder);} return (A)this;
  }
  
  public A removeAllFromNodeSelectorTerms(Collection<NodeSelectorTerms> items) {
    if (this.nodeSelectorTerms == null) return (A)this;
    for (NodeSelectorTerms item : items) {NodeSelectorTermsBuilder builder = new NodeSelectorTermsBuilder(item);_visitables.get("nodeSelectorTerms").remove(builder); this.nodeSelectorTerms.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromNodeSelectorTerms(Predicate<NodeSelectorTermsBuilder> predicate) {
    if (nodeSelectorTerms == null) return (A) this;
    final Iterator<NodeSelectorTermsBuilder> each = nodeSelectorTerms.iterator();
    final List visitables = _visitables.get("nodeSelectorTerms");
    while (each.hasNext()) {
      NodeSelectorTermsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<NodeSelectorTerms> buildNodeSelectorTerms() {
    return this.nodeSelectorTerms != null ? build(nodeSelectorTerms) : null;
  }
  
  public NodeSelectorTerms buildNodeSelectorTerm(int index) {
    return this.nodeSelectorTerms.get(index).build();
  }
  
  public NodeSelectorTerms buildFirstNodeSelectorTerm() {
    return this.nodeSelectorTerms.get(0).build();
  }
  
  public NodeSelectorTerms buildLastNodeSelectorTerm() {
    return this.nodeSelectorTerms.get(nodeSelectorTerms.size() - 1).build();
  }
  
  public NodeSelectorTerms buildMatchingNodeSelectorTerm(Predicate<NodeSelectorTermsBuilder> predicate) {
      for (NodeSelectorTermsBuilder item : nodeSelectorTerms) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingNodeSelectorTerm(Predicate<NodeSelectorTermsBuilder> predicate) {
      for (NodeSelectorTermsBuilder item : nodeSelectorTerms) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withNodeSelectorTerms(List<NodeSelectorTerms> nodeSelectorTerms) {
    if (this.nodeSelectorTerms != null) {
      this._visitables.get("nodeSelectorTerms").clear();
    }
    if (nodeSelectorTerms != null) {
        this.nodeSelectorTerms = new ArrayList();
        for (NodeSelectorTerms item : nodeSelectorTerms) {
          this.addToNodeSelectorTerms(item);
        }
    } else {
      this.nodeSelectorTerms = null;
    }
    return (A) this;
  }
  
  public A withNodeSelectorTerms(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.NodeSelectorTerms... nodeSelectorTerms) {
    if (this.nodeSelectorTerms != null) {
        this.nodeSelectorTerms.clear();
        _visitables.remove("nodeSelectorTerms");
    }
    if (nodeSelectorTerms != null) {
      for (NodeSelectorTerms item : nodeSelectorTerms) {
        this.addToNodeSelectorTerms(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasNodeSelectorTerms() {
    return this.nodeSelectorTerms != null && !this.nodeSelectorTerms.isEmpty();
  }
  
  public NodeSelectorTermsNested<A> addNewNodeSelectorTerm() {
    return new NodeSelectorTermsNested(-1, null);
  }
  
  public NodeSelectorTermsNested<A> addNewNodeSelectorTermLike(NodeSelectorTerms item) {
    return new NodeSelectorTermsNested(-1, item);
  }
  
  public NodeSelectorTermsNested<A> setNewNodeSelectorTermLike(int index,NodeSelectorTerms item) {
    return new NodeSelectorTermsNested(index, item);
  }
  
  public NodeSelectorTermsNested<A> editNodeSelectorTerm(int index) {
    if (nodeSelectorTerms.size() <= index) throw new RuntimeException("Can't edit nodeSelectorTerms. Index exceeds size.");
    return setNewNodeSelectorTermLike(index, buildNodeSelectorTerm(index));
  }
  
  public NodeSelectorTermsNested<A> editFirstNodeSelectorTerm() {
    if (nodeSelectorTerms.size() == 0) throw new RuntimeException("Can't edit first nodeSelectorTerms. The list is empty.");
    return setNewNodeSelectorTermLike(0, buildNodeSelectorTerm(0));
  }
  
  public NodeSelectorTermsNested<A> editLastNodeSelectorTerm() {
    int index = nodeSelectorTerms.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last nodeSelectorTerms. The list is empty.");
    return setNewNodeSelectorTermLike(index, buildNodeSelectorTerm(index));
  }
  
  public NodeSelectorTermsNested<A> editMatchingNodeSelectorTerm(Predicate<NodeSelectorTermsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<nodeSelectorTerms.size();i++) { 
    if (predicate.test(nodeSelectorTerms.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching nodeSelectorTerms. No match found.");
    return setNewNodeSelectorTermLike(index, buildNodeSelectorTerm(index));
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
    if (!java.util.Objects.equals(nodeSelectorTerms, that.nodeSelectorTerms)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(nodeSelectorTerms,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (nodeSelectorTerms != null && !nodeSelectorTerms.isEmpty()) { sb.append("nodeSelectorTerms:"); sb.append(nodeSelectorTerms + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class NodeSelectorTermsNested<N> extends NodeSelectorTermsFluent<NodeSelectorTermsNested<N>> implements Nested<N>{
    NodeSelectorTermsNested(int index,NodeSelectorTerms item) {
      this.index = index;
      this.builder = new NodeSelectorTermsBuilder(this, item);
    }
    NodeSelectorTermsBuilder builder;
    int index;
    
    public N and() {
      return (N) RequiredDuringSchedulingIgnoredDuringExecutionFluent.this.setToNodeSelectorTerms(index,builder.build());
    }
    
    public N endNodeSelectorTerm() {
      return and();
    }
    
  
  }

}