package com.sun.rabbitmqDemo.交换机;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 扇形交换机 当队列绑定交换机时，交换机会将消息发送给所有绑定的队列
 */
@Configuration
public class RabbitMQConfig_扇形交换机 {

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    public Queue fanoutQueue() {
        return new Queue("fanoutQueue", true);
    }

    @Bean
    public Queue fanoutQueue1() {
        return new Queue("fanoutQueue1", true);
    }

    @Bean
    public Binding fanoutBinding() {
        return BindingBuilder.bind(fanoutQueue()).to(fanoutExchange());
    }

    @Bean
    public Binding fanoutBinding1() {
        return BindingBuilder.bind(fanoutQueue1()).to(fanoutExchange());
    }
}
