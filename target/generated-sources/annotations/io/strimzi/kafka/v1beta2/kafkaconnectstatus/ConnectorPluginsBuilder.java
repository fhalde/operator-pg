package io.strimzi.kafka.v1beta2.kafkaconnectstatus;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class ConnectorPluginsBuilder extends ConnectorPluginsFluent<ConnectorPluginsBuilder> implements VisitableBuilder<ConnectorPlugins,ConnectorPluginsBuilder>{
  public ConnectorPluginsBuilder() {
    this(new ConnectorPlugins());
  }
  
  public ConnectorPluginsBuilder(ConnectorPluginsFluent<?> fluent) {
    this(fluent, new ConnectorPlugins());
  }
  
  public ConnectorPluginsBuilder(ConnectorPluginsFluent<?> fluent,ConnectorPlugins instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ConnectorPluginsBuilder(ConnectorPlugins instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ConnectorPluginsFluent<?> fluent;
  
  public ConnectorPlugins build() {
    ConnectorPlugins buildable = new ConnectorPlugins();
    buildable.setType(fluent.getType());
    buildable.setVersion(fluent.getVersion());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}