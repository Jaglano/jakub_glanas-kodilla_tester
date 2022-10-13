package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jerzy", new Teacher("Urban")));
        students.add(new Student("Aleksander", new Teacher("Nowak")));
        students.add(new Student("Marek", null));
        students.add(new Student("Bob", new Teacher("Dylan")));

        for (Student student:students) {
        Teacher teacher = Optional.ofNullable(student.teacher).orElse(new Teacher("<undefinied>"));
            System.out.println("uczeń: " + student.getName() + ", nauczyciel: " + teacher.getName());
        }

    }

    public static String getTeacherName(Student student) {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        String undefined =
                optionalTeacher.orElse(new Teacher("<undefined>")).getName();
        return undefined;
    }
}
