package org.example.Member;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;
@Entity
public class Member {
    @Id
    @SequenceGenerator(name = "member_sequence", sequenceName = "member_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "member_sequence")
    private long id;

    private String name;
    private String address;
    private Integer phone;
    private String email;
    private String startDate;
    private String duration;

    public Member(){

    }

    public Member(String name, String address, String email, int phone, String startDate, String duration) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.startDate = startDate;
        this.duration = duration;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
