package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.preferredduringschedulingignoredduringexecution.podaffinityterm.namespaceselector;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class MatchExpressionsBuilder extends MatchExpressionsFluent<MatchExpressionsBuilder> implements VisitableBuilder<MatchExpressions,MatchExpressionsBuilder>{
  public MatchExpressionsBuilder() {
    this(new MatchExpressions());
  }
  
  public MatchExpressionsBuilder(MatchExpressionsFluent<?> fluent) {
    this(fluent, new MatchExpressions());
  }
  
  public MatchExpressionsBuilder(MatchExpressionsFluent<?> fluent,MatchExpressions instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public MatchExpressionsBuilder(MatchExpressions instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  MatchExpressionsFluent<?> fluent;
  
  public MatchExpressions build() {
    MatchExpressions buildable = new MatchExpressions();
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setValues(fluent.getValues());
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}