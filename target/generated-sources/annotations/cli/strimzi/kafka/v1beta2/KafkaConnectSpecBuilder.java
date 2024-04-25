package cli.strimzi.kafka.v1beta2;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class KafkaConnectSpecBuilder extends KafkaConnectSpecFluent<KafkaConnectSpecBuilder> implements VisitableBuilder<KafkaConnectSpec,KafkaConnectSpecBuilder>{
  public KafkaConnectSpecBuilder() {
    this(new KafkaConnectSpec());
  }
  
  public KafkaConnectSpecBuilder(KafkaConnectSpecFluent<?> fluent) {
    this(fluent, new KafkaConnectSpec());
  }
  
  public KafkaConnectSpecBuilder(KafkaConnectSpecFluent<?> fluent,KafkaConnectSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public KafkaConnectSpecBuilder(KafkaConnectSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  KafkaConnectSpecFluent<?> fluent;
  
  public KafkaConnectSpec build() {
    KafkaConnectSpec buildable = new KafkaConnectSpec();
    buildable.setAuthentication(fluent.buildAuthentication());
    buildable.setBootstrapServers(fluent.getBootstrapServers());
    buildable.setBuild(fluent.buildBuild());
    buildable.setClientRackInitImage(fluent.getClientRackInitImage());
    buildable.setConfig(fluent.buildConfig());
    buildable.setExternalConfiguration(fluent.buildExternalConfiguration());
    buildable.setImage(fluent.getImage());
    buildable.setJmxOptions(fluent.buildJmxOptions());
    buildable.setJvmOptions(fluent.buildJvmOptions());
    buildable.setLivenessProbe(fluent.buildLivenessProbe());
    buildable.setLogging(fluent.buildLogging());
    buildable.setMetricsConfig(fluent.buildMetricsConfig());
    buildable.setRack(fluent.buildRack());
    buildable.setReadinessProbe(fluent.buildReadinessProbe());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setResources(fluent.buildResources());
    buildable.setTemplate(fluent.buildTemplate());
    buildable.setTls(fluent.buildTls());
    buildable.setTracing(fluent.buildTracing());
    buildable.setVersion(fluent.getVersion());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}