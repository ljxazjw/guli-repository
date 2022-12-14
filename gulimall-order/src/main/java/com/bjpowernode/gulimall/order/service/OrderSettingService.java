package com.bjpowernode.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bjpowernode.common.utils.PageUtils;
import com.bjpowernode.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author liaojianxiang
 * @email liaojianxiang@gmail.com
 * @date 2022-09-23 21:17:44
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

