package com.selftech.kafkatutorial.config;

import com.selftech.kafkatutorial.constant.KafkaConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic createTopic() {
        return TopicBuilder.name(KafkaConstant.JAVA_GUIDE_TOPIC)
                .partitions(3)
                .replicas(3)
                .build();
    }

    @Bean
    public NewTopic createJsonTopic() {
        return TopicBuilder.name(KafkaConstant.JAVA_GUIDE_JSON_TOPIC)
                .partitions(3)
                .replicas(3)
                .build();
    }

}
