package com.kodilla.optional.homework;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ApplicationTest {



    @Test
    public void shouldReturnTeacherName() {
        Teacher teacher = new Teacher("Bob");
        Student arek = new Student("Arek", teacher);
        assertEquals("Bob", Application.getTeacherName(arek));
    }
    @Test
    public void shouldReturnNullTeacherName() {
        Student robert = new Student("Robert", null);
        assertEquals("<undefined>", Application.getTeacherName(robert));
    }
}