package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 🔴 REQUIRED for findByRollNumber()
    @Column(unique = true, nullable = false)
    private String rollNumber;

    private String name;

    private String department;
}
