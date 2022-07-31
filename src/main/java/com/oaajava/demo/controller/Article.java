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
 * @Package: com.oaajava.demo.model.entity.ArticleEntity
 * @Description: <$!{table.comment}前端控制器>
 * @Author: gaoyangy
 * @CreateDate: 2022-07-31
 * @UpdateUser: gaoyangy
 * @UpdateDate: 2022-07-31
 * @UpdateRemark: <>
 * @Version: 1.0
 */

@RestController
@Api(tags = "ArticleEntity-相关接口")
@ApiOperation(value = "文章表")
@RequestMapping("/article-entity")
public class Article {
    private static final Logger logger = LoggerFactory.getLogger(Article.class);

    @Autowired
    private ArticleService iArticleService;

    @GetMapping("GetArticleEntityById/{id}")
    @ApiOperation(value = "根据id获取文章表")
    public ArticleEntity getArticleServiceDetails(@PathVariable Integer id) {
        return iArticleService.getById(id);
    }

    @PostMapping("PostArticleEntity")
    @ApiOperation(value = "$!{table.comment}新增数据")
    public boolean saveArticleService(@RequestBody ArticleEntity ArticleEntityDto) {
        return iArticleService.save(ArticleEntityDto);
    }

    @PutMapping("UpdateArticleEntityById/{id}")
    @ApiOperation(value = "$!{table.comment}修改数据")
    public boolean modifyArticleService(@RequestBody ArticleEntity ArticleEntityDto, @PathVariable Integer id) {
        return iArticleService.updateById(ArticleEntityDto);
    }

    @DeleteMapping("DeleteArticleEntityBatch")
    @ApiOperation(value = "文章表批量删除数据")
    public boolean batchRemoveArticleService(@RequestParam(value = "ids") List<Integer> ids) {
        return iArticleService.removeByIds(ids);
    }

    @DeleteMapping("DeleteArticleEntityById/{id}")
    @ApiOperation(value = "文章表删除数据")
    public boolean removeArticleService(@PathVariable Integer id) {
        return iArticleService.removeById(id);
    }

}


