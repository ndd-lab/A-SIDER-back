package com.nbb.asiderback.domain.project.controller;

import com.nbb.asiderback.domain.project.dto.ProjectCreateDto;
import com.nbb.asiderback.domain.project.service.impl.ProjectServiceImpl;
import com.nbb.asiderback.global.config.common.ResponseResult;
import com.nbb.asiderback.global.config.common.service.ResponseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${api.v1}/project")
public class ProjectController {

    private final ProjectServiceImpl projectService;

    private final ResponseService responseService;

    public ProjectController(ProjectServiceImpl projectService, ResponseService responseService) {
        this.projectService = projectService;
        this.responseService = responseService;
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseResult<ProjectCreateDto.Response> create(@RequestBody ProjectCreateDto.Request requestDto) {
        return new ResponseService().getResponseResult(projectService.create(requestDto));
    }
}
