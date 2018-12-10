package com.lmm.prototype;

/**
 * @Author: mmli3
 * @Date: Created in 2018/12/10
 * @Description: 声明了抽象方法use和createClone的接口
 */
public interface Product extends Cloneable{

    public abstract void use(String s);

    public abstract Product createClone();

}
