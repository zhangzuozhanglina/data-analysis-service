package com.metu.cityspider;

import cn.wanghaomiao.seimi.annotation.EnableSeimiCrawler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSeimiCrawler
public class AnalyCityzonePriceSpiderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnalyCityzonePriceSpiderServiceApplication.class, args);
    }

}
