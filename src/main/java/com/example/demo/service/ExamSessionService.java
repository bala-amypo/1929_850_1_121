package com.example.demo.service;

import com.example.demo.model.ExamSession;
import com.example.demo.repository.ExamSessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamSessionService {

    private final ExamSessionRepository repo;

    public ExamSessionService(ExamSessionRepository repo) {
        this.repo = repo;
    }

    public List<ExamSession> getAllSessions() {
        return repo.findAll();
    }

    public ExamSession get(Long id) {
        return repo.findById(id).orElse(null);
    }

    public ExamSession save(ExamSession session) {
        return repo.save(session);
    }
}
