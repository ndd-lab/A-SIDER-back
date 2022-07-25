package com.nbb.asiderback.domain.member.service;

import com.nbb.asiderback.domain.member.dto.MemberRegisterDto;
import com.nbb.asiderback.domain.member.exception.MemberAlreadyExistsException;
import com.nbb.asiderback.domain.member.repository.MemberRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public MemberService(MemberRepository memberRepository, PasswordEncoder passwordEncoder) {
        this.memberRepository = memberRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public MemberRegisterDto.Response register(MemberRegisterDto.Request requestDto) {
        if (isExistMember(requestDto))
            throw new MemberAlreadyExistsException(requestDto.getId());

        requestDto.encodePassword(passwordEncoder.encode(requestDto.getPassword()));

        requestDto.setUserAuthority();

        return null;
    }

    private boolean isExistMember(MemberRegisterDto.Request requestDto) {
        return memberRepository.findById(requestDto.getId()).isPresent();
    }
}
