package com.myproject.bucketservice.controller;

import com.myproject.bucketservice.entity.BucketUser;
import com.myproject.bucketservice.service.BucketUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    BucketUserService bucketUserService;

    @Value("${server.port}")
    String port;
    @GetMapping("/{id}")
    public BucketUser findUserById(@PathVariable String id){
        log.info("server.port:"+port);
        return bucketUserService.findUserById(id);
    }
}
