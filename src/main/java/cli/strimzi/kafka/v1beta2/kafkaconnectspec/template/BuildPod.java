package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"affinity","enableServiceLinks","hostAliases","imagePullSecrets","metadata","priorityClassName","schedulerName","securityContext","terminationGracePeriodSeconds","tmpDirSizeLimit","tolerations","topologySpreadConstraints"})
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
public class BuildPod implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The pod's affinity rules.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("affinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The pod's affinity rules.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.Affinity affinity;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.Affinity getAffinity() {
        return affinity;
    }

    public void setAffinity(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.Affinity affinity) {
        this.affinity = affinity;
    }

    /**
     * Indicates whether information about services should be injected into Pod's environment variables.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableServiceLinks")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Indicates whether information about services should be injected into Pod's environment variables.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enableServiceLinks;

    public Boolean getEnableServiceLinks() {
        return enableServiceLinks;
    }

    public void setEnableServiceLinks(Boolean enableServiceLinks) {
        this.enableServiceLinks = enableServiceLinks;
    }

    /**
     * The pod's HostAliases. HostAliases is an optional list of hosts and IPs that will be injected into the Pod's hosts file if specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostAliases")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The pod's HostAliases. HostAliases is an optional list of hosts and IPs that will be injected into the Pod's hosts file if specified.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.HostAliases> hostAliases;

    public java.util.List<cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.HostAliases> getHostAliases() {
        return hostAliases;
    }

    public void setHostAliases(java.util.List<cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.HostAliases> hostAliases) {
        this.hostAliases = hostAliases;
    }

    /**
     * List of references to secrets in the same namespace to use for pulling any of the images used by this Pod. When the `STRIMZI_IMAGE_PULL_SECRETS` environment variable in Cluster Operator and the `imagePullSecrets` option are specified, only the `imagePullSecrets` variable is used and the `STRIMZI_IMAGE_PULL_SECRETS` variable is ignored.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imagePullSecrets")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("List of references to secrets in the same namespace to use for pulling any of the images used by this Pod. When the `STRIMZI_IMAGE_PULL_SECRETS` environment variable in Cluster Operator and the `imagePullSecrets` option are specified, only the `imagePullSecrets` variable is used and the `STRIMZI_IMAGE_PULL_SECRETS` variable is ignored.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.ImagePullSecrets> imagePullSecrets;

    public java.util.List<cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.ImagePullSecrets> getImagePullSecrets() {
        return imagePullSecrets;
    }

    public void setImagePullSecrets(java.util.List<cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.ImagePullSecrets> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }

    /**
     * Metadata applied to the resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Metadata applied to the resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.Metadata metadata;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * The name of the priority class used to assign priority to the pods.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priorityClassName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the priority class used to assign priority to the pods. ")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String priorityClassName;

    public String getPriorityClassName() {
        return priorityClassName;
    }

    public void setPriorityClassName(String priorityClassName) {
        this.priorityClassName = priorityClassName;
    }

    /**
     * The name of the scheduler used to dispatch this `Pod`. If not specified, the default scheduler will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedulerName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the scheduler used to dispatch this `Pod`. If not specified, the default scheduler will be used.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String schedulerName;

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    /**
     * Configures pod-level security attributes and common container settings.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityContext")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configures pod-level security attributes and common container settings.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.SecurityContext securityContext;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.SecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.SecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    /**
     * The grace period is the duration in seconds after the processes running in the pod are sent a termination signal, and the time when the processes are forcibly halted with a kill signal. Set this value to longer than the expected cleanup time for your process. Value must be a non-negative integer. A zero value indicates delete immediately. You might need to increase the grace period for very large Kafka clusters, so that the Kafka brokers have enough time to transfer their work to another broker before they are terminated. Defaults to 30 seconds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("terminationGracePeriodSeconds")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The grace period is the duration in seconds after the processes running in the pod are sent a termination signal, and the time when the processes are forcibly halted with a kill signal. Set this value to longer than the expected cleanup time for your process. Value must be a non-negative integer. A zero value indicates delete immediately. You might need to increase the grace period for very large Kafka clusters, so that the Kafka brokers have enough time to transfer their work to another broker before they are terminated. Defaults to 30 seconds.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long terminationGracePeriodSeconds;

    public Long getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }

    /**
     * Defines the total amount (for example `1Gi`) of local storage required for temporary EmptyDir volume (`/tmp`). Default value is `5Mi`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tmpDirSizeLimit")
    @io.fabric8.generator.annotation.Pattern("^([0-9.]+)([eEinumkKMGTP]*[-+]?[0-9]*)$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Defines the total amount (for example `1Gi`) of local storage required for temporary EmptyDir volume (`/tmp`). Default value is `5Mi`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String tmpDirSizeLimit;

    public String getTmpDirSizeLimit() {
        return tmpDirSizeLimit;
    }

    public void setTmpDirSizeLimit(String tmpDirSizeLimit) {
        this.tmpDirSizeLimit = tmpDirSizeLimit;
    }

    /**
     * The pod's tolerations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tolerations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The pod's tolerations.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.Tolerations> tolerations;

    public java.util.List<cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.Tolerations> getTolerations() {
        return tolerations;
    }

    public void setTolerations(java.util.List<cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.Tolerations> tolerations) {
        this.tolerations = tolerations;
    }

    /**
     * The pod's topology spread constraints.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topologySpreadConstraints")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The pod's topology spread constraints.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.TopologySpreadConstraints> topologySpreadConstraints;

    public java.util.List<cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.TopologySpreadConstraints> getTopologySpreadConstraints() {
        return topologySpreadConstraints;
    }

    public void setTopologySpreadConstraints(java.util.List<cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.TopologySpreadConstraints> topologySpreadConstraints) {
        this.topologySpreadConstraints = topologySpreadConstraints;
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

