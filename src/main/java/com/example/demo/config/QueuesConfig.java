package com.example.demo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.example.demo.utils.Const.*;

@Configuration
public class QueuesConfig {

    @Bean
    Queue marketingQueue() {
        return new Queue(MARKETING_QUEUE, false);
    }

    @Bean
    Queue financeQueue() {
        return new Queue(FINANCE_QUEUE, false);
    }

    @Bean
    Queue adminQueue() {
        return new Queue(ADMIN_QUEUE, false);
    }

    @Bean
    Queue allQueue() {
        return new Queue(ALL_QUEUE, false);
    }
}
