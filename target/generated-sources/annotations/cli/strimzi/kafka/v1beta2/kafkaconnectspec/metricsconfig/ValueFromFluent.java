package cli.strimzi.kafka.v1beta2.kafkaconnectspec.metricsconfig;

import cli.strimzi.kafka.v1beta2.kafkaconnectspec.metricsconfig.valuefrom.ConfigMapKeyRef;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.metricsconfig.valuefrom.ConfigMapKeyRefBuilder;
import java.lang.String;
import java.util.LinkedHashMap;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.metricsconfig.valuefrom.ConfigMapKeyRefFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ValueFromFluent<A extends ValueFromFluent<A>> extends BaseFluent<A>{
  public ValueFromFluent() {
  }
  
  public ValueFromFluent(ValueFrom instance) {
    this.copyInstance(instance);
  }
  private ConfigMapKeyRefBuilder configMapKeyRef;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(ValueFrom instance) {
    instance = (instance != null ? instance : new ValueFrom());
    if (instance != null) {
          this.withConfigMapKeyRef(instance.getConfigMapKeyRef());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public ConfigMapKeyRef buildConfigMapKeyRef() {
    return this.configMapKeyRef != null ? this.configMapKeyRef.build() : null;
  }
  
  public A withConfigMapKeyRef(ConfigMapKeyRef configMapKeyRef) {
    this._visitables.remove("configMapKeyRef");
    if (configMapKeyRef != null) {
        this.configMapKeyRef = new ConfigMapKeyRefBuilder(configMapKeyRef);
        this._visitables.get("configMapKeyRef").add(this.configMapKeyRef);
    } else {
        this.configMapKeyRef = null;
        this._visitables.get("configMapKeyRef").remove(this.configMapKeyRef);
    }
    return (A) this;
  }
  
  public boolean hasConfigMapKeyRef() {
    return this.configMapKeyRef != null;
  }
  
  public ConfigMapKeyRefNested<A> withNewConfigMapKeyRef() {
    return new ConfigMapKeyRefNested(null);
  }
  
  public ConfigMapKeyRefNested<A> withNewConfigMapKeyRefLike(ConfigMapKeyRef item) {
    return new ConfigMapKeyRefNested(item);
  }
  
  public ConfigMapKeyRefNested<A> editMetricsconfigConfigMapKeyRef() {
    return withNewConfigMapKeyRefLike(java.util.Optional.ofNullable(buildConfigMapKeyRef()).orElse(null));
  }
  
  public ConfigMapKeyRefNested<A> editOrNewConfigMapKeyRef() {
    return withNewConfigMapKeyRefLike(java.util.Optional.ofNullable(buildConfigMapKeyRef()).orElse(new ConfigMapKeyRefBuilder().build()));
  }
  
  public ConfigMapKeyRefNested<A> editOrNewConfigMapKeyRefLike(ConfigMapKeyRef item) {
    return withNewConfigMapKeyRefLike(java.util.Optional.ofNullable(buildConfigMapKeyRef()).orElse(item));
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
    ValueFromFluent that = (ValueFromFluent) o;
    if (!java.util.Objects.equals(configMapKeyRef, that.configMapKeyRef)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configMapKeyRef,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configMapKeyRef != null) { sb.append("configMapKeyRef:"); sb.append(configMapKeyRef + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigMapKeyRefNested<N> extends ConfigMapKeyRefFluent<ConfigMapKeyRefNested<N>> implements Nested<N>{
    ConfigMapKeyRefNested(ConfigMapKeyRef item) {
      this.builder = new ConfigMapKeyRefBuilder(this, item);
    }
    ConfigMapKeyRefBuilder builder;
    
    public N and() {
      return (N) ValueFromFluent.this.withConfigMapKeyRef(builder.build());
    }
    
    public N endMetricsconfigConfigMapKeyRef() {
      return and();
    }
    
  
  }

}