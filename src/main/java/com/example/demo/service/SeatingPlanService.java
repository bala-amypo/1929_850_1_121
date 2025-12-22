package com.example.demo.service;

import com.example.demo.entity.SeatingPlan;
import java.util.List;

public interface SeatingPlanService {

    SeatingPlan savePlan(SeatingPlan plan);

    SeatingPlan getPlanById(Long id);

    List<SeatingPlan> getAllPlans();

    SeatingPlan updatePlan(Long id, SeatingPlan plan);

    void deletePlan(Long id);
}
