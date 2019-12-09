package com.metu.analyconfigclient.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName SpringConnfigProperties
 * @Description TODO
 * @Author admin
 * @Date 2019/12/1 21:53
 * @Version 1.0
 **/
@Component
@ConfigurationProperties(prefix = "spring.profiles")
@Setter
@Getter
public class SpringConnfigProperties {
    private String active;
}
