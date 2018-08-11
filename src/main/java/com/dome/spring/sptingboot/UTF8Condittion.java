package com.dome.spring.sptingboot;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class UTF8Condittion implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String encoding = System.getProperty("file.encoding");
        if (encoding != null) {
             System.out.println("UTF-8".equals(encoding.toUpperCase()));
            return "UTF-8".equals(encoding.toUpperCase());
        }
        return false;
    }
}
