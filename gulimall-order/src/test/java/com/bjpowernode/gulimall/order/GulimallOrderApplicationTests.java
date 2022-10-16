package com.bjpowernode.gulimall.order;

import com.bjpowernode.gulimall.order.entity.OrderReturnApplyEntity;
import com.bjpowernode.gulimall.order.entity.OrderReturnReasonEntity;
import org.junit.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class GulimallOrderApplicationTests {

    @Autowired
    AmqpAdmin amqpAdmin;
    @Autowired
    RabbitTemplate rabbitTemplate;


    @Test
    public void sendMessageTest(){
        OrderReturnReasonEntity reasonEntity = new OrderReturnReasonEntity();
        reasonEntity.setCreateTime(new Date());
        reasonEntity.setId(1l);
        reasonEntity.setName("嘻嘻");
        //发送消息,如果发送的消息是一个队列，会使用序列化机制，把对象写出去，对象必须实现serializable

        rabbitTemplate.convertAndSend("hello-java-exchange","hello.java",reasonEntity);



    }

    /**
     *
     *
     *
     *
     */
    @Test
     public void createExchange() {

        DirectExchange directExchange = new DirectExchange("hello-java-exchange",
                true,false);
        amqpAdmin.declareExchange(directExchange);


    }

    @Test
    public void createQueue(){
        Queue queue = new Queue("hello-java-queue",true,
                false,false);
        amqpAdmin.declareQueue(queue);
    }

    @Test
    public void createBinding(){
        //将exchange指定的交换机和目的地destination进行绑定，使用routingKey作为指定的路由键
        Binding binding = new Binding("hello-java-queue", Binding.DestinationType.QUEUE,
                "hello-java-exchange","hello.java",null);
        amqpAdmin.declareBinding(binding);

    }

}
