package com.lmm.interator;

import java.util.ArrayList;

/**
 * @Author: lmm
 * @Date: Created in 2018/9/21
 * @Description: 书架
 */
public class BookShelf implements Aggregate {

    /*private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize){
        this.books = new Book[maxSize];
    }

    public Book getBookAt (int index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }*/

    // 使用集合
    private ArrayList books;

    public BookShelf(int initialSize){
        this.books = new ArrayList(initialSize);
    }

    public Book getBookAt(int index){
        return (Book)books.get(index);
    }

    public void appendBook(Book book){
        books.add(book);
    }

    public int getLength(){
        return books.size();
    }

    @Override
    public Interator interator() {
        return new BookShelfInterator(this);
    }
}
