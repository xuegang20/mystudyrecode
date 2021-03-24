package com.tutorialspoint.annotation.event.zidingyi;

import com.tutorialspoint.annotation.event.HelloWorld;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        CustomEventPublisher obj = (CustomEventPublisher) context.getBean("customEventPublisher");

        obj.publish();
        obj.publish();

    }
}
