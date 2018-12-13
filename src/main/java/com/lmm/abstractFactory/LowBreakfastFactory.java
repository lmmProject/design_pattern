package com.lmm.abstractFactory;

/**
 * @Author: mmli3
 * @Date: Created in 2018/12/13
 * @Description:
 */
public class LowBreakfastFactory implements BreakfastFactory {
    @Override
    public Breakfast sellBuns() {
        return new CheapBuns();
    }

    @Override
    public Breakfast sellSoyMilk() {
       return new CheapSoyMilk();
    }
}
