package com.lmm.adapter;

/**
 * @Author: lmm
 * @Date: Created in 2018/9/24
 * @Description: 扮演适配器角色
 */
public class PrintBanner extends Banner implements Print{

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
