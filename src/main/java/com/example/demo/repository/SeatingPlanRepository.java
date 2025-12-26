package com.example.demo.repository;

import com.example.demo.model.SeatingPlan;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class SeatingPlanRepository {
    private final List<SeatingPlan> plans = new ArrayList<>();

    public SeatingPlan save(SeatingPlan plan) {
        plans.add(plan);
        return plan;
    }

    public SeatingPlan getPlan(String id) {
        return plans.stream().filter(p -> p.getId().toString().equals(id)).findFirst().orElse(null);
    }

    public List<SeatingPlan> getPlansBySession(String sessionId) {
        return plans.stream().filter(p -> p.getSessionId().equals(sessionId)).collect(Collectors.toList());
    }
}
