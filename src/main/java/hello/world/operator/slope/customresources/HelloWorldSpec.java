/* (C)2024 */
package hello.world.operator.slope.customresources;

import io.fabric8.generator.annotation.Required;
import io.fabric8.kubernetes.api.model.ConfigMap;

public class HelloWorldSpec {

    @Required
    @ReferredKind(ConfigMap.class)
    public Ref configRef;

    public String description;
}