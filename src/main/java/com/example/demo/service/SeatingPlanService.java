package com.example.demo.service;

import com.example.demo.model.SeatingPlan;
import java.util.List;

public interface SeatingPlanService {

    SeatingPlan createPlan(SeatingPlan plan);   // ✅ REQUIRED

    SeatingPlan getPlan(String rollNumber);

    List<SeatingPlan> getPlansBySession(String sessionId);
}
