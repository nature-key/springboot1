package com.dome.spring.sptingboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SptingbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SptingbootApplication.class, args);
		System.out.println(System.getProperty("file.encoding"));
		System.out.println(context.getBeansOfType(EncodingConvert.class));
		System.out.println(context.getBeansOfType(Runnable.class));
		context.close();
	}
}
