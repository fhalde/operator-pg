package cli.strimzi.kafka.v1beta2.kafkaconnectspec.build;

import cli.strimzi.kafka.v1beta2.kafkaconnectspec.build.plugins.ArtifactsBuilder;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.build.plugins.ArtifactsFluent;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.build.plugins.Artifacts;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class PluginsFluent<A extends PluginsFluent<A>> extends BaseFluent<A>{
  public PluginsFluent() {
  }
  
  public PluginsFluent(Plugins instance) {
    this.copyInstance(instance);
  }
  private ArrayList<ArtifactsBuilder> artifacts;
  private String name;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(Plugins instance) {
    instance = (instance != null ? instance : new Plugins());
    if (instance != null) {
          this.withArtifacts(instance.getArtifacts());
          this.withName(instance.getName());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public A addToArtifacts(int index,Artifacts item) {
    if (this.artifacts == null) {this.artifacts = new ArrayList<ArtifactsBuilder>();}
    ArtifactsBuilder builder = new ArtifactsBuilder(item);
    if (index < 0 || index >= artifacts.size()) { _visitables.get("artifacts").add(builder); artifacts.add(builder); } else { _visitables.get("artifacts").add(index, builder); artifacts.add(index, builder);}
    return (A)this;
  }
  
  public A setToArtifacts(int index,Artifacts item) {
    if (this.artifacts == null) {this.artifacts = new ArrayList<ArtifactsBuilder>();}
    ArtifactsBuilder builder = new ArtifactsBuilder(item);
    if (index < 0 || index >= artifacts.size()) { _visitables.get("artifacts").add(builder); artifacts.add(builder); } else { _visitables.get("artifacts").set(index, builder); artifacts.set(index, builder);}
    return (A)this;
  }
  
  public A addToArtifacts(cli.strimzi.kafka.v1beta2.kafkaconnectspec.build.plugins.Artifacts... items) {
    if (this.artifacts == null) {this.artifacts = new ArrayList<ArtifactsBuilder>();}
    for (Artifacts item : items) {ArtifactsBuilder builder = new ArtifactsBuilder(item);_visitables.get("artifacts").add(builder);this.artifacts.add(builder);} return (A)this;
  }
  
  public A addAllToArtifacts(Collection<Artifacts> items) {
    if (this.artifacts == null) {this.artifacts = new ArrayList<ArtifactsBuilder>();}
    for (Artifacts item : items) {ArtifactsBuilder builder = new ArtifactsBuilder(item);_visitables.get("artifacts").add(builder);this.artifacts.add(builder);} return (A)this;
  }
  
  public A removeFromArtifacts(cli.strimzi.kafka.v1beta2.kafkaconnectspec.build.plugins.Artifacts... items) {
    if (this.artifacts == null) return (A)this;
    for (Artifacts item : items) {ArtifactsBuilder builder = new ArtifactsBuilder(item);_visitables.get("artifacts").remove(builder); this.artifacts.remove(builder);} return (A)this;
  }
  
  public A removeAllFromArtifacts(Collection<Artifacts> items) {
    if (this.artifacts == null) return (A)this;
    for (Artifacts item : items) {ArtifactsBuilder builder = new ArtifactsBuilder(item);_visitables.get("artifacts").remove(builder); this.artifacts.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromArtifacts(Predicate<ArtifactsBuilder> predicate) {
    if (artifacts == null) return (A) this;
    final Iterator<ArtifactsBuilder> each = artifacts.iterator();
    final List visitables = _visitables.get("artifacts");
    while (each.hasNext()) {
      ArtifactsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Artifacts> buildArtifacts() {
    return this.artifacts != null ? build(artifacts) : null;
  }
  
  public Artifacts buildArtifact(int index) {
    return this.artifacts.get(index).build();
  }
  
  public Artifacts buildFirstArtifact() {
    return this.artifacts.get(0).build();
  }
  
  public Artifacts buildLastArtifact() {
    return this.artifacts.get(artifacts.size() - 1).build();
  }
  
  public Artifacts buildMatchingArtifact(Predicate<ArtifactsBuilder> predicate) {
      for (ArtifactsBuilder item : artifacts) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingArtifact(Predicate<ArtifactsBuilder> predicate) {
      for (ArtifactsBuilder item : artifacts) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withArtifacts(List<Artifacts> artifacts) {
    if (this.artifacts != null) {
      this._visitables.get("artifacts").clear();
    }
    if (artifacts != null) {
        this.artifacts = new ArrayList();
        for (Artifacts item : artifacts) {
          this.addToArtifacts(item);
        }
    } else {
      this.artifacts = null;
    }
    return (A) this;
  }
  
  public A withArtifacts(cli.strimzi.kafka.v1beta2.kafkaconnectspec.build.plugins.Artifacts... artifacts) {
    if (this.artifacts != null) {
        this.artifacts.clear();
        _visitables.remove("artifacts");
    }
    if (artifacts != null) {
      for (Artifacts item : artifacts) {
        this.addToArtifacts(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasArtifacts() {
    return this.artifacts != null && !this.artifacts.isEmpty();
  }
  
  public ArtifactsNested<A> addNewArtifact() {
    return new ArtifactsNested(-1, null);
  }
  
  public ArtifactsNested<A> addNewArtifactLike(Artifacts item) {
    return new ArtifactsNested(-1, item);
  }
  
  public ArtifactsNested<A> setNewArtifactLike(int index,Artifacts item) {
    return new ArtifactsNested(index, item);
  }
  
  public ArtifactsNested<A> editArtifact(int index) {
    if (artifacts.size() <= index) throw new RuntimeException("Can't edit artifacts. Index exceeds size.");
    return setNewArtifactLike(index, buildArtifact(index));
  }
  
  public ArtifactsNested<A> editFirstArtifact() {
    if (artifacts.size() == 0) throw new RuntimeException("Can't edit first artifacts. The list is empty.");
    return setNewArtifactLike(0, buildArtifact(0));
  }
  
  public ArtifactsNested<A> editLastArtifact() {
    int index = artifacts.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last artifacts. The list is empty.");
    return setNewArtifactLike(index, buildArtifact(index));
  }
  
  public ArtifactsNested<A> editMatchingArtifact(Predicate<ArtifactsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<artifacts.size();i++) { 
    if (predicate.test(artifacts.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching artifacts. No match found.");
    return setNewArtifactLike(index, buildArtifact(index));
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
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
    PluginsFluent that = (PluginsFluent) o;
    if (!java.util.Objects.equals(artifacts, that.artifacts)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(artifacts,  name,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (artifacts != null && !artifacts.isEmpty()) { sb.append("artifacts:"); sb.append(artifacts + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class ArtifactsNested<N> extends ArtifactsFluent<ArtifactsNested<N>> implements Nested<N>{
    ArtifactsNested(int index,Artifacts item) {
      this.index = index;
      this.builder = new ArtifactsBuilder(this, item);
    }
    ArtifactsBuilder builder;
    int index;
    
    public N and() {
      return (N) PluginsFluent.this.setToArtifacts(index,builder.build());
    }
    
    public N endArtifact() {
      return and();
    }
    
  
  }

}