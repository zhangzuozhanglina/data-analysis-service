package com.metu.analyapploginauth.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.metu.analyapploginauth.Query.UserQuery;
import com.metu.analyapploginauth.login.PO.UserInfoEntity;
import com.metu.analyapploginauth.mapper.UserLoginMapper;
import com.metu.analyapploginauth.service.UserLoginFeignService;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @ClassName UserLoginFeignServiceImpl
 * @Description TODO
 * @Author admin
 * @Date 2019/11/25 11:09
 * @Version 1.0
 **/
@RestController("UserLoginFeignServiceImpl")
public class UserLoginFeignServiceImpl  extends ServiceImpl<UserLoginMapper, UserInfoEntity> implements UserLoginFeignService{

    @Override
    public ArrayList getAllUserInfo() {
        list(new QueryWrapper<UserInfoEntity>().select("id").ge("name","zhangsan")).size();
        return null;
    }


    /* *
     * @Author zhengzz
     * @Description TODO
     * @Date 23:42 2019/11/27
     * @Param []
     * @return java.util.ArrayList
     **/

}
