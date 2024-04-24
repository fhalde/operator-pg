/* (C)2024 */
package hello.world.operator.slope;

import io.javaoperatorsdk.operator.api.reconciler.*;
import io.javaoperatorsdk.operator.api.reconciler.dependent.Dependent;
import hello.world.operator.slope.customresources.HelloWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ControllerConfiguration(name = "helloworld", dependents = {
        @Dependent(type = KafkaConnectorDependentResource.class)
})
public class HelloWorldReconciler implements Reconciler<HelloWorld> {

  private static final Logger log = LoggerFactory.getLogger(HelloWorldReconciler.class);

  public HelloWorldReconciler() {
  }

  @Override
  public UpdateControl<HelloWorld> reconcile(HelloWorld slope, Context<HelloWorld> context) {
    log.info("Reconciling hello world...");
    return UpdateControl.updateStatus(slope);
  }
}
