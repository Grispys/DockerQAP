package org.example.Member;


import org.example.Tournament.Tournament;
import org.example.Tournament.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private TournamentRepository tournamentRepository;


    public List<Member> findAllMembers() {
        return (List<Member>) memberRepository.findAll();
    }

    public Member findMemberById(long id) {
        Optional<Member> optionalMember = memberRepository.findById(id);

        return optionalMember.orElse(null);
    }

    public Member createMember(Member newMember) {
//        add the tournament junk later
//        List<Tournament> updatedTournament = new ArrayList<>();
        return memberRepository.save(newMember);
    }

    public Member updateMember(long id, Member updatedMember) {
        Member memberToUpdate = findMemberById(id);

        if (memberToUpdate != null) {
            memberToUpdate.setAddress(updatedMember.getAddress());
            memberToUpdate.setDuration(updatedMember.getDuration());
            memberToUpdate.setStartDate(updatedMember.getStartDate());
            memberToUpdate.setEndDate(updatedMember.getEndDate());
            memberToUpdate.setEmail(updatedMember.getEmail());
            memberToUpdate.setName(updatedMember.getName());
            memberToUpdate.setPhone(updatedMember.getPhone());

            return memberRepository.save(memberToUpdate);
        }
        return null;
    }


    public Member getMemberById(Long id){
        return memberRepository.findById(id).orElse(null);
    }
}
