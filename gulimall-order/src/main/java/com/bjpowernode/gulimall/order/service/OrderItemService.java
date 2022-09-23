package com.bjpowernode.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bjpowernode.common.utils.PageUtils;
import com.bjpowernode.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author liaojianxiang
 * @email liaojianxiang@gmail.com
 * @date 2022-09-23 21:17:43
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

