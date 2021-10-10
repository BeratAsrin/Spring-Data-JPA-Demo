package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Optional<Student> findById(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public void enrollStudent(String name) {
        Student newStudent = new Student();
        newStudent.setName(name);
        studentRepository.save(newStudent);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudentById(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void updateStudent(Integer id, String name) {
        Student student = studentRepository.getById(id);
        student.setName(name);
        studentRepository.save(student);
    }
}
