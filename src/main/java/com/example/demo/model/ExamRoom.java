package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "exam_room")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExamRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "room_number")
    private String roomNumber; // matches test

    private int capacity;

    public void ensureCapacityMatches() {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        }
    }
}
