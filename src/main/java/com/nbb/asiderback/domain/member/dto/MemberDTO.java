package com.nbb.asiderback.domain.member.entity;

import com.nbb.asiderback.global.config.common.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@NoArgsConstructor
public class Member extends BaseEntity {
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

    @Column(length = 2)
    private Integer career;

    @Column(name= "SELF_INTRODUCTION", length = 200)
    private String selfIntroduction;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_REPUTATION_ID")
    private List<MemberReputation> reputations;

    @OneToMany
    @JoinTable(
            name = "user_authority",
            joinColumns = {@JoinColumn(name = "id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "authority_name")})
    private Set<Authority> authorities;

    @Builder
    public Member(String id, String password, String email, String nickname, String upperAddress, String lowerAddress, String birth, String profileFileId, String type, Set<Authority> authorities) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.nickname = nickname;
        this.upperAddress = upperAddress;
        this.lowerAddress = lowerAddress;
        this.birth = birth;
        this.profileFileId = profileFileId;
        this.type = type;
        this.authorities = authorities;
    }
}
