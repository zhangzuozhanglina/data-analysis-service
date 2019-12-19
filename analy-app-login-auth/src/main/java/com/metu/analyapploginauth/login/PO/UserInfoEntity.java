package com.metu.analyapploginauth.login.PO;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import lombok.experimental.Accessors;

/**
*@ClassNameUserInfoEntity
*@DescriptionTODO
*@Authoradmin
*@Date2019/11/2522:03
*@Version1.0
**/
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true,fluent = false)
@TableName("t_users_information")
public class UserInfoEntity{
@TableId
private int user_id;
private String user_name;
private String password;
private String register_date;
private String email;
private String serv_num;
private String sex;
private int  age;
private String status;
@TableLogic
private int is_delete;
}
