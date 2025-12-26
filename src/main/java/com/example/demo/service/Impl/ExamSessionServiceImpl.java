package com.example.demo.service.impl;

import com.example.demo.model.ExamSession;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.service.ExamSessionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamSessionServiceImpl implements ExamSessionService {

    private final ExamSessionRepository examSessionRepository;

    public ExamSessionServiceImpl(ExamSessionRepository examSessionRepository) {
        this.examSessionRepository = examSessionRepository;
    }

    @Override
    public ExamSession createSession(ExamSession examSession) {
        return examSessionRepository.save(examSession);
    }

    @Override
    public Optional<ExamSession> getSessionById(Long id) {
        return examSessionRepository.findById(id);
    }

    // ✅ MISSING METHOD — NOW IMPLEMENTED
    @Override
    public List<ExamSession> getAllSessions() {
        return examSessionRepository.findAll();
    }

    @Override
    public void deleteSession(Long id) {
        examSessionRepository.deleteById(id);
    }
}
