package com.vip.items.mapper;

import com.vip.items.domain.vo.ProjectVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectMapper {
    List<ProjectVo> findByKeyword(@Param("keyword") String keyword);
}
