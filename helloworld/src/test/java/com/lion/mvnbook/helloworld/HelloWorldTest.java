package com.lion.mvnbook.helloworld;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lion on 2019/10/10.
 */
public class HelloWorldTest {

    @Test
    public void sayHello() {

        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHello();
        assertEquals("Hello World", result);

    }

}