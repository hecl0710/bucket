package com.myproject.bucketclient.service.impl;

import com.alibaba.fastjson.JSON;
import com.myproject.bucketclient.entity.User;
import com.myproject.bucketclient.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserSerivceImpl implements UserService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${server-url.user-service-url}")
    String url;

    @Override
    @HystrixCommand(fallbackMethod = "getDefaultUser")
    public User getUser(String id) {
        ResponseEntity<User> responseEntity = restTemplate.getForEntity(url+id, User.class);
        log.info(JSON.toJSONString(responseEntity));
        return responseEntity.getBody();
    }

    public User getDefaultUser(String id){
        log.info("hystrix execute");
        return new User("-1","defaultUser");
    }

}
