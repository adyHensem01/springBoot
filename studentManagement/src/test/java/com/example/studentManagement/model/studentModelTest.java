package com.example.studentManagement.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class studentModelTest {
     @Test
    void testNoArgsConstructor() {
        student s = new student();
        assertNull(s.getId());
        assertNull(s.getName());
        assertNull(s.getEmail());
        assertNull(s.getPhone());
    }

    @Test
    void testAllArgsConstructor() {
        student s = new student(1L, "Alice", "alice@example.com", "5551234");
        assertEquals(1L, s.getId());
        assertEquals("Alice", s.getName());
        assertEquals("alice@example.com", s.getEmail());
        assertEquals("5551234", s.getPhone());
    }

    @Test
    void testSettersAndGetters() {
        student s = new student();
        s.setId(2L);
        s.setName("Bob");
        s.setEmail("bob@example.com");
        s.setPhone("5555678");

        assertEquals(2L, s.getId());
        assertEquals("Bob", s.getName());
        assertEquals("bob@example.com", s.getEmail());
        assertEquals("5555678", s.getPhone());
    }
}
