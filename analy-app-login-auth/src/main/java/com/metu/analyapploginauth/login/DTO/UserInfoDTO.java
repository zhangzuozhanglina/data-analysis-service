package com.metu.analyapploginauth.login.DTO;

import lombok.*;

/**
 * @ClassName UserInfoDTO
 * @Description TODO
 * @Author admin
 * @Date 2019/11/28 22:42
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserInfoDTO {
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
