package com.zr.service;

import com.zr.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "com.zr.service-hi")
public interface UserService {



    @GetMapping(value = "/user/list")
    List<User> selectAll();

    @GetMapping(value = "/user/{id}")
    User selectById(@PathVariable(value = "id") Long id);

    @DeleteMapping(value = "/user/{id}")
    int deleteById(@PathVariable(value = "id") Long id);




}
