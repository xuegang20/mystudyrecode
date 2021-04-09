package com.tutorialspoint.aop.aspect;

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
