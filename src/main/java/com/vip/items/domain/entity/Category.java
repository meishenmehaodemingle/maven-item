package com.vip.items.domain.entity;

import lombok.Data;

@Data
public class Category {
    /**
    * 一级分类id
    */
    private Integer cateId;

    /**
    * 一级分类名
    */
    private String cateName;
}