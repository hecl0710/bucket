package com.myproject.bucketservice.service;

import com.myproject.bucketservice.entity.BucketUser;

public interface BucketUserService {
    BucketUser findUserById(String id);
}
