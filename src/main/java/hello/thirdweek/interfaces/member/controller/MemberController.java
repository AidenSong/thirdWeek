package hello.thirdweek.interfaces.member.controller;


import hello.thirdweek.domain.member.MemberService;
import hello.thirdweek.infra.member.entity.MemberInfoEntity;
import hello.thirdweek.interfaces.member.record.ChargeRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;


    @GetMapping("/amount")
    public int amount(@RequestParam long memberId) {

        return memberService.amount(memberId);
    }

    @PutMapping("/charge")
    public MemberInfoEntity memberAmount(@RequestBody ChargeRequest chargeRequest) {

        MemberInfoEntity result = memberService.charge(chargeRequest.memberId(), chargeRequest.chargeAmount());
        return result;
    }

}
