package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "exam_session")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExamSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;

    private LocalDate examDate;

    @Builder.Default
    @ManyToMany
    @JoinTable(
            name = "exam_session_students",
            joinColumns = @JoinColumn(name = "exam_session_id"),
            inverseJoinColumns = @JoinColumn(name = "students_id")
    )
    private Set<Student> students = new HashSet<>();
}
