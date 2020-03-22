package com.iris.blog.config;

import com.central.db.config.DefaultMybatisPlusConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: iris
 * @date 2018/12/10
 */
@Configuration
@MapperScan({"com.iris.blog.mapper*"})
public class MybatisPlusConfig extends DefaultMybatisPlusConfig {
}
