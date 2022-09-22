package com.bjpowernode.gulimall.product.dao;

import com.bjpowernode.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author liaojianxiang
 * @email liaojianxiang@gmail.com
 * @date 2022-09-22 23:02:52
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
