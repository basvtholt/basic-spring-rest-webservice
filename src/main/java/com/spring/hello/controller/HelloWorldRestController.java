package com.spring.hello.controller;

import com.spring.hello.dao.HelloWorldDAO;
import com.spring.hello.model.Hello;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @Autowired
    private HelloWorldDAO helloWorldDAO;

    @GetMapping("/")
    public String hi(){
        System.out.println("hi");
        return "hi";
    }

    @GetMapping("/hello")
    public Hello hello(){
        System.out.println("======== hello ========");

        return new Hello("Hello");
    }

    @GetMapping("/hello/{name}")
    public ResponseEntity hello(@PathVariable("name") String name){
        return new ResponseEntity(helloWorldDAO.getMsg() + name, HttpStatus.OK);
    }
}
