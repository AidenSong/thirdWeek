package hello.thirdweek.domain.member;


import hello.thirdweek.infra.member.entity.MemberInfoEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {


    private final MemberRepository memberRepository;

    public int amount(long memberId) {

        return memberRepository.amount(memberId);
    }


    public MemberInfoEntity charge(long memberId, int amount) {

        return memberRepository.charge(memberId, amount);
    }





}
