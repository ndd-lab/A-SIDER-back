package com.nbb.asiderback.domain.member.dto;

import lombok.Builder;
import lombok.Getter;

public class MemberNicknameDto {

    @Getter
    public class Request {
        private String nickname;

        @Builder
        public Request(String nickname) {
            this.nickname = nickname;
        }
    }

    @Getter
    public class Response {
        private boolean existNickname;

        @Builder
        public Response(boolean existNickname) {
            this.existNickname = existNickname;
        }
    }
}
