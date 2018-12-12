package com.lmm.builder;

/**
 * @Author: mmli3
 * @Date: Created in 2018/12/12
 * @Description: 因为步骤不变，所以用虚拟类确定要做的步骤。
 * 用抽象方法就强制要求其他人必须重写这些方法，即必须按我要求的步骤来。
 */
public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product GetResult();
}
