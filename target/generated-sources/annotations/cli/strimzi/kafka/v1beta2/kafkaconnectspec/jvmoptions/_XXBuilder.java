package cli.strimzi.kafka.v1beta2.kafkaconnectspec.jvmoptions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
public class _XXBuilder extends _XXFluent<_XXBuilder> implements VisitableBuilder<_XX,_XXBuilder>{
  public _XXBuilder() {
    this(new _XX());
  }
  
  public _XXBuilder(_XXFluent<?> fluent) {
    this(fluent, new _XX());
  }
  
  public _XXBuilder(_XXFluent<?> fluent,_XX instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public _XXBuilder(_XX instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  _XXFluent<?> fluent;
  
  public _XX build() {
    _XX buildable = new _XX();
    buildable.setAdditionalProperties(fluent.getAdditionalProperties());
    return buildable;
  }
  

}