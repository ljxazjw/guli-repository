package com.bjpowernode.gulimall.search.vo;


import lombok.Data;

import java.util.List;

/**
 *
 *
 *封装页面所有可能传递过来的查询条件
 *
 */

@Data
public class SearchParam {

    private String keyword;//页面传递过来的检索参数 关键字
    private Long catalog3Id;//三级分类的id
    private String sort;//排序的条件
    /**
     *  sort = saleCount_asc/desc
     *  sort = skuPrice_asc/desc
     *  sort = hotScore_asc/desc
     *
     */
    private Integer hasStock;
    //是否有货
    private String skuPrice;
    //价格区间查询
    private List<Long> brandID;
    //属性筛选
    private List<String> attrs;
    //页码

    private Integer pageNum;





}
