package com.zzz.design.model.chapter2.demo1;

import org.junit.jupiter.api.Test;

/**
 * @program: data-analysis-service
 * @description:
 * @author: zhengzz
 * @create: 2020-06-26 22:29
 **/

public class TestClass {
    @Test
    public void test() {
            Annimal a = new AbstractAnimal("Tom") {
                @Override
                public void eat() {

                    System.out.println("Dog Eating and it named "+this.getName());
                }
            };
            a.eat();
            a= new Pig("Jack");
            a.eat();
    }
    @Test
    public void testDrive() {
        CicusShow show =  new DriverShow();
        AbstractAnimal annimal = new AbstractAnimal("Tom") {
            @Override
            public void eat() {

                System.out.println("Dog Eating and it named "+this.getName());
            }
        };
        show.show(annimal);
        annimal = new Pig("Jack");
        show.show(annimal);
    }
}
