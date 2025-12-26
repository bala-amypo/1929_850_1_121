package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int year;

    public Student() {}

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public int getYear() { return year; }

    public void setName(String name) { this.name = name; }
    public void setYear(int year) { this.year = year; }
}
