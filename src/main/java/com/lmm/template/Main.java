package com.lmm.template;

/**
 * @Author: lmm
 * @Date: Created in 2018/9/25
 * @Description: 父类中定义处理流程的框架，在子类中实现具体处理
 */
public class Main {

    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("流程，模板");
        AbstractDisplay d3 = new StringDisplay("具体，子类");
        d1.display();
        d2.display();
        d3.display();
    }
}
