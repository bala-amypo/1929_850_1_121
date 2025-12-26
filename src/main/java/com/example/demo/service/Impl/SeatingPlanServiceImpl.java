package com.example.demo.service.impl;

import com.example.demo.model.SeatingPlan;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.repository.SeatingPlanRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.SeatingPlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SeatingPlanServiceImpl implements SeatingPlanService {

    private final ExamSessionRepository examSessionRepository;
    private final SeatingPlanRepository seatingPlanRepository;
    private final StudentRepository studentRepository;

    @Override
    public SeatingPlan generatePlan(long sessionId) {
        SeatingPlan plan = new SeatingPlan();
        plan.setGeneratedAt(LocalDateTime.now());
        return seatingPlanRepository.save(plan);
    }

    @Override
    public SeatingPlan getPlan(long id) {
        return seatingPlanRepository.findById(id).orElse(null);
    }

    @Override
    public List<SeatingPlan> getPlansBySession(long sessionId) {
        return seatingPlanRepository.findByExamSessionId(sessionId);
    }
}
