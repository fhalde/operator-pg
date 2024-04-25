package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class PodBuilder extends PodFluent<PodBuilder> implements VisitableBuilder<Pod,PodBuilder>{
  public PodBuilder() {
    this(new Pod());
  }
  
  public PodBuilder(PodFluent<?> fluent) {
    this(fluent, new Pod());
  }
  
  public PodBuilder(PodFluent<?> fluent,Pod instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public PodBuilder(Pod instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  PodFluent<?> fluent;
  
  public Pod build() {
    Pod buildable = new Pod();
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