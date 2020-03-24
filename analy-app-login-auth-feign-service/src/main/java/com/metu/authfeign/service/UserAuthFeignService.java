package com.metu.authfeign.service;

import com.metu.authfeign.service.impl.UserAuthFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="UserAuthFeignService",fallback = UserAuthFeignServiceImpl.class)
public interface UserAuthFeignService {

    @RequestMapping("/listAllUser1")
    public Object getAllUser();
}
