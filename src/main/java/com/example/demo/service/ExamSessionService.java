package com.example.demo.service;

import com.example.demo.entity.ExamSession;
import java.util.List;

public interface ExamSessionService {

    ExamSession saveSession(ExamSession session);

    ExamSession getSessionById(Long id);

    List<ExamSession> getAllSessions();

    ExamSession updateSession(Long id, ExamSession session);

    void deleteSession(Long id);
}
