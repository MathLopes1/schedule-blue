package com.blue.scheduleblue.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    
    @GetMapping(value="/")
    public String getHello() {
        return "Hello World";
    }
}
