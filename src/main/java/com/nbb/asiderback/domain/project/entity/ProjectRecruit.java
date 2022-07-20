package com.nbb.asiderback.domain.project.entity;

import com.nbb.asiderback.global.config.common.BaseEntity;

import javax.persistence.*;

@Entity
public class ProjectRecruit extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "PROJECT_RECRUIT_ID")
    private Long id;

    @Column(length = 100)
    private String title;

    @Column(name="STATUS_NAME")
    private String statusCode;

    @Lob
    private String contents;
}
