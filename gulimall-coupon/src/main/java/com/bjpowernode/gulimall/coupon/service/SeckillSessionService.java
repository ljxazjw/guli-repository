package com.bjpowernode.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bjpowernode.common.utils.PageUtils;
import com.bjpowernode.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author liaojianxiang
 * @email liaojianxiang@gmail.com
 * @date 2022-09-23 20:52:49
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

