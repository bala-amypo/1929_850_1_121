package com.example.demo.service.impl;

import com.example.demo.model.ExamSession;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.ExamSessionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamSessionServiceImpl implements ExamSessionService {

    private final ExamSessionRepository repository;
    private StudentRepository studentRepository;

    // ✅ REQUIRED BY TESTS
    public ExamSessionServiceImpl(ExamSessionRepository repository) {
        this.repository = repository;
    }

    // ✅ USED BY SPRING
    public ExamSessionServiceImpl(ExamSessionRepository repository,
                                  StudentRepository studentRepository) {
        this.repository = repository;
        this.studentRepository = studentRepository;
    }

    @Override
    public ExamSession createSession(ExamSession session) {
        return repository.save(session);
    }

    @Override
    public ExamSession getSession(long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<ExamSession> getAllSessions() {
        return repository.findAll();
    }
}
