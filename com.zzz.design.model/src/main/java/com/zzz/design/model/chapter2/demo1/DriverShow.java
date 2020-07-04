package com.zzz.design.model.chapter2.demo1;

/**
 * @program: data-analysis-service
 * @description:
 * @author: zhengzz
 * @create: 2020-06-26 22:35
 **/
public class DriverShow implements  CicusShow {


    @Override
    public void show(AbstractAnimal abstractAnimal) {
        System.out.println(abstractAnimal.getName() + " is Driving");
    }
}
