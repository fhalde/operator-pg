package hello.world.operator.slope.customresources;

import io.fabric8.kubernetes.api.model.HasMetadata;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ReferredKind {
    Class<? extends HasMetadata> value();
}