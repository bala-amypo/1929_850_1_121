package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sessions")
@Tag(name = "Exam Sessions")
public class ExamSessionController {

    @GetMapping
    @Operation(summary = "List sessions")
    public String sessions() {
        return "Sessions API";
    }
}
