package com.lmm.template;

/**
 * @Author: lmm
 * @Date: Created in 2018/9/25
 * @Description: 模板:抽象类阶段确定处理流程
 */
public abstract class AbstractDisplay {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    /**
     * 处理流程
     */
    public final void display(){
        open();
        for(int i = 0; i < 5; i++){
            print();
        }
        close();
    }

}
