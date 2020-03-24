package com.metu.analyapploginauth.login.controller;

import com.metu.analyapploginauth.Query.UserQuery;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;

/**
 * @ClassName DemoController
 * @Description 测试用controller
 * @Author admin
 * @Date 2019/11/23 19:21
 * @Version 1.0
 **/
@RestController("DemoController")
@Api(value="UserLoginController", description="用户登录认证服务")
@Slf4j
public class UserLoginController {
    /* *
     * @Author zhengzz
     * @Description 提供日期服务调用
     * @Date 19:23 2019/11/23
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping(value = "/listAllUser",method = RequestMethod.GET,produces = "application/json")
    @ApiOperation(value = "列出所有的用户信息", response =ArrayList.class )
    @ApiResponses(
            {
            @ApiResponse(code=200,message = "成功"),
            @ApiResponse(code = 401, message = "你没权限"),
            @ApiResponse(code = 403, message = "你被禁止访问了"),
            @ApiResponse(code = 404, message = "没找到，哈哈哈")
            }

    )
    public ArrayList listAllUsers() {
        ArrayList list= new ArrayList();
        list.add("zhangsan");
        list.add("lisi");
        return list;
    }
    @RequestMapping(value = "/listAllUser/{user.id}",method = RequestMethod.GET,produces = "application/json")
    @ApiOperation(value = "根据id号查询用户信息", response =ArrayList.class )
    @ApiResponses(
            {
                    @ApiResponse(code=200,message = "成功"),
                    @ApiResponse(code = 401, message = "你没权限"),
                    @ApiResponse(code = 403, message = "你被禁止访问了"),
                    @ApiResponse(code = 404, message = "没找到，哈哈哈")
            }

    )
    @ApiImplicitParam(name = "user",
            value = "要查询的用户",
            dataType = "UserQuery",//This can be the class name or a primitive
            required = false,
            paramType = "body")
    public ArrayList listAllUsersById(@RequestBody @Valid UserQuery user) {
       ArrayList list= new ArrayList();
       list.add("zhangsan");
       list.add("lisi");
        return list;
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.GET,produces = "application/json")
    public boolean addUser(@Valid @RequestBody UserQuery user) {
        return true;
    }
    @RequestMapping("/exce")
    public String showInfo(){
        String info ="你好";
        int a = 1/0;
        return info;
    }

}
