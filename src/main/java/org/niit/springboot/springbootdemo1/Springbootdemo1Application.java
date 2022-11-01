package org.niit.springboot.springbootdemo1;

import org.niit.springboot.springbootdemo1.service.Book;
import org.niit.springboot.springbootdemo1.service.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Springbootdemo1Application {

	public static void main(String[] args) {
		System.out.println("Hello World");


		ApplicationContext context = SpringApplication.run(Springbootdemo1Application.class, args);
		Message message = context.getBean("message", Message.class);
		message.greet();

	}

}
