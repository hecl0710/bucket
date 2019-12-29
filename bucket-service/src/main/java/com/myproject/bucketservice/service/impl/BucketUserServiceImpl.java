package com.myproject.bucketservice.service.impl;

import com.myproject.bucketservice.entity.BucketUser;
import com.myproject.bucketservice.service.BucketUserService;
import org.springframework.stereotype.Service;

@Service
public class BucketUserServiceImpl implements BucketUserService {
    @Override
    public BucketUser findUserById(String id) {
        return new BucketUser(id, id+System.currentTimeMillis());
    }

}
