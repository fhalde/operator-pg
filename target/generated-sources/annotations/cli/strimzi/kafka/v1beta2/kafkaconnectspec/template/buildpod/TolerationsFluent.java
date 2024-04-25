package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.LinkedHashMap;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class TolerationsFluent<A extends TolerationsFluent<A>> extends BaseFluent<A>{
  public TolerationsFluent() {
  }
  
  public TolerationsFluent(Tolerations instance) {
    this.copyInstance(instance);
  }
  private String effect;
  private String key;
  private String operator;
  private Long tolerationSeconds;
  private String value;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(Tolerations instance) {
    instance = (instance != null ? instance : new Tolerations());
    if (instance != null) {
          this.withEffect(instance.getEffect());
          this.withKey(instance.getKey());
          this.withOperator(instance.getOperator());
          this.withTolerationSeconds(instance.getTolerationSeconds());
          this.withValue(instance.getValue());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public String getEffect() {
    return this.effect;
  }
  
  public A withEffect(String effect) {
    this.effect = effect;
    return (A) this;
  }
  
  public boolean hasEffect() {
    return this.effect != null;
  }
  
  public String getKey() {
    return this.key;
  }
  
  public A withKey(String key) {
    this.key = key;
    return (A) this;
  }
  
  public boolean hasKey() {
    return this.key != null;
  }
  
  public String getOperator() {
    return this.operator;
  }
  
  public A withOperator(String operator) {
    this.operator = operator;
    return (A) this;
  }
  
  public boolean hasOperator() {
    return this.operator != null;
  }
  
  public Long getTolerationSeconds() {
    return this.tolerationSeconds;
  }
  
  public A withTolerationSeconds(Long tolerationSeconds) {
    this.tolerationSeconds = tolerationSeconds;
    return (A) this;
  }
  
  public boolean hasTolerationSeconds() {
    return this.tolerationSeconds != null;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public A withValue(String value) {
    this.value = value;
    return (A) this;
  }
  
  public boolean hasValue() {
    return this.value != null;
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
    TolerationsFluent that = (TolerationsFluent) o;
    if (!java.util.Objects.equals(effect, that.effect)) return false;
    if (!java.util.Objects.equals(key, that.key)) return false;
    if (!java.util.Objects.equals(operator, that.operator)) return false;
    if (!java.util.Objects.equals(tolerationSeconds, that.tolerationSeconds)) return false;
    if (!java.util.Objects.equals(value, that.value)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(effect,  key,  operator,  tolerationSeconds,  value,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (effect != null) { sb.append("effect:"); sb.append(effect + ","); }
    if (key != null) { sb.append("key:"); sb.append(key + ","); }
    if (operator != null) { sb.append("operator:"); sb.append(operator + ","); }
    if (tolerationSeconds != null) { sb.append("tolerationSeconds:"); sb.append(tolerationSeconds + ","); }
    if (value != null) { sb.append("value:"); sb.append(value + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  

}