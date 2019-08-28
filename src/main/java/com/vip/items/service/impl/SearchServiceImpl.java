package com.vip.items.service.impl;

import com.vip.items.domain.vo.ProjectVo;
import com.vip.items.mapper.ProjectMapper;
import com.vip.items.service.SearchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    @Resource
    ProjectMapper projectMapper;
    @Override
    public List<ProjectVo> search(String keyword) {
        List<ProjectVo> projectVoList = projectMapper.findByKeyword(keyword);
        return projectVoList;
    }
}
