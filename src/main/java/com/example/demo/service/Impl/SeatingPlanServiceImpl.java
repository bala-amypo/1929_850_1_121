package com.example.demo.service.impl;

import com.example.demo.model.SeatingPlan;
import com.example.demo.repository.SeatingPlanRepository;
import com.example.demo.service.SeatingPlanService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SeatingPlanServiceImpl implements SeatingPlanService {

    private final SeatingPlanRepository repo;

    public SeatingPlanServiceImpl(SeatingPlanRepository repo) {
        this.repo = repo;
    }

    @Override
    public SeatingPlan save(SeatingPlan plan) {
        return repo.save(plan);
    }

    @Override
    public List<SeatingPlan> getAll() {
        return repo.findAll();
    }
}
