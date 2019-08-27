package com.vip.items.service.impl;

import com.vip.items.domain.entity.User;
import com.vip.items.mapper.UserMapper;
import com.vip.items.service.LoginService;
import com.vip.items.utils.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    UserMapper userMapper;
    @Override
    public User getUser(String username,String password) {
        User user = userMapper.findByUsername(username);
        // 判断用户是否存在
        if (user != null) {
            // 判断密码是否一致
            if (user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
