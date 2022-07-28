package com.nbb.asiderback.domain.member.exception;

import lombok.Builder;
import lombok.Getter;

@Getter
public class MemberAlreadyExistsException extends RuntimeException {
    private final String id;

    @Builder
    public MemberAlreadyExistsException(String id) {
        this.id = id;
    }

    public MemberAlreadyExistsException(String message, String id) {
        super(message);
        this.id = id;
    }


}
