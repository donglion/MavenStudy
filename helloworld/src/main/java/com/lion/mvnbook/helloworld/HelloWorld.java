package com.lion.mvnbook.helloworld;

/**
 * Created by lion on 2019/10/10.
 */
public class HelloWorld {

    public String sayHello() {
        return "Hello World";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().sayHello());
    }

}
