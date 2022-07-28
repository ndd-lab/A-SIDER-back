package com.nbb.asiderback.domain.project.repository;

import com.nbb.asiderback.domain.project.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    public List<Project> findProjectByTitle(String title);

    public List<Project> findProjectByOwnerId(String ownerId);
}
