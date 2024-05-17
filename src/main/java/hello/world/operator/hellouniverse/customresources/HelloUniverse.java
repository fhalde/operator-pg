/* (C)2024 */
package hello.world.operator.hellouniverse.customresources;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.*;

@Version("v1alpha1")
@Group("hello.universe")
@ShortNames("hu")
@Singular("hellouniverse")
@Plural("hellouniverses")
@Kind("HelloUniverse")
public class HelloUniverse extends CustomResource<HelloUniverseSpec, HelloUniverseStatus> implements Namespaced {}
