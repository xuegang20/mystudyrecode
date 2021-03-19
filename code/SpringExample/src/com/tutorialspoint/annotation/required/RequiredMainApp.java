package com.tutorialspoint.annotation.required;

import com.tutorialspoint.autowire.constructor.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredMainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("my age " + student.getAge());
        System.out.println("my name " + student.getName());
    }
}
