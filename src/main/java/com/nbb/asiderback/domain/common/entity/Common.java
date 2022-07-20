package com.nbb.asiderback.domain.common.entity;

import com.nbb.asiderback.global.config.common.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "COMMON_CODE")
public class Common extends BaseEntity {

    @Id
    @Column(length = 12)
    private String code;

    @Column(name="CODE_GROUP_ID", length=32)
    private String codeGroupId;

    @Column(name="CODE_NAME", length = 128)
    private String codeName;

    @Column(name="USE_FLAG", length=1)
    private String useFlag;

    @Column(length=200)
    private String explain;

}
