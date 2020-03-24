package com.metu.analyconfigclient.controller;

import com.metu.analyconfigclient.config.SpringConnfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigController
 * @Description TODO
 * @Author admin
 * @Date 2019/12/1 21:52
 * @Version 1.0
 **/
@RestController
@RefreshScope
public class ConfigController {
    @Autowired
    private SpringConnfigProperties SpringConnfigProperties;
    @RequestMapping("/getconfig")
    public String getConfigFromCenter() {
        return SpringConnfigProperties.getActive();
    }
}
