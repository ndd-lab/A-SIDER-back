package com.nbb.asiderback.domain.member.repository;

import com.nbb.asiderback.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}
