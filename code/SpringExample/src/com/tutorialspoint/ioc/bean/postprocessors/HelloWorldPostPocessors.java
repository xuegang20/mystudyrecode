package com.tutorialspoint.ioc.bean.postprocessors;

public class HelloWorldPostPocessors {
    private String message;

    public void getMessage() {
        System.out.println("your message: " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init(){
        System.out.println("HelloWorldPostPocessors is initing ...");
    }
    public void destroy(){
        System.out.println("HelloWorldPostPocessors is destroyed ...");
    }
}