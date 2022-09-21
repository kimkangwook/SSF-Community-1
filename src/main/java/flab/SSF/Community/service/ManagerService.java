package flab.SSF.Community.service;

import flab.SSF.Community.Mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    private final MemberMapper memberMapper;

    public ManagerService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }




}
