package com.oaajava.demo.controller;

import com.oaajava.demo.model.entity.SysRoleEntity;
import com.oaajava.demo.service.SysRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
    import org.springframework.web.bind.annotation.RestController;

/**
* @Package: com.oaajava.demo.model.entity.SysRoleEntity
* @Description: <$!{table.comment}前端控制器>
* @Author: gaoyangy
* @CreateDate: 2022-07-31
* @UpdateUser: gaoyangy
* @UpdateDate: 2022-07-31
* @UpdateRemark: <>
* @Version: 1.0
*/

@RestController
@Api(tags = "SysRoleEntity-相关接口")
@ApiOperation(value = "后台角色表")
@RequestMapping("/sys-role-entity")
        public class SysRole {
    private static final Logger logger=LoggerFactory.getLogger(SysRole.class);

    @Autowired
    private SysRoleService iSysRoleService;

    @GetMapping("GetSysRoleEntityById/{id}")
    @ApiOperation(value = "根据id获取后台角色表")
    public SysRoleEntity getSysRoleServiceDetails(@PathVariable Integer id){
        return iSysRoleService.getById(id);
    }

    @PostMapping("PostSysRoleEntity")
    @ApiOperation(value = "$!{table.comment}新增数据")
    public boolean saveSysRoleService(@RequestBody SysRoleEntity SysRoleEntityDto){
        return iSysRoleService.save(SysRoleEntityDto);
    }

    @PutMapping("UpdateSysRoleEntityById/{id}")
    @ApiOperation(value = "$!{table.comment}修改数据")
    public boolean modifySysRoleService(@RequestBody SysRoleEntity SysRoleEntityDto,@PathVariable Integer id){
        return iSysRoleService.updateById(SysRoleEntityDto);
    }

    @DeleteMapping("DeleteSysRoleEntityBatch")
    @ApiOperation(value = "后台角色表批量删除数据")
    public boolean batchRemoveSysRoleService(@RequestParam(value = "ids") List<Integer> ids){
        return iSysRoleService.removeByIds(ids);
    }

    @DeleteMapping("DeleteSysRoleEntityById/{id}")
    @ApiOperation(value = "后台角色表删除数据")
    public boolean removeSysRoleService(@PathVariable Integer id){
        return iSysRoleService.removeById(id);
    }

    }


