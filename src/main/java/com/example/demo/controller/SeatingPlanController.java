package com.example.demo.controller;

import com.example.demo.model.SeatingPlan;
import com.example.demo.service.SeatingPlanService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/seating-plans")
public class SeatingPlanController {

    private final SeatingPlanService service;

    public SeatingPlanController(SeatingPlanService service) {
        this.service = service;
    }

    @PostMapping
    public SeatingPlan save(@RequestBody SeatingPlan plan) {
        return service.save(plan);
    }

    @GetMapping
    public List<SeatingPlan> getAll() {
        return service.getAll();
    }
}
