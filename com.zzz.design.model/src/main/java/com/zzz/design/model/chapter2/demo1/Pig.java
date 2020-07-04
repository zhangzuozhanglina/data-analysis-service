package com.zzz.design.model.chapter2.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: data-analysis-service
 * @description:
 * @author: zhengzz
 * @create: 2020-06-26 22:21
 **/
@Data

public class Pig extends AbstractAnimal {

    public Pig(String name) {
        super(name);
    }

    public Pig() {

    }

    @Override
    public void eat() {
        System.out.println("Pig Eating and it named "+this.getName());
    }
}
