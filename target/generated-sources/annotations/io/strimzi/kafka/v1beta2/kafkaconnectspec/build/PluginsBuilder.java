package io.strimzi.kafka.v1beta2.kafkaconnectspec.build;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PluginsBuilder extends PluginsFluent<PluginsBuilder> implements VisitableBuilder<Plugins,PluginsBuilder>{
  public PluginsBuilder() {
    this(new Plugins());
  }
  
  public PluginsBuilder(PluginsFluent<?> fluent) {
    this(fluent, new Plugins());
  }
  
  public PluginsBuilder(PluginsFluent<?> fluent,Plugins instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PluginsBuilder(Plugins instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PluginsFluent<?> fluent;
  
  public Plugins build() {
    Plugins buildable = new Plugins();
    buildable.setArtifacts(fluent.buildArtifacts());
    buildable.setName(fluent.getName());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}