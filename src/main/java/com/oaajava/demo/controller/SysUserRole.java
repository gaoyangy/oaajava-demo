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
* @Package: com.oaajava.demo.model.entity.SysUserRoleEntity
* @Description: <$!{table.comment}前端控制器>
* @Author: gaoyangy
* @CreateDate: 2022-07-31
* @UpdateUser: gaoyangy
* @UpdateDate: 2022-07-31
* @UpdateRemark: <>
* @Version: 1.0
*/

@RestController
@Api(tags = "SysUserRoleEntity-相关接口")
@ApiOperation(value = "用户-角色关联表")
@RequestMapping("/sys-user-role-entity")
        public class SysUserRole {
    private static final Logger logger=LoggerFactory.getLogger(SysUserRole.class);

    @Autowired
    private SysUserRoleService iSysUserRoleService;

    @GetMapping("GetSysUserRoleEntityById/{id}")
    @ApiOperation(value = "根据id获取用户-角色关联表")
    public SysUserRoleEntity getSysUserRoleServiceDetails(@PathVariable Integer id){
        return iSysUserRoleService.getById(id);
    }

    @PostMapping("PostSysUserRoleEntity")
    @ApiOperation(value = "$!{table.comment}新增数据")
    public boolean saveSysUserRoleService(@RequestBody SysUserRoleEntity SysUserRoleEntityDto){
        return iSysUserRoleService.save(SysUserRoleEntityDto);
    }

    @PutMapping("UpdateSysUserRoleEntityById/{id}")
    @ApiOperation(value = "$!{table.comment}修改数据")
    public boolean modifySysUserRoleService(@RequestBody SysUserRoleEntity SysUserRoleEntityDto,@PathVariable Integer id){
        return iSysUserRoleService.updateById(SysUserRoleEntityDto);
    }

    @DeleteMapping("DeleteSysUserRoleEntityBatch")
    @ApiOperation(value = "用户-角色关联表批量删除数据")
    public boolean batchRemoveSysUserRoleService(@RequestParam(value = "ids") List<Integer> ids){
        return iSysUserRoleService.removeByIds(ids);
    }

    @DeleteMapping("DeleteSysUserRoleEntityById/{id}")
    @ApiOperation(value = "用户-角色关联表删除数据")
    public boolean removeSysUserRoleService(@PathVariable Integer id){
        return iSysUserRoleService.removeById(id);
    }

    }


