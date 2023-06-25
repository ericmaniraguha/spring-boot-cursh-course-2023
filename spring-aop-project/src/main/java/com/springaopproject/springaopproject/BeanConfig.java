package com.springaopproject.springaopproject;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@CacheConfig
@ComponentScan(basePackages = "com.springaopproject.springaopproject")
@EnableAspectJAutoProxy
public class BeanConfig {
    
}
