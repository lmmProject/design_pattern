package com.lmm.prototype;

import java.util.HashMap;

/**
 * @Author: mmli3
 * @Date: Created in 2018/12/10
 * @Description: 调用createClone方法复制实例的类
 */
public class Manager {

    private HashMap showCase = new HashMap();

    public void register(String name, Product product){
        showCase.put(name, product);
    }

    public Product create(String protoname){
        Product p = (Product) showCase.get(protoname);
        return p.createClone();
    }

}
