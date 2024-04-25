package io.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.strimzi.kafka.v1beta2.kafkaconnectspec.jmxoptions.AuthenticationBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.jmxoptions.Authentication;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.jmxoptions.AuthenticationFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class JmxOptionsFluent<A extends JmxOptionsFluent<A>> extends BaseFluent<A>{
  public JmxOptionsFluent() {
  }
  
  public JmxOptionsFluent(JmxOptions instance) {
    this.copyInstance(instance);
  }
  private AuthenticationBuilder authentication;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(JmxOptions instance) {
    instance = (instance != null ? instance : new JmxOptions());
    if (instance != null) {
          this.withAuthentication(instance.getAuthentication());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public Authentication buildAuthentication() {
    return this.authentication != null ? this.authentication.build() : null;
  }
  
  public A withAuthentication(Authentication authentication) {
    this._visitables.remove("authentication");
    if (authentication != null) {
        this.authentication = new AuthenticationBuilder(authentication);
        this._visitables.get("authentication").add(this.authentication);
    } else {
        this.authentication = null;
        this._visitables.get("authentication").remove(this.authentication);
    }
    return (A) this;
  }
  
  public boolean hasAuthentication() {
    return this.authentication != null;
  }
  
  public AuthenticationNested<A> withNewAuthentication() {
    return new AuthenticationNested(null);
  }
  
  public AuthenticationNested<A> withNewAuthenticationLike(Authentication item) {
    return new AuthenticationNested(item);
  }
  
  public AuthenticationNested<A> editJmxoptionsAuthentication() {
    return withNewAuthenticationLike(java.util.Optional.ofNullable(buildAuthentication()).orElse(null));
  }
  
  public AuthenticationNested<A> editOrNewAuthentication() {
    return withNewAuthenticationLike(java.util.Optional.ofNullable(buildAuthentication()).orElse(new AuthenticationBuilder().build()));
  }
  
  public AuthenticationNested<A> editOrNewAuthenticationLike(Authentication item) {
    return withNewAuthenticationLike(java.util.Optional.ofNullable(buildAuthentication()).orElse(item));
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
    JmxOptionsFluent that = (JmxOptionsFluent) o;
    if (!java.util.Objects.equals(authentication, that.authentication)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(authentication,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (authentication != null) { sb.append("authentication:"); sb.append(authentication + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class AuthenticationNested<N> extends AuthenticationFluent<AuthenticationNested<N>> implements Nested<N>{
    AuthenticationNested(Authentication item) {
      this.builder = new AuthenticationBuilder(this, item);
    }
    AuthenticationBuilder builder;
    
    public N and() {
      return (N) JmxOptionsFluent.this.withAuthentication(builder.build());
    }
    
    public N endJmxoptionsAuthentication() {
      return and();
    }
    
  
  }

}