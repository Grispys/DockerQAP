package org.example.Tournament;

import org.example.Member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TournamentService {
    @Autowired
    private TournamentRepository tournamentRepository;
    @Autowired


    public List<Tournament> findAllTournaments() {
        return (List<Tournament>) tournamentRepository.findAll();
    }

    public Tournament findTournamentById(long id) {
        Optional<Tournament> optionalTournament = tournamentRepository.findById(id);

        return optionalTournament.orElse(null);
    }

    public Tournament createTournament(Tournament newTournament) {
        List<Member> updatedMembers = new ArrayList<>();

        for(Member member : newTournament.getParticipants()){
            long memberId = member.getId();
            Member member1 = getMemberById()
        }

        return tournamentRepository.save(newTournament);
    }

    public Tournament updateTournament(long id, Tournament updatedTournament) {
        Tournament tournamentToUpdate = findTournamentById(id);

        if (tournamentToUpdate != null) {
            tournamentToUpdate.setAddress(updatedTournament.getAddress());
            tournamentToUpdate.setCashPrize(updatedTournament.getCashPrize());
            tournamentToUpdate.setStartDate(updatedTournament.getStartDate());
            tournamentToUpdate.setEndDate(updatedTournament.getEndDate());
            tournamentToUpdate.setEntryFee(updatedTournament.getEntryFee());
            tournamentToUpdate.setName(updatedTournament.getName());
            tournamentToUpdate.setParticipants(updatedTournament.getParticipants());

            return tournamentRepository.save(tournamentToUpdate);
        }
        return null;
    }


    public Tournament getTournamentById(Long id){
        return tournamentRepository.findById(id).orElse(null);
    }
}

