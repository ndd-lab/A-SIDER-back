package com.nbb.asiderback.domain.member.repository;

import com.nbb.asiderback.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, String> {

    Optional<Member> findByEmail(String email);

    Optional<Member> findByNickname(String nickname);
}
