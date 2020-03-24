package com.metu.analyconfigcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AnalyConfigcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnalyConfigcenterApplication.class, args);
    }

}
