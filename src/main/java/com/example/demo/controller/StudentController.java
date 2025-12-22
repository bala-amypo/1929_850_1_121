package com.example.crude.controller;

import com.example.crude.entity.Student;
import com.example.crude.Repository.StudentRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
@Tag(name = "Students", description = "Student management APIs")
@SecurityRequirement(name = "bearerAuth")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping
    @Operation(summary = "Add a new student")
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping
    @Operation(summary = "List all students")
    public List<Student> listStudents() {
        return studentRepository.findAll();
    }
}