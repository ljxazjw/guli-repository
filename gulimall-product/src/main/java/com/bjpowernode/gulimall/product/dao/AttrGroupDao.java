package com.bjpowernode.gulimall.product.dao;

import com.bjpowernode.gulimall.product.entity.AttrGroupEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bjpowernode.gulimall.product.vo.SkuItemVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 属性分组
 * 
 * @author liaojianxiang
 * @email liaojianxiang@gmail.com
 * @date 2022-09-22 23:02:52
 */
@Mapper
public interface AttrGroupDao extends BaseMapper<AttrGroupEntity> {

//    List<SkuItemVo.SpuItemBaseAttrVo> getAttrGroupWithAttrsBySpuId(Long spuId, Long catalogId);
}
