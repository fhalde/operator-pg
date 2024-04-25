package cli.strimzi.kafka.v1beta2.kafkaconnectspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"apiService","buildConfig","buildContainer","buildPod","buildServiceAccount","clusterRoleBinding","connectContainer","deployment","headlessService","initContainer","jmxSecret","pod","podDisruptionBudget","podSet","serviceAccount"})
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
public class Template implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Template for Kafka Connect API `Service`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("apiService")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka Connect API `Service`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ApiService apiService;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ApiService getApiService() {
        return apiService;
    }

    public void setApiService(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ApiService apiService) {
        this.apiService = apiService;
    }

    /**
     * Template for the Kafka Connect BuildConfig used to build new container images. The BuildConfig is used only on OpenShift.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buildConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka Connect BuildConfig used to build new container images. The BuildConfig is used only on OpenShift.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildConfig buildConfig;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildConfig getBuildConfig() {
        return buildConfig;
    }

    public void setBuildConfig(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildConfig buildConfig) {
        this.buildConfig = buildConfig;
    }

    /**
     * Template for the Kafka Connect Build container. The build container is used only on Kubernetes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buildContainer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka Connect Build container. The build container is used only on Kubernetes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildContainer buildContainer;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildContainer getBuildContainer() {
        return buildContainer;
    }

    public void setBuildContainer(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildContainer buildContainer) {
        this.buildContainer = buildContainer;
    }

    /**
     * Template for Kafka Connect Build `Pods`. The build pod is used only on Kubernetes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buildPod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka Connect Build `Pods`. The build pod is used only on Kubernetes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildPod buildPod;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildPod getBuildPod() {
        return buildPod;
    }

    public void setBuildPod(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildPod buildPod) {
        this.buildPod = buildPod;
    }

    /**
     * Template for the Kafka Connect Build service account.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buildServiceAccount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka Connect Build service account.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildServiceAccount buildServiceAccount;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildServiceAccount getBuildServiceAccount() {
        return buildServiceAccount;
    }

    public void setBuildServiceAccount(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildServiceAccount buildServiceAccount) {
        this.buildServiceAccount = buildServiceAccount;
    }

    /**
     * Template for the Kafka Connect ClusterRoleBinding.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterRoleBinding")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka Connect ClusterRoleBinding.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ClusterRoleBinding clusterRoleBinding;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ClusterRoleBinding getClusterRoleBinding() {
        return clusterRoleBinding;
    }

    public void setClusterRoleBinding(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ClusterRoleBinding clusterRoleBinding) {
        this.clusterRoleBinding = clusterRoleBinding;
    }

    /**
     * Template for the Kafka Connect container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectContainer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka Connect container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ConnectContainer connectContainer;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ConnectContainer getConnectContainer() {
        return connectContainer;
    }

    public void setConnectContainer(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ConnectContainer connectContainer) {
        this.connectContainer = connectContainer;
    }

    /**
     * Template for Kafka Connect `Deployment`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deployment")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka Connect `Deployment`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.Deployment deployment;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.Deployment getDeployment() {
        return deployment;
    }

    public void setDeployment(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.Deployment deployment) {
        this.deployment = deployment;
    }

    /**
     * Template for Kafka Connect headless `Service`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("headlessService")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka Connect headless `Service`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.HeadlessService headlessService;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.HeadlessService getHeadlessService() {
        return headlessService;
    }

    public void setHeadlessService(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.HeadlessService headlessService) {
        this.headlessService = headlessService;
    }

    /**
     * Template for the Kafka init container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initContainer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka init container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.InitContainer initContainer;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.InitContainer getInitContainer() {
        return initContainer;
    }

    public void setInitContainer(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.InitContainer initContainer) {
        this.initContainer = initContainer;
    }

    /**
     * Template for Secret of the Kafka Connect Cluster JMX authentication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jmxSecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Secret of the Kafka Connect Cluster JMX authentication.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.JmxSecret jmxSecret;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.JmxSecret getJmxSecret() {
        return jmxSecret;
    }

    public void setJmxSecret(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.JmxSecret jmxSecret) {
        this.jmxSecret = jmxSecret;
    }

    /**
     * Template for Kafka Connect `Pods`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka Connect `Pods`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.Pod pod;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.Pod getPod() {
        return pod;
    }

    public void setPod(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.Pod pod) {
        this.pod = pod;
    }

    /**
     * Template for Kafka Connect `PodDisruptionBudget`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podDisruptionBudget")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka Connect `PodDisruptionBudget`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodDisruptionBudget podDisruptionBudget;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodDisruptionBudget getPodDisruptionBudget() {
        return podDisruptionBudget;
    }

    public void setPodDisruptionBudget(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodDisruptionBudget podDisruptionBudget) {
        this.podDisruptionBudget = podDisruptionBudget;
    }

    /**
     * Template for Kafka Connect `StrimziPodSet` resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podSet")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka Connect `StrimziPodSet` resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodSet podSet;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodSet getPodSet() {
        return podSet;
    }

    public void setPodSet(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodSet podSet) {
        this.podSet = podSet;
    }

    /**
     * Template for the Kafka Connect service account.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka Connect service account.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ServiceAccount serviceAccount;

    public cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ServiceAccount getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ServiceAccount serviceAccount) {
        this.serviceAccount = serviceAccount;
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

