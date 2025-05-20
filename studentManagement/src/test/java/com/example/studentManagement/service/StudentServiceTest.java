package com.example.studentManagement.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.studentManagement.repository.StudentRepository;
import com.example.studentManagement.model.student;

public class StudentServiceTest {
    
    @Test
    void testGetAllStudent(){
        //mock the repository
        StudentRepository studentRepository = Mockito.mock(StudentRepository.class);
        StudentService studentService = new StudentService(studentRepository);
       
        //prepare the mock data
        List<student> students = Arrays.asList(
            new student(1L,"John","John Doe", "123456789"),
            new student(2L,"Jane","Jane Doe", "123455566")
        );
        
        //mock the behavior of the repository
        when(studentRepository.findAll()).thenReturn(students);
        //call the method   
        List<student> result = studentService.getAllStudents();
        //verify the result
        assertEquals(2, result.size());

        //verify the interaction with the repository
        verify(studentRepository, times(1)).findAll();
    }

}
