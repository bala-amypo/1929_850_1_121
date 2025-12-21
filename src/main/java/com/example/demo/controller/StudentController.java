package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@Tag(name = "Students")
public class StudentController {

    @GetMapping
    @Operation(summary = "List students")
    public String list() {
        return "Students API";
    }
}
