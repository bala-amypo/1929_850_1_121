package com.example.demo.service;

import com.example.demo.model.ExamSession;

import java.util.List;

public interface ExamSessionService {
    List<ExamSession> getAllExamSessions();
    ExamSession getExamSessionById(long id);
}
