package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExamRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String roomNumber;

    private int capacity;

    public void ensureCapacityMatches() {
        if (capacity < 1) {
            throw new IllegalArgumentException("Capacity must be at least 1");
        }
    }
}
