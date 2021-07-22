package com.example.demo.utils;

public class Const {

    public static final String DIRECT_EXCHANGE = "direct-exchange";
    public static final String FANOUT_EXCHANGE = "fanout-exchange";
    public static final String TOPIC_EXCHANGE = "topic-exchange";
    public static final String HEADER_EXCHANGE = "header-exchange";

    public static final String MARKETING_QUEUE = "marketingQueue";
    public static final String FINANCE_QUEUE = "financeQueue";
    public static final String ADMIN_QUEUE = "adminQueue";
    public static final String ALL_QUEUE = "allQueue";

    public static final String MARKETING_ROUTING_KEY_TO_DIRECT_EXCHANGE = "marketing";
    public static final String FINANCE_ROUTING_KEY_TO_DIRECT_EXCHANGE = "finance";
    public static final String ADMIN_ROUTING_KEY_TO_DIRECT_EXCHANGE = "admin";

    public static final String MARKETING_ROUTING_KEY_TO_TOPIC_EXCHANGE = "queue.marketing";
    public static final String FINANCE_ROUTING_KEY_TO_TOPIC_EXCHANGE = "queue.finance";
    public static final String ADMIN_ROUTING_KEY_TO_TOPIC_EXCHANGE = "queue.admin";
    public static final String ALL_ROUTING_KEY_TO_TOPIC_EXCHANGE = "queue.*";

    public static final String ARGUMENT_KEY = "department";
    public static final String MARKETING_ARGUMENT_VALUE_TO_HEADER_EXCHANGE = "marketing";
    public static final String FINANCE_ARGUMENT_VALUE_TO_HEADER_EXCHANGE = "finance";
    public static final String ADMIN_ARGUMENT_VALUE_TO_HEADER_EXCHANGE = "admin";
}
