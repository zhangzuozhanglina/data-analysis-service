package com.metu.authfeign.service.impl;

import com.metu.authfeign.service.UserAuthFeignService;
import org.springframework.stereotype.Component;

/**
 * @ClassName UserAuthFeignServiceImpl
 * @Description TODO
 * @Author admin
 * @Date 2019/11/29 17:27
 * @Version 1.0
 **/
@Component
public class UserAuthFeignServiceImpl implements UserAuthFeignService {
    @Override
    public Object getAllUser() {
        return "降级操作";
    }
}
