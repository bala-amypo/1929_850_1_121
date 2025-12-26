package com.example.demo.service;

import com.example.demo.entity.ExamSession;
import java.util.List;

public interface ExamSessionService {
    List<ExamSession> getAllExamSessions();
    ExamSession createExamSession(ExamSession examSession);
}
