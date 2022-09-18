package flab.SSF.Community.Mapper;

import flab.SSF.Community.domain.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Mapper
public interface MemberMapper {

    Member insert(Member member);

    Member update(String pw);

    Member delete(String id);

    List<Member> findAll();

    Optional<Member> findById(String id);

    Optional<Member> findByEmail(String email);

}
