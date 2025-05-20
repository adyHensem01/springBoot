package com.example.studentManagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentManagement.model.student;

public interface StudentRepository extends JpaRepository<student, Long> {
    // This interface will automatically provide CRUD operations for the student entity
    // No need to write any code here
    // Spring Data JPA will generate the implementation at runtime  
    
}
