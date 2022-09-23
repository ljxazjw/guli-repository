package com.bjpowernode.gulimall.member.dao;

import com.bjpowernode.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author liaojianxiang
 * @email liaojianxiang@gmail.com
 * @date 2022-09-23 21:07:19
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
