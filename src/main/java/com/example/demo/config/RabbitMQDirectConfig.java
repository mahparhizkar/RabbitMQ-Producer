package com.example.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.example.demo.utils.Const.*;


@Configuration
public class RabbitMQDirectConfig {

    @Bean(DIRECT_EXCHANGE)
    DirectExchange directExchange() {
        return new DirectExchange(DIRECT_EXCHANGE);
    }

    @Bean
    Binding marketingBindingToDirectExchange(Queue marketingQueue, DirectExchange directExchange) {
        return BindingBuilder.bind(marketingQueue).to(directExchange).with(MARKETING_ROUTING_KEY_TO_DIRECT_EXCHANGE);
    }

    @Bean
    Binding financeBindingToDirectExchange(Queue financeQueue, DirectExchange directExchange) {
        return BindingBuilder.bind(financeQueue).to(directExchange).with(FINANCE_ROUTING_KEY_TO_DIRECT_EXCHANGE);
    }

    @Bean
    Binding adminBindingToDirectExchange(Queue adminQueue, DirectExchange directExchange) {
        return BindingBuilder.bind(adminQueue).to(directExchange).with(ADMIN_ROUTING_KEY_TO_DIRECT_EXCHANGE);
    }
}
