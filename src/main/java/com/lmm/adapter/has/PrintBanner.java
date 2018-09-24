package com.lmm.adapter.has;

import com.lmm.adapter.has.Print;

/**
 * @Author: lmm
 * @Date: Created in 2018/9/24
 * @Description: Adapter
 */
public class PrintBanner extends Print{

    private Banner banner;

    public PrintBanner(String string){
        this.banner = new Banner(string);
    }


    @Override
    void printWeak() {
        banner.showWithParen();
    }

    @Override
    void printStrong() {
        banner.showWithAster();
    }
}
