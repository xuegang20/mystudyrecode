package com.tutorialspoint.ioc.bean.inherit;

import com.tutorialspoint.ioc.bean.lifecycle.HelloWorldLifeCycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritMainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");

        helloWorld.getMessage1();
        helloWorld.getMessage2();

        HelloWorldInherit helloWorldInherit = (HelloWorldInherit) context.getBean("helloWorldInherit");

        helloWorldInherit.getMessage1();
        helloWorldInherit.getMessage2();
        helloWorldInherit.getMessage3();

    }
}
