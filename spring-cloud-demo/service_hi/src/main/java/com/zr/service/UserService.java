package com.zr.service;

import com.zr.entity.User;

import java.util.List;

public interface UserService {

    List<User> selectAll();

    User selectById(Long id);

    int deleteById(Long id);

}
