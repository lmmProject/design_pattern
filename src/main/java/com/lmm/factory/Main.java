package com.lmm.factory;

/**
 * @Author: mmli3
 * @Date: Created in 2018/11/26
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
    }
}
