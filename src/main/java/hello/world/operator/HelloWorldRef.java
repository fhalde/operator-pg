package hello.world.operator;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import hello.world.operator.helloworld.customresources.HelloWorld;

@KindClass(HelloWorld.class)
public class HelloWorldRef implements Ref {

    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String namespace;

    @Override
    @JsonGetter("name")
    public String name() {
        return name;
    }

    @Override
    @JsonGetter("namespace")
    public String namespace() {
        return namespace;
    }

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty
    @JsonSetter("namespace")
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
}
