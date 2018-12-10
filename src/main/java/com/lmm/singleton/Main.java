package com.lmm.singleton;

/**
 * @Author: mmli3
 * @Date: Created in 2018/12/10
 * @Description:
 */
public class Main {

    public static void main(String[] args) {

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

        enumSingleton.whateverMethod();
    }

}
