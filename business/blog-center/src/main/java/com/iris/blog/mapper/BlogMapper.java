package com.iris.blog.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.central.common.model.SysUser;
import com.central.db.mapper.SuperMapper;
import com.iris.blog.entity.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 用户表 Mapper 接口
 *
 * @Author: iris
 * @data 2018-10-29
 */
public interface BlogMapper extends SuperMapper<Blog> {
    /**
     * 分页查询用户列表
     * @param page
     * @param params
     * @return
     */
    List<Blog> findList();
}
