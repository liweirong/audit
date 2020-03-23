package com.iris.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author iris
 * @date 2020/3/19
 */
@EqualsAndHashCode(callSuper = false)
@TableName("blog")
public class Blog implements Serializable {

    private Long id;

    private String username;

    private String title;

    private String subject;

    private String Context;

    private Integer state;

    public Blog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setContext(String context) {
        Context = context;
    }

    public String getContext() {
       return this.Context;
    }

    public void setState(Integer state) {
        this.state = state;
    }
    public Integer getState() {
        return this.state;
    }

}
