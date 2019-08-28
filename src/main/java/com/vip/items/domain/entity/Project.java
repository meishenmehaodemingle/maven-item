package com.vip.items.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Project {
    /**
    * 项目id
    */
    private Integer proid;

    /**
    * 项目名
    */
    private String proName;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 发布公司
    */
    private String proCom;

    /**
    * 项目要求
    */
    private String proRequest;

    /**
    * 联系电话
    */
    private String tel;

    /**
    * 要求时间
    */
    private String time;

    /**
    * 一级分类id
    */
    private Integer cateId;

    /**
    * 二级分类id
    */
    private Integer menu2Id;

    /**
    * 三级分类id
    */
    private Integer menu3Id;

    /**
    * 状态,0 存在,1 删除
    */
    private Integer isDelete;

}