package com.oaajava.demo.mapper;

import com.oaajava.demo.model.entity.SysPermissionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 后台权限表 Mapper 接口
 * </p>
 *
 * @author gaoyangy
 * @since 2022-07-31
 */
@Mapper
public interface SysPermissionDao extends BaseMapper<SysPermissionEntity> {

}
