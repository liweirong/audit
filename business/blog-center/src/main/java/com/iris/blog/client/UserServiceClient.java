package com.iris.blog.client;

import com.iris.blog.client.hystrix.UserServiceHystrix;
import com.iris.blog.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;


/**
 * @author iris
 * @date 2020/3/19
 */
@FeignClient(value = "user-service", fallback = UserServiceHystrix.class)
public interface UserServiceClient {

    @PostMapping(value = "/user/{username}")
    RespDTO<User> getUser(@RequestHeader(value = "Authorization") String token, @PathVariable("username") String username);
}



