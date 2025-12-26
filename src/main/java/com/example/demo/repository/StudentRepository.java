package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepository {
    private final List<Student> students = new ArrayList<>();

    public Optional<Student> findById(Long id) {
        return students.stream().filter(s -> s.getId().equals(id)).findFirst();
    }

    public List<Student> findAll() {
        return students;
    }

    public Student save(Student student) {
        students.add(student);
        return student;
    }
}
