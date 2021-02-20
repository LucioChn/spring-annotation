package com.nobody;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
// 注解指定执行顺序
@Order(0)
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("--- Application main begin to start...");
        SpringApplication.run(Application.class, args);
        System.out.println("--- Application main has start...");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- CommandLineRunner in Application, Order=0 ...");
    }
}
