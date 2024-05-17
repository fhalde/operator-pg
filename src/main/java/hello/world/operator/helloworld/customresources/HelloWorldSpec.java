/* (C)2024 */
package hello.world.operator.helloworld.customresources;

import hello.world.operator.ConfigMapRef;
import io.fabric8.generator.annotation.Required;

public class HelloWorldSpec {

    @Required
    public ConfigMapRef configMapRef;
}