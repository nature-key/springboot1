package com.dome.spring.sptingboot.springbootDome;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TaImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar{
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        Map<String, Object> map =  importingClassMetadata.getAnnotationAttributes(EnableEach.class.getName());
       String[] str =  (String[]) map.get("packages");
        List<String> packages = Arrays.asList(str);
        BeanDefinitionBuilder bdb1=BeanDefinitionBuilder.rootBeanDefinition(MyBeanPostProcess.class);
        bdb1.addPropertyValue("packages",packages);
        registry.registerBeanDefinition(MyBeanPostProcess.class.getName(),bdb1.getBeanDefinition());
    }
}
