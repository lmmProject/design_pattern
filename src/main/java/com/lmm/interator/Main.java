package com.lmm.interator;

/**
 * @Author: lmm
 * @Date: Created in 2018/9/21
 * @Description: 优先使用抽象类和接口来编程
 */
public class Main {

    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bile"));
        bookShelf.appendBook(new Book("Design Pattern"));

        Interator interator = bookShelf.interator();
        while (interator.hasNext()){
            Book book = (Book) interator.next();
            System.out.println(book.getName());
        }
    }
}
