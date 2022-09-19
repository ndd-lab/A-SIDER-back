package com.nbb.asiderback.domain.member.repository;

import com.nbb.asiderback.domain.member.entity.Member;
import com.nbb.asiderback.domain.member.entity.QMember;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Repository
public class MemberQueryDslRepository {

    @PersistenceContext
    private EntityManager em;
    private final JPAQueryFactory queryFactory;

    QMember qMember = QMember.member;

    public MemberQueryDslRepository(JPAQueryFactory queryFactory) {
        this.queryFactory = queryFactory;
    }

    public Member getMemberInfo(String id) {
        return queryFactory.selectFrom(qMember)
                .where(qMember.id.eq(id))
                .fetchOne();
    }
}
