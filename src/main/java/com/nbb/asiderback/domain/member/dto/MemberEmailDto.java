package com.nbb.asiderback.domain.member.dto;

import lombok.Builder;
import lombok.Getter;

public class MemberEmailDto {

    @Getter
    public class Request {
        private String email;

        @Builder
        public Request(String email) {
            this.email = email;
        }
    }

    @Getter
    public class Response {
        private boolean existEmail;

        @Builder
        public Response(boolean existEmail) {
            this.existEmail = existEmail;
        }
    }

}
