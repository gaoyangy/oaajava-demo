package com.oaajava.demo.controller;

import com.oaajava.demo.model.entity.SysRolePermissionEntity;
import com.oaajava.demo.service.SysRolePermissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
    import org.springframework.web.bind.annotation.RestController;

/**
* @Package: com.oaajava.demo.model.entity.SysRolePermissionEntity
* @Description: <$!{table.comment}前端控制器>
* @Author: gaoyangy
* @CreateDate: 2022-07-31
* @UpdateUser: gaoyangy
* @UpdateDate: 2022-07-31
* @UpdateRemark: <>
* @Version: 1.0
*/

@RestController
@Api(tags = "SysRolePermissionEntity-相关接口")
@ApiOperation(value = "角色-权限关联表")
@RequestMapping("/sys-role-permission-entity")
        public class SysRolePermission {
    private static final Logger logger=LoggerFactory.getLogger(SysRolePermission.class);

    @Autowired
    private SysRolePermissionService iSysRolePermissionService;

    @GetMapping("GetSysRolePermissionEntityById/{id}")
    @ApiOperation(value = "根据id获取角色-权限关联表")
    public SysRolePermissionEntity getSysRolePermissionServiceDetails(@PathVariable Integer id){
        return iSysRolePermissionService.getById(id);
    }

    @PostMapping("PostSysRolePermissionEntity")
    @ApiOperation(value = "$!{table.comment}新增数据")
    public boolean saveSysRolePermissionService(@RequestBody SysRolePermissionEntity SysRolePermissionEntityDto){
        return iSysRolePermissionService.save(SysRolePermissionEntityDto);
    }

    @PutMapping("UpdateSysRolePermissionEntityById/{id}")
    @ApiOperation(value = "$!{table.comment}修改数据")
    public boolean modifySysRolePermissionService(@RequestBody SysRolePermissionEntity SysRolePermissionEntityDto,@PathVariable Integer id){
        return iSysRolePermissionService.updateById(SysRolePermissionEntityDto);
    }

    @DeleteMapping("DeleteSysRolePermissionEntityBatch")
    @ApiOperation(value = "角色-权限关联表批量删除数据")
    public boolean batchRemoveSysRolePermissionService(@RequestParam(value = "ids") List<Integer> ids){
        return iSysRolePermissionService.removeByIds(ids);
    }

    @DeleteMapping("DeleteSysRolePermissionEntityById/{id}")
    @ApiOperation(value = "角色-权限关联表删除数据")
    public boolean removeSysRolePermissionService(@PathVariable Integer id){
        return iSysRolePermissionService.removeById(id);
    }

    }


