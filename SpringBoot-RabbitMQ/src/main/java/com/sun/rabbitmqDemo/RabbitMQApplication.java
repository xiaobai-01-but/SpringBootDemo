package com.sun.rabbitmqDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMQApplication {
    // JDK8主方法格式，无问题
    public static void main(String[] args) {
        SpringApplication.run(RabbitMQApplication.class, args);
    }
}
