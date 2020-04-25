package com.xuecheng.fdfs;

import com.xuecheng.fdfs.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
//@Import({RibbonConfig.class})
@EnableFeignClients
public class FdfsApplication {
    public static void main(String[] args) {
        SpringApplication.run(FdfsApplication.class,args);
    }


    @Bean
    @LoadBalanced //开启负载均衡策略
    public RestTemplate restTemplate(){
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }

}
