package com.nobody.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author Mr.nobody
 * @Date 2021/2/20
 * @Version 1.0.0
 */
@Component
@Order(3)
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("--- ApplicationRunner in MyApplicationRunner, Order=3 ...");
    }
}
