package com.zhengdianfang.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class User {

    @Value("${com.zhengdianfang.demo.username}")
    private String username;

    @Value("${com.zhengdianfang.demo.age}")
    private int age;

    @Value("${com.zhengdianfang.demo.address}")
    private String address;

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }
}
