package com.bjpowernode.gulimall.coupon.dao;

import com.bjpowernode.gulimall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author liaojianxiang
 * @email liaojianxiang@gmail.com
 * @date 2022-09-23 20:52:49
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
