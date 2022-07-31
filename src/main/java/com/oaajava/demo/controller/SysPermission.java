package com.oaajava.demo.controller;

import com.oaajava.demo.model.entity.SysPermissionEntity;
import com.oaajava.demo.service.SysPermissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Package: com.oaajava.demo.model.entity.SysPermissionEntity
 * @Description: <$!{table.comment}前端控制器>
 * @Author: gaoyangy
 * @CreateDate: 2022-07-31
 * @UpdateUser: gaoyangy
 * @UpdateDate: 2022-07-31
 * @UpdateRemark: <>
 * @Version: 1.0
 */

@RestController
@Api(tags = "SysPermissionEntity-相关接口")
@ApiOperation(value = "后台权限表")
@RequestMapping("/sys-permission-entity")
public class SysPermission {
    private static final Logger logger = LoggerFactory.getLogger(SysPermission.class);

    @Autowired
    private SysPermissionService iSysPermissionService;

    @GetMapping("GetSysPermissionEntityById/{id}")
    @ApiOperation(value = "根据id获取后台权限表")
    public SysPermissionEntity getSysPermissionServiceDetails(@PathVariable Integer id) {
        return iSysPermissionService.getById(id);
    }

    @PostMapping("PostSysPermissionEntity")
    @ApiOperation(value = "$!{table.comment}新增数据")
    public boolean saveSysPermissionService(@RequestBody SysPermissionEntity SysPermissionEntityDto) {
        return iSysPermissionService.save(SysPermissionEntityDto);
    }

    @PutMapping("UpdateSysPermissionEntityById/{id}")
    @ApiOperation(value = "$!{table.comment}修改数据")
    public boolean modifySysPermissionService(@RequestBody SysPermissionEntity SysPermissionEntityDto, @PathVariable Integer id) {
        return iSysPermissionService.updateById(SysPermissionEntityDto);
    }

    @DeleteMapping("DeleteSysPermissionEntityBatch")
    @ApiOperation(value = "后台权限表批量删除数据")
    public boolean batchRemoveSysPermissionService(@RequestParam(value = "ids") List<Integer> ids) {
        return iSysPermissionService.removeByIds(ids);
    }

    @DeleteMapping("DeleteSysPermissionEntityById/{id}")
    @ApiOperation(value = "后台权限表删除数据")
    public boolean removeSysPermissionService(@PathVariable Integer id) {
        return iSysPermissionService.removeById(id);
    }

}


