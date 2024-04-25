package cli.strimzi.kafka.v1beta2.kafkaconnectspec.build;

import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class OutputFluent<A extends OutputFluent<A>> extends BaseFluent<A>{
  public OutputFluent() {
  }
  
  public OutputFluent(Output instance) {
    this.copyInstance(instance);
  }
  private List<String> additionalKanikoOptions;
  private String image;
  private String pushSecret;
  private Output.Type type;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(Output instance) {
    instance = (instance != null ? instance : new Output());
    if (instance != null) {
          this.withAdditionalKanikoOptions(instance.getAdditionalKanikoOptions());
          this.withImage(instance.getImage());
          this.withPushSecret(instance.getPushSecret());
          this.withType(instance.getType());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public A addToAdditionalKanikoOptions(int index,String item) {
    if (this.additionalKanikoOptions == null) {this.additionalKanikoOptions = new ArrayList<String>();}
    this.additionalKanikoOptions.add(index, item);
    return (A)this;
  }
  
  public A setToAdditionalKanikoOptions(int index,String item) {
    if (this.additionalKanikoOptions == null) {this.additionalKanikoOptions = new ArrayList<String>();}
    this.additionalKanikoOptions.set(index, item); return (A)this;
  }
  
  public A addToAdditionalKanikoOptions(java.lang.String... items) {
    if (this.additionalKanikoOptions == null) {this.additionalKanikoOptions = new ArrayList<String>();}
    for (String item : items) {this.additionalKanikoOptions.add(item);} return (A)this;
  }
  
  public A addAllToAdditionalKanikoOptions(Collection<String> items) {
    if (this.additionalKanikoOptions == null) {this.additionalKanikoOptions = new ArrayList<String>();}
    for (String item : items) {this.additionalKanikoOptions.add(item);} return (A)this;
  }
  
  public A removeFromAdditionalKanikoOptions(java.lang.String... items) {
    if (this.additionalKanikoOptions == null) return (A)this;
    for (String item : items) { this.additionalKanikoOptions.remove(item);} return (A)this;
  }
  
  public A removeAllFromAdditionalKanikoOptions(Collection<String> items) {
    if (this.additionalKanikoOptions == null) return (A)this;
    for (String item : items) { this.additionalKanikoOptions.remove(item);} return (A)this;
  }
  
  public List<String> getAdditionalKanikoOptions() {
    return this.additionalKanikoOptions;
  }
  
  public String getAdditionalKanikoOption(int index) {
    return this.additionalKanikoOptions.get(index);
  }
  
  public String getFirstAdditionalKanikoOption() {
    return this.additionalKanikoOptions.get(0);
  }
  
  public String getLastAdditionalKanikoOption() {
    return this.additionalKanikoOptions.get(additionalKanikoOptions.size() - 1);
  }
  
  public String getMatchingAdditionalKanikoOption(Predicate<String> predicate) {
      for (String item : additionalKanikoOptions) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingAdditionalKanikoOption(Predicate<String> predicate) {
      for (String item : additionalKanikoOptions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withAdditionalKanikoOptions(List<String> additionalKanikoOptions) {
    if (additionalKanikoOptions != null) {
        this.additionalKanikoOptions = new ArrayList();
        for (String item : additionalKanikoOptions) {
          this.addToAdditionalKanikoOptions(item);
        }
    } else {
      this.additionalKanikoOptions = null;
    }
    return (A) this;
  }
  
  public A withAdditionalKanikoOptions(java.lang.String... additionalKanikoOptions) {
    if (this.additionalKanikoOptions != null) {
        this.additionalKanikoOptions.clear();
        _visitables.remove("additionalKanikoOptions");
    }
    if (additionalKanikoOptions != null) {
      for (String item : additionalKanikoOptions) {
        this.addToAdditionalKanikoOptions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasAdditionalKanikoOptions() {
    return this.additionalKanikoOptions != null && !this.additionalKanikoOptions.isEmpty();
  }
  
  public String getImage() {
    return this.image;
  }
  
  public A withImage(String image) {
    this.image = image;
    return (A) this;
  }
  
  public boolean hasImage() {
    return this.image != null;
  }
  
  public String getPushSecret() {
    return this.pushSecret;
  }
  
  public A withPushSecret(String pushSecret) {
    this.pushSecret = pushSecret;
    return (A) this;
  }
  
  public boolean hasPushSecret() {
    return this.pushSecret != null;
  }
  
  public Output.Type getType() {
    return this.type;
  }
  
  public A withType(Output.Type type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
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
    OutputFluent that = (OutputFluent) o;
    if (!java.util.Objects.equals(additionalKanikoOptions, that.additionalKanikoOptions)) return false;
    if (!java.util.Objects.equals(image, that.image)) return false;
    if (!java.util.Objects.equals(pushSecret, that.pushSecret)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(additionalKanikoOptions,  image,  pushSecret,  type,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (additionalKanikoOptions != null && !additionalKanikoOptions.isEmpty()) { sb.append("additionalKanikoOptions:"); sb.append(additionalKanikoOptions + ","); }
    if (image != null) { sb.append("image:"); sb.append(image + ","); }
    if (pushSecret != null) { sb.append("pushSecret:"); sb.append(pushSecret + ","); }
    if (type != null) { sb.append("type:"); sb.append(type + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  

}