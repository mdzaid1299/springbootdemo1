package org.niit.springboot.springbootdemo1.service;

import org.springframework.stereotype.Service;


public class Book {
    private int bookId;
    private String bookname;

    public Book(int bookId, String bookname) {
        this.bookId = bookId;
        this.bookname = bookname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookname='" + bookname + '\'' +
                '}';
    }

}
