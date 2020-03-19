package com.iris.blog.dto;

import com.iris.blog.entity.Blog;
import com.iris.blog.entity.User;

/**
 * @author iris
 * @date 2020/3/19
 */
public class BlogDetailDTO {
    private Blog blog;
    private User user;

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
