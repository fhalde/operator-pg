package cli.strimzi.kafka.v1beta2.kafkaconnectspec.build.plugins;

import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ArtifactsFluent<A extends ArtifactsFluent<A>> extends BaseFluent<A>{
  public ArtifactsFluent() {
  }
  
  public ArtifactsFluent(Artifacts instance) {
    this.copyInstance(instance);
  }
  private String artifact;
  private String fileName;
  private String group;
  private Boolean insecure;
  private String repository;
  private String sha512sum;
  private Artifacts.Type type;
  private String url;
  private String version;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(Artifacts instance) {
    instance = (instance != null ? instance : new Artifacts());
    if (instance != null) {
          this.withArtifact(instance.getArtifact());
          this.withFileName(instance.getFileName());
          this.withGroup(instance.getGroup());
          this.withInsecure(instance.getInsecure());
          this.withRepository(instance.getRepository());
          this.withSha512sum(instance.getSha512sum());
          this.withType(instance.getType());
          this.withUrl(instance.getUrl());
          this.withVersion(instance.getVersion());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public String getArtifact() {
    return this.artifact;
  }
  
  public A withArtifact(String artifact) {
    this.artifact = artifact;
    return (A) this;
  }
  
  public boolean hasArtifact() {
    return this.artifact != null;
  }
  
  public String getFileName() {
    return this.fileName;
  }
  
  public A withFileName(String fileName) {
    this.fileName = fileName;
    return (A) this;
  }
  
  public boolean hasFileName() {
    return this.fileName != null;
  }
  
  public String getGroup() {
    return this.group;
  }
  
  public A withGroup(String group) {
    this.group = group;
    return (A) this;
  }
  
  public boolean hasGroup() {
    return this.group != null;
  }
  
  public Boolean getInsecure() {
    return this.insecure;
  }
  
  public A withInsecure(Boolean insecure) {
    this.insecure = insecure;
    return (A) this;
  }
  
  public boolean hasInsecure() {
    return this.insecure != null;
  }
  
  public String getRepository() {
    return this.repository;
  }
  
  public A withRepository(String repository) {
    this.repository = repository;
    return (A) this;
  }
  
  public boolean hasRepository() {
    return this.repository != null;
  }
  
  public String getSha512sum() {
    return this.sha512sum;
  }
  
  public A withSha512sum(String sha512sum) {
    this.sha512sum = sha512sum;
    return (A) this;
  }
  
  public boolean hasSha512sum() {
    return this.sha512sum != null;
  }
  
  public Artifacts.Type getType() {
    return this.type;
  }
  
  public A withType(Artifacts.Type type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public A withUrl(String url) {
    this.url = url;
    return (A) this;
  }
  
  public boolean hasUrl() {
    return this.url != null;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }
  
  public boolean hasVersion() {
    return this.version != null;
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
    ArtifactsFluent that = (ArtifactsFluent) o;
    if (!java.util.Objects.equals(artifact, that.artifact)) return false;
    if (!java.util.Objects.equals(fileName, that.fileName)) return false;
    if (!java.util.Objects.equals(group, that.group)) return false;
    if (!java.util.Objects.equals(insecure, that.insecure)) return false;
    if (!java.util.Objects.equals(repository, that.repository)) return false;
    if (!java.util.Objects.equals(sha512sum, that.sha512sum)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    if (!java.util.Objects.equals(url, that.url)) return false;
    if (!java.util.Objects.equals(version, that.version)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(artifact,  fileName,  group,  insecure,  repository,  sha512sum,  type,  url,  version,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (artifact != null) { sb.append("artifact:"); sb.append(artifact + ","); }
    if (fileName != null) { sb.append("fileName:"); sb.append(fileName + ","); }
    if (group != null) { sb.append("group:"); sb.append(group + ","); }
    if (insecure != null) { sb.append("insecure:"); sb.append(insecure + ","); }
    if (repository != null) { sb.append("repository:"); sb.append(repository + ","); }
    if (sha512sum != null) { sb.append("sha512sum:"); sb.append(sha512sum + ","); }
    if (type != null) { sb.append("type:"); sb.append(type + ","); }
    if (url != null) { sb.append("url:"); sb.append(url + ","); }
    if (version != null) { sb.append("version:"); sb.append(version + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withInsecure() {
    return withInsecure(true);
  }
  

}