package com.myproject.bucketclientfeign.controller;

import com.myproject.bucketclientfeign.config.UserFeignClient;
import com.myproject.bucketclientfeign.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable String id){
        return userFeignClient.findUserById(id);
    }
}
