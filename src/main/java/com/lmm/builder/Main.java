package com.lmm.builder;

/**
 * @Author: mmli3
 * @Date: Created in 2018/12/12
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreateBuilder1();
        Builder b2 = new ConcreateBuilder2();
        director.Construct(b1);
        Product p1 = b1.GetResult();
        p1.show();
        director.Construct(b2);
        Product p2 = b2.GetResult();
        p2.show();
    }

}
