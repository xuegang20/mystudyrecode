package com.tutorialspoint.ioc.bean.lifecycle;

public class HelloWorldLifeCycle {
    private String message;

    public void getMessage() {
        System.out.println("your message: " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init(){
        System.out.println("HelloWorldLifeCycle is initing ...");
    }
    public void destroy(){
        System.out.println("HelloWorldLifeCycle is destroyed ...");
    }
}