package com.bjpowernode.gulimall.ware.dao;

import com.bjpowernode.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author liaojianxiang
 * @email liaojianxiang@gmail.com
 * @date 2022-09-23 21:25:34
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {

    long getSkuStock(Long skuId);
}
