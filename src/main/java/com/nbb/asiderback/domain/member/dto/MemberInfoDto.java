package com.nbb.asiderback.domain.member.dto;

import com.nbb.asiderback.domain.member.entity.Member;
import lombok.Builder;
import lombok.Getter;


public class MemberInfoDto {

    @Getter
    public class Request {
        private String memberId;

        @Builder
        public Request(String memberId) {
            this.memberId = memberId;
        }
    }
    @Getter
    public static class Response {
        private String nickname;
        private String email;

        @Builder
        public Response(String nickname, String email) {
            this.nickname = nickname;
            this.email = email;
        }

        public static Response toDto(Member member) {
            return MemberInfoDto.Response.builder()
                    .nickname(member.getNickname())
                    .email(member.getEmail())
                    .build();
        }
    }
}
