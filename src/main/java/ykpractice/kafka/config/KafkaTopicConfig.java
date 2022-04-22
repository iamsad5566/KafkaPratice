package ykpractice.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    // Build a topic
    @Bean
    public NewTopic ykTopic() {
        return TopicBuilder.name("yk")
                .build();
    }
}
