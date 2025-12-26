package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class ExamSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;

    public ExamSession() {}
    public ExamSession(String subject) { this.subject = subject; }

    public Long getId() { return id; }
    public String getSubject() { return subject; }

    public void setSubject(String subject) { this.subject = subject; }
}
