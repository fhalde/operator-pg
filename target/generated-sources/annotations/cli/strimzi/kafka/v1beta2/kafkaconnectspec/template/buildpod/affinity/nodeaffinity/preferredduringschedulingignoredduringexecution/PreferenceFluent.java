package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference.MatchExpressionsBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference.MatchFieldsFluent;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference.MatchExpressions;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference.MatchExpressionsFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference.MatchFields;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.List;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference.MatchFieldsBuilder;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class PreferenceFluent<A extends PreferenceFluent<A>> extends BaseFluent<A>{
  public PreferenceFluent() {
  }
  
  public PreferenceFluent(Preference instance) {
    this.copyInstance(instance);
  }
  private ArrayList<MatchExpressionsBuilder> matchExpressions;
  private ArrayList<MatchFieldsBuilder> matchFields;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(Preference instance) {
    instance = (instance != null ? instance : new Preference());
    if (instance != null) {
          this.withMatchExpressions(instance.getMatchExpressions());
          this.withMatchFields(instance.getMatchFields());
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
  
  public A addToMatchExpressions(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference.MatchExpressions... items) {
    if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<MatchExpressionsBuilder>();}
    for (MatchExpressions item : items) {MatchExpressionsBuilder builder = new MatchExpressionsBuilder(item);_visitables.get("matchExpressions").add(builder);this.matchExpressions.add(builder);} return (A)this;
  }
  
  public A addAllToMatchExpressions(Collection<MatchExpressions> items) {
    if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<MatchExpressionsBuilder>();}
    for (MatchExpressions item : items) {MatchExpressionsBuilder builder = new MatchExpressionsBuilder(item);_visitables.get("matchExpressions").add(builder);this.matchExpressions.add(builder);} return (A)this;
  }
  
  public A removeFromMatchExpressions(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference.MatchExpressions... items) {
    if (this.matchExpressions == null) return (A)this;
    for (MatchExpressions item : items) {MatchExpressionsBuilder builder = new MatchExpressionsBuilder(item);_visitables.get("matchExpressions").remove(builder); this.matchExpressions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromMatchExpressions(Collection<MatchExpressions> items) {
    if (this.matchExpressions == null) return (A)this;
    for (MatchExpressions item : items) {MatchExpressionsBuilder builder = new MatchExpressionsBuilder(item);_visitables.get("matchExpressions").remove(builder); this.matchExpressions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromMatchExpressions(Predicate<MatchExpressionsBuilder> predicate) {
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
  
  public A withMatchExpressions(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference.MatchExpressions... matchExpressions) {
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
  
  public A addToMatchFields(int index,MatchFields item) {
    if (this.matchFields == null) {this.matchFields = new ArrayList<MatchFieldsBuilder>();}
    MatchFieldsBuilder builder = new MatchFieldsBuilder(item);
    if (index < 0 || index >= matchFields.size()) { _visitables.get("matchFields").add(builder); matchFields.add(builder); } else { _visitables.get("matchFields").add(index, builder); matchFields.add(index, builder);}
    return (A)this;
  }
  
  public A setToMatchFields(int index,MatchFields item) {
    if (this.matchFields == null) {this.matchFields = new ArrayList<MatchFieldsBuilder>();}
    MatchFieldsBuilder builder = new MatchFieldsBuilder(item);
    if (index < 0 || index >= matchFields.size()) { _visitables.get("matchFields").add(builder); matchFields.add(builder); } else { _visitables.get("matchFields").set(index, builder); matchFields.set(index, builder);}
    return (A)this;
  }
  
  public A addToMatchFields(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference.MatchFields... items) {
    if (this.matchFields == null) {this.matchFields = new ArrayList<MatchFieldsBuilder>();}
    for (MatchFields item : items) {MatchFieldsBuilder builder = new MatchFieldsBuilder(item);_visitables.get("matchFields").add(builder);this.matchFields.add(builder);} return (A)this;
  }
  
  public A addAllToMatchFields(Collection<MatchFields> items) {
    if (this.matchFields == null) {this.matchFields = new ArrayList<MatchFieldsBuilder>();}
    for (MatchFields item : items) {MatchFieldsBuilder builder = new MatchFieldsBuilder(item);_visitables.get("matchFields").add(builder);this.matchFields.add(builder);} return (A)this;
  }
  
  public A removeFromMatchFields(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference.MatchFields... items) {
    if (this.matchFields == null) return (A)this;
    for (MatchFields item : items) {MatchFieldsBuilder builder = new MatchFieldsBuilder(item);_visitables.get("matchFields").remove(builder); this.matchFields.remove(builder);} return (A)this;
  }
  
  public A removeAllFromMatchFields(Collection<MatchFields> items) {
    if (this.matchFields == null) return (A)this;
    for (MatchFields item : items) {MatchFieldsBuilder builder = new MatchFieldsBuilder(item);_visitables.get("matchFields").remove(builder); this.matchFields.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromMatchFields(Predicate<MatchFieldsBuilder> predicate) {
    if (matchFields == null) return (A) this;
    final Iterator<MatchFieldsBuilder> each = matchFields.iterator();
    final List visitables = _visitables.get("matchFields");
    while (each.hasNext()) {
      MatchFieldsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<MatchFields> buildMatchFields() {
    return this.matchFields != null ? build(matchFields) : null;
  }
  
  public MatchFields buildMatchField(int index) {
    return this.matchFields.get(index).build();
  }
  
  public MatchFields buildFirstMatchField() {
    return this.matchFields.get(0).build();
  }
  
  public MatchFields buildLastMatchField() {
    return this.matchFields.get(matchFields.size() - 1).build();
  }
  
  public MatchFields buildMatchingMatchField(Predicate<MatchFieldsBuilder> predicate) {
      for (MatchFieldsBuilder item : matchFields) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingMatchField(Predicate<MatchFieldsBuilder> predicate) {
      for (MatchFieldsBuilder item : matchFields) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withMatchFields(List<MatchFields> matchFields) {
    if (this.matchFields != null) {
      this._visitables.get("matchFields").clear();
    }
    if (matchFields != null) {
        this.matchFields = new ArrayList();
        for (MatchFields item : matchFields) {
          this.addToMatchFields(item);
        }
    } else {
      this.matchFields = null;
    }
    return (A) this;
  }
  
  public A withMatchFields(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference.MatchFields... matchFields) {
    if (this.matchFields != null) {
        this.matchFields.clear();
        _visitables.remove("matchFields");
    }
    if (matchFields != null) {
      for (MatchFields item : matchFields) {
        this.addToMatchFields(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasMatchFields() {
    return this.matchFields != null && !this.matchFields.isEmpty();
  }
  
  public MatchFieldsNested<A> addNewMatchField() {
    return new MatchFieldsNested(-1, null);
  }
  
  public MatchFieldsNested<A> addNewMatchFieldLike(MatchFields item) {
    return new MatchFieldsNested(-1, item);
  }
  
  public MatchFieldsNested<A> setNewMatchFieldLike(int index,MatchFields item) {
    return new MatchFieldsNested(index, item);
  }
  
  public MatchFieldsNested<A> editMatchField(int index) {
    if (matchFields.size() <= index) throw new RuntimeException("Can't edit matchFields. Index exceeds size.");
    return setNewMatchFieldLike(index, buildMatchField(index));
  }
  
  public MatchFieldsNested<A> editFirstMatchField() {
    if (matchFields.size() == 0) throw new RuntimeException("Can't edit first matchFields. The list is empty.");
    return setNewMatchFieldLike(0, buildMatchField(0));
  }
  
  public MatchFieldsNested<A> editLastMatchField() {
    int index = matchFields.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last matchFields. The list is empty.");
    return setNewMatchFieldLike(index, buildMatchField(index));
  }
  
  public MatchFieldsNested<A> editMatchingMatchField(Predicate<MatchFieldsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<matchFields.size();i++) { 
    if (predicate.test(matchFields.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching matchFields. No match found.");
    return setNewMatchFieldLike(index, buildMatchField(index));
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
    PreferenceFluent that = (PreferenceFluent) o;
    if (!java.util.Objects.equals(matchExpressions, that.matchExpressions)) return false;
    if (!java.util.Objects.equals(matchFields, that.matchFields)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(matchExpressions,  matchFields,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (matchExpressions != null && !matchExpressions.isEmpty()) { sb.append("matchExpressions:"); sb.append(matchExpressions + ","); }
    if (matchFields != null && !matchFields.isEmpty()) { sb.append("matchFields:"); sb.append(matchFields + ","); }
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
      return (N) PreferenceFluent.this.setToMatchExpressions(index,builder.build());
    }
    
    public N endMatchExpression() {
      return and();
    }
    
  
  }
  public class MatchFieldsNested<N> extends MatchFieldsFluent<MatchFieldsNested<N>> implements Nested<N>{
    MatchFieldsNested(int index,MatchFields item) {
      this.index = index;
      this.builder = new MatchFieldsBuilder(this, item);
    }
    MatchFieldsBuilder builder;
    int index;
    
    public N and() {
      return (N) PreferenceFluent.this.setToMatchFields(index,builder.build());
    }
    
    public N endMatchField() {
      return and();
    }
    
  
  }

}