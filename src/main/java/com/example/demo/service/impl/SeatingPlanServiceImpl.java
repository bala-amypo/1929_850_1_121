package com.example.demo.service.impl;

import com.example.demo.model.SeatingPlan;
import com.example.demo.repository.SeatingPlanRepository;
import com.example.demo.repository.ExamSessionRepository;
import com.example.demo.repository.ExamRoomRepository;
import com.example.demo.service.SeatingPlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatingPlanServiceImpl implements SeatingPlanService {

    private final SeatingPlanRepository planRepo;
    private final ExamSessionRepository examRepo;
    private final ExamRoomRepository roomRepo;

    public SeatingPlanServiceImpl(SeatingPlanRepository planRepo,
                                  ExamSessionRepository examRepo,
                                  ExamRoomRepository roomRepo) {
        this.planRepo = planRepo;
        this.examRepo = examRepo;
        this.roomRepo = roomRepo;
    }

    @Override
    public SeatingPlan generatePlan(long sessionId) {
        // implement logic
        return new SeatingPlan();
    }

    @Override
    public List<SeatingPlan> getPlansBySession(Long sessionId) {
        return planRepo.findByExamSessionId(sessionId);
    }
}
