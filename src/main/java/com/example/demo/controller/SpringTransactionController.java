package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringTransactionController {

    @GetMapping("test1")
    public String test1(String param){


        return "";
    }

}
