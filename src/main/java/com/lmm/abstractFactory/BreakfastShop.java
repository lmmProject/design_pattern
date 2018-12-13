package com.lmm.abstractFactory;

/**
 * @Author: mmli3
 * @Date: Created in 2018/12/13
 * @Description: 早餐店类，实现了Breakfast接口，是所有早餐店类的基类
 */
public class BreakfastShop implements  Breakfast {

    public void sell() {
        System.out.println("卖早餐了。。。");
    }
}
