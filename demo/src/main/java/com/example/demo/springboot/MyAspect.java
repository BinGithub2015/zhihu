package com.example.demo.springboot;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Around("execution(public * com.example.demo.springboot.DemoApplication.sayHello(..))")
    public Object around(ProceedingJoinPoint pjp){
        Object obj = null;
        try {
            System.out.println("com.example.demo.springboot.MyAspect.around before sayHello");
            obj = pjp.proceed();
            System.out.println("com.example.demo.springboot.MyAspect.around after sayHello");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return obj;
    }

}
