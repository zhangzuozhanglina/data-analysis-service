package com.metu.analyapploginauth.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName Lambda001Test
 * @Description TODO
 * @Author admin
 * @Date 2019/11/26 23:10
 * @Version 1.0
 **/
public class Lambda001Test {
    @Test
    public void test001() {
        // 计算空字符串
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        System.out.println("空字符串的个数"+strings.stream().filter(string-> {return string.isEmpty();}).count());
        //System.out.println("字符串长度为 3 的数量为: "+strings.stream().limit(3).collect(Collectors.joining()));

    }
}
