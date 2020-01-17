package com.zr.service;

import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "com.zr.service-hi")
public interface HiService {

    @GetMapping(value = "/hi")
    String sayHi();

}
