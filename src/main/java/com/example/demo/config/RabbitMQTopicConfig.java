package com.example.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.example.demo.utils.Const.*;

@Configuration
public class RabbitMQTopicConfig {

    @Bean(TOPIC_EXCHANGE)
    TopicExchange topicExchange() {
        return new TopicExchange(TOPIC_EXCHANGE);
    }

    @Bean
    Binding marketingBindingToTopicExchange(Queue marketingQueue, TopicExchange topicExchange) {
        return BindingBuilder.bind(marketingQueue).to(topicExchange).with(MARKETING_ROUTING_KEY_TO_TOPIC_EXCHANGE);
    }

    @Bean
    Binding financeBindingToTopicExchange(Queue financeQueue, TopicExchange topicExchange) {
        return BindingBuilder.bind(financeQueue).to(topicExchange).with(FINANCE_ROUTING_KEY_TO_TOPIC_EXCHANGE);
    }

    @Bean
    Binding adminBindingToTopicExchange(Queue adminQueue, TopicExchange topicExchange) {
        return BindingBuilder.bind(adminQueue).to(topicExchange).with(ADMIN_ROUTING_KEY_TO_TOPIC_EXCHANGE);
    }

    @Bean
    Binding allBindingToTopicExchange(Queue allQueue, TopicExchange topicExchange) {
        return BindingBuilder.bind(allQueue).to(topicExchange).with(ALL_ROUTING_KEY_TO_TOPIC_EXCHANGE);
    }
}
