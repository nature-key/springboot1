package com.dome.spring.sptingboot.springbootDome;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class MyConfig {
    @Bean
    public Runnable createRunable1(){
        return ()->{};
    }
    @Bean
    public Runnable createRunable2(){
        return ()->{};
    }
    @Bean
    public Runnable createRunable3(){
        return ()->{};
    }

}
