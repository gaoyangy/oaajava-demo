package com.oaajava.demo.serviceImpl;

import com.oaajava.demo.entity.SysUserRole;
import com.oaajava.demo.dao.SysUserRoleMapper;
import com.oaajava.demo.service.ISysUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户-角色关联表 服务实现类
 * </p>
 *
 * @author gaoyangy
 * @since 2022-07-30
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements ISysUserRoleService {

}
