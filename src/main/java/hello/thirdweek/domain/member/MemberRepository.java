package hello.thirdweek.domain.member;


import hello.thirdweek.infra.member.entity.MemberInfoEntity;

public interface MemberRepository {


    int amount(long memberId);

    MemberInfoEntity charge(long memberId, int chargeAmount);

}
