package com.dome.spring.sptingboot;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@SpringBootConfiguration
@Conditional(GBKCondittion.class)
public class EncodingConvertConfiguration {
    @Bean
//    @Conditional(UTF8Condittion.class)
    public UTF8EncodingConvert createUTF8EncodingConvert(){
        return  new UTF8EncodingConvert();
    }
    @Bean
//    @Conditional(GBKCondittion.class)
    public GBKEncodingConvert createGBKEncodingConvert(){
        return new GBKEncodingConvert();
    }

}
