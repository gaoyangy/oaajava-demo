package com.oaajava.demo.mapper;

import com.oaajava.demo.model.entity.SysUserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author gaoyangy
 * @since 2022-08-01
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUserEntity> {

}
