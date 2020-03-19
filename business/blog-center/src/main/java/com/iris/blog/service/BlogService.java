package com.iris.blog.service;
import com.iris.blog.dao.BlogMapper;
import com.iris.blog.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author iris
 * @date 2020/3/19
 */
@Service
public class BlogService {

    @Autowired
    private BlogMapper blogMapper;

    public Boolean postBlog(Blog blog) {
        return blogMapper.save(blog) == 1;
    }

    public List<Blog> findBlogs(String username) {
        return blogMapper.findByUsername(username);
    }


    public Blog  findBlogDetail(Long id) {
        Blog blog = blogMapper.findOne(id);
        if (null == blog) {
            return new Blog();
        }
        return blog;
    }

}
