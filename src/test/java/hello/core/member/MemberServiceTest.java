package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

//    MemberService memberService = new MemberServiceImpl();

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
