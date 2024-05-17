/* (C)2024 */
package hello.world.operator.helloworld.customresources;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.*;

@Version("v1alpha1")
@Group("hello.world")
@ShortNames("hw")
@Singular("helloworld")
@Plural("helloworlds")
@Kind("HelloWorld")
public class HelloWorld extends CustomResource<HelloWorldSpec, HelloWorldStatus> implements Namespaced {}
