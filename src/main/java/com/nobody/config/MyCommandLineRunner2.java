package com.nobody.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author Mr.nobody
 * @Date 2021/2/20
 * @Version 1.0.0
 */
@Component
// @Order(2)
// 实现 Ordered 接口，并且重写 getOrder 方法
public class MyCommandLineRunner2 implements CommandLineRunner, Ordered {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- CommandLineRunner in MyCommandLineRunner2, Order=2 ...");
    }

    // 指定执行顺序
    @Override
    public int getOrder() {
        return 2;
    }
}
