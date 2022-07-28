package com.nbb.asiderback.domain.member.api;

import com.nbb.asiderback.domain.member.dto.MemberInfoDto;
import com.nbb.asiderback.domain.member.service.MemberInfoService;
import com.nbb.asiderback.global.config.common.ResponseResult;
import com.nbb.asiderback.global.config.common.service.ResponseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${api.v1}/member-info")
public class MemberInfoController {

    private final MemberInfoService memberInfoService;

    public MemberInfoController (MemberInfoService memberInfoService) {
        this.memberInfoService = memberInfoService;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseResult<MemberInfoDto.Response> getMemberInfo(@PathVariable String id) {
        return new ResponseService().getResponseResult(memberInfoService.getMemberInfo(id));
    }

}
