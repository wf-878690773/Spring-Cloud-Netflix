package com.zr.service.impl;

import com.zr.entity.User;
import com.zr.mapper.UserMapper;
import com.zr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> selectAll() {

        return mapper.selectAll() ;
    }

    @Override
    public int deleteById(Long id) {

        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public User selectById(Long id) {

        return mapper.selectByPrimaryKey(id);
    }


}
