package com.example.demo.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ExamSession {
    private Long id;
    private String name;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
