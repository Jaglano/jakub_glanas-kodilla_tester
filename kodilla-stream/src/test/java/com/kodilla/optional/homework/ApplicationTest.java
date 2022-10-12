package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class ApplicationTest {

    public static List<Student> getStudentList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jerzy", new Teacher("Urban")));
        students.add(new Student("Aleksander", new Teacher("Nowak")));
        students.add(new Student("Marek", null));
        students.add(new Student("Bob", new Teacher("Dylan")));

        for (Student student:students) {
            Teacher teacher = Optional.ofNullable(student.teacher).orElse(new Teacher("<undefinied"));
            System.out.println("uczeń: " + student.getName() + ", nauczyciel: " + teacher.getName());
        }
        return students;
    }

    @Test
    public void nullTeacher(){
        getStudentList();
        assertEquals(null, getStudentList().containsAll());
    }

}
