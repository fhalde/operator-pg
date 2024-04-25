package cli.strimzi.kafka.v1beta2.kafkaconnectspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"output","plugins","resources"})
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
public class Build implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Configures where should the newly built image be stored. Required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("output")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configures where should the newly built image be stored. Required.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.build.Output output;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.build.Output getOutput() {
        return output;
    }

    public void setOutput(cli.strimzi.kafka.v1beta2.kafkaconnectspec.build.Output output) {
        this.output = output;
    }

    /**
     * List of connector plugins which should be added to the Kafka Connect. Required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("plugins")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of connector plugins which should be added to the Kafka Connect. Required.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<cli.strimzi.kafka.v1beta2.kafkaconnectspec.build.Plugins> plugins;

    public java.util.List<cli.strimzi.kafka.v1beta2.kafkaconnectspec.build.Plugins> getPlugins() {
        return plugins;
    }

    public void setPlugins(java.util.List<cli.strimzi.kafka.v1beta2.kafkaconnectspec.build.Plugins> plugins) {
        this.plugins = plugins;
    }

    /**
     * CPU and memory resources to reserve for the build.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CPU and memory resources to reserve for the build.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.build.Resources resources;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.build.Resources getResources() {
        return resources;
    }

    public void setResources(cli.strimzi.kafka.v1beta2.kafkaconnectspec.build.Resources resources) {
        this.resources = resources;
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

