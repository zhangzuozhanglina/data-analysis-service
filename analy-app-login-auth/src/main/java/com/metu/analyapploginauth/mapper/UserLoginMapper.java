package com.metu.analyapploginauth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.metu.analyapploginauth.login.PO.UserInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * @ClassName UserLoginMapper
 * @Description TODO
 * @Author admin
 * @Date 2019/11/25 22:11
 * @Version 1.0
 **/
@Repository
public interface UserLoginMapper extends  BaseMapper<UserInfoEntity>{
    public List<HashMap<String,String>> selectUserById();
}
