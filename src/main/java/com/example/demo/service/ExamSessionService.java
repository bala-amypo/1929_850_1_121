package com.example.demo.service;

import com.example.demo.model.ExamSession;
import java.util.List;

public interface ExamSessionService {

    ExamSession save(ExamSession examSession);

    ExamSession get(Long id);

    List<ExamSession> getAll();

    void delete(Long id);
}
