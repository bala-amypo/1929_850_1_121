package com.example.demo.service.impl;

import com.example.demo.exception.ApiException;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repo;

    public StudentServiceImpl(StudentRepository repo) {
        this.repo = repo;
    }

    public Student addStudent(Student s) {
        if (s.getRollNumber() == null || s.getYear() == null)
            throw new ApiException("Invalid student");

        if (s.getYear() < 1 || s.getYear() > 5)
            throw new ApiException("Invalid year");

        repo.findByRollNumber(s.getRollNumber())
                .ifPresent(x -> { throw new ApiException("Student exists"); });

        return repo.save(s);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }
}
