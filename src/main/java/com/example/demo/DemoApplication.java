package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
       // SpringApplication.run(DemoApplication.class, args);
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/example/demo/idol.xml");
        Performer performer = (Performer) context.getBean("duke");
        performer.perform();


    }

}
