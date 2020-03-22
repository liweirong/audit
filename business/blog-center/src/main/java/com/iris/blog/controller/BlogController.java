package com.iris.blog.controller;

import com.iris.blog.entity.Blog;
import com.iris.blog.service.IBlogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

//import com.central.log.annotation.AuditLog;

/**
 * @Author iris
 * 用户
 */
@Slf4j
@RestController
@Api(tags = "行业要闻发布api")
public class BlogController {

    @Autowired
    private IBlogService blogService;


    /**
     * 用户查询
     *
     * @param params
     * @return
     */
    @ApiOperation(value = "行业要闻查询列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "分页起始位置", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "limit", value = "分页结束位置", required = true, dataType = "Integer")
    })
    @GetMapping("/blogs")
    public List<Blog> findUsers(@RequestParam Map<String, Object> params) {
        return blogService.findAllUsers();
    }


}
