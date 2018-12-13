package com.lmm.abstractFactory;

/**
 * @Author: mmli3
 * @Date: Created in 2018/12/13
 * @Description: 抽象工厂接口: 包含两个抽象方法，卖包子和豆浆
 */
public interface BreakfastFactory {
    Breakfast sellBuns();
    Breakfast sellSoyMilk();
}
