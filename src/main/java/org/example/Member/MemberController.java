package org.example.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/members")
    public List<Member> getAllMembers() {
        return memberService.findAllMembers();
    }

    @GetMapping("/members/{id}")
    public Member getMemberByID(@PathVariable long id) {
        return memberService.findMemberById(id);
    }

    @PostMapping("/members")
    public Member createMember(@RequestBody Member newMember) {
        return memberService.createMember(newMember);
    }

}
