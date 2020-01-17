package com.zr.controller;

import com.zr.entity.User;
import com.zr.mapper.UserMapper;
import com.zr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;


    @GetMapping("/list")
    public @ResponseBody List<User> list(){

        return userService.selectAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody User selectById(@PathVariable(value = "id") Long id){
        User user = userService.selectById(id);
        return user;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable(value = "id") Long id){

        userService.deleteById(id);

        return "删除成功";
    }
}
