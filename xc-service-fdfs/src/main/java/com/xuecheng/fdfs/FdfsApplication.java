package com.xuecheng.fdfs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FdfsApplication {
    public static void main(String[] args) {
        SpringApplication.run(FdfsApplication.class,args);
    }
}
