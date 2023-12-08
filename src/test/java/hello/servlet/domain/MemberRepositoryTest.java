package hello.servlet.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryTest {
    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
            memberRepository.clearStore();
    }

    @Test
    void save() {
        Member memberA = new Member("memberA", 20);

        Member savedMember = memberRepository.save(memberA);

        Member findMember  = memberRepository.findById(memberA.getId());
        assertThat(savedMember).isSameAs(findMember);
    }

    @Test
    void findAll() {
        //given
        Member member1 = new Member("member1", 16);
        Member member2 = new Member("member2", 22);

        //when
        memberRepository.save(member1);
        memberRepository.save(member2);

        //then
        List<Member> result = memberRepository.findAll();

        assertThat(result.size()).isEqualTo(2);
        assertThat(result).contains(member1, member2);

    }

}