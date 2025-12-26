package com.example.demo.service.impl;

import com.example.demo.entity.ExamSession;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.service.ExamSessionService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExamSessionServiceImpl implements ExamSessionService {

    private final ExamSessionRepository examSessionRepository;

    // Constructor injection
    public ExamSessionServiceImpl(ExamSessionRepository examSessionRepository) {
        this.examSessionRepository = examSessionRepository;
    }

    @Override
    public List<ExamSession> getAllExamSessions() {
        return examSessionRepository.findAll();
    }

    @Override
    public ExamSession createExamSession(ExamSession examSession) {
        return examSessionRepository.save(examSession);
    }
}
