package com.activiti.service.impl;

import com.activiti.dao.UserMapper;
import com.activiti.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String getName(){
        return userMapper.selectById(1).getName();
    }
}
