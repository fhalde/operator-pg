package cli.strimzi.kafka.v1beta2;

import cli.strimzi.kafka.v1beta2.kafkaconnectspec.ReadinessProbe;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.RackBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.TemplateBuilder;
import java.lang.String;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.ConfigFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.JmxOptionsFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.Template;
import java.util.LinkedHashMap;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.Build;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.ResourcesBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.LoggingBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.ExternalConfigurationFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.Logging;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.LivenessProbe;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.BuildFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.ExternalConfigurationBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.RackFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.TlsFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.BuildBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.MetricsConfigFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.ReadinessProbeFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.ReadinessProbeBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.LoggingFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.JvmOptions;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.LivenessProbeFluent;
import java.lang.Long;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.ResourcesFluent;
import java.lang.Object;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.Resources;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.Tracing;
import java.util.Map;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.JvmOptionsFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.JmxOptions;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.Config;
import java.lang.SuppressWarnings;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.JvmOptionsBuilder;
import io.fabric8.kubernetes.api.builder.Nested;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.MetricsConfig;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.Rack;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.AuthenticationFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.ConfigBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.TemplateFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.Tls;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.TlsBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.AuthenticationBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.MetricsConfigBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.TracingBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.TracingFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.LivenessProbeBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.JmxOptionsBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.Authentication;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.ExternalConfiguration;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class KafkaConnectSpecFluent<A extends KafkaConnectSpecFluent<A>> extends BaseFluent<A>{
  public KafkaConnectSpecFluent() {
  }
  
  public KafkaConnectSpecFluent(KafkaConnectSpec instance) {
    this.copyInstance(instance);
  }
  private AuthenticationBuilder authentication;
  private String bootstrapServers;
  private BuildBuilder build;
  private String clientRackInitImage;
  private ConfigBuilder config;
  private ExternalConfigurationBuilder externalConfiguration;
  private String image;
  private JmxOptionsBuilder jmxOptions;
  private JvmOptionsBuilder jvmOptions;
  private LivenessProbeBuilder livenessProbe;
  private LoggingBuilder logging;
  private MetricsConfigBuilder metricsConfig;
  private RackBuilder rack;
  private ReadinessProbeBuilder readinessProbe;
  private Long replicas;
  private ResourcesBuilder resources;
  private TemplateBuilder template;
  private TlsBuilder tls;
  private TracingBuilder tracing;
  private String version;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(KafkaConnectSpec instance) {
    instance = (instance != null ? instance : new KafkaConnectSpec());
    if (instance != null) {
          this.withAuthentication(instance.getAuthentication());
          this.withBootstrapServers(instance.getBootstrapServers());
          this.withBuild(instance.getBuild());
          this.withClientRackInitImage(instance.getClientRackInitImage());
          this.withConfig(instance.getConfig());
          this.withExternalConfiguration(instance.getExternalConfiguration());
          this.withImage(instance.getImage());
          this.withJmxOptions(instance.getJmxOptions());
          this.withJvmOptions(instance.getJvmOptions());
          this.withLivenessProbe(instance.getLivenessProbe());
          this.withLogging(instance.getLogging());
          this.withMetricsConfig(instance.getMetricsConfig());
          this.withRack(instance.getRack());
          this.withReadinessProbe(instance.getReadinessProbe());
          this.withReplicas(instance.getReplicas());
          this.withResources(instance.getResources());
          this.withTemplate(instance.getTemplate());
          this.withTls(instance.getTls());
          this.withTracing(instance.getTracing());
          this.withVersion(instance.getVersion());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public Authentication buildAuthentication() {
    return this.authentication != null ? this.authentication.build() : null;
  }
  
  public A withAuthentication(Authentication authentication) {
    this._visitables.remove("authentication");
    if (authentication != null) {
        this.authentication = new AuthenticationBuilder(authentication);
        this._visitables.get("authentication").add(this.authentication);
    } else {
        this.authentication = null;
        this._visitables.get("authentication").remove(this.authentication);
    }
    return (A) this;
  }
  
  public boolean hasAuthentication() {
    return this.authentication != null;
  }
  
  public AuthenticationNested<A> withNewAuthentication() {
    return new AuthenticationNested(null);
  }
  
  public AuthenticationNested<A> withNewAuthenticationLike(Authentication item) {
    return new AuthenticationNested(item);
  }
  
  public AuthenticationNested<A> editAuthentication() {
    return withNewAuthenticationLike(java.util.Optional.ofNullable(buildAuthentication()).orElse(null));
  }
  
  public AuthenticationNested<A> editOrNewAuthentication() {
    return withNewAuthenticationLike(java.util.Optional.ofNullable(buildAuthentication()).orElse(new AuthenticationBuilder().build()));
  }
  
  public AuthenticationNested<A> editOrNewAuthenticationLike(Authentication item) {
    return withNewAuthenticationLike(java.util.Optional.ofNullable(buildAuthentication()).orElse(item));
  }
  
  public String getBootstrapServers() {
    return this.bootstrapServers;
  }
  
  public A withBootstrapServers(String bootstrapServers) {
    this.bootstrapServers = bootstrapServers;
    return (A) this;
  }
  
  public boolean hasBootstrapServers() {
    return this.bootstrapServers != null;
  }
  
  public Build buildBuild() {
    return this.build != null ? this.build.build() : null;
  }
  
  public A withBuild(Build build) {
    this._visitables.remove("build");
    if (build != null) {
        this.build = new BuildBuilder(build);
        this._visitables.get("build").add(this.build);
    } else {
        this.build = null;
        this._visitables.get("build").remove(this.build);
    }
    return (A) this;
  }
  
  public boolean hasBuild() {
    return this.build != null;
  }
  
  public BuildNested<A> withNewBuild() {
    return new BuildNested(null);
  }
  
  public BuildNested<A> withNewBuildLike(Build item) {
    return new BuildNested(item);
  }
  
  public BuildNested<A> editBuild() {
    return withNewBuildLike(java.util.Optional.ofNullable(buildBuild()).orElse(null));
  }
  
  public BuildNested<A> editOrNewBuild() {
    return withNewBuildLike(java.util.Optional.ofNullable(buildBuild()).orElse(new BuildBuilder().build()));
  }
  
  public BuildNested<A> editOrNewBuildLike(Build item) {
    return withNewBuildLike(java.util.Optional.ofNullable(buildBuild()).orElse(item));
  }
  
  public String getClientRackInitImage() {
    return this.clientRackInitImage;
  }
  
  public A withClientRackInitImage(String clientRackInitImage) {
    this.clientRackInitImage = clientRackInitImage;
    return (A) this;
  }
  
  public boolean hasClientRackInitImage() {
    return this.clientRackInitImage != null;
  }
  
  public Config buildConfig() {
    return this.config != null ? this.config.build() : null;
  }
  
  public A withConfig(Config config) {
    this._visitables.remove("config");
    if (config != null) {
        this.config = new ConfigBuilder(config);
        this._visitables.get("config").add(this.config);
    } else {
        this.config = null;
        this._visitables.get("config").remove(this.config);
    }
    return (A) this;
  }
  
  public boolean hasConfig() {
    return this.config != null;
  }
  
  public ConfigNested<A> withNewConfig() {
    return new ConfigNested(null);
  }
  
  public ConfigNested<A> withNewConfigLike(Config item) {
    return new ConfigNested(item);
  }
  
  public ConfigNested<A> editConfig() {
    return withNewConfigLike(java.util.Optional.ofNullable(buildConfig()).orElse(null));
  }
  
  public ConfigNested<A> editOrNewConfig() {
    return withNewConfigLike(java.util.Optional.ofNullable(buildConfig()).orElse(new ConfigBuilder().build()));
  }
  
  public ConfigNested<A> editOrNewConfigLike(Config item) {
    return withNewConfigLike(java.util.Optional.ofNullable(buildConfig()).orElse(item));
  }
  
  public ExternalConfiguration buildExternalConfiguration() {
    return this.externalConfiguration != null ? this.externalConfiguration.build() : null;
  }
  
  public A withExternalConfiguration(ExternalConfiguration externalConfiguration) {
    this._visitables.remove("externalConfiguration");
    if (externalConfiguration != null) {
        this.externalConfiguration = new ExternalConfigurationBuilder(externalConfiguration);
        this._visitables.get("externalConfiguration").add(this.externalConfiguration);
    } else {
        this.externalConfiguration = null;
        this._visitables.get("externalConfiguration").remove(this.externalConfiguration);
    }
    return (A) this;
  }
  
  public boolean hasExternalConfiguration() {
    return this.externalConfiguration != null;
  }
  
  public ExternalConfigurationNested<A> withNewExternalConfiguration() {
    return new ExternalConfigurationNested(null);
  }
  
  public ExternalConfigurationNested<A> withNewExternalConfigurationLike(ExternalConfiguration item) {
    return new ExternalConfigurationNested(item);
  }
  
  public ExternalConfigurationNested<A> editExternalConfiguration() {
    return withNewExternalConfigurationLike(java.util.Optional.ofNullable(buildExternalConfiguration()).orElse(null));
  }
  
  public ExternalConfigurationNested<A> editOrNewExternalConfiguration() {
    return withNewExternalConfigurationLike(java.util.Optional.ofNullable(buildExternalConfiguration()).orElse(new ExternalConfigurationBuilder().build()));
  }
  
  public ExternalConfigurationNested<A> editOrNewExternalConfigurationLike(ExternalConfiguration item) {
    return withNewExternalConfigurationLike(java.util.Optional.ofNullable(buildExternalConfiguration()).orElse(item));
  }
  
  public String getImage() {
    return this.image;
  }
  
  public A withImage(String image) {
    this.image = image;
    return (A) this;
  }
  
  public boolean hasImage() {
    return this.image != null;
  }
  
  public JmxOptions buildJmxOptions() {
    return this.jmxOptions != null ? this.jmxOptions.build() : null;
  }
  
  public A withJmxOptions(JmxOptions jmxOptions) {
    this._visitables.remove("jmxOptions");
    if (jmxOptions != null) {
        this.jmxOptions = new JmxOptionsBuilder(jmxOptions);
        this._visitables.get("jmxOptions").add(this.jmxOptions);
    } else {
        this.jmxOptions = null;
        this._visitables.get("jmxOptions").remove(this.jmxOptions);
    }
    return (A) this;
  }
  
  public boolean hasJmxOptions() {
    return this.jmxOptions != null;
  }
  
  public JmxOptionsNested<A> withNewJmxOptions() {
    return new JmxOptionsNested(null);
  }
  
  public JmxOptionsNested<A> withNewJmxOptionsLike(JmxOptions item) {
    return new JmxOptionsNested(item);
  }
  
  public JmxOptionsNested<A> editJmxOptions() {
    return withNewJmxOptionsLike(java.util.Optional.ofNullable(buildJmxOptions()).orElse(null));
  }
  
  public JmxOptionsNested<A> editOrNewJmxOptions() {
    return withNewJmxOptionsLike(java.util.Optional.ofNullable(buildJmxOptions()).orElse(new JmxOptionsBuilder().build()));
  }
  
  public JmxOptionsNested<A> editOrNewJmxOptionsLike(JmxOptions item) {
    return withNewJmxOptionsLike(java.util.Optional.ofNullable(buildJmxOptions()).orElse(item));
  }
  
  public JvmOptions buildJvmOptions() {
    return this.jvmOptions != null ? this.jvmOptions.build() : null;
  }
  
  public A withJvmOptions(JvmOptions jvmOptions) {
    this._visitables.remove("jvmOptions");
    if (jvmOptions != null) {
        this.jvmOptions = new JvmOptionsBuilder(jvmOptions);
        this._visitables.get("jvmOptions").add(this.jvmOptions);
    } else {
        this.jvmOptions = null;
        this._visitables.get("jvmOptions").remove(this.jvmOptions);
    }
    return (A) this;
  }
  
  public boolean hasJvmOptions() {
    return this.jvmOptions != null;
  }
  
  public JvmOptionsNested<A> withNewJvmOptions() {
    return new JvmOptionsNested(null);
  }
  
  public JvmOptionsNested<A> withNewJvmOptionsLike(JvmOptions item) {
    return new JvmOptionsNested(item);
  }
  
  public JvmOptionsNested<A> editJvmOptions() {
    return withNewJvmOptionsLike(java.util.Optional.ofNullable(buildJvmOptions()).orElse(null));
  }
  
  public JvmOptionsNested<A> editOrNewJvmOptions() {
    return withNewJvmOptionsLike(java.util.Optional.ofNullable(buildJvmOptions()).orElse(new JvmOptionsBuilder().build()));
  }
  
  public JvmOptionsNested<A> editOrNewJvmOptionsLike(JvmOptions item) {
    return withNewJvmOptionsLike(java.util.Optional.ofNullable(buildJvmOptions()).orElse(item));
  }
  
  public LivenessProbe buildLivenessProbe() {
    return this.livenessProbe != null ? this.livenessProbe.build() : null;
  }
  
  public A withLivenessProbe(LivenessProbe livenessProbe) {
    this._visitables.remove("livenessProbe");
    if (livenessProbe != null) {
        this.livenessProbe = new LivenessProbeBuilder(livenessProbe);
        this._visitables.get("livenessProbe").add(this.livenessProbe);
    } else {
        this.livenessProbe = null;
        this._visitables.get("livenessProbe").remove(this.livenessProbe);
    }
    return (A) this;
  }
  
  public boolean hasLivenessProbe() {
    return this.livenessProbe != null;
  }
  
  public LivenessProbeNested<A> withNewLivenessProbe() {
    return new LivenessProbeNested(null);
  }
  
  public LivenessProbeNested<A> withNewLivenessProbeLike(LivenessProbe item) {
    return new LivenessProbeNested(item);
  }
  
  public LivenessProbeNested<A> editLivenessProbe() {
    return withNewLivenessProbeLike(java.util.Optional.ofNullable(buildLivenessProbe()).orElse(null));
  }
  
  public LivenessProbeNested<A> editOrNewLivenessProbe() {
    return withNewLivenessProbeLike(java.util.Optional.ofNullable(buildLivenessProbe()).orElse(new LivenessProbeBuilder().build()));
  }
  
  public LivenessProbeNested<A> editOrNewLivenessProbeLike(LivenessProbe item) {
    return withNewLivenessProbeLike(java.util.Optional.ofNullable(buildLivenessProbe()).orElse(item));
  }
  
  public Logging buildLogging() {
    return this.logging != null ? this.logging.build() : null;
  }
  
  public A withLogging(Logging logging) {
    this._visitables.remove("logging");
    if (logging != null) {
        this.logging = new LoggingBuilder(logging);
        this._visitables.get("logging").add(this.logging);
    } else {
        this.logging = null;
        this._visitables.get("logging").remove(this.logging);
    }
    return (A) this;
  }
  
  public boolean hasLogging() {
    return this.logging != null;
  }
  
  public LoggingNested<A> withNewLogging() {
    return new LoggingNested(null);
  }
  
  public LoggingNested<A> withNewLoggingLike(Logging item) {
    return new LoggingNested(item);
  }
  
  public LoggingNested<A> editLogging() {
    return withNewLoggingLike(java.util.Optional.ofNullable(buildLogging()).orElse(null));
  }
  
  public LoggingNested<A> editOrNewLogging() {
    return withNewLoggingLike(java.util.Optional.ofNullable(buildLogging()).orElse(new LoggingBuilder().build()));
  }
  
  public LoggingNested<A> editOrNewLoggingLike(Logging item) {
    return withNewLoggingLike(java.util.Optional.ofNullable(buildLogging()).orElse(item));
  }
  
  public MetricsConfig buildMetricsConfig() {
    return this.metricsConfig != null ? this.metricsConfig.build() : null;
  }
  
  public A withMetricsConfig(MetricsConfig metricsConfig) {
    this._visitables.remove("metricsConfig");
    if (metricsConfig != null) {
        this.metricsConfig = new MetricsConfigBuilder(metricsConfig);
        this._visitables.get("metricsConfig").add(this.metricsConfig);
    } else {
        this.metricsConfig = null;
        this._visitables.get("metricsConfig").remove(this.metricsConfig);
    }
    return (A) this;
  }
  
  public boolean hasMetricsConfig() {
    return this.metricsConfig != null;
  }
  
  public MetricsConfigNested<A> withNewMetricsConfig() {
    return new MetricsConfigNested(null);
  }
  
  public MetricsConfigNested<A> withNewMetricsConfigLike(MetricsConfig item) {
    return new MetricsConfigNested(item);
  }
  
  public MetricsConfigNested<A> editMetricsConfig() {
    return withNewMetricsConfigLike(java.util.Optional.ofNullable(buildMetricsConfig()).orElse(null));
  }
  
  public MetricsConfigNested<A> editOrNewMetricsConfig() {
    return withNewMetricsConfigLike(java.util.Optional.ofNullable(buildMetricsConfig()).orElse(new MetricsConfigBuilder().build()));
  }
  
  public MetricsConfigNested<A> editOrNewMetricsConfigLike(MetricsConfig item) {
    return withNewMetricsConfigLike(java.util.Optional.ofNullable(buildMetricsConfig()).orElse(item));
  }
  
  public Rack buildRack() {
    return this.rack != null ? this.rack.build() : null;
  }
  
  public A withRack(Rack rack) {
    this._visitables.remove("rack");
    if (rack != null) {
        this.rack = new RackBuilder(rack);
        this._visitables.get("rack").add(this.rack);
    } else {
        this.rack = null;
        this._visitables.get("rack").remove(this.rack);
    }
    return (A) this;
  }
  
  public boolean hasRack() {
    return this.rack != null;
  }
  
  public RackNested<A> withNewRack() {
    return new RackNested(null);
  }
  
  public RackNested<A> withNewRackLike(Rack item) {
    return new RackNested(item);
  }
  
  public RackNested<A> editRack() {
    return withNewRackLike(java.util.Optional.ofNullable(buildRack()).orElse(null));
  }
  
  public RackNested<A> editOrNewRack() {
    return withNewRackLike(java.util.Optional.ofNullable(buildRack()).orElse(new RackBuilder().build()));
  }
  
  public RackNested<A> editOrNewRackLike(Rack item) {
    return withNewRackLike(java.util.Optional.ofNullable(buildRack()).orElse(item));
  }
  
  public ReadinessProbe buildReadinessProbe() {
    return this.readinessProbe != null ? this.readinessProbe.build() : null;
  }
  
  public A withReadinessProbe(ReadinessProbe readinessProbe) {
    this._visitables.remove("readinessProbe");
    if (readinessProbe != null) {
        this.readinessProbe = new ReadinessProbeBuilder(readinessProbe);
        this._visitables.get("readinessProbe").add(this.readinessProbe);
    } else {
        this.readinessProbe = null;
        this._visitables.get("readinessProbe").remove(this.readinessProbe);
    }
    return (A) this;
  }
  
  public boolean hasReadinessProbe() {
    return this.readinessProbe != null;
  }
  
  public ReadinessProbeNested<A> withNewReadinessProbe() {
    return new ReadinessProbeNested(null);
  }
  
  public ReadinessProbeNested<A> withNewReadinessProbeLike(ReadinessProbe item) {
    return new ReadinessProbeNested(item);
  }
  
  public ReadinessProbeNested<A> editReadinessProbe() {
    return withNewReadinessProbeLike(java.util.Optional.ofNullable(buildReadinessProbe()).orElse(null));
  }
  
  public ReadinessProbeNested<A> editOrNewReadinessProbe() {
    return withNewReadinessProbeLike(java.util.Optional.ofNullable(buildReadinessProbe()).orElse(new ReadinessProbeBuilder().build()));
  }
  
  public ReadinessProbeNested<A> editOrNewReadinessProbeLike(ReadinessProbe item) {
    return withNewReadinessProbeLike(java.util.Optional.ofNullable(buildReadinessProbe()).orElse(item));
  }
  
  public Long getReplicas() {
    return this.replicas;
  }
  
  public A withReplicas(Long replicas) {
    this.replicas = replicas;
    return (A) this;
  }
  
  public boolean hasReplicas() {
    return this.replicas != null;
  }
  
  public Resources buildResources() {
    return this.resources != null ? this.resources.build() : null;
  }
  
  public A withResources(Resources resources) {
    this._visitables.remove("resources");
    if (resources != null) {
        this.resources = new ResourcesBuilder(resources);
        this._visitables.get("resources").add(this.resources);
    } else {
        this.resources = null;
        this._visitables.get("resources").remove(this.resources);
    }
    return (A) this;
  }
  
  public boolean hasResources() {
    return this.resources != null;
  }
  
  public ResourcesNested<A> withNewResources() {
    return new ResourcesNested(null);
  }
  
  public ResourcesNested<A> withNewResourcesLike(Resources item) {
    return new ResourcesNested(item);
  }
  
  public ResourcesNested<A> editResources() {
    return withNewResourcesLike(java.util.Optional.ofNullable(buildResources()).orElse(null));
  }
  
  public ResourcesNested<A> editOrNewResources() {
    return withNewResourcesLike(java.util.Optional.ofNullable(buildResources()).orElse(new ResourcesBuilder().build()));
  }
  
  public ResourcesNested<A> editOrNewResourcesLike(Resources item) {
    return withNewResourcesLike(java.util.Optional.ofNullable(buildResources()).orElse(item));
  }
  
  public Template buildTemplate() {
    return this.template != null ? this.template.build() : null;
  }
  
  public A withTemplate(Template template) {
    this._visitables.remove("template");
    if (template != null) {
        this.template = new TemplateBuilder(template);
        this._visitables.get("template").add(this.template);
    } else {
        this.template = null;
        this._visitables.get("template").remove(this.template);
    }
    return (A) this;
  }
  
  public boolean hasTemplate() {
    return this.template != null;
  }
  
  public TemplateNested<A> withNewTemplate() {
    return new TemplateNested(null);
  }
  
  public TemplateNested<A> withNewTemplateLike(Template item) {
    return new TemplateNested(item);
  }
  
  public TemplateNested<A> editTemplate() {
    return withNewTemplateLike(java.util.Optional.ofNullable(buildTemplate()).orElse(null));
  }
  
  public TemplateNested<A> editOrNewTemplate() {
    return withNewTemplateLike(java.util.Optional.ofNullable(buildTemplate()).orElse(new TemplateBuilder().build()));
  }
  
  public TemplateNested<A> editOrNewTemplateLike(Template item) {
    return withNewTemplateLike(java.util.Optional.ofNullable(buildTemplate()).orElse(item));
  }
  
  public Tls buildTls() {
    return this.tls != null ? this.tls.build() : null;
  }
  
  public A withTls(Tls tls) {
    this._visitables.remove("tls");
    if (tls != null) {
        this.tls = new TlsBuilder(tls);
        this._visitables.get("tls").add(this.tls);
    } else {
        this.tls = null;
        this._visitables.get("tls").remove(this.tls);
    }
    return (A) this;
  }
  
  public boolean hasTls() {
    return this.tls != null;
  }
  
  public TlsNested<A> withNewTls() {
    return new TlsNested(null);
  }
  
  public TlsNested<A> withNewTlsLike(Tls item) {
    return new TlsNested(item);
  }
  
  public TlsNested<A> editTls() {
    return withNewTlsLike(java.util.Optional.ofNullable(buildTls()).orElse(null));
  }
  
  public TlsNested<A> editOrNewTls() {
    return withNewTlsLike(java.util.Optional.ofNullable(buildTls()).orElse(new TlsBuilder().build()));
  }
  
  public TlsNested<A> editOrNewTlsLike(Tls item) {
    return withNewTlsLike(java.util.Optional.ofNullable(buildTls()).orElse(item));
  }
  
  public Tracing buildTracing() {
    return this.tracing != null ? this.tracing.build() : null;
  }
  
  public A withTracing(Tracing tracing) {
    this._visitables.remove("tracing");
    if (tracing != null) {
        this.tracing = new TracingBuilder(tracing);
        this._visitables.get("tracing").add(this.tracing);
    } else {
        this.tracing = null;
        this._visitables.get("tracing").remove(this.tracing);
    }
    return (A) this;
  }
  
  public boolean hasTracing() {
    return this.tracing != null;
  }
  
  public TracingNested<A> withNewTracing() {
    return new TracingNested(null);
  }
  
  public TracingNested<A> withNewTracingLike(Tracing item) {
    return new TracingNested(item);
  }
  
  public TracingNested<A> editTracing() {
    return withNewTracingLike(java.util.Optional.ofNullable(buildTracing()).orElse(null));
  }
  
  public TracingNested<A> editOrNewTracing() {
    return withNewTracingLike(java.util.Optional.ofNullable(buildTracing()).orElse(new TracingBuilder().build()));
  }
  
  public TracingNested<A> editOrNewTracingLike(Tracing item) {
    return withNewTracingLike(java.util.Optional.ofNullable(buildTracing()).orElse(item));
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }
  
  public boolean hasVersion() {
    return this.version != null;
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
    KafkaConnectSpecFluent that = (KafkaConnectSpecFluent) o;
    if (!java.util.Objects.equals(authentication, that.authentication)) return false;
    if (!java.util.Objects.equals(bootstrapServers, that.bootstrapServers)) return false;
    if (!java.util.Objects.equals(build, that.build)) return false;
    if (!java.util.Objects.equals(clientRackInitImage, that.clientRackInitImage)) return false;
    if (!java.util.Objects.equals(config, that.config)) return false;
    if (!java.util.Objects.equals(externalConfiguration, that.externalConfiguration)) return false;
    if (!java.util.Objects.equals(image, that.image)) return false;
    if (!java.util.Objects.equals(jmxOptions, that.jmxOptions)) return false;
    if (!java.util.Objects.equals(jvmOptions, that.jvmOptions)) return false;
    if (!java.util.Objects.equals(livenessProbe, that.livenessProbe)) return false;
    if (!java.util.Objects.equals(logging, that.logging)) return false;
    if (!java.util.Objects.equals(metricsConfig, that.metricsConfig)) return false;
    if (!java.util.Objects.equals(rack, that.rack)) return false;
    if (!java.util.Objects.equals(readinessProbe, that.readinessProbe)) return false;
    if (!java.util.Objects.equals(replicas, that.replicas)) return false;
    if (!java.util.Objects.equals(resources, that.resources)) return false;
    if (!java.util.Objects.equals(template, that.template)) return false;
    if (!java.util.Objects.equals(tls, that.tls)) return false;
    if (!java.util.Objects.equals(tracing, that.tracing)) return false;
    if (!java.util.Objects.equals(version, that.version)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(authentication,  bootstrapServers,  build,  clientRackInitImage,  config,  externalConfiguration,  image,  jmxOptions,  jvmOptions,  livenessProbe,  logging,  metricsConfig,  rack,  readinessProbe,  replicas,  resources,  template,  tls,  tracing,  version,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (authentication != null) { sb.append("authentication:"); sb.append(authentication + ","); }
    if (bootstrapServers != null) { sb.append("bootstrapServers:"); sb.append(bootstrapServers + ","); }
    if (build != null) { sb.append("build:"); sb.append(build + ","); }
    if (clientRackInitImage != null) { sb.append("clientRackInitImage:"); sb.append(clientRackInitImage + ","); }
    if (config != null) { sb.append("config:"); sb.append(config + ","); }
    if (externalConfiguration != null) { sb.append("externalConfiguration:"); sb.append(externalConfiguration + ","); }
    if (image != null) { sb.append("image:"); sb.append(image + ","); }
    if (jmxOptions != null) { sb.append("jmxOptions:"); sb.append(jmxOptions + ","); }
    if (jvmOptions != null) { sb.append("jvmOptions:"); sb.append(jvmOptions + ","); }
    if (livenessProbe != null) { sb.append("livenessProbe:"); sb.append(livenessProbe + ","); }
    if (logging != null) { sb.append("logging:"); sb.append(logging + ","); }
    if (metricsConfig != null) { sb.append("metricsConfig:"); sb.append(metricsConfig + ","); }
    if (rack != null) { sb.append("rack:"); sb.append(rack + ","); }
    if (readinessProbe != null) { sb.append("readinessProbe:"); sb.append(readinessProbe + ","); }
    if (replicas != null) { sb.append("replicas:"); sb.append(replicas + ","); }
    if (resources != null) { sb.append("resources:"); sb.append(resources + ","); }
    if (template != null) { sb.append("template:"); sb.append(template + ","); }
    if (tls != null) { sb.append("tls:"); sb.append(tls + ","); }
    if (tracing != null) { sb.append("tracing:"); sb.append(tracing + ","); }
    if (version != null) { sb.append("version:"); sb.append(version + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class AuthenticationNested<N> extends AuthenticationFluent<AuthenticationNested<N>> implements Nested<N>{
    AuthenticationNested(Authentication item) {
      this.builder = new AuthenticationBuilder(this, item);
    }
    AuthenticationBuilder builder;
    
    public N and() {
      return (N) KafkaConnectSpecFluent.this.withAuthentication(builder.build());
    }
    
    public N endAuthentication() {
      return and();
    }
    
  
  }
  public class BuildNested<N> extends BuildFluent<BuildNested<N>> implements Nested<N>{
    BuildNested(Build item) {
      this.builder = new BuildBuilder(this, item);
    }
    BuildBuilder builder;
    
    public N and() {
      return (N) KafkaConnectSpecFluent.this.withBuild(builder.build());
    }
    
    public N endBuild() {
      return and();
    }
    
  
  }
  public class ConfigNested<N> extends ConfigFluent<ConfigNested<N>> implements Nested<N>{
    ConfigNested(Config item) {
      this.builder = new ConfigBuilder(this, item);
    }
    ConfigBuilder builder;
    
    public N and() {
      return (N) KafkaConnectSpecFluent.this.withConfig(builder.build());
    }
    
    public N endConfig() {
      return and();
    }
    
  
  }
  public class ExternalConfigurationNested<N> extends ExternalConfigurationFluent<ExternalConfigurationNested<N>> implements Nested<N>{
    ExternalConfigurationNested(ExternalConfiguration item) {
      this.builder = new ExternalConfigurationBuilder(this, item);
    }
    ExternalConfigurationBuilder builder;
    
    public N and() {
      return (N) KafkaConnectSpecFluent.this.withExternalConfiguration(builder.build());
    }
    
    public N endExternalConfiguration() {
      return and();
    }
    
  
  }
  public class JmxOptionsNested<N> extends JmxOptionsFluent<JmxOptionsNested<N>> implements Nested<N>{
    JmxOptionsNested(JmxOptions item) {
      this.builder = new JmxOptionsBuilder(this, item);
    }
    JmxOptionsBuilder builder;
    
    public N and() {
      return (N) KafkaConnectSpecFluent.this.withJmxOptions(builder.build());
    }
    
    public N endJmxOptions() {
      return and();
    }
    
  
  }
  public class JvmOptionsNested<N> extends JvmOptionsFluent<JvmOptionsNested<N>> implements Nested<N>{
    JvmOptionsNested(JvmOptions item) {
      this.builder = new JvmOptionsBuilder(this, item);
    }
    JvmOptionsBuilder builder;
    
    public N and() {
      return (N) KafkaConnectSpecFluent.this.withJvmOptions(builder.build());
    }
    
    public N endJvmOptions() {
      return and();
    }
    
  
  }
  public class LivenessProbeNested<N> extends LivenessProbeFluent<LivenessProbeNested<N>> implements Nested<N>{
    LivenessProbeNested(LivenessProbe item) {
      this.builder = new LivenessProbeBuilder(this, item);
    }
    LivenessProbeBuilder builder;
    
    public N and() {
      return (N) KafkaConnectSpecFluent.this.withLivenessProbe(builder.build());
    }
    
    public N endLivenessProbe() {
      return and();
    }
    
  
  }
  public class LoggingNested<N> extends LoggingFluent<LoggingNested<N>> implements Nested<N>{
    LoggingNested(Logging item) {
      this.builder = new LoggingBuilder(this, item);
    }
    LoggingBuilder builder;
    
    public N and() {
      return (N) KafkaConnectSpecFluent.this.withLogging(builder.build());
    }
    
    public N endLogging() {
      return and();
    }
    
  
  }
  public class MetricsConfigNested<N> extends MetricsConfigFluent<MetricsConfigNested<N>> implements Nested<N>{
    MetricsConfigNested(MetricsConfig item) {
      this.builder = new MetricsConfigBuilder(this, item);
    }
    MetricsConfigBuilder builder;
    
    public N and() {
      return (N) KafkaConnectSpecFluent.this.withMetricsConfig(builder.build());
    }
    
    public N endMetricsConfig() {
      return and();
    }
    
  
  }
  public class RackNested<N> extends RackFluent<RackNested<N>> implements Nested<N>{
    RackNested(Rack item) {
      this.builder = new RackBuilder(this, item);
    }
    RackBuilder builder;
    
    public N and() {
      return (N) KafkaConnectSpecFluent.this.withRack(builder.build());
    }
    
    public N endRack() {
      return and();
    }
    
  
  }
  public class ReadinessProbeNested<N> extends ReadinessProbeFluent<ReadinessProbeNested<N>> implements Nested<N>{
    ReadinessProbeNested(ReadinessProbe item) {
      this.builder = new ReadinessProbeBuilder(this, item);
    }
    ReadinessProbeBuilder builder;
    
    public N and() {
      return (N) KafkaConnectSpecFluent.this.withReadinessProbe(builder.build());
    }
    
    public N endReadinessProbe() {
      return and();
    }
    
  
  }
  public class ResourcesNested<N> extends ResourcesFluent<ResourcesNested<N>> implements Nested<N>{
    ResourcesNested(Resources item) {
      this.builder = new ResourcesBuilder(this, item);
    }
    ResourcesBuilder builder;
    
    public N and() {
      return (N) KafkaConnectSpecFluent.this.withResources(builder.build());
    }
    
    public N endResources() {
      return and();
    }
    
  
  }
  public class TemplateNested<N> extends TemplateFluent<TemplateNested<N>> implements Nested<N>{
    TemplateNested(Template item) {
      this.builder = new TemplateBuilder(this, item);
    }
    TemplateBuilder builder;
    
    public N and() {
      return (N) KafkaConnectSpecFluent.this.withTemplate(builder.build());
    }
    
    public N endTemplate() {
      return and();
    }
    
  
  }
  public class TlsNested<N> extends TlsFluent<TlsNested<N>> implements Nested<N>{
    TlsNested(Tls item) {
      this.builder = new TlsBuilder(this, item);
    }
    TlsBuilder builder;
    
    public N and() {
      return (N) KafkaConnectSpecFluent.this.withTls(builder.build());
    }
    
    public N endTls() {
      return and();
    }
    
  
  }
  public class TracingNested<N> extends TracingFluent<TracingNested<N>> implements Nested<N>{
    TracingNested(Tracing item) {
      this.builder = new TracingBuilder(this, item);
    }
    TracingBuilder builder;
    
    public N and() {
      return (N) KafkaConnectSpecFluent.this.withTracing(builder.build());
    }
    
    public N endTracing() {
      return and();
    }
    
  
  }

}