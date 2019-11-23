package com.metu.analyeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AnalyEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnalyEurekaServiceApplication.class, args);
    }

}
