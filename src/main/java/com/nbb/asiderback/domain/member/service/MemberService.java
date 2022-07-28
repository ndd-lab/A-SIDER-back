package com.nbb.asiderback.domain.member.service;

import com.nbb.asiderback.domain.member.dto.MemberEmailDto;
import com.nbb.asiderback.domain.member.dto.MemberNicknameDto;
import com.nbb.asiderback.domain.member.dto.MemberRegisterDto;
import com.nbb.asiderback.domain.member.entity.Member;
import com.nbb.asiderback.domain.member.exception.EmailAlreadyExistsException;
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

        Member member = memberRepository.save(requestDto.toEntity());

        return MemberRegisterDto.Response.builder()
                .id(member.getId())
                .build();
    }

    private boolean isExistMember(MemberRegisterDto.Request requestDto) {
        return memberRepository.findById(requestDto.getId()).isPresent();
    }

    public MemberEmailDto.Response isExistEmail(MemberEmailDto.Request requestDto) {
        boolean existEmail = false;

        if (isExistEmailValidation(requestDto)){
            existEmail = true;
        }

        return MemberEmailDto.Response.builder()
                .existEmail(existEmail)
                .build();
    }

    private boolean isExistEmailValidation(MemberEmailDto.Request requestDto) {
        return memberRepository.findByEmail(requestDto.getEmail()).isPresent();
    }

    public MemberNicknameDto.Response isExistNickname(MemberNicknameDto.Request requestDto) {
        boolean existNickname = false;

        if (isExistNicknameValidation(requestDto)){
            existNickname = true;
        }

        return MemberNicknameDto.Response.builder()
                .existNickname(existNickname)
                .build();
    }

    private boolean isExistNicknameValidation(MemberNicknameDto.Request requestDto) {
        return memberRepository.findByNickname(requestDto.getNickname()).isPresent();
    }
}
