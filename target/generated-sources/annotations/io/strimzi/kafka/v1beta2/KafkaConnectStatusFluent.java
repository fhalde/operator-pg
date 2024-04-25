package io.strimzi.kafka.v1beta2;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.strimzi.kafka.v1beta2.kafkaconnectstatus.ConditionsFluent;
import java.lang.String;
import io.strimzi.kafka.v1beta2.kafkaconnectstatus.ConnectorPluginsFluent;
import io.strimzi.kafka.v1beta2.kafkaconnectstatus.Conditions;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.strimzi.kafka.v1beta2.kafkaconnectstatus.ConnectorPluginsBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.List;
import io.strimzi.kafka.v1beta2.kafkaconnectstatus.ConditionsBuilder;
import java.lang.Long;
import java.util.Collection;
import io.strimzi.kafka.v1beta2.kafkaconnectstatus.ConnectorPlugins;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class KafkaConnectStatusFluent<A extends KafkaConnectStatusFluent<A>> extends BaseFluent<A>{
  public KafkaConnectStatusFluent() {
  }
  
  public KafkaConnectStatusFluent(KafkaConnectStatus instance) {
    this.copyInstance(instance);
  }
  private ArrayList<ConditionsBuilder> conditions;
  private ArrayList<ConnectorPluginsBuilder> connectorPlugins;
  private String labelSelector;
  private Long observedGeneration;
  private Long replicas;
  private String url;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(KafkaConnectStatus instance) {
    instance = (instance != null ? instance : new KafkaConnectStatus());
    if (instance != null) {
          this.withConditions(instance.getConditions());
          this.withConnectorPlugins(instance.getConnectorPlugins());
          this.withLabelSelector(instance.getLabelSelector());
          this.withObservedGeneration(instance.getObservedGeneration());
          this.withReplicas(instance.getReplicas());
          this.withUrl(instance.getUrl());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public A addToConditions(int index,Conditions item) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    ConditionsBuilder builder = new ConditionsBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToConditions(int index,Conditions item) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    ConditionsBuilder builder = new ConditionsBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
    return (A)this;
  }
  
  public A addToConditions(io.strimzi.kafka.v1beta2.kafkaconnectstatus.Conditions... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A addAllToIoConditions(Collection<Conditions> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<ConditionsBuilder>();}
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A removeFromConditions(io.strimzi.kafka.v1beta2.kafkaconnectstatus.Conditions... items) {
    if (this.conditions == null) return (A)this;
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromIoConditions(Collection<Conditions> items) {
    if (this.conditions == null) return (A)this;
    for (Conditions item : items) {ConditionsBuilder builder = new ConditionsBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromIoConditions(Predicate<ConditionsBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<ConditionsBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      ConditionsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Conditions> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public Conditions buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public Conditions buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public Conditions buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public Conditions buildMatchingCondition(Predicate<ConditionsBuilder> predicate) {
      for (ConditionsBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<ConditionsBuilder> predicate) {
      for (ConditionsBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<Conditions> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (Conditions item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(io.strimzi.kafka.v1beta2.kafkaconnectstatus.Conditions... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (Conditions item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !this.conditions.isEmpty();
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(Conditions item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,Conditions item) {
    return new ConditionsNested(index, item);
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<ConditionsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public A addToConnectorPlugins(int index,ConnectorPlugins item) {
    if (this.connectorPlugins == null) {this.connectorPlugins = new ArrayList<ConnectorPluginsBuilder>();}
    ConnectorPluginsBuilder builder = new ConnectorPluginsBuilder(item);
    if (index < 0 || index >= connectorPlugins.size()) { _visitables.get("connectorPlugins").add(builder); connectorPlugins.add(builder); } else { _visitables.get("connectorPlugins").add(index, builder); connectorPlugins.add(index, builder);}
    return (A)this;
  }
  
  public A setToConnectorPlugins(int index,ConnectorPlugins item) {
    if (this.connectorPlugins == null) {this.connectorPlugins = new ArrayList<ConnectorPluginsBuilder>();}
    ConnectorPluginsBuilder builder = new ConnectorPluginsBuilder(item);
    if (index < 0 || index >= connectorPlugins.size()) { _visitables.get("connectorPlugins").add(builder); connectorPlugins.add(builder); } else { _visitables.get("connectorPlugins").set(index, builder); connectorPlugins.set(index, builder);}
    return (A)this;
  }
  
  public A addToConnectorPlugins(io.strimzi.kafka.v1beta2.kafkaconnectstatus.ConnectorPlugins... items) {
    if (this.connectorPlugins == null) {this.connectorPlugins = new ArrayList<ConnectorPluginsBuilder>();}
    for (ConnectorPlugins item : items) {ConnectorPluginsBuilder builder = new ConnectorPluginsBuilder(item);_visitables.get("connectorPlugins").add(builder);this.connectorPlugins.add(builder);} return (A)this;
  }
  
  public A addAllToIoConnectorPlugins(Collection<ConnectorPlugins> items) {
    if (this.connectorPlugins == null) {this.connectorPlugins = new ArrayList<ConnectorPluginsBuilder>();}
    for (ConnectorPlugins item : items) {ConnectorPluginsBuilder builder = new ConnectorPluginsBuilder(item);_visitables.get("connectorPlugins").add(builder);this.connectorPlugins.add(builder);} return (A)this;
  }
  
  public A removeFromConnectorPlugins(io.strimzi.kafka.v1beta2.kafkaconnectstatus.ConnectorPlugins... items) {
    if (this.connectorPlugins == null) return (A)this;
    for (ConnectorPlugins item : items) {ConnectorPluginsBuilder builder = new ConnectorPluginsBuilder(item);_visitables.get("connectorPlugins").remove(builder); this.connectorPlugins.remove(builder);} return (A)this;
  }
  
  public A removeAllFromIoConnectorPlugins(Collection<ConnectorPlugins> items) {
    if (this.connectorPlugins == null) return (A)this;
    for (ConnectorPlugins item : items) {ConnectorPluginsBuilder builder = new ConnectorPluginsBuilder(item);_visitables.get("connectorPlugins").remove(builder); this.connectorPlugins.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromIoConnectorPlugins(Predicate<ConnectorPluginsBuilder> predicate) {
    if (connectorPlugins == null) return (A) this;
    final Iterator<ConnectorPluginsBuilder> each = connectorPlugins.iterator();
    final List visitables = _visitables.get("connectorPlugins");
    while (each.hasNext()) {
      ConnectorPluginsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<ConnectorPlugins> buildConnectorPlugins() {
    return this.connectorPlugins != null ? build(connectorPlugins) : null;
  }
  
  public ConnectorPlugins buildConnectorPlugin(int index) {
    return this.connectorPlugins.get(index).build();
  }
  
  public ConnectorPlugins buildFirstConnectorPlugin() {
    return this.connectorPlugins.get(0).build();
  }
  
  public ConnectorPlugins buildLastConnectorPlugin() {
    return this.connectorPlugins.get(connectorPlugins.size() - 1).build();
  }
  
  public ConnectorPlugins buildMatchingConnectorPlugin(Predicate<ConnectorPluginsBuilder> predicate) {
      for (ConnectorPluginsBuilder item : connectorPlugins) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingConnectorPlugin(Predicate<ConnectorPluginsBuilder> predicate) {
      for (ConnectorPluginsBuilder item : connectorPlugins) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConnectorPlugins(List<ConnectorPlugins> connectorPlugins) {
    if (this.connectorPlugins != null) {
      this._visitables.get("connectorPlugins").clear();
    }
    if (connectorPlugins != null) {
        this.connectorPlugins = new ArrayList();
        for (ConnectorPlugins item : connectorPlugins) {
          this.addToConnectorPlugins(item);
        }
    } else {
      this.connectorPlugins = null;
    }
    return (A) this;
  }
  
  public A withConnectorPlugins(io.strimzi.kafka.v1beta2.kafkaconnectstatus.ConnectorPlugins... connectorPlugins) {
    if (this.connectorPlugins != null) {
        this.connectorPlugins.clear();
        _visitables.remove("connectorPlugins");
    }
    if (connectorPlugins != null) {
      for (ConnectorPlugins item : connectorPlugins) {
        this.addToConnectorPlugins(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConnectorPlugins() {
    return this.connectorPlugins != null && !this.connectorPlugins.isEmpty();
  }
  
  public ConnectorPluginsNested<A> addNewConnectorPlugin() {
    return new ConnectorPluginsNested(-1, null);
  }
  
  public ConnectorPluginsNested<A> addNewConnectorPluginLike(ConnectorPlugins item) {
    return new ConnectorPluginsNested(-1, item);
  }
  
  public ConnectorPluginsNested<A> setNewConnectorPluginLike(int index,ConnectorPlugins item) {
    return new ConnectorPluginsNested(index, item);
  }
  
  public ConnectorPluginsNested<A> editConnectorPlugin(int index) {
    if (connectorPlugins.size() <= index) throw new RuntimeException("Can't edit connectorPlugins. Index exceeds size.");
    return setNewConnectorPluginLike(index, buildConnectorPlugin(index));
  }
  
  public ConnectorPluginsNested<A> editFirstConnectorPlugin() {
    if (connectorPlugins.size() == 0) throw new RuntimeException("Can't edit first connectorPlugins. The list is empty.");
    return setNewConnectorPluginLike(0, buildConnectorPlugin(0));
  }
  
  public ConnectorPluginsNested<A> editLastConnectorPlugin() {
    int index = connectorPlugins.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last connectorPlugins. The list is empty.");
    return setNewConnectorPluginLike(index, buildConnectorPlugin(index));
  }
  
  public ConnectorPluginsNested<A> editMatchingConnectorPlugin(Predicate<ConnectorPluginsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<connectorPlugins.size();i++) { 
    if (predicate.test(connectorPlugins.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching connectorPlugins. No match found.");
    return setNewConnectorPluginLike(index, buildConnectorPlugin(index));
  }
  
  public String getLabelSelector() {
    return this.labelSelector;
  }
  
  public A withLabelSelector(String labelSelector) {
    this.labelSelector = labelSelector;
    return (A) this;
  }
  
  public boolean hasLabelSelector() {
    return this.labelSelector != null;
  }
  
  public Long getObservedGeneration() {
    return this.observedGeneration;
  }
  
  public A withObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return (A) this;
  }
  
  public boolean hasObservedGeneration() {
    return this.observedGeneration != null;
  }
  
  public Long getReplicas() {
    return this.replicas;
  }
  
  public A withReplicas(Long replicas) {
    this.replicas = replicas;
    return (A) this;
  }
  
  public boolean hasReplicas() {
    return this.replicas != null;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public A withUrl(String url) {
    this.url = url;
    return (A) this;
  }
  
  public boolean hasUrl() {
    return this.url != null;
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
    KafkaConnectStatusFluent that = (KafkaConnectStatusFluent) o;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    if (!java.util.Objects.equals(connectorPlugins, that.connectorPlugins)) return false;
    if (!java.util.Objects.equals(labelSelector, that.labelSelector)) return false;
    if (!java.util.Objects.equals(observedGeneration, that.observedGeneration)) return false;
    if (!java.util.Objects.equals(replicas, that.replicas)) return false;
    if (!java.util.Objects.equals(url, that.url)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(conditions,  connectorPlugins,  labelSelector,  observedGeneration,  replicas,  url,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (connectorPlugins != null && !connectorPlugins.isEmpty()) { sb.append("connectorPlugins:"); sb.append(connectorPlugins + ","); }
    if (labelSelector != null) { sb.append("labelSelector:"); sb.append(labelSelector + ","); }
    if (observedGeneration != null) { sb.append("observedGeneration:"); sb.append(observedGeneration + ","); }
    if (replicas != null) { sb.append("replicas:"); sb.append(replicas + ","); }
    if (url != null) { sb.append("url:"); sb.append(url + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionsNested<N> extends ConditionsFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,Conditions item) {
      this.index = index;
      this.builder = new ConditionsBuilder(this, item);
    }
    ConditionsBuilder builder;
    int index;
    
    public N and() {
      return (N) KafkaConnectStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endIoCondition() {
      return and();
    }
    
  
  }
  public class ConnectorPluginsNested<N> extends ConnectorPluginsFluent<ConnectorPluginsNested<N>> implements Nested<N>{
    ConnectorPluginsNested(int index,ConnectorPlugins item) {
      this.index = index;
      this.builder = new ConnectorPluginsBuilder(this, item);
    }
    ConnectorPluginsBuilder builder;
    int index;
    
    public N and() {
      return (N) KafkaConnectStatusFluent.this.setToConnectorPlugins(index,builder.build());
    }
    
    public N endIoConnectorPlugin() {
      return and();
    }
    
  
  }

}