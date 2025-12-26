package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExamRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roomNumber;

    private int rows;
    private int columns;

    private int capacity;

    // REQUIRED by tests
    public void ensureCapacityMatches() {
        this.capacity = rows * columns;
    }
}
