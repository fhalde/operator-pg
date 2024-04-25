package io.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.connectcontainer.Env;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.connectcontainer.SecurityContextBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.List;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.connectcontainer.EnvFluent;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.connectcontainer.EnvBuilder;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.connectcontainer.SecurityContext;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.connectcontainer.SecurityContextFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ConnectContainerFluent<A extends ConnectContainerFluent<A>> extends BaseFluent<A>{
  public ConnectContainerFluent() {
  }
  
  public ConnectContainerFluent(ConnectContainer instance) {
    this.copyInstance(instance);
  }
  private ArrayList<EnvBuilder> env;
  private SecurityContextBuilder securityContext;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(ConnectContainer instance) {
    instance = (instance != null ? instance : new ConnectContainer());
    if (instance != null) {
          this.withEnv(instance.getEnv());
          this.withSecurityContext(instance.getSecurityContext());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public A addToEnv(int index,Env item) {
    if (this.env == null) {this.env = new ArrayList<EnvBuilder>();}
    EnvBuilder builder = new EnvBuilder(item);
    if (index < 0 || index >= env.size()) { _visitables.get("env").add(builder); env.add(builder); } else { _visitables.get("env").add(index, builder); env.add(index, builder);}
    return (A)this;
  }
  
  public A setToEnv(int index,Env item) {
    if (this.env == null) {this.env = new ArrayList<EnvBuilder>();}
    EnvBuilder builder = new EnvBuilder(item);
    if (index < 0 || index >= env.size()) { _visitables.get("env").add(builder); env.add(builder); } else { _visitables.get("env").set(index, builder); env.set(index, builder);}
    return (A)this;
  }
  
  public A addToEnv(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.connectcontainer.Env... items) {
    if (this.env == null) {this.env = new ArrayList<EnvBuilder>();}
    for (Env item : items) {EnvBuilder builder = new EnvBuilder(item);_visitables.get("env").add(builder);this.env.add(builder);} return (A)this;
  }
  
  public A addAllToConnectcontainerEnv(Collection<Env> items) {
    if (this.env == null) {this.env = new ArrayList<EnvBuilder>();}
    for (Env item : items) {EnvBuilder builder = new EnvBuilder(item);_visitables.get("env").add(builder);this.env.add(builder);} return (A)this;
  }
  
  public A removeFromEnv(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.connectcontainer.Env... items) {
    if (this.env == null) return (A)this;
    for (Env item : items) {EnvBuilder builder = new EnvBuilder(item);_visitables.get("env").remove(builder); this.env.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConnectcontainerEnv(Collection<Env> items) {
    if (this.env == null) return (A)this;
    for (Env item : items) {EnvBuilder builder = new EnvBuilder(item);_visitables.get("env").remove(builder); this.env.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConnectcontainerEnv(Predicate<EnvBuilder> predicate) {
    if (env == null) return (A) this;
    final Iterator<EnvBuilder> each = env.iterator();
    final List visitables = _visitables.get("env");
    while (each.hasNext()) {
      EnvBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Env> buildEnv() {
    return this.env != null ? build(env) : null;
  }
  
  public Env buildEnv(int index) {
    return this.env.get(index).build();
  }
  
  public Env buildFirstEnv() {
    return this.env.get(0).build();
  }
  
  public Env buildLastEnv() {
    return this.env.get(env.size() - 1).build();
  }
  
  public Env buildMatchingEnv(Predicate<EnvBuilder> predicate) {
      for (EnvBuilder item : env) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingEnv(Predicate<EnvBuilder> predicate) {
      for (EnvBuilder item : env) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withEnv(List<Env> env) {
    if (this.env != null) {
      this._visitables.get("env").clear();
    }
    if (env != null) {
        this.env = new ArrayList();
        for (Env item : env) {
          this.addToEnv(item);
        }
    } else {
      this.env = null;
    }
    return (A) this;
  }
  
  public A withEnv(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.connectcontainer.Env... env) {
    if (this.env != null) {
        this.env.clear();
        _visitables.remove("env");
    }
    if (env != null) {
      for (Env item : env) {
        this.addToEnv(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasEnv() {
    return this.env != null && !this.env.isEmpty();
  }
  
  public EnvNested<A> addNewEnv() {
    return new EnvNested(-1, null);
  }
  
  public EnvNested<A> addNewEnvLike(Env item) {
    return new EnvNested(-1, item);
  }
  
  public EnvNested<A> setNewEnvLike(int index,Env item) {
    return new EnvNested(index, item);
  }
  
  public EnvNested<A> editEnv(int index) {
    if (env.size() <= index) throw new RuntimeException("Can't edit env. Index exceeds size.");
    return setNewEnvLike(index, buildEnv(index));
  }
  
  public EnvNested<A> editFirstEnv() {
    if (env.size() == 0) throw new RuntimeException("Can't edit first env. The list is empty.");
    return setNewEnvLike(0, buildEnv(0));
  }
  
  public EnvNested<A> editLastEnv() {
    int index = env.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last env. The list is empty.");
    return setNewEnvLike(index, buildEnv(index));
  }
  
  public EnvNested<A> editMatchingEnv(Predicate<EnvBuilder> predicate) {
    int index = -1;
    for (int i=0;i<env.size();i++) { 
    if (predicate.test(env.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching env. No match found.");
    return setNewEnvLike(index, buildEnv(index));
  }
  
  public SecurityContext buildSecurityContext() {
    return this.securityContext != null ? this.securityContext.build() : null;
  }
  
  public A withSecurityContext(SecurityContext securityContext) {
    this._visitables.remove("securityContext");
    if (securityContext != null) {
        this.securityContext = new SecurityContextBuilder(securityContext);
        this._visitables.get("securityContext").add(this.securityContext);
    } else {
        this.securityContext = null;
        this._visitables.get("securityContext").remove(this.securityContext);
    }
    return (A) this;
  }
  
  public boolean hasSecurityContext() {
    return this.securityContext != null;
  }
  
  public SecurityContextNested<A> withNewSecurityContext() {
    return new SecurityContextNested(null);
  }
  
  public SecurityContextNested<A> withNewSecurityContextLike(SecurityContext item) {
    return new SecurityContextNested(item);
  }
  
  public SecurityContextNested<A> editConnectcontainerSecurityContext() {
    return withNewSecurityContextLike(java.util.Optional.ofNullable(buildSecurityContext()).orElse(null));
  }
  
  public SecurityContextNested<A> editOrNewSecurityContext() {
    return withNewSecurityContextLike(java.util.Optional.ofNullable(buildSecurityContext()).orElse(new SecurityContextBuilder().build()));
  }
  
  public SecurityContextNested<A> editOrNewSecurityContextLike(SecurityContext item) {
    return withNewSecurityContextLike(java.util.Optional.ofNullable(buildSecurityContext()).orElse(item));
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
    ConnectContainerFluent that = (ConnectContainerFluent) o;
    if (!java.util.Objects.equals(env, that.env)) return false;
    if (!java.util.Objects.equals(securityContext, that.securityContext)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(env,  securityContext,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (env != null && !env.isEmpty()) { sb.append("env:"); sb.append(env + ","); }
    if (securityContext != null) { sb.append("securityContext:"); sb.append(securityContext + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class EnvNested<N> extends EnvFluent<EnvNested<N>> implements Nested<N>{
    EnvNested(int index,Env item) {
      this.index = index;
      this.builder = new EnvBuilder(this, item);
    }
    EnvBuilder builder;
    int index;
    
    public N and() {
      return (N) ConnectContainerFluent.this.setToEnv(index,builder.build());
    }
    
    public N endConnectcontainerEnv() {
      return and();
    }
    
  
  }
  public class SecurityContextNested<N> extends SecurityContextFluent<SecurityContextNested<N>> implements Nested<N>{
    SecurityContextNested(SecurityContext item) {
      this.builder = new SecurityContextBuilder(this, item);
    }
    SecurityContextBuilder builder;
    
    public N and() {
      return (N) ConnectContainerFluent.this.withSecurityContext(builder.build());
    }
    
    public N endConnectcontainerSecurityContext() {
      return and();
    }
    
  
  }

}