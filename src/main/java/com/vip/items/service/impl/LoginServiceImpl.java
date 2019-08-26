package com.vip.items.service.impl;

import com.vip.items.domain.entity.User;
import com.vip.items.mapper.UserMapper;
import com.vip.items.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    UserMapper userMapper;
    @Override
    public User getUser(String username) {
        return userMapper.findByUsername(username);
    }
}
