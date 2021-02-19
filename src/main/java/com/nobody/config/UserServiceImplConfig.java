package com.nobody.config;

import com.nobody.service.iml.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Description
 * @Author Mr.nobody
 * @Date 2021/2/18
 * @Version 1.0.0
 */
@Configuration
public class UserServiceImplConfig {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    // @Scope("prototype")
    public UserServiceImpl userServiceImpl() {
        return new UserServiceImpl();
    }
}
