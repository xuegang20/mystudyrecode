package com.tutorialspoint.ioc.bean.postprocessors;

import com.tutorialspoint.ioc.bean.lifecycle.HelloWorldLifeCycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostProcessorsMainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorldPostPocessors helloWorld = (HelloWorldPostPocessors) context.getBean("helloWorldpostprocessors");

        helloWorld.getMessage();

        context.registerShutdownHook();
    }
}
