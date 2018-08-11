package com.dome.spring.sptingboot.springbootDome;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;
import java.util.List;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(TaImportBeanDefinitionRegistrar.class)
public @interface EnableEach {
    String[] packages();
}
