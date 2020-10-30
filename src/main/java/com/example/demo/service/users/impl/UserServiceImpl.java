package com.example.demo.service.users.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User User(Integer stuid) {

        return userMapper.User(stuid);
    }

    @Override
    public User user(Integer stuid) {
        return userMapper.user(stuid);
    }

    @Override
    public int updateByPrimaryKeySelective(Integer stuid, String name, String password, String phonenumber,
                                           String specialty, String grade, String dormitory, String role,String wdwx) {
        return userMapper.updateByPrimaryKeySelective( stuid,  name, password, phonenumber,
                 specialty,  grade,  dormitory, role,wdwx);
    }

    @Override
    public User selectByPrimaryKey(Integer stuid) {
        return userMapper.selectByPrimaryKey(stuid);
    }

    @Override
    public User selectByWdwx(String wdwx) {
        return userMapper.selectByWdwx(wdwx);
    }

    @Override
    public int insertSelective(User user) {
        return userMapper.insertSelective(user);
    }
}
