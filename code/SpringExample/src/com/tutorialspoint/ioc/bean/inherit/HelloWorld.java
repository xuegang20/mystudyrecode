package com.tutorialspoint.ioc.bean.inherit;

public class HelloWorld {
    private String message1;
    private String message2;

    public void getMessage1() {
        System.out.println("parent message1: " + message1);
    }

    public void setMessage1(String message) {
        this.message1 = message;
    }


    public void getMessage2() {
        System.out.println("parent message2: " + message2);
    }

    public void setMessage2(String message) {
        this.message2 = message;
    }
}