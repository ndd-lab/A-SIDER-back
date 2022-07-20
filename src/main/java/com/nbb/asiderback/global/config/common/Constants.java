package com.nbb.asiderback.global.config.common;

public class Constants {
    private Constants() {}
    public static final String CONTENT_TYPE = "application/json;charset=UTF-8";
    public static final String CONTROLLER_PATH = "com.nbb.asiderback.domain";

    public static final String USERNAME_KEY = "username";
    public static final String AUTHORITIES_KEY = "auth";
    public static final String AUTHORIZATION_HEADER = "Authorization";

    public final class REDIS_KEY {
        public static final String TOKEN_KEY = "token:";

    }


}
