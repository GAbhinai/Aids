package com.onetoone;

import jakarta.persistence.*;

@Entity
@Table(name = "passport")
public class Passport {

    @Id
    private int id;

    @Column(name = "passport_no")
    private String passportNo;

    public Passport() {
    }
    
    public  Passport(String passportNo) {
    	this.passportNo = passportNo;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public void setPassportNo(String passportNo) {
    	this.passportNo = passportNo;
    }


    public int getId() {
        return id;
    }

    public String getPassportNo() {
        return passportNo;
    }

}