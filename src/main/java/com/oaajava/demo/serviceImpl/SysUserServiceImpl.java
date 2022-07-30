package com.oaajava.demo.serviceImpl;

import com.oaajava.demo.entity.SysUser;
import com.oaajava.demo.dao.SysUserMapper;
import com.oaajava.demo.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author gaoyangy
 * @since 2022-07-30
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
