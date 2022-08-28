package com.nbb.asiderback.domain.member.dto;

import com.nbb.asiderback.domain.member.entity.Authority;
import com.nbb.asiderback.domain.member.entity.Member;
import com.nbb.asiderback.domain.member.entity.MemberReputation;
import com.nbb.asiderback.global.config.common.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class MemberDTO {
    private String id;
    private String password;
    private String email;
    private String nickname;
    private String upperAddress;
    private String lowerAddress;
    private String birth;
    private String profileFileId;
    private String type;
    private String openFlag;
    private String useFlag;
    private Integer career;
    private String selfIntroduction;

    public Member toEntity() {
        return Member.builder()
                .id(id)
                .password(password)
                .email(email)
                .nickname(nickname)
                .birth(birth)
                .type(type)
                .authorities(null)
                .build();
    }

}
