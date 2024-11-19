/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rsexemplenet.services;
import com.rsexemplenet.models.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */

public class StudentRepository {
    private final List<Student> students = new ArrayList<>();

    public StudentRepository() {
        students.add(new Student(301, "Achref Hamda", 'M', "DSI", 3));
        students.add(new Student(302, "Manel Ben dhafalh", 'F', "DSI", 3));
        students.add(new Student(303, "Abir ben yahya", 'F', "RSI", 2));
        students.add(new Student(304, "Moez ben chrifia", 'M', "DSI", 2));
        students.add(new Student(305, "Anis Badri", 'M', "TI", 1));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void saveStudent(Student student) {
        students.add(student);
    }
}