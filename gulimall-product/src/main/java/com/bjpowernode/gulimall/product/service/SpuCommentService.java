package com.bjpowernode.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bjpowernode.common.utils.PageUtils;
import com.bjpowernode.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author liaojianxiang
 * @email liaojianxiang@gmail.com
 * @date 2022-09-22 23:02:52
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

