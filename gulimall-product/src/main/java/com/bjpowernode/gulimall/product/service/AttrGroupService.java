package com.bjpowernode.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bjpowernode.common.utils.PageUtils;
import com.bjpowernode.gulimall.product.entity.AttrGroupEntity;
import com.bjpowernode.gulimall.product.vo.AttrGroupWithAttrsVo;
import com.bjpowernode.gulimall.product.vo.SkuItemVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 属性分组
 *
 * @author liaojianxiang
 * @email liaojianxiang@gmail.com
 * @date 2022-09-22 23:02:52
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPage(Map<String, Object> params, Long catelogId);

    List<AttrGroupWithAttrsVo> getAttrGroupWithAttrsByCatelogId(Long catelogId);


//    List<SkuItemVo.SpuItemBaseAttrVo> getAttrGroupWithAttrsBySpuId(@Param("spuId") Long spuId, @Param("catalogId") Long catalogId);
}

