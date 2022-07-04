package com.nbb.asiderback.domain.member.entity;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Member {
    @Id
    @Column(length = 20)
    private String id;

    @Column(length = 255)
    private String password;

    @Column(length = 50)
    private String email;

    @Column(length = 50)
    private String nickname;

    @Column(name = "UPPER_ADDRESS", length = 200)
    private String upperAddress;

    @Column(name = "LOWER_ADDRESS", length = 200)
    private String lowerAddress;

    @Column(length = 10 )
    private String birth;

    @Column(name = "PROFILE_FILE_ID", length = 20)
    private String profileFileId;

    @Column(length = 10 )
    private String type;

    @Column(name = "OPEN_FLAG", length = 1)
    private String openFlag;

    @Column(name = "USE_FLAG", length = 1)
    private String useFlag;
}
