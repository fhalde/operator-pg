/* (C)2024 */
package hello.world.operator;

import hello.world.operator.hellouniverse.HelloUniverseReconciler;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.javaoperatorsdk.operator.Operator;
import hello.world.operator.helloworld.HelloWorldReconciler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OperatorRunner {

  private static final Logger log = LoggerFactory.getLogger(OperatorRunner.class);

  public static void main(String[] args) {
    var client = new KubernetesClientBuilder().build();
    var operator = new Operator(o -> o.withKubernetesClient(client));
    operator.register(new HelloWorldReconciler());
    operator.register(new HelloUniverseReconciler());
    operator.start();
  }
}
