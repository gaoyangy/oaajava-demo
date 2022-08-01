package ${package.Controller};

import ${package.Entity}.${entity};
import ${package.Service}.${table.serviceName};
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
<#if restControllerStyle>
    import org.springframework.web.bind.annotation.RestController;
<#else>
    import org.springframework.stereotype.Controller;
</#if>
<#if superControllerClassPackage??>
    import ${superControllerClassPackage};
</#if>

/**
* @Package: ${package.Controller}
* @Description: <${table.comment}前端控制器>
* @Author: ${author}
* @CreateDate: ${date}
* @UpdateUser: ${author}
* @UpdateDate: ${date}
* @UpdateRemark: <>
* @Version: 1.0
*/

<#if restControllerStyle>
@RestController
<#else>
@Controller
</#if>
@Api(tags = "${table.comment}-${apiName}")
@ApiOperation(value = "${table.comment}")
@RequestMapping("/${apiName}")
<#if kotlin>
class ${table.controllerName}<#if superControllerClass??> : ${superControllerClass}()</#if>
<#else>
    <#if superControllerClass??>
public class ${table.controllerName} extends ${superControllerClass} {
    <#else>
public class ${table.controllerName} {
    </#if>
    private static final Logger logger=LoggerFactory.getLogger(${table.controllerName}.class);

    @Autowired
    private ${table.serviceName} i${table.serviceName};

    @GetMapping("Get${apiName}ById/{id}")
    @ApiOperation(value = "根据id获取${table.comment}")
    public ${entity} get${table.serviceName}Details(@PathVariable Integer id){
        return i${table.serviceName}.getById(id);
    }

    @PostMapping("Post${apiName}")
    @ApiOperation(value = "${table.comment}新增数据")
    public boolean save${table.serviceName}(@RequestBody ${entity} ${entity}Dto){
        return i${table.serviceName}.save(${entity}Dto);
    }

    @PutMapping("Update${apiName}ById/{id}")
    @ApiOperation(value = "${table.comment}修改数据")
    public boolean modify${table.serviceName}(@RequestBody ${entity} ${entity}Dto,@PathVariable Integer id){
        return i${table.serviceName}.updateById(${entity}Dto);
    }

    @DeleteMapping("Delete${apiName}Batch")
    @ApiOperation(value = "${table.comment}批量删除数据")
    public boolean batchRemove${table.serviceName}(@RequestParam(value = "ids") List<Integer> ids){
        return i${table.serviceName}.removeByIds(ids);
    }

    @DeleteMapping("Delete${apiName}ById/{id}")
    @ApiOperation(value = "${table.comment}删除数据")
    public boolean remove${table.serviceName}(@PathVariable Integer id){
        return i${table.serviceName}.removeById(id);
    }

}
</#if>
