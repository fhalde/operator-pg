package cli.strimzi.kafka.v1beta2.kafkaconnectspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"type"})
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
public class Tracing implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum Type {

        @com.fasterxml.jackson.annotation.JsonProperty("jaeger")
        JAEGER("jaeger"), @com.fasterxml.jackson.annotation.JsonProperty("opentelemetry")
        OPENTELEMETRY("opentelemetry");

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
     * Type of the tracing used. Currently the only supported type is `opentelemetry` for OpenTelemetry tracing. As of Strimzi 0.37.0, `jaeger` type is not supported anymore and this option is ignored.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Type of the tracing used. Currently the only supported type is `opentelemetry` for OpenTelemetry tracing. As of Strimzi 0.37.0, `jaeger` type is not supported anymore and this option is ignored.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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
