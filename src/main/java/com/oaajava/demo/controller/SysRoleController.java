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

/**
 * @Package: com.oaajava.demo.controller
 * @Description: <后台角色表前端控制器>
 * @Author: gaoyangy
 * @CreateDate: 2022-08-01
 * @UpdateUser: gaoyangy
 * @UpdateDate: 2022-08-01
 * @UpdateRemark: <>
 * @Version: 1.0
 */

@RestController
@Api(tags = "后台角色表-SysRole相关接口")
@ApiOperation(value = "后台角色表")
@RequestMapping("/SysRole")
public class SysRoleController {
    private static final Logger logger = LoggerFactory.getLogger(SysRoleController.class);

    @Autowired
    private SysRoleService iSysRoleService;

    @GetMapping("GetSysRoleById/{id}")
    @ApiOperation(value = "根据id获取后台角色表")
    public SysRoleEntity getSysRoleServiceDetails(@PathVariable Integer id) {
        return iSysRoleService.getById(id);
    }

    @PostMapping("PostSysRole")
    @ApiOperation(value = "后台角色表新增数据")
    public boolean saveSysRoleService(@RequestBody SysRoleEntity SysRoleEntityDto) {
        return iSysRoleService.save(SysRoleEntityDto);
    }

    @PutMapping("UpdateSysRoleById/{id}")
    @ApiOperation(value = "后台角色表修改数据")
    public boolean modifySysRoleService(@RequestBody SysRoleEntity SysRoleEntityDto, @PathVariable Integer id) {
        return iSysRoleService.updateById(SysRoleEntityDto);
    }

    @DeleteMapping("DeleteSysRoleBatch")
    @ApiOperation(value = "后台角色表批量删除数据")
    public boolean batchRemoveSysRoleService(@RequestParam(value = "ids") List<Integer> ids) {
        return iSysRoleService.removeByIds(ids);
    }

    @DeleteMapping("DeleteSysRoleById/{id}")
    @ApiOperation(value = "后台角色表删除数据")
    public boolean removeSysRoleService(@PathVariable Integer id){
        return iSysRoleService.removeById(id);
    }

}
