package hello.world.operator;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.fabric8.kubernetes.api.model.ConfigMap;

@KindClass(ConfigMap.class)
public class ConfigMapRef implements Ref {
    private String name;
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

    @JsonSetter("namespace")
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
}