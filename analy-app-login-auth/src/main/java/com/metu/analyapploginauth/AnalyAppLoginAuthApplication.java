package com.metu.analyapploginauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AnalyAppLoginAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnalyAppLoginAuthApplication.class, args);
    }

}
