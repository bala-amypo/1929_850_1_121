package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sessions")
@Tag(name = "Exam Sessions", description = "Exam session management APIs")
@SecurityRequirement(name = "bearerAuth")
public class ExamSessionController {

    @Autowired
    private ExamSessionRepository examSessionRepository;

    @PostMapping
    @Operation(summary = "Create a new exam session")
    public ExamSession createSession(@RequestBody ExamSession session) {
        return examSessionRepository.save(session);
    }

    @GetMapping("/{sessionId}")
    @Operation(summary = "Get exam session details")
    public ResponseEntity<ExamSession> getSession(@PathVariable Long sessionId) {
        return examSessionRepository.findById(sessionId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}