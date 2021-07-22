package com.example.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.HeadersExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.example.demo.utils.Const.*;

@Configuration
public class RabbitMQHeaderConfig {

    @Bean(HEADER_EXCHANGE)
    HeadersExchange headerExchange() {
        return new HeadersExchange(HEADER_EXCHANGE);
    }

    @Bean
    Binding marketingBindingToHeaderExchange(Queue marketingQueue, HeadersExchange headerExchange) {
        return BindingBuilder.bind(marketingQueue).to(headerExchange).where(ARGUMENT_KEY).matches(MARKETING_ARGUMENT_VALUE_TO_HEADER_EXCHANGE);
    }

    @Bean
    Binding financeBindingToHeaderExchange(Queue financeQueue, HeadersExchange headerExchange) {
        return BindingBuilder.bind(financeQueue).to(headerExchange).where(ARGUMENT_KEY).matches(FINANCE_ARGUMENT_VALUE_TO_HEADER_EXCHANGE);
    }

    @Bean
    Binding adminBindingToHeaderExchange(Queue adminQueue, HeadersExchange headerExchange) {
        return BindingBuilder.bind(adminQueue).to(headerExchange).where(ARGUMENT_KEY).matches(ADMIN_ARGUMENT_VALUE_TO_HEADER_EXCHANGE);
    }
}
