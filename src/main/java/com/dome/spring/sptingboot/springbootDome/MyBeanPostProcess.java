package com.dome.spring.sptingboot.springbootDome;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.List;

public class MyBeanPostProcess implements BeanPostProcessor {

    private List<String> packages;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        for (String pack : packages) {
            System.out.println(pack);
            if (bean.getClass().getName().startsWith(pack)) {

                System.out.println("bean:" + bean.getClass().getName());
            }
        }
        return bean;
    }

    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
