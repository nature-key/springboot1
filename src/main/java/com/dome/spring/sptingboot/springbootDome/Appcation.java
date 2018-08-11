package com.dome.spring.sptingboot.springbootDome;

import com.dome.spring.sptingboot.SptingbootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;


//@SpringBootApplication
//@EnableAsync
//@EnableConfigurationProperties
//@EnableAutoConfiguration
@SpringBootApplication
//@ComponentScan
//@Import({Role.class,User.class,MyConfig.class})
//@Import(MyImportSelector.class)
//@EnableLog(name="myspringboot")
@EnableEach(packages={"com.dome.spring.sptingboot.springbootDome.dog","com.dome.spring.sptingboot.springbootDome.cat"})
public class Appcation {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =SpringApplication.run(SptingbootApplication.class, args);
//        System.out.println(context.getBean(Role.class));
//        System.out.println(context.getBean(User.class));
//        System.out.println(context.getBeansOfType(Runnable.class));

        context.close();
    }
}
