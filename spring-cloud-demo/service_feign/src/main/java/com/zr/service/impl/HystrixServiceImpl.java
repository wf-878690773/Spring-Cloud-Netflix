package com.zr.service.impl;

import com.zr.service.HystrixService;
import org.springframework.stereotype.Component;

@Component
public class HystrixServiceImpl implements HystrixService {


    @Override
    public String sayHi(String message) {
        return "sorry,Hystrix"+message;
    }
}
