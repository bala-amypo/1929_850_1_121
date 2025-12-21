package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/plans")
@Tag(name = "Seating Plans")
public class SeatingPlanController {

    @GetMapping
    @Operation(summary = "List seating plans")
    public String plans() {
        return "Plans API";
    }
}
