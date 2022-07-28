package com.nbb.asiderback.domain.member.exception;

public class NoExistMemberException extends RuntimeException {

    public NoExistMemberException() {}

    public NoExistMemberException(String message) {
        super(message);
    }
}
