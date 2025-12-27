package com.example.demo.repository;

import com.example.demo.model.SeatingPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SeatingPlanRepository extends JpaRepository<SeatingPlan, Long> {

    Optional<SeatingPlan> getPlan(String studentRoll);

    List<SeatingPlan> getPlansBySession(String sessionId);
}
