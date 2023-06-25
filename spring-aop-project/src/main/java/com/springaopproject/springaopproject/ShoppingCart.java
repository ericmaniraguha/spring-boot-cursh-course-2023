package com.springaopproject.springaopproject;


import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(){
        //logging 
        //authenticatioin and authorization
        //sanitaze the data 
        System.out.println("Checking out the cart is called.");
    }
    
}
