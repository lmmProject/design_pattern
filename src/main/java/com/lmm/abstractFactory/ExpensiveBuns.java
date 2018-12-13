package com.lmm.abstractFactory;

/**
 * @Author: mmli3
 * @Date: Created in 2018/12/13
 * @Description: 卖高级的包子，就像同济的甘其食，一个包子就要4、5块；
 */
public class ExpensiveBuns extends BreakfastShop {

    @Override
    public void sell() {
        System.out.println("这里的包子4块5起！");
    }

}
