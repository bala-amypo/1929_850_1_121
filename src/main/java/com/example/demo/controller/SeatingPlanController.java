package com.example.crude.controller;

import com.example.crude.entity.SeatingPlan;
import com.example.crude.entity.ExamSession;
import com.example.crude.entity.ExamRoom;
import com.example.crude.entity.Student;
import com.example.crude.Repository.SeatingPlanRepository;
import com.example.crude.Repository.ExamSessionRepository;
import com.example.crude.Repository.ExamRoomRepository;
import com.example.crude.Repository.StudentRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Collections;

@RestController
@RequestMapping("/plans")
@Tag(name = "Seating Plans", description = "Seating plan management APIs")
@SecurityRequirement(name = "bearerAuth")
public class SeatingPlanController {

    @Autowired
    private SeatingPlanRepository seatingPlanRepository;

    @Autowired
    private ExamSessionRepository examSessionRepository;

    @Autowired
    private ExamRoomRepository examRoomRepository;

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/generate/{sessionId}")
    @Operation(summary = "Generate seating plan for exam session")
    public ResponseEntity<List<SeatingPlan>> generateSeatingPlan(@PathVariable Long sessionId) {
        ExamSession session = examSessionRepository.findById(sessionId).orElse(null);
        if (session == null) {
            return ResponseEntity.notFound().build();
        }

        List<Student> students = studentRepository.findAll();
        List<ExamRoom> rooms = examRoomRepository.findAll();
        
        if (students.isEmpty() || rooms.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        Collections.shuffle(students);
        
        List<SeatingPlan> plans = new java.util.ArrayList<>();
        int studentIndex = 0;
        
        for (ExamRoom room : rooms) {
            for (int seat = 1; seat <= room.getCapacity() && studentIndex < students.size(); seat++) {
                SeatingPlan plan = new SeatingPlan(session, room, students.get(studentIndex), seat);
                plans.add(seatingPlanRepository.save(plan));
                studentIndex++;
            }
        }
        
        return ResponseEntity.ok(plans);
    }

    @GetMapping("/{planId}")
    @Operation(summary = "Get seating plan by ID")
    public ResponseEntity<SeatingPlan> getSeatingPlan(@PathVariable Long planId) {
        return seatingPlanRepository.findById(planId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/session/{sessionId}")
    @Operation(summary = "List seating plans for a session")
    public List<SeatingPlan> getPlansForSession(@PathVariable Long sessionId) {
        return seatingPlanRepository.findBySessionId(sessionId);
    }
}