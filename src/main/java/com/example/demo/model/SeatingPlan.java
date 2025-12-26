package com.example.demo.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class SeatingPlan {
    private Long id;
    private String sessionId; // link to ExamSession
    private String studentId; // link to Student
    private LocalDateTime generatedAt;
}
