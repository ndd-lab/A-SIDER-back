package com.nbb.asiderback.domain.member.service;

import com.nbb.asiderback.domain.member.dto.MemberInfoDto;
import com.nbb.asiderback.domain.member.entity.Member;
import com.nbb.asiderback.domain.member.exception.NoExistMemberException;
import com.nbb.asiderback.domain.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberInfoService {

    private final MemberRepository memberRepository;

    public MemberInfoService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public MemberInfoDto.Response getMemberInfo(String id) {
        Optional<Member> optionalMember = memberRepository.findById(id);

        if (!optionalMember.isPresent()) {
            throw new NoExistMemberException();
        }

        return MemberInfoDto.Response.toDto(optionalMember.get());
    }
}
