package com.nobody.pojo.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.io.Serializable;

/**
 * @Description
 * @Author Mr.nobody
 * @Date 2021/2/18
 * @Version 1.0.0
 */
public class UserEntity implements InitializingBean, DisposableBean, Serializable {

    private long id;
    private String name;
    private int age;

    @Override
    public void afterPropertiesSet() {
        System.out.println("--- afterPropertiesSet ---");
        this.id = 1;
        this.name = "Mr.nobody";
        this.age = 18;
    }

    @Override
    public void destroy() {
        System.out.println("--- destroy ---");
    }

    public void init() {
        System.out.println("--- init ---");
        this.name = "Mr.Cxx";
        this.age = 20;
    }

    public void beanDestroy() {
        System.out.println("--- beanDestroy ---");
    }

    public UserEntity(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserEntity{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }
}
