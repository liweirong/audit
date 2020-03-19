package com.iris.blog.controller;
import com.iris.blog.aop.SysLogger;
import com.iris.blog.entity.Blog;
import com.iris.blog.service.BlogService;
import com.iris.blog.util.UserUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
/**
 * @author iris
 * @date 2020/3/19
 */
@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogService blogService;

    @ApiOperation(value = "发布博客", notes = "发布博客")
    @PreAuthorize("hasRole('USER')")
    @PostMapping("")
    @SysLogger("postBlog")
    public Boolean postBlog(@RequestBody Blog blog){
        //字段判读省略
        Boolean bool= blogService.postBlog(blog);
        return bool;
    }

    @ApiOperation(value = "根据用户id获取所有的blog", notes = "根据用户id获取所有的blog")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    @GetMapping("/{username}")
    @SysLogger("getBlogs")
    public List<Blog> getBlogs(@PathVariable String  username){
        //字段判读省略
        if(UserUtils.isMyself(username)) {
            List<Blog> blogs = blogService.findBlogs(username);
            return blogs;
        }else {
            return Collections.emptyList();
        }
    }

    @ApiOperation(value = "获取博文的详细信息", notes = "获取博文的详细信息")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    @GetMapping("/detail/{id}")
    @SysLogger("getBlogDetail")
    public List<Blog>  getBlogDetail(@PathVariable Long id){
        return blogService.findBlogDetail(id);
    }
}
