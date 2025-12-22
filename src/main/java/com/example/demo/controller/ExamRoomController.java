package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rooms")
@Tag(name = "Exam Rooms")
public class ExamRoomController {

    @GetMapping
    @Operation(summary = "List rooms")
    public String rooms() {
        return "Rooms API";
    }
}
