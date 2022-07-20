package com.nbb.asiderback.domain.project.entity;

import com.nbb.asiderback.domain.member.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Project {

    @Id @GeneratedValue
    private Long id;

    @Column(name="OWNER_ID", length = 20)
    private Integer ownerId;

    @Column(length = 100)
    private String title;

    @Column(name="UPPER_ADDRESS", length = 100)
    private String upperAddress;

    @Column(name="LOWER_ADDRESS", length = 100)
    private String lowerAddress;

    @Lob
    private String contents;

    @Column(name="START_DATE")
    private LocalDateTime startDate;

    @Column(name="END_DATE")
    private LocalDateTime endDate;

    @Column(name="LOGO_FILE_ID", length=20)
    private Long logoFileId;

    @Column(name="TEAM_COLOR", length=7)
    private String teamColor;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="MEMBER_ID")
    private List<Member> members;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="PROJECT_RECRUIT_ID")
    private List<ProjectRecruit> projectRecruits;
}
