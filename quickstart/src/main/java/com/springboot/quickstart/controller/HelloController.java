package com.springboot.quickstart.controller;
/*
* Spring boot 第一个RESTFUL 请求
* */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)

    public String getHello(){
        return "Hello ,Spring Boot~~";
    }
}
