package com.lmm.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: mmli3
 * @Date: Created in 2018/11/26
 * @Description:
 */
public class IDCardFactory extends Factory{

    private List owners = new ArrayList();

    @Override
    protected void registerProduct(Product p) {
        owners.add(((IDCard)p).getOwner());
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    List getOwners(){
        return owners;
    }
}
