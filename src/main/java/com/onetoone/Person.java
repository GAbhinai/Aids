package com.onetoone;
import jakarta.persistence.*;

@Entity
@Table(name = "person")
public class Person {

    @Id
    private int id;
    @Column
    private String name;

  
    @OneToOne
    private Passport passport;
    public Person() {
    }

    public Person(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public void setPassport(Passport passport) {
    	this.passport = passport;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    

    public Passport getPassport() {
        return passport;
    }

}