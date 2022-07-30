package com.oaajava.demo.controller;


import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import com.oaajava.demo.service.ISysRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 后台角色表 前端控制器
 * </p>
 *
 * @author gaoyangy
 * @since 2022-07-30
 */
@Api(tags = "2.0.3版本-20200312")
@ApiSupport(author = "xiaoymin@foxmail.com")
@ApiOperation(value = "写文档注释我是认真的")
@RestController
@RequestMapping("/sys-role")
public class SysRoleController {
    private ISysRoleService sysRoleService;

    public SysRoleController(ISysRoleService iSysRoleService) {
        this.sysRoleService = iSysRoleService;
    }

    @RequestMapping("/mm")
    private String Name(@RequestParam(name="id", required=false) String id) {
        String Name = sysRoleService.GetNameService(Integer.valueOf(id));
        return "姓名是" + Name;
    }
}

