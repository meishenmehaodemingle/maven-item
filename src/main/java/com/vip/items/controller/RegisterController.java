package com.vip.items.controller;

import com.vip.items.domain.entity.User;
import com.vip.items.service.LoginService;
import com.vip.items.service.RegisterService;
import com.vip.items.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@Slf4j
@RequestMapping("/api/v2")
public class RegisterController {
    @Resource
    RegisterService registerService;
    @Resource
    LoginService loginService;

    @GetMapping("/register")
    public Result<Integer> register(String username,String password,
                                    String email,String utel){
        try {
            User user = loginService.getUser(username,password);
            if (user == null || "".equals(user)){
                int i = registerService.insertUser(username, password, email, utel);
                return Result.success(i);
            }else {
                log.error("该用户已存在");
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
