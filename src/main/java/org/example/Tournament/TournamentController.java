package org.example.Tournament;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class TournamentController {
    @Autowired
    private TournamentService tournamentService;

    @GetMapping("/tournaments")
    public List<Tournament> getAllTournaments() {
        return tournamentService.findAllTournaments();
    }

    @GetMapping("/tournaments/id/{id}")
    public Tournament getTournamentByID(@PathVariable long id) {
        return tournamentService.findTournamentById(id);
    }

    @GetMapping("/tournaments/name/{name}")
    public Tournament getTournamentByName(@PathVariable String name) {
        return tournamentService.getTournamentByName(name);
    }


    @PostMapping("/tournaments")
    public Tournament createTournament(@RequestBody Tournament newTournament) {
        return tournamentService.createTournament(newTournament);
    }

}
