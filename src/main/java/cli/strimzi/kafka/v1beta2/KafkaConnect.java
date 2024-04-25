package cli.strimzi.kafka.v1beta2;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1beta2" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("kafka.strimzi.io")
@io.fabric8.kubernetes.model.annotation.Singular("kafkaconnect")
@io.fabric8.kubernetes.model.annotation.Plural("kafkaconnects")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
@lombok.ToString()
@lombok.EqualsAndHashCode(callSuper = true)
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
public class KafkaConnect extends io.fabric8.kubernetes.client.CustomResource<cli.strimzi.kafka.v1beta2.KafkaConnectSpec, cli.strimzi.kafka.v1beta2.KafkaConnectStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

