package com.metu.analyapploginauth.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RestTemplateTest
 * @Description TODO
 * @Author admin
 * @Date 2019/11/27 22:37
 * @Version 1.0
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
@Component
public class RestTemplateTest {

    @Autowired
    RestTemplate restTemplate;

    @Test
    public void test001() {

    }

}
