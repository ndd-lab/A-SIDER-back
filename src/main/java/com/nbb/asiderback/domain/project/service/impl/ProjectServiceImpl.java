package com.nbb.asiderback.domain.project.service.impl;

import com.nbb.asiderback.domain.project.dto.ProjectCreateDto;
import com.nbb.asiderback.domain.project.entity.Project;
import com.nbb.asiderback.domain.project.repository.ProjectRepository;
import com.nbb.asiderback.domain.project.service.ProjectService;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public ProjectCreateDto.Response create(ProjectCreateDto.Request requestDto) {
        Project project = requestDto.toEntity();
        project = projectRepository.save(project);

        ProjectCreateDto.Response response = new ProjectCreateDto.Response();
        response.builder()
                .id(project.getId())
                .ownerId(project.getOwnerId())
                .title(project.getTitle())
                .upperAddress(project.getUpperAddress())
                .lowerAddress(project.getLowerAddress())
                .contents(project.getContents())
                .startDate(project.getStartDate())
                .endDate(project.getEndDate())
                .logoFileId(project.getLogoFileId())
                .teamColor(project.getTeamColor())
                .build();

        return response;
    }
}
