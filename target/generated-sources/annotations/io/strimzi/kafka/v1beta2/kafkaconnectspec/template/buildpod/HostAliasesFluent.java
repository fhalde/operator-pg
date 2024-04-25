package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod;

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
public class HostAliasesFluent<A extends HostAliasesFluent<A>> extends BaseFluent<A>{
  public HostAliasesFluent() {
  }
  
  public HostAliasesFluent(HostAliases instance) {
    this.copyInstance(instance);
  }
  private List<String> hostnames;
  private String ip;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(HostAliases instance) {
    instance = (instance != null ? instance : new HostAliases());
    if (instance != null) {
          this.withHostnames(instance.getHostnames());
          this.withIp(instance.getIp());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public A addToHostnames(int index,String item) {
    if (this.hostnames == null) {this.hostnames = new ArrayList<String>();}
    this.hostnames.add(index, item);
    return (A)this;
  }
  
  public A setToHostnames(int index,String item) {
    if (this.hostnames == null) {this.hostnames = new ArrayList<String>();}
    this.hostnames.set(index, item); return (A)this;
  }
  
  public A addToHostnames(java.lang.String... items) {
    if (this.hostnames == null) {this.hostnames = new ArrayList<String>();}
    for (String item : items) {this.hostnames.add(item);} return (A)this;
  }
  
  public A addAllToHostnames(Collection<String> items) {
    if (this.hostnames == null) {this.hostnames = new ArrayList<String>();}
    for (String item : items) {this.hostnames.add(item);} return (A)this;
  }
  
  public A removeFromHostnames(java.lang.String... items) {
    if (this.hostnames == null) return (A)this;
    for (String item : items) { this.hostnames.remove(item);} return (A)this;
  }
  
  public A removeAllFromHostnames(Collection<String> items) {
    if (this.hostnames == null) return (A)this;
    for (String item : items) { this.hostnames.remove(item);} return (A)this;
  }
  
  public List<String> getHostnames() {
    return this.hostnames;
  }
  
  public String getHostname(int index) {
    return this.hostnames.get(index);
  }
  
  public String getFirstHostname() {
    return this.hostnames.get(0);
  }
  
  public String getLastHostname() {
    return this.hostnames.get(hostnames.size() - 1);
  }
  
  public String getMatchingHostname(Predicate<String> predicate) {
      for (String item : hostnames) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingHostname(Predicate<String> predicate) {
      for (String item : hostnames) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withHostnames(List<String> hostnames) {
    if (hostnames != null) {
        this.hostnames = new ArrayList();
        for (String item : hostnames) {
          this.addToHostnames(item);
        }
    } else {
      this.hostnames = null;
    }
    return (A) this;
  }
  
  public A withHostnames(java.lang.String... hostnames) {
    if (this.hostnames != null) {
        this.hostnames.clear();
        _visitables.remove("hostnames");
    }
    if (hostnames != null) {
      for (String item : hostnames) {
        this.addToHostnames(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasHostnames() {
    return this.hostnames != null && !this.hostnames.isEmpty();
  }
  
  public String getIp() {
    return this.ip;
  }
  
  public A withIp(String ip) {
    this.ip = ip;
    return (A) this;
  }
  
  public boolean hasIp() {
    return this.ip != null;
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
    HostAliasesFluent that = (HostAliasesFluent) o;
    if (!java.util.Objects.equals(hostnames, that.hostnames)) return false;
    if (!java.util.Objects.equals(ip, that.ip)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(hostnames,  ip,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (hostnames != null && !hostnames.isEmpty()) { sb.append("hostnames:"); sb.append(hostnames + ","); }
    if (ip != null) { sb.append("ip:"); sb.append(ip + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  

}