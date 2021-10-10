package com.example.demo.restcontroller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class MyRestController {

    @Autowired
    StudentService service;

    @GetMapping("/get")
    public List<Student> getAll(){
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Student> getStudentById(@PathVariable Integer id){
        return service.findById(id);
    }

    @PostMapping("/enroll/{name}")
    public void enrollStudent(@PathVariable String name){
        service.enrollStudent(name);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id){
        service.deleteStudentById(id);
    }

    @PutMapping("/update/{id},{name}")
    public void updateStudent(@PathVariable Integer id, @PathVariable String name){
        service.updateStudent(id, name);
    }

}
