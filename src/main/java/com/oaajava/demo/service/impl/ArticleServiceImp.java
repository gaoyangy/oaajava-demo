package com.oaajava.demo.service.impl;

import com.oaajava.demo.model.entity.ArticleEntity;
import com.oaajava.demo.mapper.ArticleMapper;
import com.oaajava.demo.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章表 服务实现类
 * </p>
 *
 * @author gaoyangy
 * @since 2022-08-01
 */
@Service
public class ArticleServiceImp extends ServiceImpl<ArticleMapper, ArticleEntity> implements ArticleService {

}
