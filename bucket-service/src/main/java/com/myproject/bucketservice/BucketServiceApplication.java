package com.myproject.bucketservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BucketServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BucketServiceApplication.class, args);
    }

}
