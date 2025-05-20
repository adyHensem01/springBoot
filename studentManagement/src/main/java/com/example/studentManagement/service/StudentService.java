package com.example.studentManagement.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.studentManagement.model.student;
import com.example.studentManagement.repository.StudentRepository;

@Service
public class StudentService {
    // This class will contain the business logic for managing students
    // It will use the StudentRepository to perform CRUD operations on the student entity
    // No need to write any code here for now
    // We will implement this class later when we add the controller and service layers

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    // Method to get all students
    public List<student> getAllStudents() {
        return repository.findAll();
    }
   
    //method to save student
    public student saveStudent(student student){
        return repository.save(student);
    }
    
}
