package com.zwq.demo.aop.service;

/**
 * @author zwq
 * @date 2019/1/30 15:07
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHelloWorld() {
        System.out.println("hello world!");
    }
}
