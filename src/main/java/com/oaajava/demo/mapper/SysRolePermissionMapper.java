package com.oaajava.demo.mapper;

import com.oaajava.demo.model.entity.SysRolePermissionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 角色-权限关联表 Mapper 接口
 * </p>
 *
 * @author gaoyangy
 * @since 2022-08-01
 */
@Mapper
public interface SysRolePermissionMapper extends BaseMapper<SysRolePermissionEntity> {

}
