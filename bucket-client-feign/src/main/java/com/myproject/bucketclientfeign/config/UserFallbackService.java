package com.myproject.bucketclientfeign.config;

import com.myproject.bucketclientfeign.entity.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserFallbackService implements UserFeignClient {
    @Override
    public User findUserById(String id) {
        return new User("-1","defaultUser");
    }
}
