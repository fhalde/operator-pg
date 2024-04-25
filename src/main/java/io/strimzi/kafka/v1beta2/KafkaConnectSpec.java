package io.strimzi.kafka.v1beta2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authentication","bootstrapServers","build","clientRackInitImage","config","externalConfiguration","image","jmxOptions","jvmOptions","livenessProbe","logging","metricsConfig","rack","readinessProbe","replicas","resources","template","tls","tracing","version"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
@lombok.ToString()
@lombok.EqualsAndHashCode()
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class KafkaConnectSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Authentication configuration for Kafka Connect.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authentication")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication configuration for Kafka Connect.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.Authentication authentication;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(io.strimzi.kafka.v1beta2.kafkaconnectspec.Authentication authentication) {
        this.authentication = authentication;
    }

    /**
     * Bootstrap servers to connect to. This should be given as a comma separated list of _<hostname>_:_<port>_ pairs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bootstrapServers")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Bootstrap servers to connect to. This should be given as a comma separated list of _<hostname>_:_<port>_ pairs.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String bootstrapServers;

    public String getBootstrapServers() {
        return bootstrapServers;
    }

    public void setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }

    /**
     * Configures how the Connect container image should be built. Optional.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("build")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configures how the Connect container image should be built. Optional.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.Build build;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.Build getBuild() {
        return build;
    }

    public void setBuild(io.strimzi.kafka.v1beta2.kafkaconnectspec.Build build) {
        this.build = build;
    }

    /**
     * The image of the init container used for initializing the `client.rack`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientRackInitImage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The image of the init container used for initializing the `client.rack`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String clientRackInitImage;

    public String getClientRackInitImage() {
        return clientRackInitImage;
    }

    public void setClientRackInitImage(String clientRackInitImage) {
        this.clientRackInitImage = clientRackInitImage;
    }

    /**
     * The Kafka Connect configuration. Properties with the following prefixes cannot be set: ssl., sasl., security., listeners, plugin.path, rest., bootstrap.servers, consumer.interceptor.classes, producer.interceptor.classes (with the exception of: ssl.endpoint.identification.algorithm, ssl.cipher.suites, ssl.protocol, ssl.enabled.protocols).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Kafka Connect configuration. Properties with the following prefixes cannot be set: ssl., sasl., security., listeners, plugin.path, rest., bootstrap.servers, consumer.interceptor.classes, producer.interceptor.classes (with the exception of: ssl.endpoint.identification.algorithm, ssl.cipher.suites, ssl.protocol, ssl.enabled.protocols).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.Config config;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.Config getConfig() {
        return config;
    }

    public void setConfig(io.strimzi.kafka.v1beta2.kafkaconnectspec.Config config) {
        this.config = config;
    }

    /**
     * Pass data from Secrets or ConfigMaps to the Kafka Connect pods and use them to configure connectors.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalConfiguration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pass data from Secrets or ConfigMaps to the Kafka Connect pods and use them to configure connectors.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.ExternalConfiguration externalConfiguration;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.ExternalConfiguration getExternalConfiguration() {
        return externalConfiguration;
    }

    public void setExternalConfiguration(io.strimzi.kafka.v1beta2.kafkaconnectspec.ExternalConfiguration externalConfiguration) {
        this.externalConfiguration = externalConfiguration;
    }

    /**
     * The container image used for Kafka Connect pods. If no image name is explicitly specified, it is determined based on the `spec.version` configuration. The image names are specifically mapped to corresponding versions in the Cluster Operator configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The container image used for Kafka Connect pods. If no image name is explicitly specified, it is determined based on the `spec.version` configuration. The image names are specifically mapped to corresponding versions in the Cluster Operator configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * JMX Options.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jmxOptions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("JMX Options.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.JmxOptions jmxOptions;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.JmxOptions getJmxOptions() {
        return jmxOptions;
    }

    public void setJmxOptions(io.strimzi.kafka.v1beta2.kafkaconnectspec.JmxOptions jmxOptions) {
        this.jmxOptions = jmxOptions;
    }

    /**
     * JVM Options for pods.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jvmOptions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("JVM Options for pods.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.JvmOptions jvmOptions;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.JvmOptions getJvmOptions() {
        return jvmOptions;
    }

    public void setJvmOptions(io.strimzi.kafka.v1beta2.kafkaconnectspec.JvmOptions jvmOptions) {
        this.jvmOptions = jvmOptions;
    }

    /**
     * Pod liveness checking.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("livenessProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod liveness checking.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.LivenessProbe livenessProbe;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.LivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(io.strimzi.kafka.v1beta2.kafkaconnectspec.LivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    /**
     * Logging configuration for Kafka Connect.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logging")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Logging configuration for Kafka Connect.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.Logging logging;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.Logging getLogging() {
        return logging;
    }

    public void setLogging(io.strimzi.kafka.v1beta2.kafkaconnectspec.Logging logging) {
        this.logging = logging;
    }

    /**
     * Metrics configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metricsConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Metrics configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.MetricsConfig metricsConfig;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.MetricsConfig getMetricsConfig() {
        return metricsConfig;
    }

    public void setMetricsConfig(io.strimzi.kafka.v1beta2.kafkaconnectspec.MetricsConfig metricsConfig) {
        this.metricsConfig = metricsConfig;
    }

    /**
     * Configuration of the node label which will be used as the `client.rack` consumer configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rack")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configuration of the node label which will be used as the `client.rack` consumer configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.Rack rack;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.Rack getRack() {
        return rack;
    }

    public void setRack(io.strimzi.kafka.v1beta2.kafkaconnectspec.Rack rack) {
        this.rack = rack;
    }

    /**
     * Pod readiness checking.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readinessProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod readiness checking.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.ReadinessProbe readinessProbe;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.ReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(io.strimzi.kafka.v1beta2.kafkaconnectspec.ReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    /**
     * The number of pods in the Kafka Connect group. Defaults to `3`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of pods in the Kafka Connect group. Defaults to `3`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long replicas;

    public Long getReplicas() {
        return replicas;
    }

    public void setReplicas(Long replicas) {
        this.replicas = replicas;
    }

    /**
     * The maximum limits for CPU and memory resources and the requested initial resources.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The maximum limits for CPU and memory resources and the requested initial resources.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.Resources resources;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.Resources getResources() {
        return resources;
    }

    public void setResources(io.strimzi.kafka.v1beta2.kafkaconnectspec.Resources resources) {
        this.resources = resources;
    }

    /**
     * Template for Kafka Connect and Kafka Mirror Maker 2 resources. The template allows users to specify how the `Pods`, `Service`, and other services are generated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka Connect and Kafka Mirror Maker 2 resources. The template allows users to specify how the `Pods`, `Service`, and other services are generated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.Template template;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.Template getTemplate() {
        return template;
    }

    public void setTemplate(io.strimzi.kafka.v1beta2.kafkaconnectspec.Template template) {
        this.template = template;
    }

    /**
     * TLS configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLS configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.Tls tls;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.Tls getTls() {
        return tls;
    }

    public void setTls(io.strimzi.kafka.v1beta2.kafkaconnectspec.Tls tls) {
        this.tls = tls;
    }

    /**
     * The configuration of tracing in Kafka Connect.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tracing")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The configuration of tracing in Kafka Connect.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.Tracing tracing;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.Tracing getTracing() {
        return tracing;
    }

    public void setTracing(io.strimzi.kafka.v1beta2.kafkaconnectspec.Tracing tracing) {
        this.tracing = tracing;
    }

    /**
     * The Kafka Connect version. Defaults to the latest version. Consult the user documentation to understand the process required to upgrade or downgrade the version.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Kafka Connect version. Defaults to the latest version. Consult the user documentation to understand the process required to upgrade or downgrade the version.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore()
    private java.util.Map<String, Object> additionalProperties = new java.util.HashMap<>();

    @com.fasterxml.jackson.annotation.JsonAnyGetter()
    public java.util.Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @com.fasterxml.jackson.annotation.JsonAnySetter()
    public void setAdditionalProperties(java.util.Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @com.fasterxml.jackson.annotation.JsonAnySetter()
    public void setAdditionalProperty(java.lang.String key, java.lang.Object value) {
        this.additionalProperties.put(key, value);
    }
}

