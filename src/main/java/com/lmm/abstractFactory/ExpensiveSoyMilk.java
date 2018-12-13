package com.lmm.abstractFactory;

/**
 * @Author: mmli3
 * @Date: Created in 2018/12/13
 * @Description: 高贵的豆浆
 */
public class ExpensiveSoyMilk extends BreakfastShop{

    @Override
    public void sell() {
        System.out.println("这里的豆浆3块5起！");
    }
}
