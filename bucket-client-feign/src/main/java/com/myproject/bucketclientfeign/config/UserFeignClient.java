package com.myproject.bucketclientfeign.config;

import com.myproject.bucketclientfeign.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="bucket-service", fallback = UserFallbackService.class)
public interface UserFeignClient {

    @RequestMapping("/user/{id}")
    User findUserById(@PathVariable String id);
}
