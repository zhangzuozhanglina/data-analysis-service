package com.metu.analyapploginauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.metu.analyapploginauth.mapper")
public class AnalyAppLoginAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnalyAppLoginAuthApplication.class, args);
    }

}
