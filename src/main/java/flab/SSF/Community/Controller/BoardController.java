package flab.SSF.Community.Controller;

import flab.SSF.Community.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class BoardController {

    private final MemberService memberService;

    @Autowired
    public BoardController(MemberService memberService) {
        this.memberService = memberService;
    }


}
