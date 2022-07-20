package com.nbb.asiderback.domain.project.entity;

import com.nbb.asiderback.global.config.common.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class MemberProjectRecruit extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    @Column(name="JOB_UPPER_CODE")
    @Enumerated(EnumType.STRING)
    private JobUpperCode jobUpperCode;

    @Column(name="JOB_LOWER_CODE")
    @Enumerated(EnumType.STRING)
    private JobLowerCode jobLowerCode;

    @Column(name = "RECRUIT_NUMBER", length = 2)
    private Integer recruitNumber;

    private Integer career;
}
