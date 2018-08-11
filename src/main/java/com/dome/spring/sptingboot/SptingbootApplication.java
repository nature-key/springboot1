package com.dome.spring.sptingboot;

import com.dome.spring.sptingboot.springbootDome.TomcatProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
//@EnableAutoConfiguration
//@EnableConfigurationProperties

@ComponentScan

public class SptingbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SptingbootApplication.class, args);
//		System.out.println(System.getProperty("file.encoding"));
//		System.out.println(context.getBeansOfType(EncodingConvert.class));
//		System.out.println(context.getBeansOfType(Runnable.class));
//		System.out.println(context.getBean(TomcatProperties.class));
		context.close();
	}
}
