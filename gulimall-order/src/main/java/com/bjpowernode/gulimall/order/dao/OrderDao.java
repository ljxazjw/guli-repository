package com.bjpowernode.gulimall.order.dao;

import com.bjpowernode.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liaojianxiang
 * @email liaojianxiang@gmail.com
 * @date 2022-09-23 21:17:43
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
