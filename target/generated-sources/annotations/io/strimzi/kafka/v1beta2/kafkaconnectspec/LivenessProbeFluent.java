package io.strimzi.kafka.v1beta2.kafkaconnectspec;

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
public class LivenessProbeFluent<A extends LivenessProbeFluent<A>> extends BaseFluent<A>{
  public LivenessProbeFluent() {
  }
  
  public LivenessProbeFluent(LivenessProbe instance) {
    this.copyInstance(instance);
  }
  private Long failureThreshold;
  private Long initialDelaySeconds;
  private Long periodSeconds;
  private Long successThreshold;
  private Long timeoutSeconds;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(LivenessProbe instance) {
    instance = (instance != null ? instance : new LivenessProbe());
    if (instance != null) {
          this.withFailureThreshold(instance.getFailureThreshold());
          this.withInitialDelaySeconds(instance.getInitialDelaySeconds());
          this.withPeriodSeconds(instance.getPeriodSeconds());
          this.withSuccessThreshold(instance.getSuccessThreshold());
          this.withTimeoutSeconds(instance.getTimeoutSeconds());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public Long getFailureThreshold() {
    return this.failureThreshold;
  }
  
  public A withFailureThreshold(Long failureThreshold) {
    this.failureThreshold = failureThreshold;
    return (A) this;
  }
  
  public boolean hasFailureThreshold() {
    return this.failureThreshold != null;
  }
  
  public Long getInitialDelaySeconds() {
    return this.initialDelaySeconds;
  }
  
  public A withInitialDelaySeconds(Long initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
    return (A) this;
  }
  
  public boolean hasInitialDelaySeconds() {
    return this.initialDelaySeconds != null;
  }
  
  public Long getPeriodSeconds() {
    return this.periodSeconds;
  }
  
  public A withPeriodSeconds(Long periodSeconds) {
    this.periodSeconds = periodSeconds;
    return (A) this;
  }
  
  public boolean hasPeriodSeconds() {
    return this.periodSeconds != null;
  }
  
  public Long getSuccessThreshold() {
    return this.successThreshold;
  }
  
  public A withSuccessThreshold(Long successThreshold) {
    this.successThreshold = successThreshold;
    return (A) this;
  }
  
  public boolean hasSuccessThreshold() {
    return this.successThreshold != null;
  }
  
  public Long getTimeoutSeconds() {
    return this.timeoutSeconds;
  }
  
  public A withTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return (A) this;
  }
  
  public boolean hasTimeoutSeconds() {
    return this.timeoutSeconds != null;
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
    LivenessProbeFluent that = (LivenessProbeFluent) o;
    if (!java.util.Objects.equals(failureThreshold, that.failureThreshold)) return false;
    if (!java.util.Objects.equals(initialDelaySeconds, that.initialDelaySeconds)) return false;
    if (!java.util.Objects.equals(periodSeconds, that.periodSeconds)) return false;
    if (!java.util.Objects.equals(successThreshold, that.successThreshold)) return false;
    if (!java.util.Objects.equals(timeoutSeconds, that.timeoutSeconds)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(failureThreshold,  initialDelaySeconds,  periodSeconds,  successThreshold,  timeoutSeconds,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (failureThreshold != null) { sb.append("failureThreshold:"); sb.append(failureThreshold + ","); }
    if (initialDelaySeconds != null) { sb.append("initialDelaySeconds:"); sb.append(initialDelaySeconds + ","); }
    if (periodSeconds != null) { sb.append("periodSeconds:"); sb.append(periodSeconds + ","); }
    if (successThreshold != null) { sb.append("successThreshold:"); sb.append(successThreshold + ","); }
    if (timeoutSeconds != null) { sb.append("timeoutSeconds:"); sb.append(timeoutSeconds + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  

}