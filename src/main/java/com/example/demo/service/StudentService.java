package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public Student save(Student s) {
        if (s.getYear() < 1) throw new RuntimeException("Invalid year");
        return repo.save(s);
    }

    public List<Student> getAll() {
        return repo.findAll();
    }
}
