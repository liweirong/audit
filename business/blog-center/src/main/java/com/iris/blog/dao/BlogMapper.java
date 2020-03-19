package com.iris.blog.dao;

import com.central.common.model.SysRole;
import com.central.db.mapper.SuperMapper;
import com.iris.blog.entity.Blog;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author iris
 * @date 2020/3/19
 */
@Mapper
public interface BlogMapper extends SuperMapper<SysRole> {
    List<Blog> findByUsername(String username);

    Integer save(Blog blog);

    Blog findOne(Long id);

}
