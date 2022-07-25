package com.nbb.asiderback.domain.member.dto;

import com.nbb.asiderback.domain.member.entity.Authority;
import com.nbb.asiderback.domain.member.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Collections;

public class MemberRegisterDto {

    @Getter
    @NoArgsConstructor
    public static class Request {
        private String id;
        private String password;
        private String email;
        private String nickname;
        private String birth;
        private String type;
        private Authority authority;

        @Builder
        public Request (String id, String password, String email, String nickname, String birth, String type, Authority authority) {
            this.id = id;
            this.password = password;
            this.email = email;
            this.nickname = nickname;
            this.birth = birth;
            this.type = type;
            this.authority = authority;
        }

        public void encodePassword(String encodePassword) {
            this.password = encodePassword;
        }

        public Member toEntity() {
            return Member.builder()
                    .id(id)
                    .password(password)
                    .email(email)
                    .nickname(nickname)
                    .birth(birth)
                    .type(type)
                    .authorities(Collections.singleton(authority))
                    .build();
        }

        public void setUserAuthority() {
            authority = Authority.builder()
                    .authorityName("ROLE_USER")
                    .build();
        }
    }

    @Getter
    @NoArgsConstructor
    public static class Response {

    }
}
