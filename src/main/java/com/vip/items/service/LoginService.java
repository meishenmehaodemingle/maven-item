package com.vip.items.service;

import com.vip.items.domain.entity.User;

public interface LoginService {
    User getUser(String username);
}
