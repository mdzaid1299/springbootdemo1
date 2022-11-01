package org.niit.springboot.springbootdemo1.service;

import org.springframework.stereotype.Service;

@Service
public class Message {
    public void greet(){
        System.out.println("Welcome");
    }
}
