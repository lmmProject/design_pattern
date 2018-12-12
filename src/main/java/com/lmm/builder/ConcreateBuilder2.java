package com.lmm.builder;

/**
 * @Author: mmli3
 * @Date: Created in 2018/12/12
 * @Description:
 */
public class ConcreateBuilder2 extends Builder{
    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.add("部件x");
    }

    @Override
    public void buildPartB() {
        product.add("部件y");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
