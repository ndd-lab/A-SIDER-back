package com.nbb.asiderback.domain.member.entity;

import com.nbb.asiderback.domain.project.entity.Project;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class MemberReputation {

    @Id @GeneratedValue
    @Column(name = "MEMBER_REPUTATION_ID")
    private Long id;

    @Column(name = "SCORE_CD")
    @Enumerated(EnumType.STRING)
    private ReputationType scoreCd;

    @Column(length = 1)
    private Integer score;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROJECT_ID")
    private Project project;
}
