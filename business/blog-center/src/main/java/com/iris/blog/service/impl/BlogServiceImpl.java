package com.iris.blog.service.impl;

import com.central.common.service.impl.SuperServiceImpl;
import com.iris.blog.entity.Blog;
import com.iris.blog.mapper.BlogMapper;
import com.iris.blog.service.IBlogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author iris
 */
@Slf4j
@Service
public class BlogServiceImpl extends SuperServiceImpl<BlogMapper, Blog> implements IBlogService {

    @Override
    public List<Blog> findAllUsers() {
        return baseMapper.findList();
    }
}