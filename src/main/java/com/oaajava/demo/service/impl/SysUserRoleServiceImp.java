package com.oaajava.demo.service.impl;

import com.oaajava.demo.model.entity.SysUserRoleEntity;
import com.oaajava.demo.mapper.SysUserRoleDao;
import com.oaajava.demo.service.SysUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户-角色关联表 服务实现类
 * </p>
 *
 * @author gaoyangy
 * @since 2022-07-31
 */
@Service
public class SysUserRoleServiceImp extends ServiceImpl<SysUserRoleDao, SysUserRoleEntity> implements SysUserRoleService {

}
