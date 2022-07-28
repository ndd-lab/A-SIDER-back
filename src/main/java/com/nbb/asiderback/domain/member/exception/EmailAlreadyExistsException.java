package com.nbb.asiderback.domain.member.exception;

public class EmailAlreadyExistsException extends RuntimeException {

    private final String email;

    public EmailAlreadyExistsException(String email) {
        this.email = email;
    }

    public EmailAlreadyExistsException(String message, String email) {
        super(message);
        this.email = email;
    }
}
