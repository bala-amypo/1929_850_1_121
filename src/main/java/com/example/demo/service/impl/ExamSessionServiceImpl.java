package com.example.demo.service;

import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class ExamSessionServiceImpl {

    private final ExamSessionRepository examSessionRepository;
    private final StudentRepository studentRepository;

    public ExamSessionServiceImpl(ExamSessionRepository examSessionRepository, StudentRepository studentRepository) {
        this.examSessionRepository = examSessionRepository;
        this.studentRepository = studentRepository;
    }

    // Add any methods used in tests
}
