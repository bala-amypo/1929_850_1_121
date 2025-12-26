package com.example.demo.service;

import com.example.demo.model.SeatingPlan;

import java.util.List;

public interface SeatingPlanService {
    SeatingPlan getPlan(String id);
    List<SeatingPlan> getPlansBySession(String sessionId);
    SeatingPlan createPlan(SeatingPlan plan);
}
