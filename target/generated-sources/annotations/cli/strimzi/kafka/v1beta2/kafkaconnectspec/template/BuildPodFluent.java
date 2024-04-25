package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.Tolerations;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.TolerationsBuilder;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.SecurityContextBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.TolerationsFluent;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.ImagePullSecretsFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.HostAliases;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.AffinityFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.SecurityContextFluent;
import java.lang.Long;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.Affinity;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.TopologySpreadConstraintsBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.AffinityBuilder;
import java.lang.SuppressWarnings;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.MetadataFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.TopologySpreadConstraints;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.Metadata;
import io.fabric8.kubernetes.api.builder.Nested;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.TopologySpreadConstraintsFluent;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.HostAliasesFluent;
import java.util.Iterator;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.MetadataBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.ImagePullSecrets;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.ImagePullSecretsBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.SecurityContext;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.HostAliasesBuilder;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class BuildPodFluent<A extends BuildPodFluent<A>> extends BaseFluent<A>{
  public BuildPodFluent() {
  }
  
  public BuildPodFluent(BuildPod instance) {
    this.copyInstance(instance);
  }
  private AffinityBuilder affinity;
  private Boolean enableServiceLinks;
  private ArrayList<HostAliasesBuilder> hostAliases;
  private ArrayList<ImagePullSecretsBuilder> imagePullSecrets;
  private MetadataBuilder metadata;
  private String priorityClassName;
  private String schedulerName;
  private SecurityContextBuilder securityContext;
  private Long terminationGracePeriodSeconds;
  private String tmpDirSizeLimit;
  private ArrayList<TolerationsBuilder> tolerations;
  private ArrayList<TopologySpreadConstraintsBuilder> topologySpreadConstraints;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(BuildPod instance) {
    instance = (instance != null ? instance : new BuildPod());
    if (instance != null) {
          this.withAffinity(instance.getAffinity());
          this.withEnableServiceLinks(instance.getEnableServiceLinks());
          this.withHostAliases(instance.getHostAliases());
          this.withImagePullSecrets(instance.getImagePullSecrets());
          this.withMetadata(instance.getMetadata());
          this.withPriorityClassName(instance.getPriorityClassName());
          this.withSchedulerName(instance.getSchedulerName());
          this.withSecurityContext(instance.getSecurityContext());
          this.withTerminationGracePeriodSeconds(instance.getTerminationGracePeriodSeconds());
          this.withTmpDirSizeLimit(instance.getTmpDirSizeLimit());
          this.withTolerations(instance.getTolerations());
          this.withTopologySpreadConstraints(instance.getTopologySpreadConstraints());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public Affinity buildAffinity() {
    return this.affinity != null ? this.affinity.build() : null;
  }
  
  public A withAffinity(Affinity affinity) {
    this._visitables.remove("affinity");
    if (affinity != null) {
        this.affinity = new AffinityBuilder(affinity);
        this._visitables.get("affinity").add(this.affinity);
    } else {
        this.affinity = null;
        this._visitables.get("affinity").remove(this.affinity);
    }
    return (A) this;
  }
  
  public boolean hasAffinity() {
    return this.affinity != null;
  }
  
  public AffinityNested<A> withNewAffinity() {
    return new AffinityNested(null);
  }
  
  public AffinityNested<A> withNewAffinityLike(Affinity item) {
    return new AffinityNested(item);
  }
  
  public AffinityNested<A> editAffinity() {
    return withNewAffinityLike(java.util.Optional.ofNullable(buildAffinity()).orElse(null));
  }
  
  public AffinityNested<A> editOrNewAffinity() {
    return withNewAffinityLike(java.util.Optional.ofNullable(buildAffinity()).orElse(new AffinityBuilder().build()));
  }
  
  public AffinityNested<A> editOrNewAffinityLike(Affinity item) {
    return withNewAffinityLike(java.util.Optional.ofNullable(buildAffinity()).orElse(item));
  }
  
  public Boolean getEnableServiceLinks() {
    return this.enableServiceLinks;
  }
  
  public A withEnableServiceLinks(Boolean enableServiceLinks) {
    this.enableServiceLinks = enableServiceLinks;
    return (A) this;
  }
  
  public boolean hasEnableServiceLinks() {
    return this.enableServiceLinks != null;
  }
  
  public A addToHostAliases(int index,HostAliases item) {
    if (this.hostAliases == null) {this.hostAliases = new ArrayList<HostAliasesBuilder>();}
    HostAliasesBuilder builder = new HostAliasesBuilder(item);
    if (index < 0 || index >= hostAliases.size()) { _visitables.get("hostAliases").add(builder); hostAliases.add(builder); } else { _visitables.get("hostAliases").add(index, builder); hostAliases.add(index, builder);}
    return (A)this;
  }
  
  public A setToHostAliases(int index,HostAliases item) {
    if (this.hostAliases == null) {this.hostAliases = new ArrayList<HostAliasesBuilder>();}
    HostAliasesBuilder builder = new HostAliasesBuilder(item);
    if (index < 0 || index >= hostAliases.size()) { _visitables.get("hostAliases").add(builder); hostAliases.add(builder); } else { _visitables.get("hostAliases").set(index, builder); hostAliases.set(index, builder);}
    return (A)this;
  }
  
  public A addToHostAliases(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.HostAliases... items) {
    if (this.hostAliases == null) {this.hostAliases = new ArrayList<HostAliasesBuilder>();}
    for (HostAliases item : items) {HostAliasesBuilder builder = new HostAliasesBuilder(item);_visitables.get("hostAliases").add(builder);this.hostAliases.add(builder);} return (A)this;
  }
  
  public A addAllToHostAliases(Collection<HostAliases> items) {
    if (this.hostAliases == null) {this.hostAliases = new ArrayList<HostAliasesBuilder>();}
    for (HostAliases item : items) {HostAliasesBuilder builder = new HostAliasesBuilder(item);_visitables.get("hostAliases").add(builder);this.hostAliases.add(builder);} return (A)this;
  }
  
  public A removeFromHostAliases(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.HostAliases... items) {
    if (this.hostAliases == null) return (A)this;
    for (HostAliases item : items) {HostAliasesBuilder builder = new HostAliasesBuilder(item);_visitables.get("hostAliases").remove(builder); this.hostAliases.remove(builder);} return (A)this;
  }
  
  public A removeAllFromHostAliases(Collection<HostAliases> items) {
    if (this.hostAliases == null) return (A)this;
    for (HostAliases item : items) {HostAliasesBuilder builder = new HostAliasesBuilder(item);_visitables.get("hostAliases").remove(builder); this.hostAliases.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromHostAliases(Predicate<HostAliasesBuilder> predicate) {
    if (hostAliases == null) return (A) this;
    final Iterator<HostAliasesBuilder> each = hostAliases.iterator();
    final List visitables = _visitables.get("hostAliases");
    while (each.hasNext()) {
      HostAliasesBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<HostAliases> buildHostAliases() {
    return this.hostAliases != null ? build(hostAliases) : null;
  }
  
  public HostAliases buildHostAlias(int index) {
    return this.hostAliases.get(index).build();
  }
  
  public HostAliases buildFirstHostAlias() {
    return this.hostAliases.get(0).build();
  }
  
  public HostAliases buildLastHostAlias() {
    return this.hostAliases.get(hostAliases.size() - 1).build();
  }
  
  public HostAliases buildMatchingHostAlias(Predicate<HostAliasesBuilder> predicate) {
      for (HostAliasesBuilder item : hostAliases) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingHostAlias(Predicate<HostAliasesBuilder> predicate) {
      for (HostAliasesBuilder item : hostAliases) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withHostAliases(List<HostAliases> hostAliases) {
    if (this.hostAliases != null) {
      this._visitables.get("hostAliases").clear();
    }
    if (hostAliases != null) {
        this.hostAliases = new ArrayList();
        for (HostAliases item : hostAliases) {
          this.addToHostAliases(item);
        }
    } else {
      this.hostAliases = null;
    }
    return (A) this;
  }
  
  public A withHostAliases(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.HostAliases... hostAliases) {
    if (this.hostAliases != null) {
        this.hostAliases.clear();
        _visitables.remove("hostAliases");
    }
    if (hostAliases != null) {
      for (HostAliases item : hostAliases) {
        this.addToHostAliases(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasHostAliases() {
    return this.hostAliases != null && !this.hostAliases.isEmpty();
  }
  
  public HostAliasesNested<A> addNewHostAlias() {
    return new HostAliasesNested(-1, null);
  }
  
  public HostAliasesNested<A> addNewHostAliasLike(HostAliases item) {
    return new HostAliasesNested(-1, item);
  }
  
  public HostAliasesNested<A> setNewHostAliasLike(int index,HostAliases item) {
    return new HostAliasesNested(index, item);
  }
  
  public HostAliasesNested<A> editHostAlias(int index) {
    if (hostAliases.size() <= index) throw new RuntimeException("Can't edit hostAliases. Index exceeds size.");
    return setNewHostAliasLike(index, buildHostAlias(index));
  }
  
  public HostAliasesNested<A> editFirstHostAlias() {
    if (hostAliases.size() == 0) throw new RuntimeException("Can't edit first hostAliases. The list is empty.");
    return setNewHostAliasLike(0, buildHostAlias(0));
  }
  
  public HostAliasesNested<A> editLastHostAlias() {
    int index = hostAliases.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last hostAliases. The list is empty.");
    return setNewHostAliasLike(index, buildHostAlias(index));
  }
  
  public HostAliasesNested<A> editMatchingHostAlias(Predicate<HostAliasesBuilder> predicate) {
    int index = -1;
    for (int i=0;i<hostAliases.size();i++) { 
    if (predicate.test(hostAliases.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching hostAliases. No match found.");
    return setNewHostAliasLike(index, buildHostAlias(index));
  }
  
  public A addToImagePullSecrets(int index,ImagePullSecrets item) {
    if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<ImagePullSecretsBuilder>();}
    ImagePullSecretsBuilder builder = new ImagePullSecretsBuilder(item);
    if (index < 0 || index >= imagePullSecrets.size()) { _visitables.get("imagePullSecrets").add(builder); imagePullSecrets.add(builder); } else { _visitables.get("imagePullSecrets").add(index, builder); imagePullSecrets.add(index, builder);}
    return (A)this;
  }
  
  public A setToImagePullSecrets(int index,ImagePullSecrets item) {
    if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<ImagePullSecretsBuilder>();}
    ImagePullSecretsBuilder builder = new ImagePullSecretsBuilder(item);
    if (index < 0 || index >= imagePullSecrets.size()) { _visitables.get("imagePullSecrets").add(builder); imagePullSecrets.add(builder); } else { _visitables.get("imagePullSecrets").set(index, builder); imagePullSecrets.set(index, builder);}
    return (A)this;
  }
  
  public A addToImagePullSecrets(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.ImagePullSecrets... items) {
    if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<ImagePullSecretsBuilder>();}
    for (ImagePullSecrets item : items) {ImagePullSecretsBuilder builder = new ImagePullSecretsBuilder(item);_visitables.get("imagePullSecrets").add(builder);this.imagePullSecrets.add(builder);} return (A)this;
  }
  
  public A addAllToImagePullSecrets(Collection<ImagePullSecrets> items) {
    if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<ImagePullSecretsBuilder>();}
    for (ImagePullSecrets item : items) {ImagePullSecretsBuilder builder = new ImagePullSecretsBuilder(item);_visitables.get("imagePullSecrets").add(builder);this.imagePullSecrets.add(builder);} return (A)this;
  }
  
  public A removeFromImagePullSecrets(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.ImagePullSecrets... items) {
    if (this.imagePullSecrets == null) return (A)this;
    for (ImagePullSecrets item : items) {ImagePullSecretsBuilder builder = new ImagePullSecretsBuilder(item);_visitables.get("imagePullSecrets").remove(builder); this.imagePullSecrets.remove(builder);} return (A)this;
  }
  
  public A removeAllFromImagePullSecrets(Collection<ImagePullSecrets> items) {
    if (this.imagePullSecrets == null) return (A)this;
    for (ImagePullSecrets item : items) {ImagePullSecretsBuilder builder = new ImagePullSecretsBuilder(item);_visitables.get("imagePullSecrets").remove(builder); this.imagePullSecrets.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromImagePullSecrets(Predicate<ImagePullSecretsBuilder> predicate) {
    if (imagePullSecrets == null) return (A) this;
    final Iterator<ImagePullSecretsBuilder> each = imagePullSecrets.iterator();
    final List visitables = _visitables.get("imagePullSecrets");
    while (each.hasNext()) {
      ImagePullSecretsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<ImagePullSecrets> buildImagePullSecrets() {
    return this.imagePullSecrets != null ? build(imagePullSecrets) : null;
  }
  
  public ImagePullSecrets buildImagePullSecret(int index) {
    return this.imagePullSecrets.get(index).build();
  }
  
  public ImagePullSecrets buildFirstImagePullSecret() {
    return this.imagePullSecrets.get(0).build();
  }
  
  public ImagePullSecrets buildLastImagePullSecret() {
    return this.imagePullSecrets.get(imagePullSecrets.size() - 1).build();
  }
  
  public ImagePullSecrets buildMatchingImagePullSecret(Predicate<ImagePullSecretsBuilder> predicate) {
      for (ImagePullSecretsBuilder item : imagePullSecrets) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingImagePullSecret(Predicate<ImagePullSecretsBuilder> predicate) {
      for (ImagePullSecretsBuilder item : imagePullSecrets) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withImagePullSecrets(List<ImagePullSecrets> imagePullSecrets) {
    if (this.imagePullSecrets != null) {
      this._visitables.get("imagePullSecrets").clear();
    }
    if (imagePullSecrets != null) {
        this.imagePullSecrets = new ArrayList();
        for (ImagePullSecrets item : imagePullSecrets) {
          this.addToImagePullSecrets(item);
        }
    } else {
      this.imagePullSecrets = null;
    }
    return (A) this;
  }
  
  public A withImagePullSecrets(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.ImagePullSecrets... imagePullSecrets) {
    if (this.imagePullSecrets != null) {
        this.imagePullSecrets.clear();
        _visitables.remove("imagePullSecrets");
    }
    if (imagePullSecrets != null) {
      for (ImagePullSecrets item : imagePullSecrets) {
        this.addToImagePullSecrets(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasImagePullSecrets() {
    return this.imagePullSecrets != null && !this.imagePullSecrets.isEmpty();
  }
  
  public ImagePullSecretsNested<A> addNewImagePullSecret() {
    return new ImagePullSecretsNested(-1, null);
  }
  
  public ImagePullSecretsNested<A> addNewImagePullSecretLike(ImagePullSecrets item) {
    return new ImagePullSecretsNested(-1, item);
  }
  
  public ImagePullSecretsNested<A> setNewImagePullSecretLike(int index,ImagePullSecrets item) {
    return new ImagePullSecretsNested(index, item);
  }
  
  public ImagePullSecretsNested<A> editImagePullSecret(int index) {
    if (imagePullSecrets.size() <= index) throw new RuntimeException("Can't edit imagePullSecrets. Index exceeds size.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }
  
  public ImagePullSecretsNested<A> editFirstImagePullSecret() {
    if (imagePullSecrets.size() == 0) throw new RuntimeException("Can't edit first imagePullSecrets. The list is empty.");
    return setNewImagePullSecretLike(0, buildImagePullSecret(0));
  }
  
  public ImagePullSecretsNested<A> editLastImagePullSecret() {
    int index = imagePullSecrets.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last imagePullSecrets. The list is empty.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }
  
  public ImagePullSecretsNested<A> editMatchingImagePullSecret(Predicate<ImagePullSecretsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<imagePullSecrets.size();i++) { 
    if (predicate.test(imagePullSecrets.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching imagePullSecrets. No match found.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }
  
  public Metadata buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public A withMetadata(Metadata metadata) {
    this._visitables.remove("metadata");
    if (metadata != null) {
        this.metadata = new MetadataBuilder(metadata);
        this._visitables.get("metadata").add(this.metadata);
    } else {
        this.metadata = null;
        this._visitables.get("metadata").remove(this.metadata);
    }
    return (A) this;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(Metadata item) {
    return new MetadataNested(item);
  }
  
  public MetadataNested<A> editBuildpodMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(new MetadataBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(Metadata item) {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(item));
  }
  
  public String getPriorityClassName() {
    return this.priorityClassName;
  }
  
  public A withPriorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
    return (A) this;
  }
  
  public boolean hasPriorityClassName() {
    return this.priorityClassName != null;
  }
  
  public String getSchedulerName() {
    return this.schedulerName;
  }
  
  public A withSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
    return (A) this;
  }
  
  public boolean hasSchedulerName() {
    return this.schedulerName != null;
  }
  
  public SecurityContext buildSecurityContext() {
    return this.securityContext != null ? this.securityContext.build() : null;
  }
  
  public A withSecurityContext(SecurityContext securityContext) {
    this._visitables.remove("securityContext");
    if (securityContext != null) {
        this.securityContext = new SecurityContextBuilder(securityContext);
        this._visitables.get("securityContext").add(this.securityContext);
    } else {
        this.securityContext = null;
        this._visitables.get("securityContext").remove(this.securityContext);
    }
    return (A) this;
  }
  
  public boolean hasSecurityContext() {
    return this.securityContext != null;
  }
  
  public SecurityContextNested<A> withNewSecurityContext() {
    return new SecurityContextNested(null);
  }
  
  public SecurityContextNested<A> withNewSecurityContextLike(SecurityContext item) {
    return new SecurityContextNested(item);
  }
  
  public SecurityContextNested<A> editBuildpodSecurityContext() {
    return withNewSecurityContextLike(java.util.Optional.ofNullable(buildSecurityContext()).orElse(null));
  }
  
  public SecurityContextNested<A> editOrNewSecurityContext() {
    return withNewSecurityContextLike(java.util.Optional.ofNullable(buildSecurityContext()).orElse(new SecurityContextBuilder().build()));
  }
  
  public SecurityContextNested<A> editOrNewSecurityContextLike(SecurityContext item) {
    return withNewSecurityContextLike(java.util.Optional.ofNullable(buildSecurityContext()).orElse(item));
  }
  
  public Long getTerminationGracePeriodSeconds() {
    return this.terminationGracePeriodSeconds;
  }
  
  public A withTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    return (A) this;
  }
  
  public boolean hasTerminationGracePeriodSeconds() {
    return this.terminationGracePeriodSeconds != null;
  }
  
  public String getTmpDirSizeLimit() {
    return this.tmpDirSizeLimit;
  }
  
  public A withTmpDirSizeLimit(String tmpDirSizeLimit) {
    this.tmpDirSizeLimit = tmpDirSizeLimit;
    return (A) this;
  }
  
  public boolean hasTmpDirSizeLimit() {
    return this.tmpDirSizeLimit != null;
  }
  
  public A addToTolerations(int index,Tolerations item) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<TolerationsBuilder>();}
    TolerationsBuilder builder = new TolerationsBuilder(item);
    if (index < 0 || index >= tolerations.size()) { _visitables.get("tolerations").add(builder); tolerations.add(builder); } else { _visitables.get("tolerations").add(index, builder); tolerations.add(index, builder);}
    return (A)this;
  }
  
  public A setToTolerations(int index,Tolerations item) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<TolerationsBuilder>();}
    TolerationsBuilder builder = new TolerationsBuilder(item);
    if (index < 0 || index >= tolerations.size()) { _visitables.get("tolerations").add(builder); tolerations.add(builder); } else { _visitables.get("tolerations").set(index, builder); tolerations.set(index, builder);}
    return (A)this;
  }
  
  public A addToTolerations(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.Tolerations... items) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<TolerationsBuilder>();}
    for (Tolerations item : items) {TolerationsBuilder builder = new TolerationsBuilder(item);_visitables.get("tolerations").add(builder);this.tolerations.add(builder);} return (A)this;
  }
  
  public A addAllToTolerations(Collection<Tolerations> items) {
    if (this.tolerations == null) {this.tolerations = new ArrayList<TolerationsBuilder>();}
    for (Tolerations item : items) {TolerationsBuilder builder = new TolerationsBuilder(item);_visitables.get("tolerations").add(builder);this.tolerations.add(builder);} return (A)this;
  }
  
  public A removeFromTolerations(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.Tolerations... items) {
    if (this.tolerations == null) return (A)this;
    for (Tolerations item : items) {TolerationsBuilder builder = new TolerationsBuilder(item);_visitables.get("tolerations").remove(builder); this.tolerations.remove(builder);} return (A)this;
  }
  
  public A removeAllFromTolerations(Collection<Tolerations> items) {
    if (this.tolerations == null) return (A)this;
    for (Tolerations item : items) {TolerationsBuilder builder = new TolerationsBuilder(item);_visitables.get("tolerations").remove(builder); this.tolerations.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromTolerations(Predicate<TolerationsBuilder> predicate) {
    if (tolerations == null) return (A) this;
    final Iterator<TolerationsBuilder> each = tolerations.iterator();
    final List visitables = _visitables.get("tolerations");
    while (each.hasNext()) {
      TolerationsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<Tolerations> buildTolerations() {
    return this.tolerations != null ? build(tolerations) : null;
  }
  
  public Tolerations buildToleration(int index) {
    return this.tolerations.get(index).build();
  }
  
  public Tolerations buildFirstToleration() {
    return this.tolerations.get(0).build();
  }
  
  public Tolerations buildLastToleration() {
    return this.tolerations.get(tolerations.size() - 1).build();
  }
  
  public Tolerations buildMatchingToleration(Predicate<TolerationsBuilder> predicate) {
      for (TolerationsBuilder item : tolerations) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingToleration(Predicate<TolerationsBuilder> predicate) {
      for (TolerationsBuilder item : tolerations) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTolerations(List<Tolerations> tolerations) {
    if (this.tolerations != null) {
      this._visitables.get("tolerations").clear();
    }
    if (tolerations != null) {
        this.tolerations = new ArrayList();
        for (Tolerations item : tolerations) {
          this.addToTolerations(item);
        }
    } else {
      this.tolerations = null;
    }
    return (A) this;
  }
  
  public A withTolerations(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.Tolerations... tolerations) {
    if (this.tolerations != null) {
        this.tolerations.clear();
        _visitables.remove("tolerations");
    }
    if (tolerations != null) {
      for (Tolerations item : tolerations) {
        this.addToTolerations(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTolerations() {
    return this.tolerations != null && !this.tolerations.isEmpty();
  }
  
  public TolerationsNested<A> addNewToleration() {
    return new TolerationsNested(-1, null);
  }
  
  public TolerationsNested<A> addNewTolerationLike(Tolerations item) {
    return new TolerationsNested(-1, item);
  }
  
  public TolerationsNested<A> setNewTolerationLike(int index,Tolerations item) {
    return new TolerationsNested(index, item);
  }
  
  public TolerationsNested<A> editToleration(int index) {
    if (tolerations.size() <= index) throw new RuntimeException("Can't edit tolerations. Index exceeds size.");
    return setNewTolerationLike(index, buildToleration(index));
  }
  
  public TolerationsNested<A> editFirstToleration() {
    if (tolerations.size() == 0) throw new RuntimeException("Can't edit first tolerations. The list is empty.");
    return setNewTolerationLike(0, buildToleration(0));
  }
  
  public TolerationsNested<A> editLastToleration() {
    int index = tolerations.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last tolerations. The list is empty.");
    return setNewTolerationLike(index, buildToleration(index));
  }
  
  public TolerationsNested<A> editMatchingToleration(Predicate<TolerationsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<tolerations.size();i++) { 
    if (predicate.test(tolerations.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching tolerations. No match found.");
    return setNewTolerationLike(index, buildToleration(index));
  }
  
  public A addToTopologySpreadConstraints(int index,TopologySpreadConstraints item) {
    if (this.topologySpreadConstraints == null) {this.topologySpreadConstraints = new ArrayList<TopologySpreadConstraintsBuilder>();}
    TopologySpreadConstraintsBuilder builder = new TopologySpreadConstraintsBuilder(item);
    if (index < 0 || index >= topologySpreadConstraints.size()) { _visitables.get("topologySpreadConstraints").add(builder); topologySpreadConstraints.add(builder); } else { _visitables.get("topologySpreadConstraints").add(index, builder); topologySpreadConstraints.add(index, builder);}
    return (A)this;
  }
  
  public A setToTopologySpreadConstraints(int index,TopologySpreadConstraints item) {
    if (this.topologySpreadConstraints == null) {this.topologySpreadConstraints = new ArrayList<TopologySpreadConstraintsBuilder>();}
    TopologySpreadConstraintsBuilder builder = new TopologySpreadConstraintsBuilder(item);
    if (index < 0 || index >= topologySpreadConstraints.size()) { _visitables.get("topologySpreadConstraints").add(builder); topologySpreadConstraints.add(builder); } else { _visitables.get("topologySpreadConstraints").set(index, builder); topologySpreadConstraints.set(index, builder);}
    return (A)this;
  }
  
  public A addToTopologySpreadConstraints(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.TopologySpreadConstraints... items) {
    if (this.topologySpreadConstraints == null) {this.topologySpreadConstraints = new ArrayList<TopologySpreadConstraintsBuilder>();}
    for (TopologySpreadConstraints item : items) {TopologySpreadConstraintsBuilder builder = new TopologySpreadConstraintsBuilder(item);_visitables.get("topologySpreadConstraints").add(builder);this.topologySpreadConstraints.add(builder);} return (A)this;
  }
  
  public A addAllToTopologySpreadConstraints(Collection<TopologySpreadConstraints> items) {
    if (this.topologySpreadConstraints == null) {this.topologySpreadConstraints = new ArrayList<TopologySpreadConstraintsBuilder>();}
    for (TopologySpreadConstraints item : items) {TopologySpreadConstraintsBuilder builder = new TopologySpreadConstraintsBuilder(item);_visitables.get("topologySpreadConstraints").add(builder);this.topologySpreadConstraints.add(builder);} return (A)this;
  }
  
  public A removeFromTopologySpreadConstraints(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.TopologySpreadConstraints... items) {
    if (this.topologySpreadConstraints == null) return (A)this;
    for (TopologySpreadConstraints item : items) {TopologySpreadConstraintsBuilder builder = new TopologySpreadConstraintsBuilder(item);_visitables.get("topologySpreadConstraints").remove(builder); this.topologySpreadConstraints.remove(builder);} return (A)this;
  }
  
  public A removeAllFromTopologySpreadConstraints(Collection<TopologySpreadConstraints> items) {
    if (this.topologySpreadConstraints == null) return (A)this;
    for (TopologySpreadConstraints item : items) {TopologySpreadConstraintsBuilder builder = new TopologySpreadConstraintsBuilder(item);_visitables.get("topologySpreadConstraints").remove(builder); this.topologySpreadConstraints.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromTopologySpreadConstraints(Predicate<TopologySpreadConstraintsBuilder> predicate) {
    if (topologySpreadConstraints == null) return (A) this;
    final Iterator<TopologySpreadConstraintsBuilder> each = topologySpreadConstraints.iterator();
    final List visitables = _visitables.get("topologySpreadConstraints");
    while (each.hasNext()) {
      TopologySpreadConstraintsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<TopologySpreadConstraints> buildTopologySpreadConstraints() {
    return this.topologySpreadConstraints != null ? build(topologySpreadConstraints) : null;
  }
  
  public TopologySpreadConstraints buildTopologySpreadConstraint(int index) {
    return this.topologySpreadConstraints.get(index).build();
  }
  
  public TopologySpreadConstraints buildFirstTopologySpreadConstraint() {
    return this.topologySpreadConstraints.get(0).build();
  }
  
  public TopologySpreadConstraints buildLastTopologySpreadConstraint() {
    return this.topologySpreadConstraints.get(topologySpreadConstraints.size() - 1).build();
  }
  
  public TopologySpreadConstraints buildMatchingTopologySpreadConstraint(Predicate<TopologySpreadConstraintsBuilder> predicate) {
      for (TopologySpreadConstraintsBuilder item : topologySpreadConstraints) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingTopologySpreadConstraint(Predicate<TopologySpreadConstraintsBuilder> predicate) {
      for (TopologySpreadConstraintsBuilder item : topologySpreadConstraints) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTopologySpreadConstraints(List<TopologySpreadConstraints> topologySpreadConstraints) {
    if (this.topologySpreadConstraints != null) {
      this._visitables.get("topologySpreadConstraints").clear();
    }
    if (topologySpreadConstraints != null) {
        this.topologySpreadConstraints = new ArrayList();
        for (TopologySpreadConstraints item : topologySpreadConstraints) {
          this.addToTopologySpreadConstraints(item);
        }
    } else {
      this.topologySpreadConstraints = null;
    }
    return (A) this;
  }
  
  public A withTopologySpreadConstraints(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.TopologySpreadConstraints... topologySpreadConstraints) {
    if (this.topologySpreadConstraints != null) {
        this.topologySpreadConstraints.clear();
        _visitables.remove("topologySpreadConstraints");
    }
    if (topologySpreadConstraints != null) {
      for (TopologySpreadConstraints item : topologySpreadConstraints) {
        this.addToTopologySpreadConstraints(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTopologySpreadConstraints() {
    return this.topologySpreadConstraints != null && !this.topologySpreadConstraints.isEmpty();
  }
  
  public TopologySpreadConstraintsNested<A> addNewTopologySpreadConstraint() {
    return new TopologySpreadConstraintsNested(-1, null);
  }
  
  public TopologySpreadConstraintsNested<A> addNewTopologySpreadConstraintLike(TopologySpreadConstraints item) {
    return new TopologySpreadConstraintsNested(-1, item);
  }
  
  public TopologySpreadConstraintsNested<A> setNewTopologySpreadConstraintLike(int index,TopologySpreadConstraints item) {
    return new TopologySpreadConstraintsNested(index, item);
  }
  
  public TopologySpreadConstraintsNested<A> editTopologySpreadConstraint(int index) {
    if (topologySpreadConstraints.size() <= index) throw new RuntimeException("Can't edit topologySpreadConstraints. Index exceeds size.");
    return setNewTopologySpreadConstraintLike(index, buildTopologySpreadConstraint(index));
  }
  
  public TopologySpreadConstraintsNested<A> editFirstTopologySpreadConstraint() {
    if (topologySpreadConstraints.size() == 0) throw new RuntimeException("Can't edit first topologySpreadConstraints. The list is empty.");
    return setNewTopologySpreadConstraintLike(0, buildTopologySpreadConstraint(0));
  }
  
  public TopologySpreadConstraintsNested<A> editLastTopologySpreadConstraint() {
    int index = topologySpreadConstraints.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last topologySpreadConstraints. The list is empty.");
    return setNewTopologySpreadConstraintLike(index, buildTopologySpreadConstraint(index));
  }
  
  public TopologySpreadConstraintsNested<A> editMatchingTopologySpreadConstraint(Predicate<TopologySpreadConstraintsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<topologySpreadConstraints.size();i++) { 
    if (predicate.test(topologySpreadConstraints.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching topologySpreadConstraints. No match found.");
    return setNewTopologySpreadConstraintLike(index, buildTopologySpreadConstraint(index));
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
    BuildPodFluent that = (BuildPodFluent) o;
    if (!java.util.Objects.equals(affinity, that.affinity)) return false;
    if (!java.util.Objects.equals(enableServiceLinks, that.enableServiceLinks)) return false;
    if (!java.util.Objects.equals(hostAliases, that.hostAliases)) return false;
    if (!java.util.Objects.equals(imagePullSecrets, that.imagePullSecrets)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(priorityClassName, that.priorityClassName)) return false;
    if (!java.util.Objects.equals(schedulerName, that.schedulerName)) return false;
    if (!java.util.Objects.equals(securityContext, that.securityContext)) return false;
    if (!java.util.Objects.equals(terminationGracePeriodSeconds, that.terminationGracePeriodSeconds)) return false;
    if (!java.util.Objects.equals(tmpDirSizeLimit, that.tmpDirSizeLimit)) return false;
    if (!java.util.Objects.equals(tolerations, that.tolerations)) return false;
    if (!java.util.Objects.equals(topologySpreadConstraints, that.topologySpreadConstraints)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(affinity,  enableServiceLinks,  hostAliases,  imagePullSecrets,  metadata,  priorityClassName,  schedulerName,  securityContext,  terminationGracePeriodSeconds,  tmpDirSizeLimit,  tolerations,  topologySpreadConstraints,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (affinity != null) { sb.append("affinity:"); sb.append(affinity + ","); }
    if (enableServiceLinks != null) { sb.append("enableServiceLinks:"); sb.append(enableServiceLinks + ","); }
    if (hostAliases != null && !hostAliases.isEmpty()) { sb.append("hostAliases:"); sb.append(hostAliases + ","); }
    if (imagePullSecrets != null && !imagePullSecrets.isEmpty()) { sb.append("imagePullSecrets:"); sb.append(imagePullSecrets + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (priorityClassName != null) { sb.append("priorityClassName:"); sb.append(priorityClassName + ","); }
    if (schedulerName != null) { sb.append("schedulerName:"); sb.append(schedulerName + ","); }
    if (securityContext != null) { sb.append("securityContext:"); sb.append(securityContext + ","); }
    if (terminationGracePeriodSeconds != null) { sb.append("terminationGracePeriodSeconds:"); sb.append(terminationGracePeriodSeconds + ","); }
    if (tmpDirSizeLimit != null) { sb.append("tmpDirSizeLimit:"); sb.append(tmpDirSizeLimit + ","); }
    if (tolerations != null && !tolerations.isEmpty()) { sb.append("tolerations:"); sb.append(tolerations + ","); }
    if (topologySpreadConstraints != null && !topologySpreadConstraints.isEmpty()) { sb.append("topologySpreadConstraints:"); sb.append(topologySpreadConstraints + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withEnableServiceLinks() {
    return withEnableServiceLinks(true);
  }
  public class AffinityNested<N> extends AffinityFluent<AffinityNested<N>> implements Nested<N>{
    AffinityNested(Affinity item) {
      this.builder = new AffinityBuilder(this, item);
    }
    AffinityBuilder builder;
    
    public N and() {
      return (N) BuildPodFluent.this.withAffinity(builder.build());
    }
    
    public N endAffinity() {
      return and();
    }
    
  
  }
  public class HostAliasesNested<N> extends HostAliasesFluent<HostAliasesNested<N>> implements Nested<N>{
    HostAliasesNested(int index,HostAliases item) {
      this.index = index;
      this.builder = new HostAliasesBuilder(this, item);
    }
    HostAliasesBuilder builder;
    int index;
    
    public N and() {
      return (N) BuildPodFluent.this.setToHostAliases(index,builder.build());
    }
    
    public N endHostAlias() {
      return and();
    }
    
  
  }
  public class ImagePullSecretsNested<N> extends ImagePullSecretsFluent<ImagePullSecretsNested<N>> implements Nested<N>{
    ImagePullSecretsNested(int index,ImagePullSecrets item) {
      this.index = index;
      this.builder = new ImagePullSecretsBuilder(this, item);
    }
    ImagePullSecretsBuilder builder;
    int index;
    
    public N and() {
      return (N) BuildPodFluent.this.setToImagePullSecrets(index,builder.build());
    }
    
    public N endImagePullSecret() {
      return and();
    }
    
  
  }
  public class MetadataNested<N> extends MetadataFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(Metadata item) {
      this.builder = new MetadataBuilder(this, item);
    }
    MetadataBuilder builder;
    
    public N and() {
      return (N) BuildPodFluent.this.withMetadata(builder.build());
    }
    
    public N endBuildpodMetadata() {
      return and();
    }
    
  
  }
  public class SecurityContextNested<N> extends SecurityContextFluent<SecurityContextNested<N>> implements Nested<N>{
    SecurityContextNested(SecurityContext item) {
      this.builder = new SecurityContextBuilder(this, item);
    }
    SecurityContextBuilder builder;
    
    public N and() {
      return (N) BuildPodFluent.this.withSecurityContext(builder.build());
    }
    
    public N endBuildpodSecurityContext() {
      return and();
    }
    
  
  }
  public class TolerationsNested<N> extends TolerationsFluent<TolerationsNested<N>> implements Nested<N>{
    TolerationsNested(int index,Tolerations item) {
      this.index = index;
      this.builder = new TolerationsBuilder(this, item);
    }
    TolerationsBuilder builder;
    int index;
    
    public N and() {
      return (N) BuildPodFluent.this.setToTolerations(index,builder.build());
    }
    
    public N endToleration() {
      return and();
    }
    
  
  }
  public class TopologySpreadConstraintsNested<N> extends TopologySpreadConstraintsFluent<TopologySpreadConstraintsNested<N>> implements Nested<N>{
    TopologySpreadConstraintsNested(int index,TopologySpreadConstraints item) {
      this.index = index;
      this.builder = new TopologySpreadConstraintsBuilder(this, item);
    }
    TopologySpreadConstraintsBuilder builder;
    int index;
    
    public N and() {
      return (N) BuildPodFluent.this.setToTopologySpreadConstraints(index,builder.build());
    }
    
    public N endTopologySpreadConstraint() {
      return and();
    }
    
  
  }

}