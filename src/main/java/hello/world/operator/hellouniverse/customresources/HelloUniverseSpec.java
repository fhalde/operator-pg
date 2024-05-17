/* (C)2024 */
package hello.world.operator.hellouniverse.customresources;

import hello.world.operator.HelloWorldRef;
import io.fabric8.generator.annotation.Required;

public class HelloUniverseSpec {

    @Required
    public HelloWorldRef helloWorldRef;

    public String description;
}