package com.lmm.singleton;

/**
 * @Author: mmli3
 * @Date: Created in 2018/12/10
 * @Description: 饿汉式（静态常量）[可用]
 */
public class NewSingleton {

    private final static NewSingleton INSTANCE = new NewSingleton();

    private NewSingleton(){}

    public static NewSingleton getInstance(){
        return INSTANCE;
    }

}
//优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
//
//缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。