package io.strimzi.kafka.v1beta2.kafkaconnectspec.template.deployment;

import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.deployment.metadata.LabelsBuilder;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.deployment.metadata.AnnotationsFluent;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.deployment.metadata.Labels;
import java.lang.String;
import java.util.LinkedHashMap;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.deployment.metadata.LabelsFluent;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.deployment.metadata.Annotations;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.template.deployment.metadata.AnnotationsBuilder;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class MetadataFluent<A extends MetadataFluent<A>> extends BaseFluent<A>{
  public MetadataFluent() {
  }
  
  public MetadataFluent(Metadata instance) {
    this.copyInstance(instance);
  }
  private AnnotationsBuilder annotations;
  private LabelsBuilder labels;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(Metadata instance) {
    instance = (instance != null ? instance : new Metadata());
    if (instance != null) {
          this.withAnnotations(instance.getAnnotations());
          this.withLabels(instance.getLabels());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public Annotations buildAnnotations() {
    return this.annotations != null ? this.annotations.build() : null;
  }
  
  public A withAnnotations(Annotations annotations) {
    this._visitables.remove("annotations");
    if (annotations != null) {
        this.annotations = new AnnotationsBuilder(annotations);
        this._visitables.get("annotations").add(this.annotations);
    } else {
        this.annotations = null;
        this._visitables.get("annotations").remove(this.annotations);
    }
    return (A) this;
  }
  
  public boolean hasAnnotations() {
    return this.annotations != null;
  }
  
  public AnnotationsNested<A> withNewAnnotations() {
    return new AnnotationsNested(null);
  }
  
  public AnnotationsNested<A> withNewAnnotationsLike(Annotations item) {
    return new AnnotationsNested(item);
  }
  
  public AnnotationsNested<A> editDeploymentAnnotations() {
    return withNewAnnotationsLike(java.util.Optional.ofNullable(buildAnnotations()).orElse(null));
  }
  
  public AnnotationsNested<A> editOrNewAnnotations() {
    return withNewAnnotationsLike(java.util.Optional.ofNullable(buildAnnotations()).orElse(new AnnotationsBuilder().build()));
  }
  
  public AnnotationsNested<A> editOrNewAnnotationsLike(Annotations item) {
    return withNewAnnotationsLike(java.util.Optional.ofNullable(buildAnnotations()).orElse(item));
  }
  
  public Labels buildLabels() {
    return this.labels != null ? this.labels.build() : null;
  }
  
  public A withLabels(Labels labels) {
    this._visitables.remove("labels");
    if (labels != null) {
        this.labels = new LabelsBuilder(labels);
        this._visitables.get("labels").add(this.labels);
    } else {
        this.labels = null;
        this._visitables.get("labels").remove(this.labels);
    }
    return (A) this;
  }
  
  public boolean hasLabels() {
    return this.labels != null;
  }
  
  public LabelsNested<A> withNewLabels() {
    return new LabelsNested(null);
  }
  
  public LabelsNested<A> withNewLabelsLike(Labels item) {
    return new LabelsNested(item);
  }
  
  public LabelsNested<A> editDeploymentLabels() {
    return withNewLabelsLike(java.util.Optional.ofNullable(buildLabels()).orElse(null));
  }
  
  public LabelsNested<A> editOrNewLabels() {
    return withNewLabelsLike(java.util.Optional.ofNullable(buildLabels()).orElse(new LabelsBuilder().build()));
  }
  
  public LabelsNested<A> editOrNewLabelsLike(Labels item) {
    return withNewLabelsLike(java.util.Optional.ofNullable(buildLabels()).orElse(item));
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
    MetadataFluent that = (MetadataFluent) o;
    if (!java.util.Objects.equals(annotations, that.annotations)) return false;
    if (!java.util.Objects.equals(labels, that.labels)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(annotations,  labels,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (annotations != null) { sb.append("annotations:"); sb.append(annotations + ","); }
    if (labels != null) { sb.append("labels:"); sb.append(labels + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class AnnotationsNested<N> extends AnnotationsFluent<AnnotationsNested<N>> implements Nested<N>{
    AnnotationsNested(Annotations item) {
      this.builder = new AnnotationsBuilder(this, item);
    }
    AnnotationsBuilder builder;
    
    public N and() {
      return (N) MetadataFluent.this.withAnnotations(builder.build());
    }
    
    public N endDeploymentAnnotations() {
      return and();
    }
    
  
  }
  public class LabelsNested<N> extends LabelsFluent<LabelsNested<N>> implements Nested<N>{
    LabelsNested(Labels item) {
      this.builder = new LabelsBuilder(this, item);
    }
    LabelsBuilder builder;
    
    public N and() {
      return (N) MetadataFluent.this.withLabels(builder.build());
    }
    
    public N endDeploymentLabels() {
      return and();
    }
    
  
  }

}