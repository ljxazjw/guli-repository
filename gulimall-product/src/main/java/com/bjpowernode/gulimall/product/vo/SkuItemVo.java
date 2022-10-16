package com.bjpowernode.gulimall.product.vo;

import com.bjpowernode.gulimall.product.entity.SkuImagesEntity;
import com.bjpowernode.gulimall.product.entity.SkuInfoEntity;
import com.bjpowernode.gulimall.product.entity.SpuInfoDescEntity;
import lombok.Data;

import java.util.List;


@Data
public class SkuItemVo {

    //sku的基本信息
    SkuInfoEntity info;
//    sku的图片信息，
    List<SkuImagesEntity> images;
    //spu的销售属性组合
    List<SkuItemSaleAttrVo> saleAttr;
//    spu的介绍
     SpuInfoDescEntity desp;
//    获取spu的规格参数信息
    List<SpuItemBaseAttrVo> groupAttrs;


    @Data
    public static class SkuItemSaleAttrVo{
        private Long attrId;

        private String attrName;

        private List<String> attrValues;

    }

    @Data
    public static class SpuItemBaseAttrVo{
        private String groupName;
        private List<SpuBaseAttrVo> attrs;
    }

    @Data
    public static class SpuBaseAttrVo{
        private String attrName;
        private String attrValue;

    }




}
