package com.example.demo.controller;

import com.example.demo.model.ExamSession;
import com.example.demo.service.ExamSessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sessions")
@RequiredArgsConstructor
public class ExamSessionController {

    private final ExamSessionService service;

    @PostMapping
    public ExamSession create(@RequestBody ExamSession session) {
        return service.createSession(session);
    }
}
