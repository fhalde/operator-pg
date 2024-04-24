/* (C)2024 */
package hello.world.operator.slope.customresources;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import io.fabric8.generator.annotation.Required;

import java.util.List;

public record HelloWorldSpec(
    @Required
    @JsonPropertyDescription("??")
    List<String> description) {}
