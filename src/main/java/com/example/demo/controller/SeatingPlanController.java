package com.example.demo.controller;

import com.example.demo.model.SeatingPlan;
import com.example.demo.service.SeatingPlanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seating")
public class SeatingPlanController {

    private final SeatingPlanService service;

    public SeatingPlanController(SeatingPlanService service) {
        this.service = service;
    }

    @PostMapping("/generate/{sessionId}")
    public ResponseEntity<SeatingPlan> generate(@PathVariable long sessionId) {
        return ResponseEntity.ok(service.generatePlan(sessionId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SeatingPlan> get(@PathVariable long id) {
        return ResponseEntity.ok(service.getPlan(id));
    }

    @GetMapping("/session/{sessionId}")
    public ResponseEntity<List<SeatingPlan>> list(@PathVariable long sessionId) {
        return ResponseEntity.ok(service.getPlansBySession(sessionId));
    }
}
