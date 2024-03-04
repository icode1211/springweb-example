package com.estsoft.hispring.controller;

import com.estsoft.hispring.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members")
    @ResponseBody
    public List<MemberDTO> getAllMembers() {   // json : [ { "id": "", "name": "" }  ]
        return memberService.getAllMembers();
    }
}
