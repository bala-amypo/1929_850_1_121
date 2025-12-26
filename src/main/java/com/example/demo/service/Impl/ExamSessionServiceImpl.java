package com.example.demo.service.impl;

import com.example.demo.model.ExamSession;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.ExamSessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExamSessionServiceImpl implements ExamSessionService {

    private final ExamSessionRepository examSessionRepository;
    private final StudentRepository studentRepository;

    @Override
    public ExamSession createSession(ExamSession session) {
        return examSessionRepository.save(session);
    }

    @Override
    public ExamSession getSession(long id) {
        return examSessionRepository.findById(id).orElse(null);
    }
}
