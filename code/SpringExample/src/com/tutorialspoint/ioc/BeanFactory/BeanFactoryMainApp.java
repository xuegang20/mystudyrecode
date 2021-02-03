package com.tutorialspoint.ioc.BeanFactory;

import com.tutorialspoint.ioc.HelloWorld;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryMainApp {
    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        HelloWorld helloWorld = (HelloWorld)xmlBeanFactory.getBean("helloWorld");
        helloWorld.getMessage();
    }
}
