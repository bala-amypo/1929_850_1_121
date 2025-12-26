package com.example.demo.repository;

import com.example.demo.model.ExamSession;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ExamSessionRepository {
    private final List<ExamSession> sessions = new ArrayList<>();

    public Optional<ExamSession> findById(Long id) {
        return sessions.stream().filter(s -> s.getId().equals(id)).findFirst();
    }

    public List<ExamSession> findAll() {
        return sessions;
    }

    public ExamSession save(ExamSession session) {
        sessions.add(session);
        return session;
    }
}
