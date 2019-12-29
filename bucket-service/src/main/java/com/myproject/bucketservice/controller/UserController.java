package com.myproject.bucketservice.controller;

import com.myproject.bucketservice.entity.BucketUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{id}")
    public BucketUser findUserById(@PathVariable String id){
        return new BucketUser(id, id+System.currentTimeMillis());
    }
}
