package com.nbb.asiderback.domain.study.entity;

import com.nbb.asiderback.domain.member.entity.Member;
import com.nbb.asiderback.global.config.common.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Study extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    @Column(length = 20)
    private String title;

    @Column(name="STATUS_CODE")
    private String statusCode;

    @Column(name = "UPPER_ADDRESS", length = 200)
    private String upperAddress;

    @Column(name = "LOWER_ADDRESS", length = 200)
    private String lowerAddress;

    @Lob
    private String contents;

    @Enumerated(EnumType.STRING)
    private CategoryCode categoryCode;

    @OneToMany(mappedBy = "study")
    private List<StudySchedule> studySchedules;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="MEMBER_ID")
    private List<Member> members;
}
