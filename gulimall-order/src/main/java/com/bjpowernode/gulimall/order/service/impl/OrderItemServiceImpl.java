package com.bjpowernode.gulimall.order.service.impl;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bjpowernode.common.utils.PageUtils;
import com.bjpowernode.common.utils.Query;

import com.bjpowernode.gulimall.order.dao.OrderItemDao;
import com.bjpowernode.gulimall.order.entity.OrderItemEntity;
import com.bjpowernode.gulimall.order.service.OrderItemService;


@Service("orderItemService")
public class OrderItemServiceImpl extends ServiceImpl<OrderItemDao, OrderItemEntity> implements OrderItemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderItemEntity> page = this.page(
                new Query<OrderItemEntity>().getPage(params),
                new QueryWrapper<OrderItemEntity>()
        );

        return new PageUtils(page);
    }

    /**
     *
     * queue:声明监听的所有队列
     *
     *
     * 参数可以写以下的类型
     * Message 原生的消息类型，头+体
     *
     *
     */
    @RabbitListener(queues = {"hello-java-queue"})
    public void  recieveMessage(Object message){


    }

}