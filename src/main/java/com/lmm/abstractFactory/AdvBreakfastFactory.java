package com.lmm.abstractFactory;

/**
 * @Author: mmli3
 * @Date: Created in 2018/12/13
 * @Description:
 */
public class AdvBreakfastFactory implements BreakfastFactory {

    @Override
    public Breakfast sellBuns() {
        return new ExpensiveBuns();
    }

    @Override
    public Breakfast sellSoyMilk() {
        return new ExpensiveSoyMilk();
    }
}
