package com.oaajava.demo.mapper;

import com.oaajava.demo.model.entity.ArticleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 文章表 Mapper 接口
 * </p>
 *
 * @author gaoyangy
 * @since 2022-08-01
 */
@Mapper
public interface ArticleMapper extends BaseMapper<ArticleEntity> {

}
