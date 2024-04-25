package io.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.build.PluginsBuilder;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.build.Output;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.build.OutputBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.List;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.build.ResourcesBuilder;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.build.Plugins;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.build.PluginsFluent;
import java.util.Collection;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.build.OutputFluent;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.build.ResourcesFluent;
import java.lang.Object;
import io.strimzi.kafka.v1beta2.kafkaconnectspec.build.Resources;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class BuildFluent<A extends BuildFluent<A>> extends BaseFluent<A>{
  public BuildFluent() {
  }
  
  public BuildFluent(Build instance) {
    this.copyInstance(instance);
  }
  private OutputBuilder output;
  private ArrayList<PluginsBuilder> plugins;
  private ResourcesBuilder resources;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(Build instance) {
    instance = (instance != null ? instance : new Build());
    if (instance != null) {
          this.withOutput(instance.getOutput());
          this.withPlugins(instance.getPlugins());
          this.withResources(instance.getResources());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public Output buildOutput() {
    return this.output != null ? this.output.build() : null;
  }
  
  public A withOutput(Output output) {
    this._visitables.remove("output");
    if (output != null) {
        this.output = new OutputBuilder(output);
        this._visitables.get("output").add(this.output);
    } else {
        this.output = null;
        this._visitables.get("output").remove(this.output);
    }
    return (A) this;
  }
  
  public boolean hasOutput() {
    return this.output != null;
  }
  
  public OutputNested<A> withNewOutput() {
    return new OutputNested(null);
  }
  
  public OutputNested<A> withNewOutputLike(Output item) {
    return new OutputNested(item);
  }
  
  public OutputNested<A> editIoOutput() {
    return withNewOutputLike(java.util.Optional.ofNullable(buildOutput()).orElse(null));
  }
  
  public OutputNested<A> editOrNewOutput() {
    return withNewOutputLike(java.util.Optional.ofNullable(buildOutput()).orElse(new OutputBuilder().build()));
  }
  
  public OutputNested<A> editOrNewOutputLike(Output item) {
    return withNewOutputLike(java.util.Optional.ofNullable(buildOutput()).orElse(item));
  }
  
  public A addToPlugins(int index,Plugins item) {
    if (this.plugins == null) {this.plugins = new ArrayList<PluginsBuilder>();}
    PluginsBuilder builder = new PluginsBuilder(item);
    if (index < 0 || index >= plugins.size()) { _visitables.get("plugins").add(builder); plugins.add(builder); } else { _visitables.get("plugins").add(index, builder); plugins.add(index, builder);}
    return (A)this;
  }
  
  public A setToPlugins(int index,Plugins item) {
    if (this.plugins == null) {this.plugins = new ArrayList<PluginsBuilder>();}
    PluginsBuilder builder = new PluginsBuilder(item);
    if (index < 0 || index >= plugins.size()) { _visitables.get("plugins").add(builder); plugins.add(builder); } else { _visitables.get("plugins").set(index, builder); plugins.set(index, builder);}
    return (A)this;
  }
  
  public A addToPlugins(io.strimzi.kafka.v1beta2.kafkaconnectspec.build.Plugins... items) {
    if (this.plugins == null) {this.plugins = new ArrayList<PluginsBuilder>();}
    for (Plugins item : items) {PluginsBuilder builder = new PluginsBuilder(item);_visitables.get("plugins").add(builder);this.plugins.add(builder);} return (A)this;
  }
  
  public A addAllToIoPlugins(Collection<Plugins> items) {
    if (this.plugins == null) {this.plugins = new ArrayList<PluginsBuilder>();}
    for (Plugins item : items) {PluginsBuilder builder = new PluginsBuilder(item);_visitables.get("plugins").add(builder);this.plugins.add(builder);} return (A)this;
  }
  
  public A removeFromPlugins(io.strimzi.kafka.v1beta2.kafkaconnectspec.build.Plugins... items) {
    if (this.plugins == null) return (A)this;
    for (Plugins item : items) {PluginsBuilder builder = new PluginsBuilder(item);_visitables.get("plugins").remove(builder); this.plugins.remove(builder);} return (A)this;
  }
  
  public A removeAllFromIoPlugins(Collection<Plugins> items) {
    if (this.plugins == null) return (A)this;
    for (Plugins item : items) {PluginsBuilder builder = new PluginsBuilder(item);_visitables.get("plugins").remove(builder); this.plugins.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromIoPlugins(Predicate<PluginsBuilder> predicate) {
    if (plugins == null) return (A) this;
    final Iterator<PluginsBuilder> each = plugins.iterator();
    final List visitables = _visitables.get("plugins");
    while (each.hasNext()) {
      PluginsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Plugins> buildPlugins() {
    return this.plugins != null ? build(plugins) : null;
  }
  
  public Plugins buildPlugin(int index) {
    return this.plugins.get(index).build();
  }
  
  public Plugins buildFirstPlugin() {
    return this.plugins.get(0).build();
  }
  
  public Plugins buildLastPlugin() {
    return this.plugins.get(plugins.size() - 1).build();
  }
  
  public Plugins buildMatchingPlugin(Predicate<PluginsBuilder> predicate) {
      for (PluginsBuilder item : plugins) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingPlugin(Predicate<PluginsBuilder> predicate) {
      for (PluginsBuilder item : plugins) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPlugins(List<Plugins> plugins) {
    if (this.plugins != null) {
      this._visitables.get("plugins").clear();
    }
    if (plugins != null) {
        this.plugins = new ArrayList();
        for (Plugins item : plugins) {
          this.addToPlugins(item);
        }
    } else {
      this.plugins = null;
    }
    return (A) this;
  }
  
  public A withPlugins(io.strimzi.kafka.v1beta2.kafkaconnectspec.build.Plugins... plugins) {
    if (this.plugins != null) {
        this.plugins.clear();
        _visitables.remove("plugins");
    }
    if (plugins != null) {
      for (Plugins item : plugins) {
        this.addToPlugins(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPlugins() {
    return this.plugins != null && !this.plugins.isEmpty();
  }
  
  public PluginsNested<A> addNewPlugin() {
    return new PluginsNested(-1, null);
  }
  
  public PluginsNested<A> addNewPluginLike(Plugins item) {
    return new PluginsNested(-1, item);
  }
  
  public PluginsNested<A> setNewPluginLike(int index,Plugins item) {
    return new PluginsNested(index, item);
  }
  
  public PluginsNested<A> editPlugin(int index) {
    if (plugins.size() <= index) throw new RuntimeException("Can't edit plugins. Index exceeds size.");
    return setNewPluginLike(index, buildPlugin(index));
  }
  
  public PluginsNested<A> editFirstPlugin() {
    if (plugins.size() == 0) throw new RuntimeException("Can't edit first plugins. The list is empty.");
    return setNewPluginLike(0, buildPlugin(0));
  }
  
  public PluginsNested<A> editLastPlugin() {
    int index = plugins.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last plugins. The list is empty.");
    return setNewPluginLike(index, buildPlugin(index));
  }
  
  public PluginsNested<A> editMatchingPlugin(Predicate<PluginsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<plugins.size();i++) { 
    if (predicate.test(plugins.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching plugins. No match found.");
    return setNewPluginLike(index, buildPlugin(index));
  }
  
  public Resources buildResources() {
    return this.resources != null ? this.resources.build() : null;
  }
  
  public A withResources(Resources resources) {
    this._visitables.remove("resources");
    if (resources != null) {
        this.resources = new ResourcesBuilder(resources);
        this._visitables.get("resources").add(this.resources);
    } else {
        this.resources = null;
        this._visitables.get("resources").remove(this.resources);
    }
    return (A) this;
  }
  
  public boolean hasResources() {
    return this.resources != null;
  }
  
  public ResourcesNested<A> withNewResources() {
    return new ResourcesNested(null);
  }
  
  public ResourcesNested<A> withNewResourcesLike(Resources item) {
    return new ResourcesNested(item);
  }
  
  public ResourcesNested<A> editBuildResources() {
    return withNewResourcesLike(java.util.Optional.ofNullable(buildResources()).orElse(null));
  }
  
  public ResourcesNested<A> editOrNewResources() {
    return withNewResourcesLike(java.util.Optional.ofNullable(buildResources()).orElse(new ResourcesBuilder().build()));
  }
  
  public ResourcesNested<A> editOrNewResourcesLike(Resources item) {
    return withNewResourcesLike(java.util.Optional.ofNullable(buildResources()).orElse(item));
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
    BuildFluent that = (BuildFluent) o;
    if (!java.util.Objects.equals(output, that.output)) return false;
    if (!java.util.Objects.equals(plugins, that.plugins)) return false;
    if (!java.util.Objects.equals(resources, that.resources)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(output,  plugins,  resources,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (output != null) { sb.append("output:"); sb.append(output + ","); }
    if (plugins != null && !plugins.isEmpty()) { sb.append("plugins:"); sb.append(plugins + ","); }
    if (resources != null) { sb.append("resources:"); sb.append(resources + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class OutputNested<N> extends OutputFluent<OutputNested<N>> implements Nested<N>{
    OutputNested(Output item) {
      this.builder = new OutputBuilder(this, item);
    }
    OutputBuilder builder;
    
    public N and() {
      return (N) BuildFluent.this.withOutput(builder.build());
    }
    
    public N endIoOutput() {
      return and();
    }
    
  
  }
  public class PluginsNested<N> extends PluginsFluent<PluginsNested<N>> implements Nested<N>{
    PluginsNested(int index,Plugins item) {
      this.index = index;
      this.builder = new PluginsBuilder(this, item);
    }
    PluginsBuilder builder;
    int index;
    
    public N and() {
      return (N) BuildFluent.this.setToPlugins(index,builder.build());
    }
    
    public N endIoPlugin() {
      return and();
    }
    
  
  }
  public class ResourcesNested<N> extends ResourcesFluent<ResourcesNested<N>> implements Nested<N>{
    ResourcesNested(Resources item) {
      this.builder = new ResourcesBuilder(this, item);
    }
    ResourcesBuilder builder;
    
    public N and() {
      return (N) BuildFluent.this.withResources(builder.build());
    }
    
    public N endBuildResources() {
      return and();
    }
    
  
  }

}