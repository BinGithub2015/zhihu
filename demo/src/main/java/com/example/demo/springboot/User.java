package com.example.demo.springboot;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class User implements InitializingBean {

    @Transactional
    public String sayHello(){
        return "hello";
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("PostConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("PreDestroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

}
