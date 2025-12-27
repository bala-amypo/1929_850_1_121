package com.example.demo.service;

import com.example.demo.model.SeatingPlan;

import java.util.List;

public interface SeatingPlanService {
    SeatingPlan generatePlan(long sessionId);

    // Add this method
    List<SeatingPlan> getPlansBySession(Long sessionId);
}
