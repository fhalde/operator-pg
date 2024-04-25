package io.strimzi.kafka.v1beta2.kafkaconnectspec.build;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.build.resources.LimitsFluent;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.build.resources.Requests;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.build.resources.ClaimsBuilder;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.build.resources.Limits;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.build.resources.ClaimsFluent;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.build.resources.RequestsFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.List;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.build.resources.Claims;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.build.resources.LimitsBuilder;
import java.util.Collection;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.build.resources.RequestsBuilder;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ResourcesFluent<A extends ResourcesFluent<A>> extends BaseFluent<A>{
  public ResourcesFluent() {
  }
  
  public ResourcesFluent(Resources instance) {
    this.copyInstance(instance);
  }
  private ArrayList<ClaimsBuilder> claims;
  private LimitsBuilder limits;
  private RequestsBuilder requests;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(Resources instance) {
    instance = (instance != null ? instance : new Resources());
    if (instance != null) {
          this.withClaims(instance.getClaims());
          this.withLimits(instance.getLimits());
          this.withRequests(instance.getRequests());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public A addToClaims(int index,Claims item) {
    if (this.claims == null) {this.claims = new ArrayList<ClaimsBuilder>();}
    ClaimsBuilder builder = new ClaimsBuilder(item);
    if (index < 0 || index >= claims.size()) { _visitables.get("claims").add(builder); claims.add(builder); } else { _visitables.get("claims").add(index, builder); claims.add(index, builder);}
    return (A)this;
  }
  
  public A setToClaims(int index,Claims item) {
    if (this.claims == null) {this.claims = new ArrayList<ClaimsBuilder>();}
    ClaimsBuilder builder = new ClaimsBuilder(item);
    if (index < 0 || index >= claims.size()) { _visitables.get("claims").add(builder); claims.add(builder); } else { _visitables.get("claims").set(index, builder); claims.set(index, builder);}
    return (A)this;
  }
  
  public A addToClaims(io.strimzi.kafka.v1beta2.kafkaconnectspec.build.resources.Claims... items) {
    if (this.claims == null) {this.claims = new ArrayList<ClaimsBuilder>();}
    for (Claims item : items) {ClaimsBuilder builder = new ClaimsBuilder(item);_visitables.get("claims").add(builder);this.claims.add(builder);} return (A)this;
  }
  
  public A addAllToIoClaims(Collection<Claims> items) {
    if (this.claims == null) {this.claims = new ArrayList<ClaimsBuilder>();}
    for (Claims item : items) {ClaimsBuilder builder = new ClaimsBuilder(item);_visitables.get("claims").add(builder);this.claims.add(builder);} return (A)this;
  }
  
  public A removeFromClaims(io.strimzi.kafka.v1beta2.kafkaconnectspec.build.resources.Claims... items) {
    if (this.claims == null) return (A)this;
    for (Claims item : items) {ClaimsBuilder builder = new ClaimsBuilder(item);_visitables.get("claims").remove(builder); this.claims.remove(builder);} return (A)this;
  }
  
  public A removeAllFromIoClaims(Collection<Claims> items) {
    if (this.claims == null) return (A)this;
    for (Claims item : items) {ClaimsBuilder builder = new ClaimsBuilder(item);_visitables.get("claims").remove(builder); this.claims.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromIoClaims(Predicate<ClaimsBuilder> predicate) {
    if (claims == null) return (A) this;
    final Iterator<ClaimsBuilder> each = claims.iterator();
    final List visitables = _visitables.get("claims");
    while (each.hasNext()) {
      ClaimsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Claims> buildClaims() {
    return this.claims != null ? build(claims) : null;
  }
  
  public Claims buildClaim(int index) {
    return this.claims.get(index).build();
  }
  
  public Claims buildFirstClaim() {
    return this.claims.get(0).build();
  }
  
  public Claims buildLastClaim() {
    return this.claims.get(claims.size() - 1).build();
  }
  
  public Claims buildMatchingClaim(Predicate<ClaimsBuilder> predicate) {
      for (ClaimsBuilder item : claims) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingClaim(Predicate<ClaimsBuilder> predicate) {
      for (ClaimsBuilder item : claims) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withClaims(List<Claims> claims) {
    if (this.claims != null) {
      this._visitables.get("claims").clear();
    }
    if (claims != null) {
        this.claims = new ArrayList();
        for (Claims item : claims) {
          this.addToClaims(item);
        }
    } else {
      this.claims = null;
    }
    return (A) this;
  }
  
  public A withClaims(io.strimzi.kafka.v1beta2.kafkaconnectspec.build.resources.Claims... claims) {
    if (this.claims != null) {
        this.claims.clear();
        _visitables.remove("claims");
    }
    if (claims != null) {
      for (Claims item : claims) {
        this.addToClaims(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasClaims() {
    return this.claims != null && !this.claims.isEmpty();
  }
  
  public ClaimsNested<A> addNewClaim() {
    return new ClaimsNested(-1, null);
  }
  
  public ClaimsNested<A> addNewClaimLike(Claims item) {
    return new ClaimsNested(-1, item);
  }
  
  public ClaimsNested<A> setNewClaimLike(int index,Claims item) {
    return new ClaimsNested(index, item);
  }
  
  public ClaimsNested<A> editClaim(int index) {
    if (claims.size() <= index) throw new RuntimeException("Can't edit claims. Index exceeds size.");
    return setNewClaimLike(index, buildClaim(index));
  }
  
  public ClaimsNested<A> editFirstClaim() {
    if (claims.size() == 0) throw new RuntimeException("Can't edit first claims. The list is empty.");
    return setNewClaimLike(0, buildClaim(0));
  }
  
  public ClaimsNested<A> editLastClaim() {
    int index = claims.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last claims. The list is empty.");
    return setNewClaimLike(index, buildClaim(index));
  }
  
  public ClaimsNested<A> editMatchingClaim(Predicate<ClaimsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<claims.size();i++) { 
    if (predicate.test(claims.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching claims. No match found.");
    return setNewClaimLike(index, buildClaim(index));
  }
  
  public Limits buildLimits() {
    return this.limits != null ? this.limits.build() : null;
  }
  
  public A withLimits(Limits limits) {
    this._visitables.remove("limits");
    if (limits != null) {
        this.limits = new LimitsBuilder(limits);
        this._visitables.get("limits").add(this.limits);
    } else {
        this.limits = null;
        this._visitables.get("limits").remove(this.limits);
    }
    return (A) this;
  }
  
  public boolean hasLimits() {
    return this.limits != null;
  }
  
  public LimitsNested<A> withNewLimits() {
    return new LimitsNested(null);
  }
  
  public LimitsNested<A> withNewLimitsLike(Limits item) {
    return new LimitsNested(item);
  }
  
  public LimitsNested<A> editIoLimits() {
    return withNewLimitsLike(java.util.Optional.ofNullable(buildLimits()).orElse(null));
  }
  
  public LimitsNested<A> editOrNewLimits() {
    return withNewLimitsLike(java.util.Optional.ofNullable(buildLimits()).orElse(new LimitsBuilder().build()));
  }
  
  public LimitsNested<A> editOrNewLimitsLike(Limits item) {
    return withNewLimitsLike(java.util.Optional.ofNullable(buildLimits()).orElse(item));
  }
  
  public Requests buildRequests() {
    return this.requests != null ? this.requests.build() : null;
  }
  
  public A withRequests(Requests requests) {
    this._visitables.remove("requests");
    if (requests != null) {
        this.requests = new RequestsBuilder(requests);
        this._visitables.get("requests").add(this.requests);
    } else {
        this.requests = null;
        this._visitables.get("requests").remove(this.requests);
    }
    return (A) this;
  }
  
  public boolean hasRequests() {
    return this.requests != null;
  }
  
  public RequestsNested<A> withNewRequests() {
    return new RequestsNested(null);
  }
  
  public RequestsNested<A> withNewRequestsLike(Requests item) {
    return new RequestsNested(item);
  }
  
  public RequestsNested<A> editIoRequests() {
    return withNewRequestsLike(java.util.Optional.ofNullable(buildRequests()).orElse(null));
  }
  
  public RequestsNested<A> editOrNewRequests() {
    return withNewRequestsLike(java.util.Optional.ofNullable(buildRequests()).orElse(new RequestsBuilder().build()));
  }
  
  public RequestsNested<A> editOrNewRequestsLike(Requests item) {
    return withNewRequestsLike(java.util.Optional.ofNullable(buildRequests()).orElse(item));
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
    ResourcesFluent that = (ResourcesFluent) o;
    if (!java.util.Objects.equals(claims, that.claims)) return false;
    if (!java.util.Objects.equals(limits, that.limits)) return false;
    if (!java.util.Objects.equals(requests, that.requests)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(claims,  limits,  requests,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (claims != null && !claims.isEmpty()) { sb.append("claims:"); sb.append(claims + ","); }
    if (limits != null) { sb.append("limits:"); sb.append(limits + ","); }
    if (requests != null) { sb.append("requests:"); sb.append(requests + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class ClaimsNested<N> extends ClaimsFluent<ClaimsNested<N>> implements Nested<N>{
    ClaimsNested(int index,Claims item) {
      this.index = index;
      this.builder = new ClaimsBuilder(this, item);
    }
    ClaimsBuilder builder;
    int index;
    
    public N and() {
      return (N) ResourcesFluent.this.setToClaims(index,builder.build());
    }
    
    public N endIoClaim() {
      return and();
    }
    
  
  }
  public class LimitsNested<N> extends LimitsFluent<LimitsNested<N>> implements Nested<N>{
    LimitsNested(Limits item) {
      this.builder = new LimitsBuilder(this, item);
    }
    LimitsBuilder builder;
    
    public N and() {
      return (N) ResourcesFluent.this.withLimits(builder.build());
    }
    
    public N endIoLimits() {
      return and();
    }
    
  
  }
  public class RequestsNested<N> extends RequestsFluent<RequestsNested<N>> implements Nested<N>{
    RequestsNested(Requests item) {
      this.builder = new RequestsBuilder(this, item);
    }
    RequestsBuilder builder;
    
    public N and() {
      return (N) ResourcesFluent.this.withRequests(builder.build());
    }
    
    public N endIoRequests() {
      return and();
    }
    
  
  }

}