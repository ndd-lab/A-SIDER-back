package com.nbb.asiderback.domain.member.api;

import com.nbb.asiderback.domain.member.dto.MemberEmailDto;
import com.nbb.asiderback.domain.member.dto.MemberNicknameDto;
import com.nbb.asiderback.domain.member.dto.MemberRegisterDto;
import com.nbb.asiderback.domain.member.service.MemberService;
import com.nbb.asiderback.global.config.common.ResponseResult;
import com.nbb.asiderback.global.config.common.service.ResponseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${api.v1}/member")
public class MemberController {

    private final MemberService memberService;
    private final ResponseService responseService;

    public MemberController (MemberService memberService, ResponseService responseService) {
        this.memberService = memberService;
        this.responseService = responseService;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseResult<MemberRegisterDto.Response> register(@RequestBody MemberRegisterDto.Request requestDto){
        return new ResponseService().getResponseResult(memberService.register(requestDto));
    }

    @GetMapping("/email")
    @ResponseStatus(HttpStatus.OK)
    public ResponseResult<MemberEmailDto.Response> isExistEmail(@RequestBody MemberEmailDto.Request requestDto){
        return new ResponseService().getResponseResult(memberService.isExistEmail(requestDto));
    }

    @GetMapping("/nickname")
    @ResponseStatus(HttpStatus.OK)
    public ResponseResult<MemberNicknameDto.Response> isExistNickname(@RequestBody MemberNicknameDto.Request requestDto){
        return new ResponseService().getResponseResult(memberService.isExistNickname(requestDto));
    }

}
