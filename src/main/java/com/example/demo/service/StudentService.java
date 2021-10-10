package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService{
    Optional<Student> findById(Integer id);
    void enrollStudent(String name);
    List<Student> getAll();
    void deleteStudentById(Integer id);
    void updateStudent(Integer id, String name);
}
