package com.oaajava.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oaajava.demo.entity.SysRole;

import java.util.List;

/**
 * <p>
 * 后台角色表 Mapper 接口
 * </p>
 *
 * @author gaoyangy
 * @since 2022-07-30
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {

    List<SysRole> getTreeByNested(Integer id);
}
