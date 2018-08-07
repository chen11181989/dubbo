package com.share.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SayHelloImpl2 implements SayHello {
    @Override
    public String sayHello(String name) {

        return "hello version 2.0.0"+name;
    }

    public static void main(String[] args) throws  Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-server.xml");
        context.start();
       System.in.read();
    }
}
