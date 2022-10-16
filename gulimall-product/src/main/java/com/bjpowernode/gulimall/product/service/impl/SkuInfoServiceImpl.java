package com.bjpowernode.gulimall.product.service.impl;

import com.bjpowernode.gulimall.product.entity.SkuImagesEntity;
import com.bjpowernode.gulimall.product.entity.SpuInfoDescEntity;
import com.bjpowernode.gulimall.product.service.*;
import com.bjpowernode.gulimall.product.vo.SkuItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bjpowernode.common.utils.PageUtils;
import com.bjpowernode.common.utils.Query;

import com.bjpowernode.gulimall.product.dao.SkuInfoDao;
import com.bjpowernode.gulimall.product.entity.SkuInfoEntity;


@Service("skuInfoService")
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoDao, SkuInfoEntity> implements SkuInfoService {

    @Autowired
    SkuImagesService imagesService;

    @Autowired
    SpuInfoDescService descService;

    @Autowired
    AttrGroupService attrGroupService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuInfoEntity> page = this.page(
                new Query<SkuInfoEntity>().getPage(params),
                new QueryWrapper<SkuInfoEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public void saveSkyInfo(SkuInfoEntity skuInfoEntity) {
        this.baseMapper.insert(skuInfoEntity);
    }

    @Override
    public List<SkuInfoEntity> getSkusBySpuId(Long spuId) {
        List<SkuInfoEntity> list = this.list(new QueryWrapper<SkuInfoEntity>().eq("spu_id",spuId));



        return list;
    }

    @Override
    public SkuItemVo item(Long skuId) {
         SkuItemVo skuItemVo = new SkuItemVo();
//        sku的基本信息获取
        SkuInfoEntity info = getById(skuId);
        skuItemVo.setInfo(info);
        Long catalogId = info.getCatalogId();
        Long spuId = info.getSpuId();

//       sku的图片信息
        List<SkuImagesEntity> images = imagesService.getImagesBySkuId(skuId);
        skuItemVo.setImages(images);
//        获取spu的介绍

        SpuInfoDescEntity  spuInfoDescEntity = descService.getById(spuId);
        skuItemVo.setDesp(spuInfoDescEntity);

//        获取规格参数信息
        List<SkuItemVo.SpuItemBaseAttrVo> attrGroupVo = attrGroupService.getAttrGroupWithAttrsBySpuId(spuId,catalogId);
        skuItemVo.setGroupAttrs(attrGroupVo);

        return null;
    }

}