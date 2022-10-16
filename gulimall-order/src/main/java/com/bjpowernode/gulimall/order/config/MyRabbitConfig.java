package com.bjpowernode.gulimall.order.config;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class MyRabbitConfig {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Bean
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }

    /**
     *
     * 定制RabbitTemple
     *
     */
    @PostConstruct
    public void initRabbitTemple(){


        rabbitTemplate.setConfirmCallback(new RabbitTemplate.ConfirmCallback() {
            /**
             *
             *
             * @param correlationData 当前消息的唯一关联数据
             * @param b 消息是否成功收到
             *
             * @param s 失败的原因
             */
            @Override
            public void confirm(CorrelationData correlationData, boolean b, String s) {
                System.out.println("confirm。。。。");

            }
        });
        //设置抵达队列的确认回调,
        rabbitTemplate.setReturnCallback(new RabbitTemplate.ReturnCallback() {
            /**
             *
             *只要消息没有投递给指定的队列，就触发这个失败回调
             * @param message   那个消息投递失败的详细信息
             * @param i  回复的状态码
             * @param s  回复的文本内容
             * @param s1  当时这个消息发给哪一个交换机
             * @param s2  当时这个消息用的哪一个的路由键
             */
            @Override
            public void returnedMessage(Message message, int i, String s, String s1, String s2) {
                System.out.println();
            }
        });
    }

}
