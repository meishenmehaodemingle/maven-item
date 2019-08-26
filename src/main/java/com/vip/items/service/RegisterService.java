package com.vip.items.service;

import java.util.Date;

public interface RegisterService {
    int insertUser(String username,String password,
                   String email,String utel);
}
