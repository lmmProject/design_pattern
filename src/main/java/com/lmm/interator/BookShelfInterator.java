package com.lmm.interator;

/**
 * @Author: lmm
 * @Date: Created in 2018/9/21
 * @Description: 遍历书架
 */
public class BookShelfInterator implements Interator{

    private BookShelf bookShelf;
    private int index;

    public BookShelfInterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()) return true;
        return false;
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
