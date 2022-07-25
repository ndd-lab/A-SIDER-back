package com.nbb.asiderback.global.config.common;

import com.nbb.asiderback.domain.member.dto.MemberRegisterDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class ResponseResult<T> extends Response{
    private T data;
}
