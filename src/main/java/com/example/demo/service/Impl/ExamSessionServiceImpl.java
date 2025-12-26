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
    public ExamSession save(ExamSession examSession) {
        return repository.save(examSession);
    }

    @Override
    public ExamSession get(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<ExamSession> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
