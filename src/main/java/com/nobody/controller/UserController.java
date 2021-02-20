package com.nobody.controller;

import com.nobody.service.UserService;
import com.nobody.service.iml.UserServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Mr.nobody
 * @Date 2021/2/18
 * @Version 1.0.0
 */
@RestController
@RequestMapping("user")
public class UserController implements ApplicationContextAware {

    @Autowired
    private UserService userService;

    private ApplicationContext applicationContext;

    @GetMapping("find")
    public String find() {
        userService.test();
        // 测试手动 new bean
        UserService userService1 = new UserServiceImpl();
        // 测试获取 prototype bean 时，验证初始化和消耗方法
        UserServiceImpl bean = applicationContext.getBean(UserServiceImpl.class);
        return "ok";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
