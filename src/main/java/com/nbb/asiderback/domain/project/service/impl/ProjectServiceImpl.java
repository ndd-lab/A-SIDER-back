package com.nbb.asiderback.domain.project.service.impl;

import com.nbb.asiderback.domain.project.repository.ProjectRepository;
import com.nbb.asiderback.domain.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }
}
