package com.example.demo.service;

import com.example.demo.model.ExamSession;

import java.util.List;

public interface ExamSessionService {

    ExamSession createSession(ExamSession session);

    ExamSession getSession(long id);

    // ✅ ADD THIS
    List<ExamSession> getAllSessions();
}
