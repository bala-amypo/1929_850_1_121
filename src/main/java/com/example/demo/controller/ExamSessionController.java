package com.example.demo.controller;

import com.example.demo.entity.ExamSession;
import com.example.demo.service.ExamSessionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exam-sessions")
public class ExamSessionController {

    private final ExamSessionService examSessionService;

    // Constructor injection
    public ExamSessionController(ExamSessionService examSessionService) {
        this.examSessionService = examSessionService;
    }

    @GetMapping
    public List<ExamSession> getAllExamSessions() {
        return examSessionService.getAllExamSessions();
    }

    @PostMapping
    public ExamSession createExamSession(@RequestBody ExamSession examSession) {
        return examSessionService.createExamSession(examSession);
    }
}
