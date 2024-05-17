package hello.world.operator;

import io.fabric8.kubernetes.api.model.HasMetadata;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface KindClass {
    Class<? extends HasMetadata> value();
}