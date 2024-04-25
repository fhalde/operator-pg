public class Main {
    public static void main(String[] args) {
        new io.strimzi.kafka.v1beta2.KafkaConnectBuilder().withNewSpec().withNewTemplate().endIoTemplate();
        new cli.strimzi.kafka.v1beta2.KafkaConnectBuilder().withNewSpec().withNewTemplate().endTemplate().endSpec().build();
    }
}
