package com.lmm.factory;

/**
 * @Author: mmli3
 * @Date: Created in 2018/11/26
 * @Description:
 */
public class IDCard extends Product{

    private String owner;

    IDCard(String owner){
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    @Override
    void use() {
        System.out.println("使用" + owner + "的ID卡");
    }

    String getOwner(){
        return owner;
    }
}
