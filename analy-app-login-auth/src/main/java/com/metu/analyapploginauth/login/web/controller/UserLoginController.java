package com.metu.analyapploginauth.login.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName UserLoginController
 * @Description TODO
 * @Author admin
 * @Date 2019/11/29 14:24
 * @Version 1.0
 **/
@Controller
@RequestMapping(value = "/freemarker")
@Slf4j
public class UserLoginController {
    @RequestMapping(value = "/toDemo")
    public ModelAndView toDemo(ModelAndView mv) {
        log.info("====>>跳转freemarker页面");
        mv.addObject("name", "jack");
        mv.setViewName("freemarker");
        return mv;
    }
}
