package cli.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.volumes;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.volumes.secret.ItemsBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.util.Iterator;
import java.util.Collection;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.volumes.secret.Items;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.volumes.secret.ItemsFluent;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class SecretFluent<A extends SecretFluent<A>> extends BaseFluent<A>{
  public SecretFluent() {
  }
  
  public SecretFluent(Secret instance) {
    this.copyInstance(instance);
  }
  private Long defaultMode;
  private ArrayList<ItemsBuilder> items;
  private Boolean optional;
  private String secretName;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(Secret instance) {
    instance = (instance != null ? instance : new Secret());
    if (instance != null) {
          this.withDefaultMode(instance.getDefaultMode());
          this.withItems(instance.getItems());
          this.withOptional(instance.getOptional());
          this.withSecretName(instance.getSecretName());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public Long getDefaultMode() {
    return this.defaultMode;
  }
  
  public A withDefaultMode(Long defaultMode) {
    this.defaultMode = defaultMode;
    return (A) this;
  }
  
  public boolean hasDefaultMode() {
    return this.defaultMode != null;
  }
  
  public A addToItems(int index,Items item) {
    if (this.items == null) {this.items = new ArrayList<ItemsBuilder>();}
    ItemsBuilder builder = new ItemsBuilder(item);
    if (index < 0 || index >= items.size()) { _visitables.get("items").add(builder); items.add(builder); } else { _visitables.get("items").add(index, builder); items.add(index, builder);}
    return (A)this;
  }
  
  public A setToItems(int index,Items item) {
    if (this.items == null) {this.items = new ArrayList<ItemsBuilder>();}
    ItemsBuilder builder = new ItemsBuilder(item);
    if (index < 0 || index >= items.size()) { _visitables.get("items").add(builder); items.add(builder); } else { _visitables.get("items").set(index, builder); items.set(index, builder);}
    return (A)this;
  }
  
  public A addToItems(cli.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.volumes.secret.Items... items) {
    if (this.items == null) {this.items = new ArrayList<ItemsBuilder>();}
    for (Items item : items) {ItemsBuilder builder = new ItemsBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  
  public A addAllToSecretItems(Collection<Items> items) {
    if (this.items == null) {this.items = new ArrayList<ItemsBuilder>();}
    for (Items item : items) {ItemsBuilder builder = new ItemsBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  
  public A removeFromItems(cli.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.volumes.secret.Items... items) {
    if (this.items == null) return (A)this;
    for (Items item : items) {ItemsBuilder builder = new ItemsBuilder(item);_visitables.get("items").remove(builder); this.items.remove(builder);} return (A)this;
  }
  
  public A removeAllFromSecretItems(Collection<Items> items) {
    if (this.items == null) return (A)this;
    for (Items item : items) {ItemsBuilder builder = new ItemsBuilder(item);_visitables.get("items").remove(builder); this.items.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromSecretItems(Predicate<ItemsBuilder> predicate) {
    if (items == null) return (A) this;
    final Iterator<ItemsBuilder> each = items.iterator();
    final List visitables = _visitables.get("items");
    while (each.hasNext()) {
      ItemsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Items> buildItems() {
    return this.items != null ? build(items) : null;
  }
  
  public Items buildItem(int index) {
    return this.items.get(index).build();
  }
  
  public Items buildFirstItem() {
    return this.items.get(0).build();
  }
  
  public Items buildLastItem() {
    return this.items.get(items.size() - 1).build();
  }
  
  public Items buildMatchingItem(Predicate<ItemsBuilder> predicate) {
      for (ItemsBuilder item : items) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingItem(Predicate<ItemsBuilder> predicate) {
      for (ItemsBuilder item : items) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withItems(List<Items> items) {
    if (this.items != null) {
      this._visitables.get("items").clear();
    }
    if (items != null) {
        this.items = new ArrayList();
        for (Items item : items) {
          this.addToItems(item);
        }
    } else {
      this.items = null;
    }
    return (A) this;
  }
  
  public A withItems(cli.strimzi.kafka.v1beta2.kafkaconnectspec.externalconfiguration.volumes.secret.Items... items) {
    if (this.items != null) {
        this.items.clear();
        _visitables.remove("items");
    }
    if (items != null) {
      for (Items item : items) {
        this.addToItems(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasItems() {
    return this.items != null && !this.items.isEmpty();
  }
  
  public ItemsNested<A> addNewItem() {
    return new ItemsNested(-1, null);
  }
  
  public ItemsNested<A> addNewItemLike(Items item) {
    return new ItemsNested(-1, item);
  }
  
  public ItemsNested<A> setNewItemLike(int index,Items item) {
    return new ItemsNested(index, item);
  }
  
  public ItemsNested<A> editItem(int index) {
    if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
    return setNewItemLike(index, buildItem(index));
  }
  
  public ItemsNested<A> editFirstItem() {
    if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
    return setNewItemLike(0, buildItem(0));
  }
  
  public ItemsNested<A> editLastItem() {
    int index = items.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
    return setNewItemLike(index, buildItem(index));
  }
  
  public ItemsNested<A> editMatchingItem(Predicate<ItemsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<items.size();i++) { 
    if (predicate.test(items.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
    return setNewItemLike(index, buildItem(index));
  }
  
  public Boolean getOptional() {
    return this.optional;
  }
  
  public A withOptional(Boolean optional) {
    this.optional = optional;
    return (A) this;
  }
  
  public boolean hasOptional() {
    return this.optional != null;
  }
  
  public String getSecretName() {
    return this.secretName;
  }
  
  public A withSecretName(String secretName) {
    this.secretName = secretName;
    return (A) this;
  }
  
  public boolean hasSecretName() {
    return this.secretName != null;
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
    SecretFluent that = (SecretFluent) o;
    if (!java.util.Objects.equals(defaultMode, that.defaultMode)) return false;
    if (!java.util.Objects.equals(items, that.items)) return false;
    if (!java.util.Objects.equals(optional, that.optional)) return false;
    if (!java.util.Objects.equals(secretName, that.secretName)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(defaultMode,  items,  optional,  secretName,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (defaultMode != null) { sb.append("defaultMode:"); sb.append(defaultMode + ","); }
    if (items != null && !items.isEmpty()) { sb.append("items:"); sb.append(items + ","); }
    if (optional != null) { sb.append("optional:"); sb.append(optional + ","); }
    if (secretName != null) { sb.append("secretName:"); sb.append(secretName + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withOptional() {
    return withOptional(true);
  }
  public class ItemsNested<N> extends ItemsFluent<ItemsNested<N>> implements Nested<N>{
    ItemsNested(int index,Items item) {
      this.index = index;
      this.builder = new ItemsBuilder(this, item);
    }
    ItemsBuilder builder;
    int index;
    
    public N and() {
      return (N) SecretFluent.this.setToItems(index,builder.build());
    }
    
    public N endSecretItem() {
      return and();
    }
    
  
  }

}