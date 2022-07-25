package com.nbb.asiderback.domain.project.repository;

import com.nbb.asiderback.domain.project.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
