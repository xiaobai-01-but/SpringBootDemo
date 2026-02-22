package com.sun.rabbitmqDemo.交换机;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 直交货机,绑定对列到交换机，路由键为队列名称。需要全名称匹配
 */
@Configuration
public class RabbitMQConfig_直交换机 {

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("directExchange",true,false);
    }

    @Bean
    public Queue directQueue(){
        return new Queue("directQueue",true);
    }

    @Bean
    public Binding directBinding(){
        return BindingBuilder.bind(directQueue()).to(directExchange()).with("directQueue");
    }
}
