package com.example.demo.controller;

import com.example.demo.model.ExamSession; // <- corrected
import com.example.demo.service.ExamSessionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examsessions")
public class ExamSessionController {

    private final ExamSessionService examSessionService;

    public ExamSessionController(ExamSessionService examSessionService) {
        this.examSessionService = examSessionService;
    }

    @PostMapping
    public ExamSession createExamSession(@RequestBody ExamSession examSession) {
        return examSessionService.saveExamSession(examSession);
    }

    @GetMapping
    public List<ExamSession> getAllExamSessions() {
        return examSessionService.getAllExamSessions();
    }
}
