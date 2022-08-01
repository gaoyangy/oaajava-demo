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
* @Package: com.oaajava.demo.controller
* @Description: <角色-权限关联表前端控制器>
* @Author: gaoyangy
* @CreateDate: 2022-08-01
* @UpdateUser: gaoyangy
* @UpdateDate: 2022-08-01
* @UpdateRemark: <>
* @Version: 1.0
*/

@RestController
@Api(tags = "角色-权限关联表-SysRolePermission相关接口")
@ApiOperation(value = "角色-权限关联表")
@RequestMapping("/SysRolePermission")
public class SysRolePermissionController {
    private static final Logger logger=LoggerFactory.getLogger(SysRolePermissionController.class);

    @Autowired
    private SysRolePermissionService iSysRolePermissionService;

    @GetMapping("GetSysRolePermissionById/{id}")
    @ApiOperation(value = "根据id获取角色-权限关联表")
    public SysRolePermissionEntity getSysRolePermissionServiceDetails(@PathVariable Integer id){
        return iSysRolePermissionService.getById(id);
    }

    @PostMapping("PostSysRolePermission")
    @ApiOperation(value = "角色-权限关联表新增数据")
    public boolean saveSysRolePermissionService(@RequestBody SysRolePermissionEntity SysRolePermissionEntityDto){
        return iSysRolePermissionService.save(SysRolePermissionEntityDto);
    }

    @PutMapping("UpdateSysRolePermissionById/{id}")
    @ApiOperation(value = "角色-权限关联表修改数据")
    public boolean modifySysRolePermissionService(@RequestBody SysRolePermissionEntity SysRolePermissionEntityDto,@PathVariable Integer id){
        return iSysRolePermissionService.updateById(SysRolePermissionEntityDto);
    }

    @DeleteMapping("DeleteSysRolePermissionBatch")
    @ApiOperation(value = "角色-权限关联表批量删除数据")
    public boolean batchRemoveSysRolePermissionService(@RequestParam(value = "ids") List<Integer> ids){
        return iSysRolePermissionService.removeByIds(ids);
    }

    @DeleteMapping("DeleteSysRolePermissionById/{id}")
    @ApiOperation(value = "角色-权限关联表删除数据")
    public boolean removeSysRolePermissionService(@PathVariable Integer id){
        return iSysRolePermissionService.removeById(id);
    }

}
