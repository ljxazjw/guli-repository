package com.bjpowernode.gulimall.product.service.impl;

import com.bjpowernode.gulimall.product.entity.AttrEntity;
import com.bjpowernode.gulimall.product.service.AttrService;
import com.bjpowernode.gulimall.product.vo.AttrGroupWithAttrsVo;
import com.bjpowernode.gulimall.product.vo.SkuItemVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bjpowernode.common.utils.PageUtils;
import com.bjpowernode.common.utils.Query;

import com.bjpowernode.gulimall.product.dao.AttrGroupDao;
import com.bjpowernode.gulimall.product.entity.AttrGroupEntity;
import com.bjpowernode.gulimall.product.service.AttrGroupService;
import org.springframework.util.StringUtils;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Autowired
    AttrService attrService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageUtils(page);
    }
    @Override
    public PageUtils queryPage(Map<String, Object> params, Long catelogId) {
        if(catelogId == 0){
            IPage<AttrGroupEntity> page = this.page(new Query<AttrGroupEntity>().getPage(params),
                      new QueryWrapper<AttrGroupEntity>());
            return new PageUtils(page);
        }else {
            String key = (String) params.get("key");

            QueryWrapper<AttrGroupEntity> wrapper = new QueryWrapper<AttrGroupEntity>().eq("catelog_Id",catelogId);
            if(!StringUtils.isEmpty(key)){
                wrapper.and((obj) ->{
                    obj.eq("attr_group_id",key).or().like("attr_group_name",key);
                });

            }
            IPage<AttrGroupEntity> page = this.page(new Query<AttrGroupEntity>().getPage(params),
                    wrapper);
            return new PageUtils(page);
        }

    }

    /**
     *
     *
     * 根据分类id 查出所有的分组以及这些所有的属性
     * @param catelogId
     * @return
     */

    @Override
    public List<AttrGroupWithAttrsVo> getAttrGroupWithAttrsByCatelogId(Long catelogId) {
//        查询分组信息
        List<AttrGroupEntity> attrGroupEntities = this.list(new QueryWrapper<AttrGroupEntity>().eq("catelog_id", catelogId));
//        查询属性
        List<AttrGroupWithAttrsVo> collect = attrGroupEntities.stream().map(group -> {
            AttrGroupWithAttrsVo attrsVo = new AttrGroupWithAttrsVo();
            BeanUtils.copyProperties(group,attrsVo);
            List<AttrEntity> attrs = attrService.getRelationAttr(attrsVo.getAttrGroupId());
            attrsVo.setAttrs(attrs);
            return attrsVo;
        }).collect(Collectors.toList());
        return collect;

    }

//    @Override
//    public List<SkuItemVo.SpuItemBaseAttrVo> getAttrGroupWithAttrsBySpuId(Long spuId, Long catalogId) {
//        return null;
    }

//    @Override
//    public List<SkuItemVo.SpuItemBaseAttrVo> getAttrGroupWithAttrsBySpuId(Long spuId, Long catalogId) {
////        查出当前spu对应的所有属性分组信息以及对应的值
////        AttrGroupDao baseMapper = getBaseMapper();
////        List<SkuItemVo.SpuItemBaseAttrVo> Vos = baseMapper.getAttrGroupWithAttrsBySpuId(spuId,catalogId);
//    }
