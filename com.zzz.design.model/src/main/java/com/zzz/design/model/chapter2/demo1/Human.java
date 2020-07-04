package com.zzz.design.model.chapter2.demo1;

import lombok.*;

/**
 * @program: data-analysis-service
 * @description:
 * @author: zhengzz
 * @create: 2020-06-28 22:46
 **/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Human implements Cloneable {

    public int weight;
    public int height;
    public int sex;
    public String name;
    public AbstractAnimal dog;

    public static void main(String[] args) throws CloneNotSupportedException {
        Cloneable h = Human.builder().sex(20).weight(100).name("张三").height(20).build();
        System.out.println(h.toString());

    }

    public Cloneable clone() throws CloneNotSupportedException {
        Cloneable clone = (Cloneable) super.clone();
        Cloneable clone1 = clone;
        return clone1;
    }
}
