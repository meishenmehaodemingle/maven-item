package com.vip.items.controller;

import com.vip.items.domain.entity.Project;
import com.vip.items.domain.vo.ProjectVo;
import com.vip.items.service.SearchService;
import com.vip.items.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/v2")
public class SearchController {
    @Resource
    SearchService searchService;
    @GetMapping("/search")
    public Result<List<Project>> search(String keyword){
            try {
                List<ProjectVo> projects = searchService.search(keyword);
                return Result.success(projects);
            } catch (Exception e) {
                log.error(e.getMessage());
            }
        return Result.error();
    }
}
