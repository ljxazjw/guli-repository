package com.bjpowernode.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bjpowernode.common.utils.PageUtils;
import com.bjpowernode.gulimall.product.entity.SkuImagesEntity;

import java.util.List;
import java.util.Map;

/**
 * sku图片
 *
 * @author liaojianxiang
 * @email liaojianxiang@gmail.com
 * @date 2022-09-22 23:02:52
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<SkuImagesEntity> getImagesBySkuId(Long skuId);
}

