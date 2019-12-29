package com.myproject.bucketclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BucketClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(BucketClientApplication.class, args);
    }

}
