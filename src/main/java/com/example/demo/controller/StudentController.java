package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service){
        this.service = service;
    }

    @PostMapping
    public Student create(@RequestBody Student student){
        return service.createStudent(student);
    }

    @GetMapping
    public List<Student> getAll(){
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id){
        return service.getStudentById(id);
    }

    @PutMapping("/{id}")
    public Student update(@RequestBody Student student, @PathVariable Long id){
        return service.updateStudent(id,student);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        service.deleteStudent(id);
        return "Student deleted successfully";
    }




}
