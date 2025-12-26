package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "exam_rooms")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExamRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 🔴 REQUIRED FIELD (THIS FIXES YOUR ERROR)
    @Column(nullable = false, unique = true)
    private String roomNumber;

    private int rows;
    private int columns;
}
