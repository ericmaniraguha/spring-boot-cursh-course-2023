package com.springaopproject.springaopproject;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
   
    @Before("execution(* com.springaopproject.springaopproject.ShoppingCart.checkout())")
    public void beforelogger(){
        System.out.println("\"Before checkout: Logging aspect is called.\"");
    }

    @After("execution(* *.*.*.*.checkout())")
    public void afterlogger(){
        System.out.println("After checkout: Logging aspect is called.");
    }
}
