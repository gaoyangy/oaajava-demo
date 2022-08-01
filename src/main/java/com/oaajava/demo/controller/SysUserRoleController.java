package com.oaajava.demo.controller;

import com.oaajava.demo.model.entity.SysUserRoleEntity;
import com.oaajava.demo.service.SysUserRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
    import org.springframework.web.bind.annotation.RestController;

/**
* @Package: com.oaajava.demo.controller
* @Description: <用户-角色关联表前端控制器>
* @Author: gaoyangy
* @CreateDate: 2022-08-01
* @UpdateUser: gaoyangy
* @UpdateDate: 2022-08-01
* @UpdateRemark: <>
* @Version: 1.0
*/

@RestController
@Api(tags = "用户-角色关联表-SysUserRole相关接口")
@ApiOperation(value = "用户-角色关联表")
@RequestMapping("/SysUserRole")
public class SysUserRoleController {
    private static final Logger logger=LoggerFactory.getLogger(SysUserRoleController.class);

    @Autowired
    private SysUserRoleService iSysUserRoleService;

    @GetMapping("GetSysUserRoleById/{id}")
    @ApiOperation(value = "根据id获取用户-角色关联表")
    public SysUserRoleEntity getSysUserRoleServiceDetails(@PathVariable Integer id){
        return iSysUserRoleService.getById(id);
    }

    @PostMapping("PostSysUserRole")
    @ApiOperation(value = "用户-角色关联表新增数据")
    public boolean saveSysUserRoleService(@RequestBody SysUserRoleEntity SysUserRoleEntityDto){
        return iSysUserRoleService.save(SysUserRoleEntityDto);
    }

    @PutMapping("UpdateSysUserRoleById/{id}")
    @ApiOperation(value = "用户-角色关联表修改数据")
    public boolean modifySysUserRoleService(@RequestBody SysUserRoleEntity SysUserRoleEntityDto,@PathVariable Integer id){
        return iSysUserRoleService.updateById(SysUserRoleEntityDto);
    }

    @DeleteMapping("DeleteSysUserRoleBatch")
    @ApiOperation(value = "用户-角色关联表批量删除数据")
    public boolean batchRemoveSysUserRoleService(@RequestParam(value = "ids") List<Integer> ids){
        return iSysUserRoleService.removeByIds(ids);
    }

    @DeleteMapping("DeleteSysUserRoleById/{id}")
    @ApiOperation(value = "用户-角色关联表删除数据")
    public boolean removeSysUserRoleService(@PathVariable Integer id){
        return iSysUserRoleService.removeById(id);
    }

}
