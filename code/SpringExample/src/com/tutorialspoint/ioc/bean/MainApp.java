package com.tutorialspoint.ioc.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.setMessage("test prototype message");
//        helloWorld.setMessage("test singleton message");
        helloWorld.getMessage();

        HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");
        helloWorld2.getMessage();

    }
}
