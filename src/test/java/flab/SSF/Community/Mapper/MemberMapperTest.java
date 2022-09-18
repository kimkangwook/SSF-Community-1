package flab.SSF.Community.Mapper;

import flab.SSF.Community.domain.Member;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@MybatisTest
class MemberMapperTest {
    @Autowired
    public MemberMapper memberMapper;
    @Test
    void insert() {
        Member member = new Member();
        member.setUid("qewqwqe");
        member.setPhone("01021111245");
        member.setAddress("해운대");
        member.setDate(new Date());
        member.setEmail("dasda@naver.com");
        member.setEnabled('y');
        member.setGrade('y');
        member.setPw("sk12244");
        member.setRole('y');

        memberMapper.insert(member);

    }
}