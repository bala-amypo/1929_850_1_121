package com.example.demo.service.impl;

import com.example.demo.model.ExamSession;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.service.ExamSessionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamSessionServiceImpl implements ExamSessionService {

    private final ExamSessionRepository repository;

    public ExamSessionServiceImpl(ExamSessionRepository repository) {
        this.repository = repository;
    }

    @Override
    public ExamSession saveExamSession(ExamSession examSession) {
        return repository.save(examSession);
    }

    @Override
    public List<ExamSession> getAllExamSessions() {
        return repository.findAll();
    }
}
