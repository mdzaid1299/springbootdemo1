package org.niit.springboot.springbootdemo1.config;

import org.niit.springboot.springbootdemo1.service.Book;
import org.springframework.context.annotation.Bean;

public class BookConfig {
    @Bean("book")
    public Book getBook(){
        return new Book(11,"The story of my life");
    }
    @Bean("book1")
    public Book getBook1(){
        return new Book(15,"Anatomy");
    }
}
