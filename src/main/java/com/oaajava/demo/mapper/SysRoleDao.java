package com.oaajava.demo.mapper;

import com.oaajava.demo.model.entity.SysRoleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 后台角色表 Mapper 接口
 * </p>
 *
 * @author gaoyangy
 * @since 2022-07-31
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {

}
