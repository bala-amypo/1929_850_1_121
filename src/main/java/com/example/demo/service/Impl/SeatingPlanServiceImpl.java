package com.example.demo.service.impl;

import com.example.demo.model.SeatingPlan;
import com.example.demo.service.SeatingPlanService;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class SeatingPlanServiceImpl implements SeatingPlanService {

    @Override
    public SeatingPlan generatePlan(String room) {
        SeatingPlan plan = new SeatingPlan();
        plan.setRoom(room);
        plan.setGeneratedAt(LocalDateTime.now());
        return plan;
    }
}
