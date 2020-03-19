package com.iris.blog.client.hystrix;

import com.iris.blog.client.UserServiceClient;
import com.iris.blog.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author iris
 * @date 2020/3/19
 */
@Component
public class UserServiceHystrix implements UserServiceClient {

    @Override
    public RespDTO<User> getUser(String token, String username) {
        System.out.println(token);
        System.out.println(username);
        return null;
    }
}
