package com.example.demo.service;

import com.example.demo.model.Student;
import java.util.List;

public interface StudentService {

    Student createStudent(Student student);

    List<Student> getAllStudents();
}
