package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class SeatingPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String details;

    public SeatingPlan() {}
    public SeatingPlan(String details) { this.details = details; }

    public Long getId() { return id; }
    public String getDetails() { return details; }

    public void setDetails(String details) { this.details = details; }
}
