package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildcontainer.securitycontext;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class CapabilitiesFluent<A extends CapabilitiesFluent<A>> extends BaseFluent<A>{
  public CapabilitiesFluent() {
  }
  
  public CapabilitiesFluent(Capabilities instance) {
    this.copyInstance(instance);
  }
  private List<String> add;
  private List<String> drop;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(Capabilities instance) {
    instance = (instance != null ? instance : new Capabilities());
    if (instance != null) {
          this.withAdd(instance.getAdd());
          this.withDrop(instance.getDrop());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public A addToAdd(int index,String item) {
    if (this.add == null) {this.add = new ArrayList<String>();}
    this.add.add(index, item);
    return (A)this;
  }
  
  public A setToAdd(int index,String item) {
    if (this.add == null) {this.add = new ArrayList<String>();}
    this.add.set(index, item); return (A)this;
  }
  
  public A addToAdd(java.lang.String... items) {
    if (this.add == null) {this.add = new ArrayList<String>();}
    for (String item : items) {this.add.add(item);} return (A)this;
  }
  
  public A addAllToAdd(Collection<String> items) {
    if (this.add == null) {this.add = new ArrayList<String>();}
    for (String item : items) {this.add.add(item);} return (A)this;
  }
  
  public A removeFromAdd(java.lang.String... items) {
    if (this.add == null) return (A)this;
    for (String item : items) { this.add.remove(item);} return (A)this;
  }
  
  public A removeAllFromAdd(Collection<String> items) {
    if (this.add == null) return (A)this;
    for (String item : items) { this.add.remove(item);} return (A)this;
  }
  
  public List<String> getAdd() {
    return this.add;
  }
  
  public String getAdd(int index) {
    return this.add.get(index);
  }
  
  public String getFirstAdd() {
    return this.add.get(0);
  }
  
  public String getLastAdd() {
    return this.add.get(add.size() - 1);
  }
  
  public String getMatchingAdd(Predicate<String> predicate) {
      for (String item : add) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingAdd(Predicate<String> predicate) {
      for (String item : add) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withAdd(List<String> add) {
    if (add != null) {
        this.add = new ArrayList();
        for (String item : add) {
          this.addToAdd(item);
        }
    } else {
      this.add = null;
    }
    return (A) this;
  }
  
  public A withAdd(java.lang.String... add) {
    if (this.add != null) {
        this.add.clear();
        _visitables.remove("add");
    }
    if (add != null) {
      for (String item : add) {
        this.addToAdd(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasAdd() {
    return this.add != null && !this.add.isEmpty();
  }
  
  public A addToDrop(int index,String item) {
    if (this.drop == null) {this.drop = new ArrayList<String>();}
    this.drop.add(index, item);
    return (A)this;
  }
  
  public A setToDrop(int index,String item) {
    if (this.drop == null) {this.drop = new ArrayList<String>();}
    this.drop.set(index, item); return (A)this;
  }
  
  public A addToDrop(java.lang.String... items) {
    if (this.drop == null) {this.drop = new ArrayList<String>();}
    for (String item : items) {this.drop.add(item);} return (A)this;
  }
  
  public A addAllToDrop(Collection<String> items) {
    if (this.drop == null) {this.drop = new ArrayList<String>();}
    for (String item : items) {this.drop.add(item);} return (A)this;
  }
  
  public A removeFromDrop(java.lang.String... items) {
    if (this.drop == null) return (A)this;
    for (String item : items) { this.drop.remove(item);} return (A)this;
  }
  
  public A removeAllFromDrop(Collection<String> items) {
    if (this.drop == null) return (A)this;
    for (String item : items) { this.drop.remove(item);} return (A)this;
  }
  
  public List<String> getDrop() {
    return this.drop;
  }
  
  public String getDrop(int index) {
    return this.drop.get(index);
  }
  
  public String getFirstDrop() {
    return this.drop.get(0);
  }
  
  public String getLastDrop() {
    return this.drop.get(drop.size() - 1);
  }
  
  public String getMatchingDrop(Predicate<String> predicate) {
      for (String item : drop) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingDrop(Predicate<String> predicate) {
      for (String item : drop) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withDrop(List<String> drop) {
    if (drop != null) {
        this.drop = new ArrayList();
        for (String item : drop) {
          this.addToDrop(item);
        }
    } else {
      this.drop = null;
    }
    return (A) this;
  }
  
  public A withDrop(java.lang.String... drop) {
    if (this.drop != null) {
        this.drop.clear();
        _visitables.remove("drop");
    }
    if (drop != null) {
      for (String item : drop) {
        this.addToDrop(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasDrop() {
    return this.drop != null && !this.drop.isEmpty();
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
    CapabilitiesFluent that = (CapabilitiesFluent) o;
    if (!java.util.Objects.equals(add, that.add)) return false;
    if (!java.util.Objects.equals(drop, that.drop)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(add,  drop,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (add != null && !add.isEmpty()) { sb.append("add:"); sb.append(add + ","); }
    if (drop != null && !drop.isEmpty()) { sb.append("drop:"); sb.append(drop + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  

}