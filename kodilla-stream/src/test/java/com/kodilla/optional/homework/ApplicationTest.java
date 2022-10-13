package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



public class ApplicationTest {
    @Test
    public void shouldReturnTeacherName() {
        Teacher teacher = new Teacher("Bob");
        Student arek = new Student("Arek", teacher);
        Application.getTeacherName(arek);
        assertEquals("Bob", Application.getTeacherName(arek));
    }
    @Test
    public void shouldReturnNullTeacherName() {
        Student robert = new Student("Robert", null);
        Application.getTeacherName(robert);
        assertEquals("<undefined>", Application.getTeacherName(robert));
    }
}