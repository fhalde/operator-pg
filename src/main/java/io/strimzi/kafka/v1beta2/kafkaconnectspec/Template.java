package io.strimzi.kafka.v1beta2.kafkaconnectspec;

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
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.template.ApiService apiService;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.template.ApiService getApiService() {
        return apiService;
    }

    public void setApiService(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.ApiService apiService) {
        this.apiService = apiService;
    }

    /**
     * Template for the Kafka Connect BuildConfig used to build new container images. The BuildConfig is used only on OpenShift.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buildConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka Connect BuildConfig used to build new container images. The BuildConfig is used only on OpenShift.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildConfig buildConfig;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildConfig getBuildConfig() {
        return buildConfig;
    }

    public void setBuildConfig(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildConfig buildConfig) {
        this.buildConfig = buildConfig;
    }

    /**
     * Template for the Kafka Connect Build container. The build container is used only on Kubernetes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buildContainer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka Connect Build container. The build container is used only on Kubernetes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildContainer buildContainer;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildContainer getBuildContainer() {
        return buildContainer;
    }

    public void setBuildContainer(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildContainer buildContainer) {
        this.buildContainer = buildContainer;
    }

    /**
     * Template for Kafka Connect Build `Pods`. The build pod is used only on Kubernetes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buildPod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka Connect Build `Pods`. The build pod is used only on Kubernetes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildPod buildPod;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildPod getBuildPod() {
        return buildPod;
    }

    public void setBuildPod(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildPod buildPod) {
        this.buildPod = buildPod;
    }

    /**
     * Template for the Kafka Connect Build service account.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buildServiceAccount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka Connect Build service account.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildServiceAccount buildServiceAccount;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildServiceAccount getBuildServiceAccount() {
        return buildServiceAccount;
    }

    public void setBuildServiceAccount(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildServiceAccount buildServiceAccount) {
        this.buildServiceAccount = buildServiceAccount;
    }

    /**
     * Template for the Kafka Connect ClusterRoleBinding.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterRoleBinding")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka Connect ClusterRoleBinding.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.template.ClusterRoleBinding clusterRoleBinding;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.template.ClusterRoleBinding getClusterRoleBinding() {
        return clusterRoleBinding;
    }

    public void setClusterRoleBinding(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.ClusterRoleBinding clusterRoleBinding) {
        this.clusterRoleBinding = clusterRoleBinding;
    }

    /**
     * Template for the Kafka Connect container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectContainer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka Connect container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.template.ConnectContainer connectContainer;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.template.ConnectContainer getConnectContainer() {
        return connectContainer;
    }

    public void setConnectContainer(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.ConnectContainer connectContainer) {
        this.connectContainer = connectContainer;
    }

    /**
     * Template for Kafka Connect `Deployment`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deployment")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka Connect `Deployment`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.template.Deployment deployment;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.template.Deployment getDeployment() {
        return deployment;
    }

    public void setDeployment(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.Deployment deployment) {
        this.deployment = deployment;
    }

    /**
     * Template for Kafka Connect headless `Service`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("headlessService")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka Connect headless `Service`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.template.HeadlessService headlessService;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.template.HeadlessService getHeadlessService() {
        return headlessService;
    }

    public void setHeadlessService(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.HeadlessService headlessService) {
        this.headlessService = headlessService;
    }

    /**
     * Template for the Kafka init container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initContainer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka init container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.template.InitContainer initContainer;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.template.InitContainer getInitContainer() {
        return initContainer;
    }

    public void setInitContainer(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.InitContainer initContainer) {
        this.initContainer = initContainer;
    }

    /**
     * Template for Secret of the Kafka Connect Cluster JMX authentication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jmxSecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Secret of the Kafka Connect Cluster JMX authentication.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.template.JmxSecret jmxSecret;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.template.JmxSecret getJmxSecret() {
        return jmxSecret;
    }

    public void setJmxSecret(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.JmxSecret jmxSecret) {
        this.jmxSecret = jmxSecret;
    }

    /**
     * Template for Kafka Connect `Pods`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka Connect `Pods`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.template.Pod pod;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.template.Pod getPod() {
        return pod;
    }

    public void setPod(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.Pod pod) {
        this.pod = pod;
    }

    /**
     * Template for Kafka Connect `PodDisruptionBudget`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podDisruptionBudget")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka Connect `PodDisruptionBudget`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodDisruptionBudget podDisruptionBudget;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodDisruptionBudget getPodDisruptionBudget() {
        return podDisruptionBudget;
    }

    public void setPodDisruptionBudget(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodDisruptionBudget podDisruptionBudget) {
        this.podDisruptionBudget = podDisruptionBudget;
    }

    /**
     * Template for Kafka Connect `StrimziPodSet` resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podSet")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka Connect `StrimziPodSet` resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodSet podSet;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodSet getPodSet() {
        return podSet;
    }

    public void setPodSet(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodSet podSet) {
        this.podSet = podSet;
    }

    /**
     * Template for the Kafka Connect service account.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka Connect service account.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaconnectspec.template.ServiceAccount serviceAccount;

    public io.strimzi.kafka.v1beta2.kafkaconnectspec.template.ServiceAccount getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(io.strimzi.kafka.v1beta2.kafkaconnectspec.template.ServiceAccount serviceAccount) {
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

