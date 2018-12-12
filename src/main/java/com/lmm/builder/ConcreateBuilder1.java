package com.lmm.builder;

/**
 * @Author: mmli3
 * @Date: Created in 2018/12/12
 * @Description: 继承Builder，强制性重写Builder的抽象方法。步骤是我规定的，但是步骤里面的细节可以自己决定。
 */

public class ConcreateBuilder1 extends Builder {
    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
