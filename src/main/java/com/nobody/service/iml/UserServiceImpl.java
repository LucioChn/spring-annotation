package com.nobody.service.iml;

import com.nobody.dao.UserDao;
import com.nobody.pojo.entity.UserEntity;
import com.nobody.service.UserService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author Mr.nobody
 * @Date 2021/2/19
 * @Version 1.0.0
 */
// @Service
public class UserServiceImpl implements UserService, InitializingBean, DisposableBean {

    private UserDao userDao;

    public UserServiceImpl() {
        System.out.println("--- UserServiceImpl 构造方法");
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        System.out.println("--- setUserDao 属性注入方法");
        this.userDao = userDao;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("--- afterPropertiesSet 方法");
    }

    public void initMethod() {
        System.out.println("--- initMethod 方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("--- destroy 方法");
    }

    public void destroyMethod() {
        System.out.println("--- destroyMethod 方法");
    }

    @Override
    public void test() {
        UserEntity userEntity = new UserEntity(1, "Mr.nobody", 18);
        System.out.println(userEntity);
    }

}
