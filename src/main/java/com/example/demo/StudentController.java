package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.security.Provider;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentRepository repository;

    public StudentController(StudentRepository repository){
        this.repository = repository;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return repository.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return repository.findAll();
    }
}
