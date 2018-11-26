package com.lmm.factory;

/**
 * @Author: mmli3
 * @Date: Created in 2018/11/26
 * @Description:用来"生产产品"和"注册产品"
 */
public abstract class Factory {

    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return  p;
    }

    protected abstract void registerProduct(Product p);

    protected abstract Product createProduct(String owner);
}
