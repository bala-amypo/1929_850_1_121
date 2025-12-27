package com.example.demo.controller;

import com.example.demo.model.ExamSession;
import com.example.demo.service.ExamSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exam-sessions")
public class ExamSessionController {

    private final ExamSessionService examSessionService;

    @Autowired
    public ExamSessionController(ExamSessionService examSessionService) {
        this.examSessionService = examSessionService;
    }

    @PostMapping
    public ExamSession addSession(@RequestBody ExamSession session) {
        return examSessionService.saveSession(session);
    }

    @GetMapping
    public List<ExamSession> getAllSessions() {
        return examSessionService.getAllSessions();
    }
}
