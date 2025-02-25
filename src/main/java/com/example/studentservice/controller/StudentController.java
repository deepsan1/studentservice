package com.example.studentservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.example.studentservice.model.Student;
import com.example.studentservice.repo.StudentRepo;

@Controller
public class StudentController {
    @Autowired
    private StudentRepo repo;

    public ResponseEntity<List<Student>> getAllStudents(){

        Optional<List<Student>> students    = repo.getAllStudents();
        List<Student> sList = new ArrayList();
        if (students.isPresent()){
             sList = students.get();
             
        }
        return ResponseEntity.ok(sList);
           

    }

}
