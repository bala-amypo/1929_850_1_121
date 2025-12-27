package com.example.demo.repository;

import com.example.demo.model.SeatingPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SeatingPlanRepository extends JpaRepository<SeatingPlan, Long> {

    // ✔ valid Spring Data method
    Optional<SeatingPlan> findByExamSession_CourseCode(String courseCode);

    // ✔ valid Spring Data method
    List<SeatingPlan> findByExamSession_Id(Long sessionId);
}
