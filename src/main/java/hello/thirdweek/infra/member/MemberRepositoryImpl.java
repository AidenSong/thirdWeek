package hello.thirdweek.infra.member;


import hello.thirdweek.domain.member.MemberRepository;
import hello.thirdweek.infra.member.entity.MemberInfoEntity;
import hello.thirdweek.infra.member.jparepository.MemberInfoJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Slf4j
public class MemberRepositoryImpl implements MemberRepository {


    private final MemberInfoJpaRepository MemberInfoJpaRepository;


    @Override
    public int amount(long memberId) {
        Optional<MemberInfoEntity> memberInfo = MemberInfoJpaRepository.findById(memberId);
        if (memberInfo.isPresent()) {
            return memberInfo.get().getMemberAmount();
        }

        return 0;
    }

    @Override
    public MemberInfoEntity charge(long memberId, int chargeAmount) {

        Optional<MemberInfoEntity> memberInfo = MemberInfoJpaRepository.findById(memberId);
        if (memberInfo.isPresent()) {
            memberInfo.get().setMemberAmount(memberInfo.get().getMemberAmount() + chargeAmount);
            MemberInfoJpaRepository.save(memberInfo.get());
            return memberInfo.get();
        }
        return null;
    }
}
