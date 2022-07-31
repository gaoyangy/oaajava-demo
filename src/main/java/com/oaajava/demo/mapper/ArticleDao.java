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
 * @since 2022-07-31
 */
@Mapper
public interface ArticleDao extends BaseMapper<ArticleEntity> {

}
