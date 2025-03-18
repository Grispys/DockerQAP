package org.example.Member;


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
        List<Passenger> updatedPassengers = new ArrayList<>();
        List<Airport> updatedAirports = new ArrayList<>();

        for(Passenger passenger : newAircraft.getPassengers()){
            long passengerID = passenger.getId();
            Passenger passenger1 = getPassengerById(passengerID);

            if (passenger1 !=null){
                updatedPassengers.add(passenger1);
            } else{
                passengerRepository.save(passenger);
                updatedPassengers.add(passenger);
            }
        }

        for (Airport airport : newAircraft.getAirports()) {
            long airportId = airport.getId();
            Airport airport1 = getAirportById(airportId);

            if (airport1 != null) {
                updatedAirports.add(airport1);
            } else {
                airportRepository.save(airport);
                updatedAirports.add(airport);
            }
        }

        newAircraft.setAirports(updatedAirports);
        newAircraft.setPassengers(updatedPassengers);

        return aircraftRepository.save(newAircraft);
    }

    public Aircraft updateAircraft(long id, Aircraft updatedAircraft) {
        Aircraft AircraftToUpdate = findAircraftById(id);

        if (AircraftToUpdate != null) {
            AircraftToUpdate.setNumOfPassengers(updatedAircraft.getNumOfPassengers());
            AircraftToUpdate.setType(updatedAircraft.getType());
            AircraftToUpdate.setAirlineName(updatedAircraft.getAirlineName());

            return aircraftRepository.save(AircraftToUpdate);
        }

        return null;
    }


    public Passenger getPassengerById(Long id){
        return passengerRepository.findById(id).orElse(null);
    }

    public Airport getAirportById(Long id) {    return airportRepository.findById(id).orElse(null);}

}
