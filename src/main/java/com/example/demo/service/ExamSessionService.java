package com.example.demo.service;

import com.example.demo.model.ExamSession;
import java.util.List;

public interface ExamSessionService {

    // already used by tests
    ExamSession createSession(ExamSession session);
    ExamSession getSession(Long id);
    List<ExamSession> getAllSessions();

    // 🔹 ADD THESE (for controller compatibility)
    ExamSession save(ExamSession session);
    ExamSession get(Long id);
}
