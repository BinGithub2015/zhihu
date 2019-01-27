package com.example.demo.springboot;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
public class User2 implements ITest {

    @Transactional
    @Override
    public String test() {
        return "com.example.demo.springboot.User2.test";
    }
}
