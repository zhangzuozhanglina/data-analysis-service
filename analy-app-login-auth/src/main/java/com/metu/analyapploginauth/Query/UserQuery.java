package com.metu.analyapploginauth.Query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @ClassName UserQuery
 * @Description TODO
 * @Author admin
 * @Date 2019/11/24 10:44
 * @Version 1.0
 **/
@Setter
@Getter
@NoArgsConstructor
@Data
@ApiModel
public class UserQuery {

    @ApiModelProperty(notes = "用户id",required = false,dataType = "String")
    @NotNull
    private String id;

    @ApiModelProperty(notes = "用户名",required = false,dataType = "String")
    private String name;

    @Max(200)
    @Min(0)
    @ApiModelProperty(notes = "年龄",required = false,dataType = "Integer")
    private Integer age;


}
