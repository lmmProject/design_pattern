package com.lmm.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: mmli3
 * @Date: Created in 2018/12/12
 * @Description:
 */
public class Product {

    List parts = new ArrayList();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("产品创建----");
        for (Object part : parts) {
            System.out.println(part);
        }
    }

}
