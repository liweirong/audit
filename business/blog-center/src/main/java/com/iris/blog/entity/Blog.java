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

    private String suject;


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

    public String getSuject() {
        return suject;
    }

    public void setSuject(String suject) {
        this.suject = suject;
    }
}
