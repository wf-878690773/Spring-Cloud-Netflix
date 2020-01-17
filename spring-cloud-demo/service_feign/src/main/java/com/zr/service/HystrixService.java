package com.zr.service;

import com.zr.service.impl.HystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "service-hi",fallback = HystrixServiceImpl.class)
public interface HystrixService {


    @RequestMapping(value = "/hi",method = RequestMethod.GET)
     String sayHi(@RequestParam("message")String message);


}
