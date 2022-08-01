package com.oaajava.demo.controller;

import com.oaajava.demo.model.entity.ArticleEntity;
import com.oaajava.demo.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Package: com.oaajava.demo.controller
 * @Description: <文章表前端控制器>
 * @Author: gaoyangy
 * @CreateDate: 2022-08-01
 * @UpdateUser: gaoyangy
 * @UpdateDate: 2022-08-01
 * @UpdateRemark: <>
 * @Version: 1.0
 */

@RestController
@Api(tags = "文章表-Article相关接口")
@ApiOperation(value = "文章表")
@RequestMapping("/Article")
public class ArticleController {
    private static final Logger logger = LoggerFactory.getLogger(ArticleController.class);

    @Autowired
    private ArticleService iArticleService;

    @GetMapping("GetArticleById/{id}")
    @ApiOperation(value = "根据id获取文章表")
    public ArticleEntity getArticleServiceDetails(@PathVariable Integer id) {
        return iArticleService.getById(id);
    }

    @PostMapping("PostArticle")
    @ApiOperation(value = "文章表新增数据")
    public boolean saveArticleService(@RequestBody ArticleEntity ArticleEntityDto) {
        return iArticleService.save(ArticleEntityDto);
    }

    @PutMapping("UpdateArticleById/{id}")
    @ApiOperation(value = "文章表修改数据")
    public boolean modifyArticleService(@RequestBody ArticleEntity ArticleEntityDto, @PathVariable Integer id) {
        return iArticleService.updateById(ArticleEntityDto);
    }

    @DeleteMapping("DeleteArticleBatch")
    @ApiOperation(value = "文章表批量删除数据")
    public boolean batchRemoveArticleService(@RequestParam(value = "ids") List<Integer> ids) {
        return iArticleService.removeByIds(ids);
    }

    @DeleteMapping("DeleteArticleById/{id}")
    @ApiOperation(value = "文章表删除数据")
    public boolean removeArticleService(@PathVariable Integer id) {
        return iArticleService.removeById(id);
    }

}
