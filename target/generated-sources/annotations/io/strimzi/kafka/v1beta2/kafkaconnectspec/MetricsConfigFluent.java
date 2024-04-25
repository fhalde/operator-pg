package io.strimzi.kafka.v1beta2.kafkaconnectspec;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.metricsconfig.ValueFrom;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.metricsconfig.ValueFromBuilder;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.metricsconfig.ValueFromFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class MetricsConfigFluent<A extends MetricsConfigFluent<A>> extends BaseFluent<A>{
  public MetricsConfigFluent() {
  }
  
  public MetricsConfigFluent(MetricsConfig instance) {
    this.copyInstance(instance);
  }
  private MetricsConfig.Type type;
  private ValueFromBuilder valueFrom;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(MetricsConfig instance) {
    instance = (instance != null ? instance : new MetricsConfig());
    if (instance != null) {
          this.withType(instance.getType());
          this.withValueFrom(instance.getValueFrom());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public MetricsConfig.Type getType() {
    return this.type;
  }
  
  public A withType(MetricsConfig.Type type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public ValueFrom buildValueFrom() {
    return this.valueFrom != null ? this.valueFrom.build() : null;
  }
  
  public A withValueFrom(ValueFrom valueFrom) {
    this._visitables.remove("valueFrom");
    if (valueFrom != null) {
        this.valueFrom = new ValueFromBuilder(valueFrom);
        this._visitables.get("valueFrom").add(this.valueFrom);
    } else {
        this.valueFrom = null;
        this._visitables.get("valueFrom").remove(this.valueFrom);
    }
    return (A) this;
  }
  
  public boolean hasValueFrom() {
    return this.valueFrom != null;
  }
  
  public ValueFromNested<A> withNewValueFrom() {
    return new ValueFromNested(null);
  }
  
  public ValueFromNested<A> withNewValueFromLike(ValueFrom item) {
    return new ValueFromNested(item);
  }
  
  public ValueFromNested<A> editMetricsconfigValueFrom() {
    return withNewValueFromLike(java.util.Optional.ofNullable(buildValueFrom()).orElse(null));
  }
  
  public ValueFromNested<A> editOrNewValueFrom() {
    return withNewValueFromLike(java.util.Optional.ofNullable(buildValueFrom()).orElse(new ValueFromBuilder().build()));
  }
  
  public ValueFromNested<A> editOrNewValueFromLike(ValueFrom item) {
    return withNewValueFromLike(java.util.Optional.ofNullable(buildValueFrom()).orElse(item));
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
    MetricsConfigFluent that = (MetricsConfigFluent) o;
    if (!java.util.Objects.equals(type, that.type)) return false;
    if (!java.util.Objects.equals(valueFrom, that.valueFrom)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(type,  valueFrom,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (type != null) { sb.append("type:"); sb.append(type + ","); }
    if (valueFrom != null) { sb.append("valueFrom:"); sb.append(valueFrom + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class ValueFromNested<N> extends ValueFromFluent<ValueFromNested<N>> implements Nested<N>{
    ValueFromNested(ValueFrom item) {
      this.builder = new ValueFromBuilder(this, item);
    }
    ValueFromBuilder builder;
    
    public N and() {
      return (N) MetricsConfigFluent.this.withValueFrom(builder.build());
    }
    
    public N endMetricsconfigValueFrom() {
      return and();
    }
    
  
  }

}