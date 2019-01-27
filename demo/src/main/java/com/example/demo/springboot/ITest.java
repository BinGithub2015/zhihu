package com.example.demo.springboot;

public interface ITest {
    default String test(){
        return "com.example.demo.springboot.ITest.test";
    };
}
