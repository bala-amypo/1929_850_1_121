package com.example.demo.controller;

import com.example.demo.model.SeatingPlan;
import com.example.demo.service.SeatingPlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seating")
@RequiredArgsConstructor
public class SeatingPlanController {

    private final SeatingPlanService seatingPlanService;

    @GetMapping("/{id}")
    public SeatingPlan get(@PathVariable long id) {
        return seatingPlanService.getPlan(id);
    }

    @GetMapping("/session/{id}")
    public List<SeatingPlan> list(@PathVariable long id) {
        return seatingPlanService.getPlansBySession(id);
    }
}
