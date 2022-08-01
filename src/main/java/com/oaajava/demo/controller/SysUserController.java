package com.oaajava.demo.controller;

import com.oaajava.demo.model.entity.SysUserEntity;
import com.oaajava.demo.service.SysUserService;
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
* @Description: <用户表前端控制器>
* @Author: gaoyangy
* @CreateDate: 2022-08-01
* @UpdateUser: gaoyangy
* @UpdateDate: 2022-08-01
* @UpdateRemark: <>
* @Version: 1.0
*/

@RestController
@Api(tags = "用户表-SysUser相关接口")
@ApiOperation(value = "用户表")
@RequestMapping("/SysUser")
public class SysUserController {
    private static final Logger logger=LoggerFactory.getLogger(SysUserController.class);

    @Autowired
    private SysUserService iSysUserService;

    @GetMapping("GetSysUserById/{id}")
    @ApiOperation(value = "根据id获取用户表")
    public SysUserEntity getSysUserServiceDetails(@PathVariable Integer id){
        return iSysUserService.getById(id);
    }

    @PostMapping("PostSysUser")
    @ApiOperation(value = "用户表新增数据")
    public boolean saveSysUserService(@RequestBody SysUserEntity SysUserEntityDto){
        return iSysUserService.save(SysUserEntityDto);
    }

    @PutMapping("UpdateSysUserById/{id}")
    @ApiOperation(value = "用户表修改数据")
    public boolean modifySysUserService(@RequestBody SysUserEntity SysUserEntityDto,@PathVariable Integer id){
        return iSysUserService.updateById(SysUserEntityDto);
    }

    @DeleteMapping("DeleteSysUserBatch")
    @ApiOperation(value = "用户表批量删除数据")
    public boolean batchRemoveSysUserService(@RequestParam(value = "ids") List<Integer> ids){
        return iSysUserService.removeByIds(ids);
    }

    @DeleteMapping("DeleteSysUserById/{id}")
    @ApiOperation(value = "用户表删除数据")
    public boolean removeSysUserService(@PathVariable Integer id){
        return iSysUserService.removeById(id);
    }

}
