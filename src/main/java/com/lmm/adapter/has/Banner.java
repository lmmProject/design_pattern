package com.lmm.adapter.has;

/**
 * @Author: lmm
 * @Date: Created in 2018/9/24
 * @Description:  Adaptee
 */
public class Banner {

    private String string;

    public Banner(String string){
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster(){
        System.out.println("*"+ string + "*");
    }
}
