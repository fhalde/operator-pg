package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.requiredduringschedulingignoredduringexecution;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.requiredduringschedulingignoredduringexecution.namespaceselector.MatchExpressionsBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.requiredduringschedulingignoredduringexecution.namespaceselector.MatchExpressions;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.requiredduringschedulingignoredduringexecution.namespaceselector.MatchLabelsFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.requiredduringschedulingignoredduringexecution.namespaceselector.MatchExpressionsFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.List;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.requiredduringschedulingignoredduringexecution.namespaceselector.MatchLabels;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.requiredduringschedulingignoredduringexecution.namespaceselector.MatchLabelsBuilder;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class NamespaceSelectorFluent<A extends NamespaceSelectorFluent<A>> extends BaseFluent<A>{
  public NamespaceSelectorFluent() {
  }
  
  public NamespaceSelectorFluent(NamespaceSelector instance) {
    this.copyInstance(instance);
  }
  private ArrayList<MatchExpressionsBuilder> matchExpressions;
  private MatchLabelsBuilder matchLabels;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(NamespaceSelector instance) {
    instance = (instance != null ? instance : new NamespaceSelector());
    if (instance != null) {
          this.withMatchExpressions(instance.getMatchExpressions());
          this.withMatchLabels(instance.getMatchLabels());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public A addToMatchExpressions(int index,MatchExpressions item) {
    if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<MatchExpressionsBuilder>();}
    MatchExpressionsBuilder builder = new MatchExpressionsBuilder(item);
    if (index < 0 || index >= matchExpressions.size()) { _visitables.get("matchExpressions").add(builder); matchExpressions.add(builder); } else { _visitables.get("matchExpressions").add(index, builder); matchExpressions.add(index, builder);}
    return (A)this;
  }
  
  public A setToMatchExpressions(int index,MatchExpressions item) {
    if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<MatchExpressionsBuilder>();}
    MatchExpressionsBuilder builder = new MatchExpressionsBuilder(item);
    if (index < 0 || index >= matchExpressions.size()) { _visitables.get("matchExpressions").add(builder); matchExpressions.add(builder); } else { _visitables.get("matchExpressions").set(index, builder); matchExpressions.set(index, builder);}
    return (A)this;
  }
  
  public A addToMatchExpressions(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.requiredduringschedulingignoredduringexecution.namespaceselector.MatchExpressions... items) {
    if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<MatchExpressionsBuilder>();}
    for (MatchExpressions item : items) {MatchExpressionsBuilder builder = new MatchExpressionsBuilder(item);_visitables.get("matchExpressions").add(builder);this.matchExpressions.add(builder);} return (A)this;
  }
  
  public A addAllToNamespaceselectorMatchExpressions(Collection<MatchExpressions> items) {
    if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<MatchExpressionsBuilder>();}
    for (MatchExpressions item : items) {MatchExpressionsBuilder builder = new MatchExpressionsBuilder(item);_visitables.get("matchExpressions").add(builder);this.matchExpressions.add(builder);} return (A)this;
  }
  
  public A removeFromMatchExpressions(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.requiredduringschedulingignoredduringexecution.namespaceselector.MatchExpressions... items) {
    if (this.matchExpressions == null) return (A)this;
    for (MatchExpressions item : items) {MatchExpressionsBuilder builder = new MatchExpressionsBuilder(item);_visitables.get("matchExpressions").remove(builder); this.matchExpressions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromNamespaceselectorMatchExpressions(Collection<MatchExpressions> items) {
    if (this.matchExpressions == null) return (A)this;
    for (MatchExpressions item : items) {MatchExpressionsBuilder builder = new MatchExpressionsBuilder(item);_visitables.get("matchExpressions").remove(builder); this.matchExpressions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromNamespaceselectorMatchExpressions(Predicate<MatchExpressionsBuilder> predicate) {
    if (matchExpressions == null) return (A) this;
    final Iterator<MatchExpressionsBuilder> each = matchExpressions.iterator();
    final List visitables = _visitables.get("matchExpressions");
    while (each.hasNext()) {
      MatchExpressionsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<MatchExpressions> buildMatchExpressions() {
    return this.matchExpressions != null ? build(matchExpressions) : null;
  }
  
  public MatchExpressions buildMatchExpression(int index) {
    return this.matchExpressions.get(index).build();
  }
  
  public MatchExpressions buildFirstMatchExpression() {
    return this.matchExpressions.get(0).build();
  }
  
  public MatchExpressions buildLastMatchExpression() {
    return this.matchExpressions.get(matchExpressions.size() - 1).build();
  }
  
  public MatchExpressions buildMatchingMatchExpression(Predicate<MatchExpressionsBuilder> predicate) {
      for (MatchExpressionsBuilder item : matchExpressions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingMatchExpression(Predicate<MatchExpressionsBuilder> predicate) {
      for (MatchExpressionsBuilder item : matchExpressions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withMatchExpressions(List<MatchExpressions> matchExpressions) {
    if (this.matchExpressions != null) {
      this._visitables.get("matchExpressions").clear();
    }
    if (matchExpressions != null) {
        this.matchExpressions = new ArrayList();
        for (MatchExpressions item : matchExpressions) {
          this.addToMatchExpressions(item);
        }
    } else {
      this.matchExpressions = null;
    }
    return (A) this;
  }
  
  public A withMatchExpressions(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.requiredduringschedulingignoredduringexecution.namespaceselector.MatchExpressions... matchExpressions) {
    if (this.matchExpressions != null) {
        this.matchExpressions.clear();
        _visitables.remove("matchExpressions");
    }
    if (matchExpressions != null) {
      for (MatchExpressions item : matchExpressions) {
        this.addToMatchExpressions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasMatchExpressions() {
    return this.matchExpressions != null && !this.matchExpressions.isEmpty();
  }
  
  public MatchExpressionsNested<A> addNewMatchExpression() {
    return new MatchExpressionsNested(-1, null);
  }
  
  public MatchExpressionsNested<A> addNewMatchExpressionLike(MatchExpressions item) {
    return new MatchExpressionsNested(-1, item);
  }
  
  public MatchExpressionsNested<A> setNewMatchExpressionLike(int index,MatchExpressions item) {
    return new MatchExpressionsNested(index, item);
  }
  
  public MatchExpressionsNested<A> editMatchExpression(int index) {
    if (matchExpressions.size() <= index) throw new RuntimeException("Can't edit matchExpressions. Index exceeds size.");
    return setNewMatchExpressionLike(index, buildMatchExpression(index));
  }
  
  public MatchExpressionsNested<A> editFirstMatchExpression() {
    if (matchExpressions.size() == 0) throw new RuntimeException("Can't edit first matchExpressions. The list is empty.");
    return setNewMatchExpressionLike(0, buildMatchExpression(0));
  }
  
  public MatchExpressionsNested<A> editLastMatchExpression() {
    int index = matchExpressions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last matchExpressions. The list is empty.");
    return setNewMatchExpressionLike(index, buildMatchExpression(index));
  }
  
  public MatchExpressionsNested<A> editMatchingMatchExpression(Predicate<MatchExpressionsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<matchExpressions.size();i++) { 
    if (predicate.test(matchExpressions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching matchExpressions. No match found.");
    return setNewMatchExpressionLike(index, buildMatchExpression(index));
  }
  
  public MatchLabels buildMatchLabels() {
    return this.matchLabels != null ? this.matchLabels.build() : null;
  }
  
  public A withMatchLabels(MatchLabels matchLabels) {
    this._visitables.remove("matchLabels");
    if (matchLabels != null) {
        this.matchLabels = new MatchLabelsBuilder(matchLabels);
        this._visitables.get("matchLabels").add(this.matchLabels);
    } else {
        this.matchLabels = null;
        this._visitables.get("matchLabels").remove(this.matchLabels);
    }
    return (A) this;
  }
  
  public boolean hasMatchLabels() {
    return this.matchLabels != null;
  }
  
  public MatchLabelsNested<A> withNewMatchLabels() {
    return new MatchLabelsNested(null);
  }
  
  public MatchLabelsNested<A> withNewMatchLabelsLike(MatchLabels item) {
    return new MatchLabelsNested(item);
  }
  
  public MatchLabelsNested<A> editNamespaceselectorMatchLabels() {
    return withNewMatchLabelsLike(java.util.Optional.ofNullable(buildMatchLabels()).orElse(null));
  }
  
  public MatchLabelsNested<A> editOrNewMatchLabels() {
    return withNewMatchLabelsLike(java.util.Optional.ofNullable(buildMatchLabels()).orElse(new MatchLabelsBuilder().build()));
  }
  
  public MatchLabelsNested<A> editOrNewMatchLabelsLike(MatchLabels item) {
    return withNewMatchLabelsLike(java.util.Optional.ofNullable(buildMatchLabels()).orElse(item));
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
    NamespaceSelectorFluent that = (NamespaceSelectorFluent) o;
    if (!java.util.Objects.equals(matchExpressions, that.matchExpressions)) return false;
    if (!java.util.Objects.equals(matchLabels, that.matchLabels)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(matchExpressions,  matchLabels,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (matchExpressions != null && !matchExpressions.isEmpty()) { sb.append("matchExpressions:"); sb.append(matchExpressions + ","); }
    if (matchLabels != null) { sb.append("matchLabels:"); sb.append(matchLabels + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class MatchExpressionsNested<N> extends MatchExpressionsFluent<MatchExpressionsNested<N>> implements Nested<N>{
    MatchExpressionsNested(int index,MatchExpressions item) {
      this.index = index;
      this.builder = new MatchExpressionsBuilder(this, item);
    }
    MatchExpressionsBuilder builder;
    int index;
    
    public N and() {
      return (N) NamespaceSelectorFluent.this.setToMatchExpressions(index,builder.build());
    }
    
    public N endNamespaceselectorMatchExpression() {
      return and();
    }
    
  
  }
  public class MatchLabelsNested<N> extends MatchLabelsFluent<MatchLabelsNested<N>> implements Nested<N>{
    MatchLabelsNested(MatchLabels item) {
      this.builder = new MatchLabelsBuilder(this, item);
    }
    MatchLabelsBuilder builder;
    
    public N and() {
      return (N) NamespaceSelectorFluent.this.withMatchLabels(builder.build());
    }
    
    public N endNamespaceselectorMatchLabels() {
      return and();
    }
    
  
  }

}