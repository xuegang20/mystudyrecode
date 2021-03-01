package com.tutorialspoint.ioc.bean.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorldLifeCycle helloWorld = (HelloWorldLifeCycle) context.getBean("helloWorldlifecycle");

        helloWorld.getMessage();

        context.registerShutdownHook();

    }
}
