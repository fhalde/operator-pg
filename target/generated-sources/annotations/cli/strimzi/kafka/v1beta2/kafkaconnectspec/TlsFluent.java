package cli.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.tls.TrustedCertificates;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.tls.TrustedCertificatesFluent;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.tls.TrustedCertificatesBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class TlsFluent<A extends TlsFluent<A>> extends BaseFluent<A>{
  public TlsFluent() {
  }
  
  public TlsFluent(Tls instance) {
    this.copyInstance(instance);
  }
  private ArrayList<TrustedCertificatesBuilder> trustedCertificates;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(Tls instance) {
    instance = (instance != null ? instance : new Tls());
    if (instance != null) {
          this.withTrustedCertificates(instance.getTrustedCertificates());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public A addToTrustedCertificates(int index,TrustedCertificates item) {
    if (this.trustedCertificates == null) {this.trustedCertificates = new ArrayList<TrustedCertificatesBuilder>();}
    TrustedCertificatesBuilder builder = new TrustedCertificatesBuilder(item);
    if (index < 0 || index >= trustedCertificates.size()) { _visitables.get("trustedCertificates").add(builder); trustedCertificates.add(builder); } else { _visitables.get("trustedCertificates").add(index, builder); trustedCertificates.add(index, builder);}
    return (A)this;
  }
  
  public A setToTrustedCertificates(int index,TrustedCertificates item) {
    if (this.trustedCertificates == null) {this.trustedCertificates = new ArrayList<TrustedCertificatesBuilder>();}
    TrustedCertificatesBuilder builder = new TrustedCertificatesBuilder(item);
    if (index < 0 || index >= trustedCertificates.size()) { _visitables.get("trustedCertificates").add(builder); trustedCertificates.add(builder); } else { _visitables.get("trustedCertificates").set(index, builder); trustedCertificates.set(index, builder);}
    return (A)this;
  }
  
  public A addToTrustedCertificates(cli.strimzi.kafka.v1beta2.kafkaconnectspec.tls.TrustedCertificates... items) {
    if (this.trustedCertificates == null) {this.trustedCertificates = new ArrayList<TrustedCertificatesBuilder>();}
    for (TrustedCertificates item : items) {TrustedCertificatesBuilder builder = new TrustedCertificatesBuilder(item);_visitables.get("trustedCertificates").add(builder);this.trustedCertificates.add(builder);} return (A)this;
  }
  
  public A addAllToTrustedCertificates(Collection<TrustedCertificates> items) {
    if (this.trustedCertificates == null) {this.trustedCertificates = new ArrayList<TrustedCertificatesBuilder>();}
    for (TrustedCertificates item : items) {TrustedCertificatesBuilder builder = new TrustedCertificatesBuilder(item);_visitables.get("trustedCertificates").add(builder);this.trustedCertificates.add(builder);} return (A)this;
  }
  
  public A removeFromTrustedCertificates(cli.strimzi.kafka.v1beta2.kafkaconnectspec.tls.TrustedCertificates... items) {
    if (this.trustedCertificates == null) return (A)this;
    for (TrustedCertificates item : items) {TrustedCertificatesBuilder builder = new TrustedCertificatesBuilder(item);_visitables.get("trustedCertificates").remove(builder); this.trustedCertificates.remove(builder);} return (A)this;
  }
  
  public A removeAllFromTrustedCertificates(Collection<TrustedCertificates> items) {
    if (this.trustedCertificates == null) return (A)this;
    for (TrustedCertificates item : items) {TrustedCertificatesBuilder builder = new TrustedCertificatesBuilder(item);_visitables.get("trustedCertificates").remove(builder); this.trustedCertificates.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromTrustedCertificates(Predicate<TrustedCertificatesBuilder> predicate) {
    if (trustedCertificates == null) return (A) this;
    final Iterator<TrustedCertificatesBuilder> each = trustedCertificates.iterator();
    final List visitables = _visitables.get("trustedCertificates");
    while (each.hasNext()) {
      TrustedCertificatesBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<TrustedCertificates> buildTrustedCertificates() {
    return this.trustedCertificates != null ? build(trustedCertificates) : null;
  }
  
  public TrustedCertificates buildTrustedCertificate(int index) {
    return this.trustedCertificates.get(index).build();
  }
  
  public TrustedCertificates buildFirstTrustedCertificate() {
    return this.trustedCertificates.get(0).build();
  }
  
  public TrustedCertificates buildLastTrustedCertificate() {
    return this.trustedCertificates.get(trustedCertificates.size() - 1).build();
  }
  
  public TrustedCertificates buildMatchingTrustedCertificate(Predicate<TrustedCertificatesBuilder> predicate) {
      for (TrustedCertificatesBuilder item : trustedCertificates) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingTrustedCertificate(Predicate<TrustedCertificatesBuilder> predicate) {
      for (TrustedCertificatesBuilder item : trustedCertificates) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTrustedCertificates(List<TrustedCertificates> trustedCertificates) {
    if (this.trustedCertificates != null) {
      this._visitables.get("trustedCertificates").clear();
    }
    if (trustedCertificates != null) {
        this.trustedCertificates = new ArrayList();
        for (TrustedCertificates item : trustedCertificates) {
          this.addToTrustedCertificates(item);
        }
    } else {
      this.trustedCertificates = null;
    }
    return (A) this;
  }
  
  public A withTrustedCertificates(cli.strimzi.kafka.v1beta2.kafkaconnectspec.tls.TrustedCertificates... trustedCertificates) {
    if (this.trustedCertificates != null) {
        this.trustedCertificates.clear();
        _visitables.remove("trustedCertificates");
    }
    if (trustedCertificates != null) {
      for (TrustedCertificates item : trustedCertificates) {
        this.addToTrustedCertificates(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTrustedCertificates() {
    return this.trustedCertificates != null && !this.trustedCertificates.isEmpty();
  }
  
  public TrustedCertificatesNested<A> addNewTrustedCertificate() {
    return new TrustedCertificatesNested(-1, null);
  }
  
  public TrustedCertificatesNested<A> addNewTrustedCertificateLike(TrustedCertificates item) {
    return new TrustedCertificatesNested(-1, item);
  }
  
  public TrustedCertificatesNested<A> setNewTrustedCertificateLike(int index,TrustedCertificates item) {
    return new TrustedCertificatesNested(index, item);
  }
  
  public TrustedCertificatesNested<A> editTrustedCertificate(int index) {
    if (trustedCertificates.size() <= index) throw new RuntimeException("Can't edit trustedCertificates. Index exceeds size.");
    return setNewTrustedCertificateLike(index, buildTrustedCertificate(index));
  }
  
  public TrustedCertificatesNested<A> editFirstTrustedCertificate() {
    if (trustedCertificates.size() == 0) throw new RuntimeException("Can't edit first trustedCertificates. The list is empty.");
    return setNewTrustedCertificateLike(0, buildTrustedCertificate(0));
  }
  
  public TrustedCertificatesNested<A> editLastTrustedCertificate() {
    int index = trustedCertificates.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last trustedCertificates. The list is empty.");
    return setNewTrustedCertificateLike(index, buildTrustedCertificate(index));
  }
  
  public TrustedCertificatesNested<A> editMatchingTrustedCertificate(Predicate<TrustedCertificatesBuilder> predicate) {
    int index = -1;
    for (int i=0;i<trustedCertificates.size();i++) { 
    if (predicate.test(trustedCertificates.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching trustedCertificates. No match found.");
    return setNewTrustedCertificateLike(index, buildTrustedCertificate(index));
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
    TlsFluent that = (TlsFluent) o;
    if (!java.util.Objects.equals(trustedCertificates, that.trustedCertificates)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(trustedCertificates,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (trustedCertificates != null && !trustedCertificates.isEmpty()) { sb.append("trustedCertificates:"); sb.append(trustedCertificates + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class TrustedCertificatesNested<N> extends TrustedCertificatesFluent<TrustedCertificatesNested<N>> implements Nested<N>{
    TrustedCertificatesNested(int index,TrustedCertificates item) {
      this.index = index;
      this.builder = new TrustedCertificatesBuilder(this, item);
    }
    TrustedCertificatesBuilder builder;
    int index;
    
    public N and() {
      return (N) TlsFluent.this.setToTrustedCertificates(index,builder.build());
    }
    
    public N endTrustedCertificate() {
      return and();
    }
    
  
  }

}