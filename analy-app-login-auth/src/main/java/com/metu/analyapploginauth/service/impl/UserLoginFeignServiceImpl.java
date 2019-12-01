package com.metu.analyapploginauth.service.impl;

import com.metu.analyapploginauth.service.UserLoginFeignService;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @ClassName UserLoginFeignServiceImpl
 * @Description TODO
 * @Author admin
 * @Date 2019/11/25 11:09
 * @Version 1.0
 **/
@RestController("UserLoginFeignServiceImpl")
public class UserLoginFeignServiceImpl implements UserLoginFeignService {
    
    /* *
     * @Author zhengzz
     * @Description TODO
     * @Date 23:42 2019/11/27
     * @Param []
     * @return java.util.ArrayList
     **/
    @Override
    public ArrayList get() {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        return list;
    }


}
