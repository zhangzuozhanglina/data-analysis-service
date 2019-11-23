package com.metu.analyapploginauth.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @ClassName DemoController
 * @Description 测试用controller
 * @Author admin
 * @Date 2019/11/23 19:21
 * @Version 1.0
 **/
@RestController("DemoController")
public class DemoController {
    /* *
     * @Author zhengzz
     * @Description 提供日期服务调用
     * @Date 19:23 2019/11/23
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("/date")
    public String  getDate() {
        return new Date().toLocaleString();
    }

}
