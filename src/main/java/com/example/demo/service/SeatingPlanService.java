package com.example.demo.service;

import com.example.demo.model.SeatingPlan;
import java.util.List;

public interface SeatingPlanService {

    SeatingPlan createPlan(SeatingPlan plan);

    SeatingPlan getPlan(String courseCode);

    List<SeatingPlan> getPlansBySession(Long sessionId);
}
