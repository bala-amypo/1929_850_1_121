package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class ExamRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String roomNumber;

    private Integer rows;
    private Integer columns;
    private Integer capacity;

    public ExamRoom() {}
}
