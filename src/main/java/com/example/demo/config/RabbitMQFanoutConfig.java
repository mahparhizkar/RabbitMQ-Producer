package com.example.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.example.demo.utils.Const.FANOUT_EXCHANGE;

@Configuration
public class RabbitMQFanoutConfig {

    @Bean(FANOUT_EXCHANGE)
    FanoutExchange fanoutExchange() {
        return new FanoutExchange(FANOUT_EXCHANGE);
    }

    @Bean()
    Binding marketingBindingToFanoutExchange(Queue marketingQueue, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(marketingQueue).to(fanoutExchange);
    }

    @Bean
    Binding financeBindingToFanoutExchange(Queue financeQueue, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(financeQueue).to(fanoutExchange);
    }

    @Bean
    Binding adminBindingToFanoutExchange(Queue adminQueue, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(adminQueue).to(fanoutExchange);
    }
}
