package com.zr.controller;

import javafx.concurrent.ScheduledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.zr.service.HelloService;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;



    @GetMapping(value = "/hi")
    public String hi() {
        return helloService.hiService();
    }

    @GetMapping(value = "/hello")
    public String hello() {

        return "hello";
    }
}
