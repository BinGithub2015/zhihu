package com.example.demo.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    @Autowired
    private User user;
    @Autowired
    private ITest iTest;

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello(){
        return user.sayHello();
    }

    @RequestMapping(value = "/sayHello2", method = RequestMethod.GET)
    public String sayHello2(){
        return iTest.test();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

