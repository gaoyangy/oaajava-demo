package com.oaajava.demo.service.impl;

import com.oaajava.demo.model.entity.SysUserEntity;
import com.oaajava.demo.mapper.SysUserDao;
import com.oaajava.demo.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author gaoyangy
 * @since 2022-07-31
 */
@Service
public class SysUserServiceImp extends ServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {

}
