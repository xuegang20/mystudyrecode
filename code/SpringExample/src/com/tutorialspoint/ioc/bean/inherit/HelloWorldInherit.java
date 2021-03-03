package com.tutorialspoint.ioc.bean.inherit;

public class HelloWorldInherit {
    private String message1;
    private String message2;
    private String message3;

    public void getMessage1() {
        System.out.println("HelloWorldInherit message1: " + message1);
    }

    public void setMessage1(String message) {
        this.message1 = message;
    }

    public void getMessage2() {
        System.out.println("HelloWorldInherit message2: " + message2);
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void getMessage3() {
        System.out.println("HelloWorldInherit message3: " + message3);
    }

    public void setMessage3(String message) {
        this.message3 = message;
    }
}
