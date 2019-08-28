package com.vip.items.service;

import com.vip.items.domain.vo.ProjectVo;

import java.util.List;

public interface SearchService {
    List<ProjectVo> search(String keyword);
}
