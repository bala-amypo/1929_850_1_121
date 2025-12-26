package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String rollNumber;

    @Column(name = "student_year") // Avoid H2 reserved keyword 'YEAR'
    private int year;

    // Constructors
    public Student() {}

    public Student(String name, String rollNumber, int year) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.year = year;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRollNumber() { return rollNumber; }
    public void setRollNumber(String rollNumber) { this.rollNumber = rollNumber; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
}
