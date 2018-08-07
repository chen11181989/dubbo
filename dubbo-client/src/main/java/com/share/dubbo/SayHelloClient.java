package com.share.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SayHelloClient {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "dubbo-client.xml" });

        context.start();

       SayHello hello = (SayHello)context.getBean("sayHelloImpl");
     String name =  hello.sayHello("我是来测试的");
        System.out.println(name);
    }
}
