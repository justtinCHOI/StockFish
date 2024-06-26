package com.stockfish.stockfishserver.member.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -320840453L;

    public static final QMember member = new QMember("member1");

    public final com.stockfish.stockfishserver.audit.QAuditable _super = new com.stockfish.stockfishserver.audit.QAuditable(this);

    public final ListPath<com.stockfish.stockfishserver.cash.entity.Cash, com.stockfish.stockfishserver.cash.entity.QCash> cashList = this.<com.stockfish.stockfishserver.cash.entity.Cash, com.stockfish.stockfishserver.cash.entity.QCash>createList("cashList", com.stockfish.stockfishserver.cash.entity.Cash.class, com.stockfish.stockfishserver.cash.entity.QCash.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath email = createString("email");

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final ListPath<MemberRole, EnumPath<MemberRole>> memberRoleList = this.<MemberRole, EnumPath<MemberRole>>createList("memberRoleList", MemberRole.class, EnumPath.class, PathInits.DIRECT2);

    public final EnumPath<MemberStatus> memberStatus = createEnum("memberStatus", MemberStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedAt = _super.modifiedAt;

    public final StringPath name = createString("name");

    public final StringPath nickname = createString("nickname");

    public final StringPath password = createString("password");

    public final BooleanPath social = createBoolean("social");

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

