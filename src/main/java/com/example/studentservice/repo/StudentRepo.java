package com.example.studentservice.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentservice.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{

    Optional<List<Student>> getAllStudents();

}


