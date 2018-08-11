package com.dome.spring.sptingboot;


import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class UserConfiguration {
    @Bean
    @ConditionalOnProperty(name = "runable.name", havingValue = "true")
    public Runnable createRunAble() {

        return () -> {
        };
    }
    @Bean
    @ConditionalOnClass(name="com.google.gson.Gson")
    public Runnable createRunAble1() {
        return () -> {
        };
    }

    @Bean
    @ConditionalOnBean(name="user")
    public Runnable createRunAble2() {
        return () -> {
        };
    }


}
