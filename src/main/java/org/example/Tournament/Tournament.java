package org.example.Tournament;

import jakarta.persistence.*;
import org.example.Member.Member;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tournament {
    @Id
    @SequenceGenerator(name = "member_sequence", sequenceName = "member_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "member_sequence")
    private long id;

    private String name;
    private String address;
    private double entryFee;
    private double cashPrize;
    private String startDate;
    private String endDate;
    @OneToMany
    private List<Member> participants;

    public Tournament(){

    }

    public Tournament(String name, String address, double entryFee, double cashPrize, String startDate, String endDate) {
        this.name = name;
        this.address = address;
        this.startDate = startDate;
        this.endDate = endDate;

        this.entryFee = entryFee;
        this.cashPrize = cashPrize;
        this.participants = new ArrayList<Member>();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getCashPrize() {
        return cashPrize;
    }

    public void setCashPrize(double cashPrize) {
        this.cashPrize = cashPrize;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Member> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Member> participants){
        this.participants = participants;
    }

    public void addParticipant(Member participants) {
        this.participants.add(participants);
    }



}
