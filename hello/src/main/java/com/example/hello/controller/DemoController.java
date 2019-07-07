package com.example.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("hello")
    public String hello(){
        System.out.println("FirstBlood");
        return "FirstBlood";
    }
}
