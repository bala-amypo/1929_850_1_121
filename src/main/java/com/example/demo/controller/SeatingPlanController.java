package com.example.demo.controller;

import com.example.demo.model.SeatingPlan;
import com.example.demo.service.SeatingPlanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seating")
public class SeatingPlanController {

    private final SeatingPlanService service;

    public SeatingPlanController(SeatingPlanService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public SeatingPlan getPlan(@PathVariable String id) {
        return service.getPlan(id);
    }

    @GetMapping("/session/{sessionId}")
    public List<SeatingPlan> getPlansBySession(@PathVariable String sessionId) {
        return service.getPlansBySession(sessionId);
    }

    @PostMapping
    public SeatingPlan createPlan(@RequestBody SeatingPlan plan) {
        return service.createPlan(plan);
    }
}
