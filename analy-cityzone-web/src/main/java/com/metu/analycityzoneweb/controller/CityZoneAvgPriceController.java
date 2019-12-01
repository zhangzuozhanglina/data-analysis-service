package com.metu.analycityzoneweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName CityZoneAvgPriceController
 * @Description 全国城市房价均价
 * @Author admin
 * @Date 2019/11/30 22:10
 * @Version 1.0
 **/
@Controller
public class CityZoneAvgPriceController {
    @GetMapping("/index")
    public String index() {
        return "CityAveragePrice";
    }
}
