package com.spring.hello.dao;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldDAO {
    private String msg = "Hello, ";

    public String getMsg() {
        return msg;
    }
}
