package com.metu.analyapploginauth.login.PO;


import lombok.*;

/**
*@ClassNameUserInfoEntity
*@DescriptionTODO
*@Authoradmin
*@Date2019/11/2522:03
*@Version1.0
**/
@Data
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoEntity{
private String user_id;
private String user_name;
private String password;
private String register_date;
private String email;
private String serv_num;
private String sex;
private int  age;
private String status;

}
