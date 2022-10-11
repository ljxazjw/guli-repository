package com.bjpowernode.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bjpowernode.common.utils.PageUtils;
import com.bjpowernode.gulimall.product.entity.SpuInfoDescEntity;
import com.bjpowernode.gulimall.product.entity.SpuInfoEntity;
import com.bjpowernode.gulimall.product.vo.SpuSaveVo;

import java.util.Map;

/**
 * spu信息
 *
 * @author liaojianxiang
 * @email liaojianxiang@gmail.com
 * @date 2022-09-22 23:02:52
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity infoEntity);

    void saveSpuInfoDesc(SpuInfoDescEntity descEntity);

    void up(Long spuId);
}

