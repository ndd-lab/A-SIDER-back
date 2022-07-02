package com.nbb.asiderback.global.error;

import lombok.Getter;

@Getter
public enum ErrorCode {

    TOKEN_EXPIRE("101", "만료된 토큰", 401),
    UNSUPPORTED_TOKEN("102", "지원하지 않는 토큰", 401);

    private final String code;
    private final String message;
    private final int status;

    ErrorCode(String code, String message, int status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }

}
