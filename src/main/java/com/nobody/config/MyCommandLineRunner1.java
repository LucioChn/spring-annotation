package com.nobody.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author Mr.nobody
 * @Date 2021/2/20
 * @Version 1.0.0
 */
@Component
// 注解指定执行顺序
@Order(1)
public class MyCommandLineRunner1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- CommandLineRunner in MyCommandLineRunner1, Order=1 ...");
    }
}
