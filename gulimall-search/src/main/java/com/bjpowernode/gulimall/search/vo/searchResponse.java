package com.bjpowernode.gulimall.search.vo;

import com.bjpowernode.common.to.es.SkuEsModel;
import lombok.Data;

import java.util.List;


@Data
public class searchResponse {
    //查询到的所有商品信息
    private List<SkuEsModel> products;

    /**
     *
     * 封装的分页的信息
     */

    private Integer pageNum;//当前页码

    private Long total;//总记录数

    private Integer totalPages;//总页码


    private List<BrandVO> brands;//当前查询到的结果，所有涉及到的品牌

    private List<CatalogVo> catalogs;//当前结果查询到的，所有的分类

    private List<AttrVo> attrs;//当前查询到的结果，所有涉及到的属性


    @Data
    public static  class  BrandVO{
        private Long brandId;//品牌的id
        private String brandName;//品牌的名字
        private String brandImg;//品牌的图片

    }

    public static class CatalogVo{
        private Long catalogId;
        private String catalogName;
    }


    @Data
    public static class AttrVo{
        private Long attrId;
        private String attrName;
        private List<String> attrValue;
    }
}
