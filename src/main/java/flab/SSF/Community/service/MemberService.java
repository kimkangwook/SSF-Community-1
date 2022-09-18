package flab.SSF.Community.service;

import flab.SSF.Community.Mapper.MemberMapper;
import flab.SSF.Community.domain.Member;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private final MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }


    /**
     * 회원가입
     */
    public String join(Member member) {
//        중복검사 id, email
        validateDuplicateId(member);
        validateDuplicateEmail(member);

//        정책유효성 검사

//        validatePolicy(,member.getId());
//        member.getEmail()

        memberMapper.insert(member);
        return member.getUid();
    }

    /**
     * 아이디 정책유효성 검사
     */
//    public static boolean validatePolicy(String regex, CharSequence input) {
//
//        Pattern p = Pattern.compile(regex);
//        Matcher m = p.matcher(input);
//        return (input.length()>13 || m.matches());
//    }


    private void validateDuplicateEmail(Member member) {
        memberMapper.findByEmail(member.getEmail()).ifPresent
                (m -> {throw new IllegalStateException("이미 등록된 이메일입니다.");});
    }

    private void validateDuplicateId(Member member) {
        memberMapper.findById(member.getUid()).ifPresent
                (m -> {throw new IllegalStateException("이미 등록된 아이디입니다.");} );
    }

    /**
     * 이메일로 아이디찾기
     */
    public String findId(String email) {

        return memberMapper.findByEmail(email).orElseGet
                (() -> {throw new IllegalStateException("등록되지 않은 회원입니다.");}).getUid();

    }

    /**
     * 아이디로 비밀번호 찾기(새로운 비밀번호로 변경)
     */
    public Member findPassword(String Uid, String pw) {
        Member member=memberMapper.findById(Uid).orElseGet(()->{throw new IllegalStateException("등록되지 않은 회원입니다.");});
        memberMapper.update(pw);
        return member;
    }


    /**
     * 전체 회원 조회하기
     */
    public List<Member> findMembers() {
        return memberMapper.findAll();
    }

    public Optional<Member> findOne(String memberId) {
        return memberMapper.findById(memberId);
    }
}
