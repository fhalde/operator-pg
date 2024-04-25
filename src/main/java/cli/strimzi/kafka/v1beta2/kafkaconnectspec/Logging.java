package cli.strimzi.kafka.v1beta2.kafkaconnectspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"loggers","type","valueFrom"})
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
public class Logging implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * A Map from logger name to logger level.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loggers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A Map from logger name to logger level.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.logging.Loggers loggers;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.logging.Loggers getLoggers() {
        return loggers;
    }

    public void setLoggers(cli.strimzi.kafka.v1beta2.kafkaconnectspec.logging.Loggers loggers) {
        this.loggers = loggers;
    }

    public enum Type {

        @com.fasterxml.jackson.annotation.JsonProperty("inline")
        INLINE("inline"), @com.fasterxml.jackson.annotation.JsonProperty("external")
        EXTERNAL("external");

        java.lang.String value;

        Type(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Logging type, must be either 'inline' or 'external'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Logging type, must be either 'inline' or 'external'.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    /**
     * `ConfigMap` entry where the logging configuration is stored.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueFrom")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("`ConfigMap` entry where the logging configuration is stored. ")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.logging.ValueFrom valueFrom;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.logging.ValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(cli.strimzi.kafka.v1beta2.kafkaconnectspec.logging.ValueFrom valueFrom) {
        this.valueFrom = valueFrom;
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

