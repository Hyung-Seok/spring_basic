package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        // given
        Member member = new Member(1L, "memberA", Grade.VIP);

        // when
        memberService.join(member);
//        System.out.println("member.getId() : " + member.getId());
        Member findMember = memberService.findMember(1L);
//        System.out.println("findMember.getID() : " + findMember.getId());
        // then
        Assertions.assertThat(member).isEqualTo(findMember);

    }

}
