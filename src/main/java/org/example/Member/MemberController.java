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

    @GetMapping("/members/id/{id}")
    public Member getMemberByID(@PathVariable long id) {
        return memberService.findMemberById(id);
    }

    @GetMapping("/members/name/{name}")
    public Member getMemberByName(@PathVariable String name) {
        return memberService.getMemberByName(name);
    }

    @PostMapping("/members")
    public Member createMember(@RequestBody Member newMember) {
        return memberService.createMember(newMember);
    }

}
