package com.dome.spring.sptingboot.springbootDome;

import ch.qos.logback.core.util.TimeUtil;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
@Component
public class Jeep implements Runnable {
    @Async
    public void run() {
        try {

            for (int i = 1; i < 10; i++) {
                System.out.println("========" + i + "+=========");
                TimeUnit.SECONDS.sleep(10);
            }


        } catch (Exception E) {
            E.getStackTrace();
        }

    }
}
