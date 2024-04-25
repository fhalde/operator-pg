package cli.strimzi.kafka.v1beta2.kafkaconnectspec;

import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildPodBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildPod;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ClusterRoleBinding;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.InitContainer;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.Deployment;
import java.lang.String;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodDisruptionBudgetBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildConfigBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ApiServiceFluent;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.HeadlessServiceBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildConfig;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.JmxSecretBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ClusterRoleBindingBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.Pod;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ConnectContainerFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ServiceAccountBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildConfigFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodSetFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodSet;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.HeadlessServiceFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ApiService;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.InitContainerFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ApiServiceBuilder;
import java.lang.Object;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildPodFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildServiceAccount;
import java.util.Map;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.DeploymentBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.InitContainerBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.JmxSecretFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ServiceAccount;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodDisruptionBudget;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.HeadlessService;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ServiceAccountFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildContainerBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildContainerFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.DeploymentFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildContainer;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ClusterRoleBindingFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildServiceAccountBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.BuildServiceAccountFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodDisruptionBudgetFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.JmxSecret;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ConnectContainerBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.ConnectContainer;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.PodSetBuilder;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class TemplateFluent<A extends TemplateFluent<A>> extends BaseFluent<A>{
  public TemplateFluent() {
  }
  
  public TemplateFluent(Template instance) {
    this.copyInstance(instance);
  }
  private ApiServiceBuilder apiService;
  private BuildConfigBuilder buildConfig;
  private BuildContainerBuilder buildContainer;
  private BuildPodBuilder buildPod;
  private BuildServiceAccountBuilder buildServiceAccount;
  private ClusterRoleBindingBuilder clusterRoleBinding;
  private ConnectContainerBuilder connectContainer;
  private DeploymentBuilder deployment;
  private HeadlessServiceBuilder headlessService;
  private InitContainerBuilder initContainer;
  private JmxSecretBuilder jmxSecret;
  private PodBuilder pod;
  private PodDisruptionBudgetBuilder podDisruptionBudget;
  private PodSetBuilder podSet;
  private ServiceAccountBuilder serviceAccount;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(Template instance) {
    instance = (instance != null ? instance : new Template());
    if (instance != null) {
          this.withApiService(instance.getApiService());
          this.withBuildConfig(instance.getBuildConfig());
          this.withBuildContainer(instance.getBuildContainer());
          this.withBuildPod(instance.getBuildPod());
          this.withBuildServiceAccount(instance.getBuildServiceAccount());
          this.withClusterRoleBinding(instance.getClusterRoleBinding());
          this.withConnectContainer(instance.getConnectContainer());
          this.withDeployment(instance.getDeployment());
          this.withHeadlessService(instance.getHeadlessService());
          this.withInitContainer(instance.getInitContainer());
          this.withJmxSecret(instance.getJmxSecret());
          this.withPod(instance.getPod());
          this.withPodDisruptionBudget(instance.getPodDisruptionBudget());
          this.withPodSet(instance.getPodSet());
          this.withServiceAccount(instance.getServiceAccount());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public ApiService buildApiService() {
    return this.apiService != null ? this.apiService.build() : null;
  }
  
  public A withApiService(ApiService apiService) {
    this._visitables.remove("apiService");
    if (apiService != null) {
        this.apiService = new ApiServiceBuilder(apiService);
        this._visitables.get("apiService").add(this.apiService);
    } else {
        this.apiService = null;
        this._visitables.get("apiService").remove(this.apiService);
    }
    return (A) this;
  }
  
  public boolean hasApiService() {
    return this.apiService != null;
  }
  
  public ApiServiceNested<A> withNewApiService() {
    return new ApiServiceNested(null);
  }
  
  public ApiServiceNested<A> withNewApiServiceLike(ApiService item) {
    return new ApiServiceNested(item);
  }
  
  public ApiServiceNested<A> editApiService() {
    return withNewApiServiceLike(java.util.Optional.ofNullable(buildApiService()).orElse(null));
  }
  
  public ApiServiceNested<A> editOrNewApiService() {
    return withNewApiServiceLike(java.util.Optional.ofNullable(buildApiService()).orElse(new ApiServiceBuilder().build()));
  }
  
  public ApiServiceNested<A> editOrNewApiServiceLike(ApiService item) {
    return withNewApiServiceLike(java.util.Optional.ofNullable(buildApiService()).orElse(item));
  }
  
  public BuildConfig buildBuildConfig() {
    return this.buildConfig != null ? this.buildConfig.build() : null;
  }
  
  public A withBuildConfig(BuildConfig buildConfig) {
    this._visitables.remove("buildConfig");
    if (buildConfig != null) {
        this.buildConfig = new BuildConfigBuilder(buildConfig);
        this._visitables.get("buildConfig").add(this.buildConfig);
    } else {
        this.buildConfig = null;
        this._visitables.get("buildConfig").remove(this.buildConfig);
    }
    return (A) this;
  }
  
  public boolean hasBuildConfig() {
    return this.buildConfig != null;
  }
  
  public BuildConfigNested<A> withNewBuildConfig() {
    return new BuildConfigNested(null);
  }
  
  public BuildConfigNested<A> withNewBuildConfigLike(BuildConfig item) {
    return new BuildConfigNested(item);
  }
  
  public BuildConfigNested<A> editBuildConfig() {
    return withNewBuildConfigLike(java.util.Optional.ofNullable(buildBuildConfig()).orElse(null));
  }
  
  public BuildConfigNested<A> editOrNewBuildConfig() {
    return withNewBuildConfigLike(java.util.Optional.ofNullable(buildBuildConfig()).orElse(new BuildConfigBuilder().build()));
  }
  
  public BuildConfigNested<A> editOrNewBuildConfigLike(BuildConfig item) {
    return withNewBuildConfigLike(java.util.Optional.ofNullable(buildBuildConfig()).orElse(item));
  }
  
  public BuildContainer buildBuildContainer() {
    return this.buildContainer != null ? this.buildContainer.build() : null;
  }
  
  public A withBuildContainer(BuildContainer buildContainer) {
    this._visitables.remove("buildContainer");
    if (buildContainer != null) {
        this.buildContainer = new BuildContainerBuilder(buildContainer);
        this._visitables.get("buildContainer").add(this.buildContainer);
    } else {
        this.buildContainer = null;
        this._visitables.get("buildContainer").remove(this.buildContainer);
    }
    return (A) this;
  }
  
  public boolean hasBuildContainer() {
    return this.buildContainer != null;
  }
  
  public BuildContainerNested<A> withNewBuildContainer() {
    return new BuildContainerNested(null);
  }
  
  public BuildContainerNested<A> withNewBuildContainerLike(BuildContainer item) {
    return new BuildContainerNested(item);
  }
  
  public BuildContainerNested<A> editBuildContainer() {
    return withNewBuildContainerLike(java.util.Optional.ofNullable(buildBuildContainer()).orElse(null));
  }
  
  public BuildContainerNested<A> editOrNewBuildContainer() {
    return withNewBuildContainerLike(java.util.Optional.ofNullable(buildBuildContainer()).orElse(new BuildContainerBuilder().build()));
  }
  
  public BuildContainerNested<A> editOrNewBuildContainerLike(BuildContainer item) {
    return withNewBuildContainerLike(java.util.Optional.ofNullable(buildBuildContainer()).orElse(item));
  }
  
  public BuildPod buildBuildPod() {
    return this.buildPod != null ? this.buildPod.build() : null;
  }
  
  public A withBuildPod(BuildPod buildPod) {
    this._visitables.remove("buildPod");
    if (buildPod != null) {
        this.buildPod = new BuildPodBuilder(buildPod);
        this._visitables.get("buildPod").add(this.buildPod);
    } else {
        this.buildPod = null;
        this._visitables.get("buildPod").remove(this.buildPod);
    }
    return (A) this;
  }
  
  public boolean hasBuildPod() {
    return this.buildPod != null;
  }
  
  public BuildPodNested<A> withNewBuildPod() {
    return new BuildPodNested(null);
  }
  
  public BuildPodNested<A> withNewBuildPodLike(BuildPod item) {
    return new BuildPodNested(item);
  }
  
  public BuildPodNested<A> editBuildPod() {
    return withNewBuildPodLike(java.util.Optional.ofNullable(buildBuildPod()).orElse(null));
  }
  
  public BuildPodNested<A> editOrNewBuildPod() {
    return withNewBuildPodLike(java.util.Optional.ofNullable(buildBuildPod()).orElse(new BuildPodBuilder().build()));
  }
  
  public BuildPodNested<A> editOrNewBuildPodLike(BuildPod item) {
    return withNewBuildPodLike(java.util.Optional.ofNullable(buildBuildPod()).orElse(item));
  }
  
  public BuildServiceAccount buildBuildServiceAccount() {
    return this.buildServiceAccount != null ? this.buildServiceAccount.build() : null;
  }
  
  public A withBuildServiceAccount(BuildServiceAccount buildServiceAccount) {
    this._visitables.remove("buildServiceAccount");
    if (buildServiceAccount != null) {
        this.buildServiceAccount = new BuildServiceAccountBuilder(buildServiceAccount);
        this._visitables.get("buildServiceAccount").add(this.buildServiceAccount);
    } else {
        this.buildServiceAccount = null;
        this._visitables.get("buildServiceAccount").remove(this.buildServiceAccount);
    }
    return (A) this;
  }
  
  public boolean hasBuildServiceAccount() {
    return this.buildServiceAccount != null;
  }
  
  public BuildServiceAccountNested<A> withNewBuildServiceAccount() {
    return new BuildServiceAccountNested(null);
  }
  
  public BuildServiceAccountNested<A> withNewBuildServiceAccountLike(BuildServiceAccount item) {
    return new BuildServiceAccountNested(item);
  }
  
  public BuildServiceAccountNested<A> editBuildServiceAccount() {
    return withNewBuildServiceAccountLike(java.util.Optional.ofNullable(buildBuildServiceAccount()).orElse(null));
  }
  
  public BuildServiceAccountNested<A> editOrNewBuildServiceAccount() {
    return withNewBuildServiceAccountLike(java.util.Optional.ofNullable(buildBuildServiceAccount()).orElse(new BuildServiceAccountBuilder().build()));
  }
  
  public BuildServiceAccountNested<A> editOrNewBuildServiceAccountLike(BuildServiceAccount item) {
    return withNewBuildServiceAccountLike(java.util.Optional.ofNullable(buildBuildServiceAccount()).orElse(item));
  }
  
  public ClusterRoleBinding buildClusterRoleBinding() {
    return this.clusterRoleBinding != null ? this.clusterRoleBinding.build() : null;
  }
  
  public A withClusterRoleBinding(ClusterRoleBinding clusterRoleBinding) {
    this._visitables.remove("clusterRoleBinding");
    if (clusterRoleBinding != null) {
        this.clusterRoleBinding = new ClusterRoleBindingBuilder(clusterRoleBinding);
        this._visitables.get("clusterRoleBinding").add(this.clusterRoleBinding);
    } else {
        this.clusterRoleBinding = null;
        this._visitables.get("clusterRoleBinding").remove(this.clusterRoleBinding);
    }
    return (A) this;
  }
  
  public boolean hasClusterRoleBinding() {
    return this.clusterRoleBinding != null;
  }
  
  public ClusterRoleBindingNested<A> withNewClusterRoleBinding() {
    return new ClusterRoleBindingNested(null);
  }
  
  public ClusterRoleBindingNested<A> withNewClusterRoleBindingLike(ClusterRoleBinding item) {
    return new ClusterRoleBindingNested(item);
  }
  
  public ClusterRoleBindingNested<A> editClusterRoleBinding() {
    return withNewClusterRoleBindingLike(java.util.Optional.ofNullable(buildClusterRoleBinding()).orElse(null));
  }
  
  public ClusterRoleBindingNested<A> editOrNewClusterRoleBinding() {
    return withNewClusterRoleBindingLike(java.util.Optional.ofNullable(buildClusterRoleBinding()).orElse(new ClusterRoleBindingBuilder().build()));
  }
  
  public ClusterRoleBindingNested<A> editOrNewClusterRoleBindingLike(ClusterRoleBinding item) {
    return withNewClusterRoleBindingLike(java.util.Optional.ofNullable(buildClusterRoleBinding()).orElse(item));
  }
  
  public ConnectContainer buildConnectContainer() {
    return this.connectContainer != null ? this.connectContainer.build() : null;
  }
  
  public A withConnectContainer(ConnectContainer connectContainer) {
    this._visitables.remove("connectContainer");
    if (connectContainer != null) {
        this.connectContainer = new ConnectContainerBuilder(connectContainer);
        this._visitables.get("connectContainer").add(this.connectContainer);
    } else {
        this.connectContainer = null;
        this._visitables.get("connectContainer").remove(this.connectContainer);
    }
    return (A) this;
  }
  
  public boolean hasConnectContainer() {
    return this.connectContainer != null;
  }
  
  public ConnectContainerNested<A> withNewConnectContainer() {
    return new ConnectContainerNested(null);
  }
  
  public ConnectContainerNested<A> withNewConnectContainerLike(ConnectContainer item) {
    return new ConnectContainerNested(item);
  }
  
  public ConnectContainerNested<A> editConnectContainer() {
    return withNewConnectContainerLike(java.util.Optional.ofNullable(buildConnectContainer()).orElse(null));
  }
  
  public ConnectContainerNested<A> editOrNewConnectContainer() {
    return withNewConnectContainerLike(java.util.Optional.ofNullable(buildConnectContainer()).orElse(new ConnectContainerBuilder().build()));
  }
  
  public ConnectContainerNested<A> editOrNewConnectContainerLike(ConnectContainer item) {
    return withNewConnectContainerLike(java.util.Optional.ofNullable(buildConnectContainer()).orElse(item));
  }
  
  public Deployment buildDeployment() {
    return this.deployment != null ? this.deployment.build() : null;
  }
  
  public A withDeployment(Deployment deployment) {
    this._visitables.remove("deployment");
    if (deployment != null) {
        this.deployment = new DeploymentBuilder(deployment);
        this._visitables.get("deployment").add(this.deployment);
    } else {
        this.deployment = null;
        this._visitables.get("deployment").remove(this.deployment);
    }
    return (A) this;
  }
  
  public boolean hasDeployment() {
    return this.deployment != null;
  }
  
  public DeploymentNested<A> withNewDeployment() {
    return new DeploymentNested(null);
  }
  
  public DeploymentNested<A> withNewDeploymentLike(Deployment item) {
    return new DeploymentNested(item);
  }
  
  public DeploymentNested<A> editDeployment() {
    return withNewDeploymentLike(java.util.Optional.ofNullable(buildDeployment()).orElse(null));
  }
  
  public DeploymentNested<A> editOrNewDeployment() {
    return withNewDeploymentLike(java.util.Optional.ofNullable(buildDeployment()).orElse(new DeploymentBuilder().build()));
  }
  
  public DeploymentNested<A> editOrNewDeploymentLike(Deployment item) {
    return withNewDeploymentLike(java.util.Optional.ofNullable(buildDeployment()).orElse(item));
  }
  
  public HeadlessService buildHeadlessService() {
    return this.headlessService != null ? this.headlessService.build() : null;
  }
  
  public A withHeadlessService(HeadlessService headlessService) {
    this._visitables.remove("headlessService");
    if (headlessService != null) {
        this.headlessService = new HeadlessServiceBuilder(headlessService);
        this._visitables.get("headlessService").add(this.headlessService);
    } else {
        this.headlessService = null;
        this._visitables.get("headlessService").remove(this.headlessService);
    }
    return (A) this;
  }
  
  public boolean hasHeadlessService() {
    return this.headlessService != null;
  }
  
  public HeadlessServiceNested<A> withNewHeadlessService() {
    return new HeadlessServiceNested(null);
  }
  
  public HeadlessServiceNested<A> withNewHeadlessServiceLike(HeadlessService item) {
    return new HeadlessServiceNested(item);
  }
  
  public HeadlessServiceNested<A> editHeadlessService() {
    return withNewHeadlessServiceLike(java.util.Optional.ofNullable(buildHeadlessService()).orElse(null));
  }
  
  public HeadlessServiceNested<A> editOrNewHeadlessService() {
    return withNewHeadlessServiceLike(java.util.Optional.ofNullable(buildHeadlessService()).orElse(new HeadlessServiceBuilder().build()));
  }
  
  public HeadlessServiceNested<A> editOrNewHeadlessServiceLike(HeadlessService item) {
    return withNewHeadlessServiceLike(java.util.Optional.ofNullable(buildHeadlessService()).orElse(item));
  }
  
  public InitContainer buildInitContainer() {
    return this.initContainer != null ? this.initContainer.build() : null;
  }
  
  public A withInitContainer(InitContainer initContainer) {
    this._visitables.remove("initContainer");
    if (initContainer != null) {
        this.initContainer = new InitContainerBuilder(initContainer);
        this._visitables.get("initContainer").add(this.initContainer);
    } else {
        this.initContainer = null;
        this._visitables.get("initContainer").remove(this.initContainer);
    }
    return (A) this;
  }
  
  public boolean hasInitContainer() {
    return this.initContainer != null;
  }
  
  public InitContainerNested<A> withNewInitContainer() {
    return new InitContainerNested(null);
  }
  
  public InitContainerNested<A> withNewInitContainerLike(InitContainer item) {
    return new InitContainerNested(item);
  }
  
  public InitContainerNested<A> editInitContainer() {
    return withNewInitContainerLike(java.util.Optional.ofNullable(buildInitContainer()).orElse(null));
  }
  
  public InitContainerNested<A> editOrNewInitContainer() {
    return withNewInitContainerLike(java.util.Optional.ofNullable(buildInitContainer()).orElse(new InitContainerBuilder().build()));
  }
  
  public InitContainerNested<A> editOrNewInitContainerLike(InitContainer item) {
    return withNewInitContainerLike(java.util.Optional.ofNullable(buildInitContainer()).orElse(item));
  }
  
  public JmxSecret buildJmxSecret() {
    return this.jmxSecret != null ? this.jmxSecret.build() : null;
  }
  
  public A withJmxSecret(JmxSecret jmxSecret) {
    this._visitables.remove("jmxSecret");
    if (jmxSecret != null) {
        this.jmxSecret = new JmxSecretBuilder(jmxSecret);
        this._visitables.get("jmxSecret").add(this.jmxSecret);
    } else {
        this.jmxSecret = null;
        this._visitables.get("jmxSecret").remove(this.jmxSecret);
    }
    return (A) this;
  }
  
  public boolean hasJmxSecret() {
    return this.jmxSecret != null;
  }
  
  public JmxSecretNested<A> withNewJmxSecret() {
    return new JmxSecretNested(null);
  }
  
  public JmxSecretNested<A> withNewJmxSecretLike(JmxSecret item) {
    return new JmxSecretNested(item);
  }
  
  public JmxSecretNested<A> editJmxSecret() {
    return withNewJmxSecretLike(java.util.Optional.ofNullable(buildJmxSecret()).orElse(null));
  }
  
  public JmxSecretNested<A> editOrNewJmxSecret() {
    return withNewJmxSecretLike(java.util.Optional.ofNullable(buildJmxSecret()).orElse(new JmxSecretBuilder().build()));
  }
  
  public JmxSecretNested<A> editOrNewJmxSecretLike(JmxSecret item) {
    return withNewJmxSecretLike(java.util.Optional.ofNullable(buildJmxSecret()).orElse(item));
  }
  
  public Pod buildPod() {
    return this.pod != null ? this.pod.build() : null;
  }
  
  public A withPod(Pod pod) {
    this._visitables.remove("pod");
    if (pod != null) {
        this.pod = new PodBuilder(pod);
        this._visitables.get("pod").add(this.pod);
    } else {
        this.pod = null;
        this._visitables.get("pod").remove(this.pod);
    }
    return (A) this;
  }
  
  public boolean hasPod() {
    return this.pod != null;
  }
  
  public PodNested<A> withNewPod() {
    return new PodNested(null);
  }
  
  public PodNested<A> withNewPodLike(Pod item) {
    return new PodNested(item);
  }
  
  public PodNested<A> editPod() {
    return withNewPodLike(java.util.Optional.ofNullable(buildPod()).orElse(null));
  }
  
  public PodNested<A> editOrNewPod() {
    return withNewPodLike(java.util.Optional.ofNullable(buildPod()).orElse(new PodBuilder().build()));
  }
  
  public PodNested<A> editOrNewPodLike(Pod item) {
    return withNewPodLike(java.util.Optional.ofNullable(buildPod()).orElse(item));
  }
  
  public PodDisruptionBudget buildPodDisruptionBudget() {
    return this.podDisruptionBudget != null ? this.podDisruptionBudget.build() : null;
  }
  
  public A withPodDisruptionBudget(PodDisruptionBudget podDisruptionBudget) {
    this._visitables.remove("podDisruptionBudget");
    if (podDisruptionBudget != null) {
        this.podDisruptionBudget = new PodDisruptionBudgetBuilder(podDisruptionBudget);
        this._visitables.get("podDisruptionBudget").add(this.podDisruptionBudget);
    } else {
        this.podDisruptionBudget = null;
        this._visitables.get("podDisruptionBudget").remove(this.podDisruptionBudget);
    }
    return (A) this;
  }
  
  public boolean hasPodDisruptionBudget() {
    return this.podDisruptionBudget != null;
  }
  
  public PodDisruptionBudgetNested<A> withNewPodDisruptionBudget() {
    return new PodDisruptionBudgetNested(null);
  }
  
  public PodDisruptionBudgetNested<A> withNewPodDisruptionBudgetLike(PodDisruptionBudget item) {
    return new PodDisruptionBudgetNested(item);
  }
  
  public PodDisruptionBudgetNested<A> editPodDisruptionBudget() {
    return withNewPodDisruptionBudgetLike(java.util.Optional.ofNullable(buildPodDisruptionBudget()).orElse(null));
  }
  
  public PodDisruptionBudgetNested<A> editOrNewPodDisruptionBudget() {
    return withNewPodDisruptionBudgetLike(java.util.Optional.ofNullable(buildPodDisruptionBudget()).orElse(new PodDisruptionBudgetBuilder().build()));
  }
  
  public PodDisruptionBudgetNested<A> editOrNewPodDisruptionBudgetLike(PodDisruptionBudget item) {
    return withNewPodDisruptionBudgetLike(java.util.Optional.ofNullable(buildPodDisruptionBudget()).orElse(item));
  }
  
  public PodSet buildPodSet() {
    return this.podSet != null ? this.podSet.build() : null;
  }
  
  public A withPodSet(PodSet podSet) {
    this._visitables.remove("podSet");
    if (podSet != null) {
        this.podSet = new PodSetBuilder(podSet);
        this._visitables.get("podSet").add(this.podSet);
    } else {
        this.podSet = null;
        this._visitables.get("podSet").remove(this.podSet);
    }
    return (A) this;
  }
  
  public boolean hasPodSet() {
    return this.podSet != null;
  }
  
  public PodSetNested<A> withNewPodSet() {
    return new PodSetNested(null);
  }
  
  public PodSetNested<A> withNewPodSetLike(PodSet item) {
    return new PodSetNested(item);
  }
  
  public PodSetNested<A> editPodSet() {
    return withNewPodSetLike(java.util.Optional.ofNullable(buildPodSet()).orElse(null));
  }
  
  public PodSetNested<A> editOrNewPodSet() {
    return withNewPodSetLike(java.util.Optional.ofNullable(buildPodSet()).orElse(new PodSetBuilder().build()));
  }
  
  public PodSetNested<A> editOrNewPodSetLike(PodSet item) {
    return withNewPodSetLike(java.util.Optional.ofNullable(buildPodSet()).orElse(item));
  }
  
  public ServiceAccount buildServiceAccount() {
    return this.serviceAccount != null ? this.serviceAccount.build() : null;
  }
  
  public A withServiceAccount(ServiceAccount serviceAccount) {
    this._visitables.remove("serviceAccount");
    if (serviceAccount != null) {
        this.serviceAccount = new ServiceAccountBuilder(serviceAccount);
        this._visitables.get("serviceAccount").add(this.serviceAccount);
    } else {
        this.serviceAccount = null;
        this._visitables.get("serviceAccount").remove(this.serviceAccount);
    }
    return (A) this;
  }
  
  public boolean hasServiceAccount() {
    return this.serviceAccount != null;
  }
  
  public ServiceAccountNested<A> withNewServiceAccount() {
    return new ServiceAccountNested(null);
  }
  
  public ServiceAccountNested<A> withNewServiceAccountLike(ServiceAccount item) {
    return new ServiceAccountNested(item);
  }
  
  public ServiceAccountNested<A> editServiceAccount() {
    return withNewServiceAccountLike(java.util.Optional.ofNullable(buildServiceAccount()).orElse(null));
  }
  
  public ServiceAccountNested<A> editOrNewServiceAccount() {
    return withNewServiceAccountLike(java.util.Optional.ofNullable(buildServiceAccount()).orElse(new ServiceAccountBuilder().build()));
  }
  
  public ServiceAccountNested<A> editOrNewServiceAccountLike(ServiceAccount item) {
    return withNewServiceAccountLike(java.util.Optional.ofNullable(buildServiceAccount()).orElse(item));
  }
  
  public A addToAdditionalProperties(String key,Object value) {
    if(this.additionalProperties == null && key != null && value != null) { this.additionalProperties = new LinkedHashMap(); }
    if(key != null && value != null) {this.additionalProperties.put(key, value);} return (A)this;
  }
  
  public A addToAdditionalProperties(Map<String,Object> map) {
    if(this.additionalProperties == null && map != null) { this.additionalProperties = new LinkedHashMap(); }
    if(map != null) { this.additionalProperties.putAll(map);} return (A)this;
  }
  
  public A removeFromAdditionalProperties(String key) {
    if(this.additionalProperties == null) { return (A) this; }
    if(key != null && this.additionalProperties != null) {this.additionalProperties.remove(key);} return (A)this;
  }
  
  public A removeFromAdditionalProperties(Map<String,Object> map) {
    if(this.additionalProperties == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.additionalProperties != null){this.additionalProperties.remove(key);}}} return (A)this;
  }
  
  public Map<String,Object> getAdditionalProperties() {
    return this.additionalProperties;
  }
  
  public <K,V>A withAdditionalProperties(Map<String,Object> additionalProperties) {
    if (additionalProperties == null) {
      this.additionalProperties = null;
    } else {
      this.additionalProperties = new LinkedHashMap(additionalProperties);
    }
    return (A) this;
  }
  
  public boolean hasAdditionalProperties() {
    return this.additionalProperties != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    TemplateFluent that = (TemplateFluent) o;
    if (!java.util.Objects.equals(apiService, that.apiService)) return false;
    if (!java.util.Objects.equals(buildConfig, that.buildConfig)) return false;
    if (!java.util.Objects.equals(buildContainer, that.buildContainer)) return false;
    if (!java.util.Objects.equals(buildPod, that.buildPod)) return false;
    if (!java.util.Objects.equals(buildServiceAccount, that.buildServiceAccount)) return false;
    if (!java.util.Objects.equals(clusterRoleBinding, that.clusterRoleBinding)) return false;
    if (!java.util.Objects.equals(connectContainer, that.connectContainer)) return false;
    if (!java.util.Objects.equals(deployment, that.deployment)) return false;
    if (!java.util.Objects.equals(headlessService, that.headlessService)) return false;
    if (!java.util.Objects.equals(initContainer, that.initContainer)) return false;
    if (!java.util.Objects.equals(jmxSecret, that.jmxSecret)) return false;
    if (!java.util.Objects.equals(pod, that.pod)) return false;
    if (!java.util.Objects.equals(podDisruptionBudget, that.podDisruptionBudget)) return false;
    if (!java.util.Objects.equals(podSet, that.podSet)) return false;
    if (!java.util.Objects.equals(serviceAccount, that.serviceAccount)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiService,  buildConfig,  buildContainer,  buildPod,  buildServiceAccount,  clusterRoleBinding,  connectContainer,  deployment,  headlessService,  initContainer,  jmxSecret,  pod,  podDisruptionBudget,  podSet,  serviceAccount,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiService != null) { sb.append("apiService:"); sb.append(apiService + ","); }
    if (buildConfig != null) { sb.append("buildConfig:"); sb.append(buildConfig + ","); }
    if (buildContainer != null) { sb.append("buildContainer:"); sb.append(buildContainer + ","); }
    if (buildPod != null) { sb.append("buildPod:"); sb.append(buildPod + ","); }
    if (buildServiceAccount != null) { sb.append("buildServiceAccount:"); sb.append(buildServiceAccount + ","); }
    if (clusterRoleBinding != null) { sb.append("clusterRoleBinding:"); sb.append(clusterRoleBinding + ","); }
    if (connectContainer != null) { sb.append("connectContainer:"); sb.append(connectContainer + ","); }
    if (deployment != null) { sb.append("deployment:"); sb.append(deployment + ","); }
    if (headlessService != null) { sb.append("headlessService:"); sb.append(headlessService + ","); }
    if (initContainer != null) { sb.append("initContainer:"); sb.append(initContainer + ","); }
    if (jmxSecret != null) { sb.append("jmxSecret:"); sb.append(jmxSecret + ","); }
    if (pod != null) { sb.append("pod:"); sb.append(pod + ","); }
    if (podDisruptionBudget != null) { sb.append("podDisruptionBudget:"); sb.append(podDisruptionBudget + ","); }
    if (podSet != null) { sb.append("podSet:"); sb.append(podSet + ","); }
    if (serviceAccount != null) { sb.append("serviceAccount:"); sb.append(serviceAccount + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class ApiServiceNested<N> extends ApiServiceFluent<ApiServiceNested<N>> implements Nested<N>{
    ApiServiceNested(ApiService item) {
      this.builder = new ApiServiceBuilder(this, item);
    }
    ApiServiceBuilder builder;
    
    public N and() {
      return (N) TemplateFluent.this.withApiService(builder.build());
    }
    
    public N endApiService() {
      return and();
    }
    
  
  }
  public class BuildConfigNested<N> extends BuildConfigFluent<BuildConfigNested<N>> implements Nested<N>{
    BuildConfigNested(BuildConfig item) {
      this.builder = new BuildConfigBuilder(this, item);
    }
    BuildConfigBuilder builder;
    
    public N and() {
      return (N) TemplateFluent.this.withBuildConfig(builder.build());
    }
    
    public N endBuildConfig() {
      return and();
    }
    
  
  }
  public class BuildContainerNested<N> extends BuildContainerFluent<BuildContainerNested<N>> implements Nested<N>{
    BuildContainerNested(BuildContainer item) {
      this.builder = new BuildContainerBuilder(this, item);
    }
    BuildContainerBuilder builder;
    
    public N and() {
      return (N) TemplateFluent.this.withBuildContainer(builder.build());
    }
    
    public N endBuildContainer() {
      return and();
    }
    
  
  }
  public class BuildPodNested<N> extends BuildPodFluent<BuildPodNested<N>> implements Nested<N>{
    BuildPodNested(BuildPod item) {
      this.builder = new BuildPodBuilder(this, item);
    }
    BuildPodBuilder builder;
    
    public N and() {
      return (N) TemplateFluent.this.withBuildPod(builder.build());
    }
    
    public N endBuildPod() {
      return and();
    }
    
  
  }
  public class BuildServiceAccountNested<N> extends BuildServiceAccountFluent<BuildServiceAccountNested<N>> implements Nested<N>{
    BuildServiceAccountNested(BuildServiceAccount item) {
      this.builder = new BuildServiceAccountBuilder(this, item);
    }
    BuildServiceAccountBuilder builder;
    
    public N and() {
      return (N) TemplateFluent.this.withBuildServiceAccount(builder.build());
    }
    
    public N endBuildServiceAccount() {
      return and();
    }
    
  
  }
  public class ClusterRoleBindingNested<N> extends ClusterRoleBindingFluent<ClusterRoleBindingNested<N>> implements Nested<N>{
    ClusterRoleBindingNested(ClusterRoleBinding item) {
      this.builder = new ClusterRoleBindingBuilder(this, item);
    }
    ClusterRoleBindingBuilder builder;
    
    public N and() {
      return (N) TemplateFluent.this.withClusterRoleBinding(builder.build());
    }
    
    public N endClusterRoleBinding() {
      return and();
    }
    
  
  }
  public class ConnectContainerNested<N> extends ConnectContainerFluent<ConnectContainerNested<N>> implements Nested<N>{
    ConnectContainerNested(ConnectContainer item) {
      this.builder = new ConnectContainerBuilder(this, item);
    }
    ConnectContainerBuilder builder;
    
    public N and() {
      return (N) TemplateFluent.this.withConnectContainer(builder.build());
    }
    
    public N endConnectContainer() {
      return and();
    }
    
  
  }
  public class DeploymentNested<N> extends DeploymentFluent<DeploymentNested<N>> implements Nested<N>{
    DeploymentNested(Deployment item) {
      this.builder = new DeploymentBuilder(this, item);
    }
    DeploymentBuilder builder;
    
    public N and() {
      return (N) TemplateFluent.this.withDeployment(builder.build());
    }
    
    public N endDeployment() {
      return and();
    }
    
  
  }
  public class HeadlessServiceNested<N> extends HeadlessServiceFluent<HeadlessServiceNested<N>> implements Nested<N>{
    HeadlessServiceNested(HeadlessService item) {
      this.builder = new HeadlessServiceBuilder(this, item);
    }
    HeadlessServiceBuilder builder;
    
    public N and() {
      return (N) TemplateFluent.this.withHeadlessService(builder.build());
    }
    
    public N endHeadlessService() {
      return and();
    }
    
  
  }
  public class InitContainerNested<N> extends InitContainerFluent<InitContainerNested<N>> implements Nested<N>{
    InitContainerNested(InitContainer item) {
      this.builder = new InitContainerBuilder(this, item);
    }
    InitContainerBuilder builder;
    
    public N and() {
      return (N) TemplateFluent.this.withInitContainer(builder.build());
    }
    
    public N endInitContainer() {
      return and();
    }
    
  
  }
  public class JmxSecretNested<N> extends JmxSecretFluent<JmxSecretNested<N>> implements Nested<N>{
    JmxSecretNested(JmxSecret item) {
      this.builder = new JmxSecretBuilder(this, item);
    }
    JmxSecretBuilder builder;
    
    public N and() {
      return (N) TemplateFluent.this.withJmxSecret(builder.build());
    }
    
    public N endJmxSecret() {
      return and();
    }
    
  
  }
  public class PodNested<N> extends PodFluent<PodNested<N>> implements Nested<N>{
    PodNested(Pod item) {
      this.builder = new PodBuilder(this, item);
    }
    PodBuilder builder;
    
    public N and() {
      return (N) TemplateFluent.this.withPod(builder.build());
    }
    
    public N endPod() {
      return and();
    }
    
  
  }
  public class PodDisruptionBudgetNested<N> extends PodDisruptionBudgetFluent<PodDisruptionBudgetNested<N>> implements Nested<N>{
    PodDisruptionBudgetNested(PodDisruptionBudget item) {
      this.builder = new PodDisruptionBudgetBuilder(this, item);
    }
    PodDisruptionBudgetBuilder builder;
    
    public N and() {
      return (N) TemplateFluent.this.withPodDisruptionBudget(builder.build());
    }
    
    public N endPodDisruptionBudget() {
      return and();
    }
    
  
  }
  public class PodSetNested<N> extends PodSetFluent<PodSetNested<N>> implements Nested<N>{
    PodSetNested(PodSet item) {
      this.builder = new PodSetBuilder(this, item);
    }
    PodSetBuilder builder;
    
    public N and() {
      return (N) TemplateFluent.this.withPodSet(builder.build());
    }
    
    public N endPodSet() {
      return and();
    }
    
  
  }
  public class ServiceAccountNested<N> extends ServiceAccountFluent<ServiceAccountNested<N>> implements Nested<N>{
    ServiceAccountNested(ServiceAccount item) {
      this.builder = new ServiceAccountBuilder(this, item);
    }
    ServiceAccountBuilder builder;
    
    public N and() {
      return (N) TemplateFluent.this.withServiceAccount(builder.build());
    }
    
    public N endServiceAccount() {
      return and();
    }
    
  
  }

}