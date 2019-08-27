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
            if (username != null && !"".equals(username)
                    && password != null && !"".equals(password)
                    && utel != null && !"".equals(utel)){
                User user = loginService.getUser(username);
                if (user == null || "".equals(user)){
                    int i = registerService.insertUser(username, password, email, utel);
                    return Result.success(i);
                }else {
                    log.error("该用户已存在");
                }
            }else {
                log.error("必填信息为空");
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
