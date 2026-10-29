package com.example;
import jakarta.persistence.*;
@Entity
@Table(name="stud")
public class Student {
	@Id
    private int id;
	@Column(name="studentname")
    private String name;
	@Column(name="studentage")
    private int age;
    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
	
}
