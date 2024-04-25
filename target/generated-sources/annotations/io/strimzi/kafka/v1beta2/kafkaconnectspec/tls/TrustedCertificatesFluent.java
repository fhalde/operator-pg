package io.strimzi.kafka.v1beta2.kafkaconnectspec.tls;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.LinkedHashMap;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class TrustedCertificatesFluent<A extends TrustedCertificatesFluent<A>> extends BaseFluent<A>{
  public TrustedCertificatesFluent() {
  }
  
  public TrustedCertificatesFluent(TrustedCertificates instance) {
    this.copyInstance(instance);
  }
  private String certificate;
  private String secretName;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(TrustedCertificates instance) {
    instance = (instance != null ? instance : new TrustedCertificates());
    if (instance != null) {
          this.withCertificate(instance.getCertificate());
          this.withSecretName(instance.getSecretName());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public String getCertificate() {
    return this.certificate;
  }
  
  public A withCertificate(String certificate) {
    this.certificate = certificate;
    return (A) this;
  }
  
  public boolean hasCertificate() {
    return this.certificate != null;
  }
  
  public String getSecretName() {
    return this.secretName;
  }
  
  public A withSecretName(String secretName) {
    this.secretName = secretName;
    return (A) this;
  }
  
  public boolean hasSecretName() {
    return this.secretName != null;
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
    TrustedCertificatesFluent that = (TrustedCertificatesFluent) o;
    if (!java.util.Objects.equals(certificate, that.certificate)) return false;
    if (!java.util.Objects.equals(secretName, that.secretName)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(certificate,  secretName,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (certificate != null) { sb.append("certificate:"); sb.append(certificate + ","); }
    if (secretName != null) { sb.append("secretName:"); sb.append(secretName + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  

}