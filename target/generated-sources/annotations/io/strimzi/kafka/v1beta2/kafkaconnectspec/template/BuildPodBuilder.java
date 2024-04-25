package io.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class BuildPodBuilder extends BuildPodFluent<BuildPodBuilder> implements VisitableBuilder<BuildPod,BuildPodBuilder>{
  public BuildPodBuilder() {
    this(new BuildPod());
  }
  
  public BuildPodBuilder(BuildPodFluent<?> fluent) {
    this(fluent, new BuildPod());
  }
  
  public BuildPodBuilder(BuildPodFluent<?> fluent,BuildPod instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public BuildPodBuilder(BuildPod instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  BuildPodFluent<?> fluent;
  
  public BuildPod build() {
    BuildPod buildable = new BuildPod();
    buildable.setAffinity(fluent.buildAffinity());
    buildable.setEnableServiceLinks(fluent.getEnableServiceLinks());
    buildable.setHostAliases(fluent.buildHostAliases());
    buildable.setImagePullSecrets(fluent.buildImagePullSecrets());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setPriorityClassName(fluent.getPriorityClassName());
    buildable.setSchedulerName(fluent.getSchedulerName());
    buildable.setSecurityContext(fluent.buildSecurityContext());
    buildable.setTerminationGracePeriodSeconds(fluent.getTerminationGracePeriodSeconds());
    buildable.setTmpDirSizeLimit(fluent.getTmpDirSizeLimit());
    buildable.setTolerations(fluent.buildTolerations());
    buildable.setTopologySpreadConstraints(fluent.buildTopologySpreadConstraints());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}