package com.vip.items.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    /**
    * 用户id
    */
    private Integer uid;

    /**
    * 用户名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 用户电话
    */
    private String utel;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 状态,0 存在,1 删除
    */
    private Integer isDelete;
    
}