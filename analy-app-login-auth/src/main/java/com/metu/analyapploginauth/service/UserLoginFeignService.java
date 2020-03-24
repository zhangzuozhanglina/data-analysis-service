package com.metu.analyapploginauth.service;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@FeignClient(name="Service",url = "localhost:8081")
public interface UserLoginFeignService {
    @RequestMapping(value = "/listAllUser1", method = RequestMethod.GET)
    public ArrayList getAllUserInfo();
}
