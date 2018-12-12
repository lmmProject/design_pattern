package com.lmm.builder;

/**
 * @Author: mmli3
 * @Date: Created in 2018/12/12
 * @Description: 指挥者类：指挥建造过程
 */
public class Director {
    public void Construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
