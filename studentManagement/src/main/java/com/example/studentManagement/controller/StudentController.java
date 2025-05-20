package com.example.studentManagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.studentManagement.model.student;

import com.example.studentManagement.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    // This class will handle HTTP requests and responses for managing students
    // It will use the StudentService to perform CRUD operations on the student entity

    private final StudentService studentService;
    
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    // Method to get all students

    @GetMapping
    public List<student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public student createStudent(@RequestBody student student) {
        return studentService.saveStudent(student);
    }

}
