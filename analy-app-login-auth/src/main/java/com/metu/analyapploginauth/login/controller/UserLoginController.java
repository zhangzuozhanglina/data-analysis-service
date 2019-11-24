package com.metu.analyapploginauth.login.controller;

import io.swagger.annotations.Api;
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
@Api(value="demo", description="这是一个Swagger demo的服务")
public class UserLoginController {
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
