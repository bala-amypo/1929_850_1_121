package com.example.demo.controller;

import com.example.demo.model.SeatingPlan;
import com.example.demo.service.SeatingPlanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seating-plans")
public class SeatingPlanController {

    private final SeatingPlanService service;

    public SeatingPlanController(SeatingPlanService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<SeatingPlan> create(@RequestBody SeatingPlan plan) {
        return ResponseEntity.ok(service.createPlan(plan));
    }

    @GetMapping("/course/{courseCode}")
    public ResponseEntity<SeatingPlan> getByCourse(@PathVariable String courseCode) {
        return ResponseEntity.ok(service.getPlan(courseCode));
    }

    // ✅ FIXED HERE: Long instead of String
    @GetMapping("/session/{sessionId}")
    public ResponseEntity<List<SeatingPlan>> getBySession(@PathVariable Long sessionId) {
        return ResponseEntity.ok(service.getPlansBySession(sessionId));
    }
}
