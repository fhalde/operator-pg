package cli.strimzi.kafka.v1beta2.kafkaconnectspec;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.jvmoptions._XXBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.jvmoptions._XXFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.jvmoptions._XX;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.jvmoptions.JavaSystemPropertiesFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.jvmoptions.JavaSystemPropertiesBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.jvmoptions.JavaSystemProperties;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class JvmOptionsFluent<A extends JvmOptionsFluent<A>> extends BaseFluent<A>{
  public JvmOptionsFluent() {
  }
  
  public JvmOptionsFluent(JvmOptions instance) {
    this.copyInstance(instance);
  }
  private _XXBuilder _XX;
  private String _Xms;
  private String _Xmx;
  private Boolean gcLoggingEnabled;
  private ArrayList<JavaSystemPropertiesBuilder> javaSystemProperties;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(JvmOptions instance) {
    instance = (instance != null ? instance : new JvmOptions());
    if (instance != null) {
          this.withXX(instance.get_XX());
          this.withXms(instance.get_Xms());
          this.withXmx(instance.get_Xmx());
          this.withGcLoggingEnabled(instance.getGcLoggingEnabled());
          this.withJavaSystemProperties(instance.getJavaSystemProperties());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public _XX buildXX() {
    return this._XX != null ? this._XX.build() : null;
  }
  
  public A withXX(_XX _XX) {
    this._visitables.remove("_XX");
    if (_XX != null) {
        this._XX = new _XXBuilder(_XX);
        this._visitables.get("_XX").add(this._XX);
    } else {
        this._XX = null;
        this._visitables.get("_XX").remove(this._XX);
    }
    return (A) this;
  }
  
  public boolean hasXX() {
    return this._XX != null;
  }
  
  public XXNested<A> withNewXX() {
    return new XXNested(null);
  }
  
  public XXNested<A> withNewXXLike(_XX item) {
    return new XXNested(item);
  }
  
  public XXNested<A> editXX() {
    return withNewXXLike(java.util.Optional.ofNullable(buildXX()).orElse(null));
  }
  
  public XXNested<A> editOrNewXX() {
    return withNewXXLike(java.util.Optional.ofNullable(buildXX()).orElse(new _XXBuilder().build()));
  }
  
  public XXNested<A> editOrNewXXLike(_XX item) {
    return withNewXXLike(java.util.Optional.ofNullable(buildXX()).orElse(item));
  }
  
  public String getXms() {
    return this._Xms;
  }
  
  public A withXms(String _Xms) {
    this._Xms = _Xms;
    return (A) this;
  }
  
  public boolean hasXms() {
    return this._Xms != null;
  }
  
  public String getXmx() {
    return this._Xmx;
  }
  
  public A withXmx(String _Xmx) {
    this._Xmx = _Xmx;
    return (A) this;
  }
  
  public boolean hasXmx() {
    return this._Xmx != null;
  }
  
  public Boolean getGcLoggingEnabled() {
    return this.gcLoggingEnabled;
  }
  
  public A withGcLoggingEnabled(Boolean gcLoggingEnabled) {
    this.gcLoggingEnabled = gcLoggingEnabled;
    return (A) this;
  }
  
  public boolean hasGcLoggingEnabled() {
    return this.gcLoggingEnabled != null;
  }
  
  public A addToJavaSystemProperties(int index,JavaSystemProperties item) {
    if (this.javaSystemProperties == null) {this.javaSystemProperties = new ArrayList<JavaSystemPropertiesBuilder>();}
    JavaSystemPropertiesBuilder builder = new JavaSystemPropertiesBuilder(item);
    if (index < 0 || index >= javaSystemProperties.size()) { _visitables.get("javaSystemProperties").add(builder); javaSystemProperties.add(builder); } else { _visitables.get("javaSystemProperties").add(index, builder); javaSystemProperties.add(index, builder);}
    return (A)this;
  }
  
  public A setToJavaSystemProperties(int index,JavaSystemProperties item) {
    if (this.javaSystemProperties == null) {this.javaSystemProperties = new ArrayList<JavaSystemPropertiesBuilder>();}
    JavaSystemPropertiesBuilder builder = new JavaSystemPropertiesBuilder(item);
    if (index < 0 || index >= javaSystemProperties.size()) { _visitables.get("javaSystemProperties").add(builder); javaSystemProperties.add(builder); } else { _visitables.get("javaSystemProperties").set(index, builder); javaSystemProperties.set(index, builder);}
    return (A)this;
  }
  
  public A addToJavaSystemProperties(cli.strimzi.kafka.v1beta2.kafkaconnectspec.jvmoptions.JavaSystemProperties... items) {
    if (this.javaSystemProperties == null) {this.javaSystemProperties = new ArrayList<JavaSystemPropertiesBuilder>();}
    for (JavaSystemProperties item : items) {JavaSystemPropertiesBuilder builder = new JavaSystemPropertiesBuilder(item);_visitables.get("javaSystemProperties").add(builder);this.javaSystemProperties.add(builder);} return (A)this;
  }
  
  public A addAllToJavaSystemProperties(Collection<JavaSystemProperties> items) {
    if (this.javaSystemProperties == null) {this.javaSystemProperties = new ArrayList<JavaSystemPropertiesBuilder>();}
    for (JavaSystemProperties item : items) {JavaSystemPropertiesBuilder builder = new JavaSystemPropertiesBuilder(item);_visitables.get("javaSystemProperties").add(builder);this.javaSystemProperties.add(builder);} return (A)this;
  }
  
  public A removeFromJavaSystemProperties(cli.strimzi.kafka.v1beta2.kafkaconnectspec.jvmoptions.JavaSystemProperties... items) {
    if (this.javaSystemProperties == null) return (A)this;
    for (JavaSystemProperties item : items) {JavaSystemPropertiesBuilder builder = new JavaSystemPropertiesBuilder(item);_visitables.get("javaSystemProperties").remove(builder); this.javaSystemProperties.remove(builder);} return (A)this;
  }
  
  public A removeAllFromJavaSystemProperties(Collection<JavaSystemProperties> items) {
    if (this.javaSystemProperties == null) return (A)this;
    for (JavaSystemProperties item : items) {JavaSystemPropertiesBuilder builder = new JavaSystemPropertiesBuilder(item);_visitables.get("javaSystemProperties").remove(builder); this.javaSystemProperties.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromJavaSystemProperties(Predicate<JavaSystemPropertiesBuilder> predicate) {
    if (javaSystemProperties == null) return (A) this;
    final Iterator<JavaSystemPropertiesBuilder> each = javaSystemProperties.iterator();
    final List visitables = _visitables.get("javaSystemProperties");
    while (each.hasNext()) {
      JavaSystemPropertiesBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<JavaSystemProperties> buildJavaSystemProperties() {
    return this.javaSystemProperties != null ? build(javaSystemProperties) : null;
  }
  
  public JavaSystemProperties buildJavaSystemProperty(int index) {
    return this.javaSystemProperties.get(index).build();
  }
  
  public JavaSystemProperties buildFirstJavaSystemProperty() {
    return this.javaSystemProperties.get(0).build();
  }
  
  public JavaSystemProperties buildLastJavaSystemProperty() {
    return this.javaSystemProperties.get(javaSystemProperties.size() - 1).build();
  }
  
  public JavaSystemProperties buildMatchingJavaSystemProperty(Predicate<JavaSystemPropertiesBuilder> predicate) {
      for (JavaSystemPropertiesBuilder item : javaSystemProperties) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingJavaSystemProperty(Predicate<JavaSystemPropertiesBuilder> predicate) {
      for (JavaSystemPropertiesBuilder item : javaSystemProperties) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withJavaSystemProperties(List<JavaSystemProperties> javaSystemProperties) {
    if (this.javaSystemProperties != null) {
      this._visitables.get("javaSystemProperties").clear();
    }
    if (javaSystemProperties != null) {
        this.javaSystemProperties = new ArrayList();
        for (JavaSystemProperties item : javaSystemProperties) {
          this.addToJavaSystemProperties(item);
        }
    } else {
      this.javaSystemProperties = null;
    }
    return (A) this;
  }
  
  public A withJavaSystemProperties(cli.strimzi.kafka.v1beta2.kafkaconnectspec.jvmoptions.JavaSystemProperties... javaSystemProperties) {
    if (this.javaSystemProperties != null) {
        this.javaSystemProperties.clear();
        _visitables.remove("javaSystemProperties");
    }
    if (javaSystemProperties != null) {
      for (JavaSystemProperties item : javaSystemProperties) {
        this.addToJavaSystemProperties(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasJavaSystemProperties() {
    return this.javaSystemProperties != null && !this.javaSystemProperties.isEmpty();
  }
  
  public JavaSystemPropertiesNested<A> addNewJavaSystemProperty() {
    return new JavaSystemPropertiesNested(-1, null);
  }
  
  public JavaSystemPropertiesNested<A> addNewJavaSystemPropertyLike(JavaSystemProperties item) {
    return new JavaSystemPropertiesNested(-1, item);
  }
  
  public JavaSystemPropertiesNested<A> setNewJavaSystemPropertyLike(int index,JavaSystemProperties item) {
    return new JavaSystemPropertiesNested(index, item);
  }
  
  public JavaSystemPropertiesNested<A> editJavaSystemProperty(int index) {
    if (javaSystemProperties.size() <= index) throw new RuntimeException("Can't edit javaSystemProperties. Index exceeds size.");
    return setNewJavaSystemPropertyLike(index, buildJavaSystemProperty(index));
  }
  
  public JavaSystemPropertiesNested<A> editFirstJavaSystemProperty() {
    if (javaSystemProperties.size() == 0) throw new RuntimeException("Can't edit first javaSystemProperties. The list is empty.");
    return setNewJavaSystemPropertyLike(0, buildJavaSystemProperty(0));
  }
  
  public JavaSystemPropertiesNested<A> editLastJavaSystemProperty() {
    int index = javaSystemProperties.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last javaSystemProperties. The list is empty.");
    return setNewJavaSystemPropertyLike(index, buildJavaSystemProperty(index));
  }
  
  public JavaSystemPropertiesNested<A> editMatchingJavaSystemProperty(Predicate<JavaSystemPropertiesBuilder> predicate) {
    int index = -1;
    for (int i=0;i<javaSystemProperties.size();i++) { 
    if (predicate.test(javaSystemProperties.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching javaSystemProperties. No match found.");
    return setNewJavaSystemPropertyLike(index, buildJavaSystemProperty(index));
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
    JvmOptionsFluent that = (JvmOptionsFluent) o;
    if (!java.util.Objects.equals(_XX, that._XX)) return false;
    if (!java.util.Objects.equals(_Xms, that._Xms)) return false;
    if (!java.util.Objects.equals(_Xmx, that._Xmx)) return false;
    if (!java.util.Objects.equals(gcLoggingEnabled, that.gcLoggingEnabled)) return false;
    if (!java.util.Objects.equals(javaSystemProperties, that.javaSystemProperties)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(_XX,  _Xms,  _Xmx,  gcLoggingEnabled,  javaSystemProperties,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (_XX != null) { sb.append("_XX:"); sb.append(_XX + ","); }
    if (_Xms != null) { sb.append("_Xms:"); sb.append(_Xms + ","); }
    if (_Xmx != null) { sb.append("_Xmx:"); sb.append(_Xmx + ","); }
    if (gcLoggingEnabled != null) { sb.append("gcLoggingEnabled:"); sb.append(gcLoggingEnabled + ","); }
    if (javaSystemProperties != null && !javaSystemProperties.isEmpty()) { sb.append("javaSystemProperties:"); sb.append(javaSystemProperties + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withGcLoggingEnabled() {
    return withGcLoggingEnabled(true);
  }
  public class XXNested<N> extends _XXFluent<XXNested<N>> implements Nested<N>{
    XXNested(_XX item) {
      this.builder = new _XXBuilder(this, item);
    }
    _XXBuilder builder;
    
    public N and() {
      return (N) JvmOptionsFluent.this.withXX(builder.build());
    }
    
    public N endXX() {
      return and();
    }
    
  
  }
  public class JavaSystemPropertiesNested<N> extends JavaSystemPropertiesFluent<JavaSystemPropertiesNested<N>> implements Nested<N>{
    JavaSystemPropertiesNested(int index,JavaSystemProperties item) {
      this.index = index;
      this.builder = new JavaSystemPropertiesBuilder(this, item);
    }
    JavaSystemPropertiesBuilder builder;
    int index;
    
    public N and() {
      return (N) JvmOptionsFluent.this.setToJavaSystemProperties(index,builder.build());
    }
    
    public N endJavaSystemProperty() {
      return and();
    }
    
  
  }

}