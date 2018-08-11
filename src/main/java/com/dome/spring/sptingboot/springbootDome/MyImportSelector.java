package com.dome.spring.sptingboot.springbootDome;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector{
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println(annotationMetadata.getAnnotationAttributes(EnableLog.class.getName()));
        return new String[]{"com.dome.spring.sptingboot.springbootDome.Role",User.class.getName(),MyConfig.class.getName()};
    }
}
