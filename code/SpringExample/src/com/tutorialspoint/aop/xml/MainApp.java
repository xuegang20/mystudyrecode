package com.tutorialspoint.aop.xml;

import com.tutorialspoint.annotation.event.HelloWorld;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("AopBeans.xml");

        Student obj = (Student) context.getBean("student");

        obj.getName();
        obj.getAge();

        obj.printThrowException();
    }
}
