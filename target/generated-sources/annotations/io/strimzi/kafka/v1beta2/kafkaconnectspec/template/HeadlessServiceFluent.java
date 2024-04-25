package io.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.headlessservice.MetadataBuilder;
import java.lang.SuppressWarnings;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.headlessservice.MetadataFluent;
import io.fabric8.kubernetes.api.builder.Nested;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.headlessservice.Metadata;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class HeadlessServiceFluent<A extends HeadlessServiceFluent<A>> extends BaseFluent<A>{
  public HeadlessServiceFluent() {
  }
  
  public HeadlessServiceFluent(HeadlessService instance) {
    this.copyInstance(instance);
  }
  private List<HeadlessService.IpFamilies> ipFamilies;
  private HeadlessService.IpFamilyPolicy ipFamilyPolicy;
  private MetadataBuilder metadata;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(HeadlessService instance) {
    instance = (instance != null ? instance : new HeadlessService());
    if (instance != null) {
          this.withIpFamilies(instance.getIpFamilies());
          this.withIpFamilyPolicy(instance.getIpFamilyPolicy());
          this.withMetadata(instance.getMetadata());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public A addToIpFamilies(int index,HeadlessService.IpFamilies item) {
    if (this.ipFamilies == null) {this.ipFamilies = new ArrayList<HeadlessService.IpFamilies>();}
    this.ipFamilies.add(index, item);
    return (A)this;
  }
  
  public A setToIpFamilies(int index,HeadlessService.IpFamilies item) {
    if (this.ipFamilies == null) {this.ipFamilies = new ArrayList<HeadlessService.IpFamilies>();}
    this.ipFamilies.set(index, item); return (A)this;
  }
  
  public A addToIpFamilies(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.HeadlessService.IpFamilies... items) {
    if (this.ipFamilies == null) {this.ipFamilies = new ArrayList<HeadlessService.IpFamilies>();}
    for (HeadlessService.IpFamilies item : items) {this.ipFamilies.add(item);} return (A)this;
  }
  
  public A addAllToIpFamilies(Collection<HeadlessService.IpFamilies> items) {
    if (this.ipFamilies == null) {this.ipFamilies = new ArrayList<HeadlessService.IpFamilies>();}
    for (HeadlessService.IpFamilies item : items) {this.ipFamilies.add(item);} return (A)this;
  }
  
  public A removeFromIpFamilies(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.HeadlessService.IpFamilies... items) {
    if (this.ipFamilies == null) return (A)this;
    for (HeadlessService.IpFamilies item : items) { this.ipFamilies.remove(item);} return (A)this;
  }
  
  public A removeAllFromIpFamilies(Collection<HeadlessService.IpFamilies> items) {
    if (this.ipFamilies == null) return (A)this;
    for (HeadlessService.IpFamilies item : items) { this.ipFamilies.remove(item);} return (A)this;
  }
  
  public List<HeadlessService.IpFamilies> getIpFamilies() {
    return this.ipFamilies;
  }
  
  public HeadlessService.IpFamilies getIpFamily(int index) {
    return this.ipFamilies.get(index);
  }
  
  public HeadlessService.IpFamilies getFirstIpFamily() {
    return this.ipFamilies.get(0);
  }
  
  public HeadlessService.IpFamilies getLastIpFamily() {
    return this.ipFamilies.get(ipFamilies.size() - 1);
  }
  
  public HeadlessService.IpFamilies getMatchingIpFamily(Predicate<HeadlessService.IpFamilies> predicate) {
      for (HeadlessService.IpFamilies item : ipFamilies) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingIpFamily(Predicate<HeadlessService.IpFamilies> predicate) {
      for (HeadlessService.IpFamilies item : ipFamilies) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withIpFamilies(List<HeadlessService.IpFamilies> ipFamilies) {
    if (ipFamilies != null) {
        this.ipFamilies = new ArrayList();
        for (HeadlessService.IpFamilies item : ipFamilies) {
          this.addToIpFamilies(item);
        }
    } else {
      this.ipFamilies = null;
    }
    return (A) this;
  }
  
  public A withIpFamilies(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.HeadlessService.IpFamilies... ipFamilies) {
    if (this.ipFamilies != null) {
        this.ipFamilies.clear();
        _visitables.remove("ipFamilies");
    }
    if (ipFamilies != null) {
      for (HeadlessService.IpFamilies item : ipFamilies) {
        this.addToIpFamilies(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasIpFamilies() {
    return this.ipFamilies != null && !this.ipFamilies.isEmpty();
  }
  
  public HeadlessService.IpFamilyPolicy getIpFamilyPolicy() {
    return this.ipFamilyPolicy;
  }
  
  public A withIpFamilyPolicy(HeadlessService.IpFamilyPolicy ipFamilyPolicy) {
    this.ipFamilyPolicy = ipFamilyPolicy;
    return (A) this;
  }
  
  public boolean hasIpFamilyPolicy() {
    return this.ipFamilyPolicy != null;
  }
  
  public Metadata buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public A withMetadata(Metadata metadata) {
    this._visitables.remove("metadata");
    if (metadata != null) {
        this.metadata = new MetadataBuilder(metadata);
        this._visitables.get("metadata").add(this.metadata);
    } else {
        this.metadata = null;
        this._visitables.get("metadata").remove(this.metadata);
    }
    return (A) this;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(Metadata item) {
    return new MetadataNested(item);
  }
  
  public MetadataNested<A> editHeadlessserviceMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(new MetadataBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(Metadata item) {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(item));
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
    HeadlessServiceFluent that = (HeadlessServiceFluent) o;
    if (!java.util.Objects.equals(ipFamilies, that.ipFamilies)) return false;
    if (!java.util.Objects.equals(ipFamilyPolicy, that.ipFamilyPolicy)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(ipFamilies,  ipFamilyPolicy,  metadata,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (ipFamilies != null && !ipFamilies.isEmpty()) { sb.append("ipFamilies:"); sb.append(ipFamilies + ","); }
    if (ipFamilyPolicy != null) { sb.append("ipFamilyPolicy:"); sb.append(ipFamilyPolicy + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class MetadataNested<N> extends MetadataFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(Metadata item) {
      this.builder = new MetadataBuilder(this, item);
    }
    MetadataBuilder builder;
    
    public N and() {
      return (N) HeadlessServiceFluent.this.withMetadata(builder.build());
    }
    
    public N endHeadlessserviceMetadata() {
      return and();
    }
    
  
  }

}