package com.bjpowernode.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bjpowernode.common.utils.PageUtils;
import com.bjpowernode.gulimall.product.entity.AttrEntity;
import com.bjpowernode.gulimall.product.vo.AttrGroupRelationVo;
import com.bjpowernode.gulimall.product.vo.AttrRespVo;
import com.bjpowernode.gulimall.product.vo.AttrVo;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author liaojianxiang
 * @email liaojianxiang@gmail.com
 * @date 2022-09-22 23:02:52
 */
public interface AttrService extends IService<AttrEntity> {


    PageUtils queryPage(Map<String, Object> params);

//    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

//    AttrRespVo getAttrInfo(Long attrId);

//    void updateAttr(AttrVo attr);

    List<AttrEntity> getRelationAttr(Long attrgroupId);
//
//    void deleteRelation(AttrGroupRelationVo[] vos);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);

    List<Long> selectSearchAttrs(List<Long> attrIds);

}

