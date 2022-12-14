package com.bjpowernode.gulimall.product.web;


import com.bjpowernode.gulimall.product.service.SkuInfoService;
import com.bjpowernode.gulimall.product.vo.SkuItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ItemController {


    @Autowired
    SkuInfoService skuInfoService;

    @GetMapping("/{skuId}.html")
    public String skuItem(@PathVariable("skuId") Long skuId){

        System.out.println("准备查询" + skuId + "详情");
        SkuItemVo vo = skuInfoService.item(skuId);

        return "item";

    }
}
