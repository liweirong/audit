package com.iris.blog.service;

import com.central.common.model.*;
import com.central.common.service.ISuperService;
import com.iris.blog.entity.Blog;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
* @Author: iris
 */
public interface IBlogService extends ISuperService<Blog> {

	/**
	 * 查询全部用户
	 * @param params
	 * @return
	 */
	List<Blog> findAllUsers();


}
