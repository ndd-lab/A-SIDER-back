package com.nbb.asiderback.domain.study.entity;

import com.nbb.asiderback.domain.member.entity.Member;
import com.nbb.asiderback.global.config.common.BaseEntity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class StudySchedule extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name="STUDY_ID")
    private Study study;

    @OneToMany
    @JoinColumn(name = "MEMBER_ID")
    private List<Member> members;

    private Double lon;

    private Double lat;

    @Column(name="OFFLINE_FLAG", length = 1)
    private String offlineFlag;

    @Column(length = 200)
    private String place;

    @Column(name = "START_DATE")
    private LocalDateTime startDate;

    @Column(name = "END_DATE")
    private LocalDateTime endDate;

    @Lob
    private String contents;
}
