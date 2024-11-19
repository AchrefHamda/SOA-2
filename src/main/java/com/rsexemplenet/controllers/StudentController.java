/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rsexemplenet.controllers;

/**
 *
 * @author Lenovo
 */

import com.rsexemplenet.models.Student;
import com.rsexemplenet.services.StudentRepository;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import java.util.List;


@Path("/student")
public class StudentController {
    private final StudentRepository repository = new StudentRepository();

    @GET
    @Produces("application/json")
    public List<Student> getStudents() {
        return repository.getAllStudents();
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Student addStudent(Student student) {
        repository.saveStudent(student);
        return student;
    }
}
