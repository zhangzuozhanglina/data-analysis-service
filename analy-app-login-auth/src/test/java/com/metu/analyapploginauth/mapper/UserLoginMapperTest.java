package com.metu.analyapploginauth.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.metu.analyapploginauth.login.PO.UserInfoEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;

/**
 * @ClassName UserLoginMapperTest
 * @Description TODO
 * @Author admin
 * @Date 2019/11/25 22:21
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserLoginMapperTest {

    @Autowired
    public  UserLoginMapper userLoginMapper;

    @Test
    public void testQueryById() {
        List<HashMap<String,String>> rs=userLoginMapper.selectUserById();
        System.out.println(rs.toString());
    }
    @Test
    public void testUserLoginByMybatisPlus() {


        // 新增用户
        /*UserInfoEntity user=new UserInfoEntity();
        user.setUser_id("1");
        user.setAge(24);
        user.setEmail("1234@qq.com");
        userLoginMapper.insert(user);*/
        // 查看用户

      /* int rs= userLoginMapper.selectCount(new QueryWrapper<UserInfoEntity>().lambda().eq(UserInfoEntity::getUser_id,"1"));
        System.out.println(rs);*/
    }


}
