package com.vip.items.mapper;

import com.vip.items.domain.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface UserMapper {
    /**
     * 根据用户名查找其是否存在
     * @param username
     * @return
     */
    User findByUsername(@Param("username") String username);

    int insertUser(@Param("username") String username, @Param("password") String password,
                   @Param("email") String email, @Param("utel") String utel);
}
