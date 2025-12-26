package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "exam_sessions")
public class ExamSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate examDate;

    @Column(nullable = false)
    private String sessionName;

    // -----------------
    // Constructors
    // -----------------

    public ExamSession() {
    }

    public ExamSession(LocalDate examDate, String sessionName) {
        this.examDate = examDate;
        this.sessionName = sessionName;
    }

    // -----------------
    // Getters & Setters
    // -----------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }
}
