package com.example.demo.controller;

import com.example.demo.model.SeatingPlan;
import com.example.demo.service.SeatingPlanService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seating")
public class SeatingPlanController {

    private final SeatingPlanService planService;

    public SeatingPlanController(SeatingPlanService planService) {
        this.planService = planService;
    }

    @GetMapping("/{id}")
    public SeatingPlan get(@PathVariable long id) {
        return planService.generatePlan(id);
    }
}
