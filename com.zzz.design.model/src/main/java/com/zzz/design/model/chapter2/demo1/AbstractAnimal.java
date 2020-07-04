package com.zzz.design.model.chapter2.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: data-analysis-service
 * @description:
 * @author: zhengzz
 * @create: 2020-06-26 22:39
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AbstractAnimal implements  Annimal{
    public String name;
    @Override
    public void eat() {
        this.eat();

    }

}
