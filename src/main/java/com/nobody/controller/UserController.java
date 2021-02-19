package com.nobody.controller;

import com.nobody.service.UserService;
import com.nobody.service.iml.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("find")
    public String find() {
        userService.test();
        UserService userService1 = new UserServiceImpl();
        return "ok";
    }

}
