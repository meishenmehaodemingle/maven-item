package com.vip.items.service.impl;

import com.vip.items.mapper.UserMapper;
import com.vip.items.service.RegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Resource
    UserMapper userMapper;
    @Override
    public int insertUser(String username, String password, String email,
                          String utel) {
        int i = userMapper.insertUser(username, password, email, utel);
        return i;
    }
}
