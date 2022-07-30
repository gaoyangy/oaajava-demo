package com.oaajava.demo.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oaajava.demo.dao.SysRoleMapper;
import com.oaajava.demo.entity.SysRole;
import com.oaajava.demo.service.ISysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 后台角色表 服务实现类
 * </p>
 *
 * @author gaoyangy
 * @since 2022-07-30
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Override
    public String GetNameService(Integer id) {
        sysRoleMapper.getTreeByNested(id);
        return null;
    }
}
