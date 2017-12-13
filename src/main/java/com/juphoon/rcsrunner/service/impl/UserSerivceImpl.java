package com.juphoon.rcsrunner.service.impl;



import com.juphoon.rcsrunner.entity.User;
import com.juphoon.rcsrunner.mapper.UserMapper;
import com.juphoon.rcsrunner.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSerivceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }
}
