package com.metu.authfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.metu"})
@ComponentScan(basePackages = {"com"})
@EnableHystrixDashboard
@EnableCircuitBreaker
public class AnalyAppLoginAuthFeignServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnalyAppLoginAuthFeignServiceApplication.class, args);
    }

}
