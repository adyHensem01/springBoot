package com.example.studentManagement.controller;

import javax.print.attribute.standard.Media;

import org.springframework.http.MediaType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.hasSize;


import com.example.studentManagement.repository.StudentRepository;

@SpringBootTest
@AutoConfigureMockMvc
public class studentControllerTest {
    
    @Autowired
    private MockMvc mockMvc;
    // This class will contain unit tests for the StudentController

    @Autowired
    private StudentRepository studentRepository;
    // This class will contain unit tests for the StudentRepository

    @Test
    void testCreateAndGetStudent() throws Exception {
        // This method will test the create and get student functionality
        // We will use MockMvc to perform HTTP requests and assert the responses
        // We will also use Mockito to mock the StudentService and StudentRepository
        // We will use JUnit 5 for assertions

        //clear previous data
        studentRepository.deleteAll();
        //create a new student
        String studentJson = """
                             {
                                
                                 "name": "John Doe",
                                 "email" :"JohnDoe@yahoo.com",
                                 "phone": "123456789"
                            }
                             
                             """;

        //perform a POST request to create a new student
        mockMvc.perform(post("/students")
                .contentType(MediaType.APPLICATION_JSON)
                .content(studentJson))
                .andExpect(status().isOk());

        //perform to get one student 
        mockMvc.perform(get("/students"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)));

    }

}
