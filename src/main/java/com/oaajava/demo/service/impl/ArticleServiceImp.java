package com.oaajava.demo.service.impl;

import com.oaajava.demo.model.entity.ArticleEntity;
import com.oaajava.demo.mapper.ArticleDao;
import com.oaajava.demo.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章表 服务实现类
 * </p>
 *
 * @author gaoyangy
 * @since 2022-07-31
 */
@Service
public class ArticleServiceImp extends ServiceImpl<ArticleDao, ArticleEntity> implements ArticleService {

}
