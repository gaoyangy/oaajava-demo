package com.oaajava.demo.service;

import com.oaajava.demo.entity.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 后台角色表 服务类
 * </p>
 *
 * @author gaoyangy
 * @since 2022-07-30
 */
public interface ISysRoleService extends IService<SysRole> {

    String GetNameService(Integer id);
}
