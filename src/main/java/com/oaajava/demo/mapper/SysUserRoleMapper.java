package com.oaajava.demo.mapper;

import com.oaajava.demo.model.entity.SysUserRoleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户-角色关联表 Mapper 接口
 * </p>
 *
 * @author gaoyangy
 * @since 2022-08-01
 */
@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRoleEntity> {

}
