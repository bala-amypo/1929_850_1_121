package com.example.demo.service.impl;

import com.example.demo.model.SeatingPlan;
import com.example.demo.repository.SeatingPlanRepository;
import com.example.demo.service.SeatingPlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatingPlanServiceImpl implements SeatingPlanService {

    private final SeatingPlanRepository repository;

    public SeatingPlanServiceImpl(SeatingPlanRepository repository) {
        this.repository = repository;
    }

    @Override
    public SeatingPlan getPlan(String id) {
        return repository.getPlan(id);
    }

    @Override
    public List<SeatingPlan> getPlansBySession(String sessionId) {
        return repository.getPlansBySession(sessionId);
    }

    @Override
    public SeatingPlan createPlan(SeatingPlan plan) {
        return repository.save(plan);
    }
}
