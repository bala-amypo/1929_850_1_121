package com.example.demo.service.impl;

import com.example.demo.model.ExamSession;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.service.ExamSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // ✅ This is essential
public class ExamSessionServiceImpl implements ExamSessionService {

    private final ExamSessionRepository examSessionRepository;

    @Autowired
    public ExamSessionServiceImpl(ExamSessionRepository examSessionRepository) {
        this.examSessionRepository = examSessionRepository;
    }

    @Override
    public ExamSession saveSession(ExamSession session) {
        return examSessionRepository.save(session);
    }

    @Override
    public List<ExamSession> getAllSessions() {
        return examSessionRepository.findAll();
    }
}
